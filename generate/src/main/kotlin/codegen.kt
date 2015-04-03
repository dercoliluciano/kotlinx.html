package html4k.generate

import java.util.ArrayList

fun <O : Appendable> O.packg(name : String) : O {
    append("package ")
    append(name)
    append("\n")
    return this
}

fun <O : Appendable> O.import(name : String) : O {
    append("import ")
    append(name)
    append("\n")
    return this
}

fun <O : Appendable> O.warning() : O {
    append("/")
    append("*" repeat 79)
    appendln()
    append("    DO NOT EDIT")
    appendln()
    append("    This file was generated by module generate")
    appendln()
    append("*" repeat 79)
    append("/")

    return this
}

data class Var(val name : String, val type : String, val mutable : Boolean = false, val override : Boolean = false, val forceOmitValVar : Boolean = false, val defaultValue : String = "")
data class Clazz(val name : String, val parameters : List<String> = listOf(), val variables : List<Var> = listOf(), val parents : List<String> = listOf(), val isPublic : Boolean = true, val isAbstract : Boolean = false, val isOpen : Boolean = false, val isObject : Boolean = false)

fun <O : Appendable> O.variable(variable : Var, omitValVar : Boolean = false) : O {
    if (!omitValVar && !variable.forceOmitValVar) {
        if (variable.override) {
            append("override ")
        }
        append(if (variable.mutable) "var " else "val ")
    }

    append(variable.name)
    append(" : ")
    append(variable.type)

    if (variable.defaultValue.isNotEmpty()) {
        append(" = ")
        append(variable.defaultValue)
    }

    return this
}

fun <O : Appendable> O.enumEntry(name : String, className : String, arguments : List<String>) {
    append(name)
    append(" : ")
    append(className)
    arguments.joinTo(this, ", ", "(", ")\n")
}

fun <O : Appendable> O.delegateBy(expression : String) : O {
    append(" by ")
    append(expression)
    emptyLine()

    return this
}

fun <O : Appendable> O.getter(): O {
    append("\n    get() ")
    return this
}

fun <O : Appendable> O.setter(block : O.() -> Unit) : O {
    append("\n    set(newValue) {")
    block()
    append("}\n")

    return this
}

fun <O : Appendable> O.clazz(clazz : Clazz, block : O.() -> Unit) : O {
    val tokens = ArrayList<String>()
    if (clazz.isPublic) {
        tokens.add("public")
    }
    if (clazz.isAbstract) {
        tokens.add("abstract")
    }
    if (clazz.isOpen) {
        tokens.add("open")
    }

    tokens.add(if (clazz.isObject) "object" else "class")
    tokens.add(clazz.name)
    tokens.joinTo(this, " ")

    if (clazz.parameters.isNotEmpty()) {
        clazz.parameters.joinTo(this, ", ", "<", ">")
    }
    if (clazz.variables.isNotEmpty()) {
        append("(")
        clazz.variables.forEachIndexed { i, p ->
            if (i != 0) {
                append(", ")
            }
            variable(p)
        }
        append(")")
    }

    if (clazz.parents.isNotEmpty()) {
        clazz.parents.joinTo(this, ", ", " : ")
    }

    append(" {\n")
    block()
    append("}\n")

    return this
}

fun <O : Appendable> O.functionCall(name : String, arguments : List<String>) : O = with {
    append(name)
    arguments.joinTo(this, ", ", "(", ")")
}

fun <O : Appendable> O.function(name : String, arguments : List<Var>, returnType : String, generics : List<String> = emptyList(), receiver : String = "") : O {
    append("fun ")

    if (generics.isNotEmpty()) {
        generics.joinTo(this, ", ", "<", "> ")
    }

    if (receiver.isNotEmpty()) {
        append(receiver)
        append(".")
    }

    append(name)
    append("(")
    arguments.forEachIndexed { i, p ->
        if (i != 0) {
            append(", ")
        }
        variable(p, true)
    }
    append(")")

    if (returnType.isNotEmpty()) {
        append(" : ")
        append(returnType)
    }

    return this
}

fun <O : Appendable> O.block(block : O.() -> Unit) : O {
    append("{\n")
    block()
    append("}\n")

    return this
}

fun <O : Appendable> O.defineIs(expression : CharSequence) : O {
    append(" = ")
    append(expression)
    append("\n")

    return this
}

fun <O : Appendable> O.emptyLine() : O = this.with { appendln() }

fun <T> T.with(block : T.() -> Unit) : T {
    block()
    return this
}
