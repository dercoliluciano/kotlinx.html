package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class VAR_(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("var", consumer, initialAttributes) {
    var onabort : String by StringAttribute("onabort")
    var contenteditable : Boolean by BooleanAttribute("contenteditable")
    var onloadedmetadata : String by StringAttribute("onloadedmetadata")
    var onscroll : String by StringAttribute("onscroll")
    var onseeking : String by StringAttribute("onseeking")
    var id : String by StringAttribute("id")
    var onload : String by StringAttribute("onload")
    var ondragstart : String by StringAttribute("ondragstart")
    var oninput : String by StringAttribute("oninput")
    var EnableViewState : Boolean by BooleanAttribute("EnableViewState")
    var ontimeupdate : String by StringAttribute("ontimeupdate")
    var onshow : String by StringAttribute("onshow")
    var onclick : String by StringAttribute("onclick")
    var onfocus : String by StringAttribute("onfocus")
    var Visible : Boolean by BooleanAttribute("Visible")
    var contextmenu : String by StringAttribute("contextmenu")
    var OnPreRender : String by StringAttribute("OnPreRender")
    var onstalled : String by StringAttribute("onstalled")
    var onprogress : String by StringAttribute("onprogress")
    var draggable : Draggable by EnumAttribute("draggable", draggableValues)
    var OnDisposed : String by StringAttribute("OnDisposed")
    var item : String by StringAttribute("item")
    var oncanplay : String by StringAttribute("oncanplay")
    var oncontextmenu : String by StringAttribute("oncontextmenu")
    var SkinID : String by StringAttribute("SkinID")
    var subject : String by StringAttribute("subject")
    var classes : String by StringAttribute("class")
    var runat : Runat by EnumAttribute("runat", runatValues)
    var onerror : String by StringAttribute("onerror")
    var onformchange : String by StringAttribute("onformchange")
    var onseeked : String by StringAttribute("onseeked")
    var onloadeddata : String by StringAttribute("onloadeddata")
    var ondurationchange : String by StringAttribute("ondurationchange")
    var onmouseover : String by StringAttribute("onmouseover")
    var OnUnload : String by StringAttribute("OnUnload")
    var onmousewheel : String by StringAttribute("onmousewheel")
    var ondrag : String by StringAttribute("ondrag")
    var ondragleave : String by StringAttribute("ondragleave")
    var onplaying : String by StringAttribute("onplaying")
    var onforminput : String by StringAttribute("onforminput")
    var onkeyup : String by StringAttribute("onkeyup")
    var onratechange : String by StringAttribute("onratechange")
    var onkeydown : String by StringAttribute("onkeydown")
    var onmousedown : String by StringAttribute("onmousedown")
    var onchange : String by StringAttribute("onchange")
    var onkeypress : String by StringAttribute("onkeypress")
    var OnLoad : String by StringAttribute("OnLoad")
    var itemprop : String by StringAttribute("itemprop")
    var onvolumenchange : String by StringAttribute("onvolumenchange")
    var ondblclick : String by StringAttribute("ondblclick")
    var onreadystatechange : String by StringAttribute("onreadystatechange")
    var ondragenter : String by StringAttribute("ondragenter")
    var hidden : Boolean by BooleanAttribute("hidden")
    var lang : String by StringAttribute("lang")
    var onwaiting : String by StringAttribute("onwaiting")
    var onpause : String by StringAttribute("onpause")
    var OnInit : String by StringAttribute("OnInit")
    var accesskey : String by StringAttribute("accesskey")
    var style : String by StringAttribute("style")
    var onemptied : String by StringAttribute("onemptied")
    var dir : Dir by EnumAttribute("dir", dirValues)
    var onselect : String by StringAttribute("onselect")
    var onloadstart : String by StringAttribute("onloadstart")
    var ondragover : String by StringAttribute("ondragover")
    var onsuspend : String by StringAttribute("onsuspend")
    var onmouseup : String by StringAttribute("onmouseup")
    var tabIndex : String by StringAttribute("tabIndex")
    var EnableTheming : Boolean by BooleanAttribute("EnableTheming")
    var role : String by StringAttribute("role")
    var onmousemove : String by StringAttribute("onmousemove")
    var onmouseout : String by StringAttribute("onmouseout")
    var onplay : String by StringAttribute("onplay")
    var oncanplaythrough : String by StringAttribute("oncanplaythrough")
    var onended : String by StringAttribute("onended")
    var onblur : String by StringAttribute("onblur")
    var data_MsgId : String by StringAttribute("data-MsgId")
    var ondrop : String by StringAttribute("ondrop")
    var OnDataBinding : String by StringAttribute("OnDataBinding")
    var oninvalid : String by StringAttribute("oninvalid")
    var spellcheck : Boolean by BooleanAttribute("spellcheck")
    var title : String by StringAttribute("title")
    var data_FolderName : String by StringAttribute("data-FolderName")
    var onsubmit : String by StringAttribute("onsubmit")

    override
    fun a(href : String?, target : String?, block : A.() -> Unit) : Unit = super.a(href, target, block)

    override
    fun abbr(block : ABBR.() -> Unit) : Unit = super.abbr(block)

    override
    fun area(alt : String?, content : String) : Unit = super.area(alt, content)

    override
    fun audio(block : AUDIO.() -> Unit) : Unit = super.audio(block)

    override
    fun b(block : B.() -> Unit) : Unit = super.b(block)

    override
    fun bdi(block : BDI.() -> Unit) : Unit = super.bdi(block)

    override
    fun bdo(block : BDO.() -> Unit) : Unit = super.bdo(block)

    override
    fun br(content : String) : Unit = super.br(content)

    override
    fun button(block : BUTTON.() -> Unit) : Unit = super.button(block)

    override
    fun canvas(content : String) : Unit = super.canvas(content)

    override
    fun cite(block : CITE.() -> Unit) : Unit = super.cite(block)

    override
    fun code(block : CODE.() -> Unit) : Unit = super.code(block)

    override
    fun command(content : String) : Unit = super.command(content)

    override
    fun datalist(block : DATALIST.() -> Unit) : Unit = super.datalist(block)

    override
    fun del(block : DEL.() -> Unit) : Unit = super.del(block)

    override
    fun dfn(block : DFN.() -> Unit) : Unit = super.dfn(block)

    override
    fun em(block : EM.() -> Unit) : Unit = super.em(block)

    override
    fun embed(content : String) : Unit = super.embed(content)

    override
    fun i(block : I.() -> Unit) : Unit = super.i(block)

    override
    fun iframe(content : String) : Unit = super.iframe(content)

    override
    fun img(alt : String?, src : String?, content : String) : Unit = super.img(alt, src, content)

    override
    fun input(alt : String?, content : String) : Unit = super.input(alt, content)

    override
    fun ins(block : INS.() -> Unit) : Unit = super.ins(block)

    override
    fun kbd(block : KBD.() -> Unit) : Unit = super.kbd(block)

    override
    fun keygen(content : String) : Unit = super.keygen(content)

    override
    fun label(block : LABEL.() -> Unit) : Unit = super.label(block)

    override
    fun link(content : String) : Unit = super.link(content)

    override
    fun map(block : MAP.() -> Unit) : Unit = super.map(block)

    override
    fun mark(block : MARK.() -> Unit) : Unit = super.mark(block)

    override
    fun math(block : MATH.() -> Unit) : Unit = super.math(block)

    override
    fun meta(content : String) : Unit = super.meta(content)

    override
    fun meter(block : METER.() -> Unit) : Unit = super.meter(block)

    override
    fun noscript(block : NOSCRIPT.() -> Unit) : Unit = super.noscript(block)

    override
    fun object_(block : OBJECT_.() -> Unit) : Unit = super.object_(block)

    override
    fun output(block : OUTPUT.() -> Unit) : Unit = super.output(block)

    override
    fun progress(block : PROGRESS.() -> Unit) : Unit = super.progress(block)

    override
    fun q(block : Q.() -> Unit) : Unit = super.q(block)

    override
    fun ruby(block : RUBY.() -> Unit) : Unit = super.ruby(block)

    override
    fun samp(block : SAMP.() -> Unit) : Unit = super.samp(block)

    override
    fun script(type : String?, src : String?, content : String) : Unit = super.script(type, src, content)

    override
    fun select(block : SELECT.() -> Unit) : Unit = super.select(block)

    override
    fun small(block : SMALL.() -> Unit) : Unit = super.small(block)

    override
    fun span(block : SPAN.() -> Unit) : Unit = super.span(block)

    override
    fun strong(block : STRONG.() -> Unit) : Unit = super.strong(block)

    override
    fun sub(block : SUB.() -> Unit) : Unit = super.sub(block)

    override
    fun sup(block : SUP.() -> Unit) : Unit = super.sup(block)

    override
    fun svg(content : String) : Unit = super.svg(content)

    override
    fun textarea(rows : Rows?, cols : Cols?, content : String) : Unit = super.textarea(rows, cols, content)

    override
    fun time(block : TIME.() -> Unit) : Unit = super.time(block)

    override
    fun var_(block : VAR_.() -> Unit) : Unit = super.var_(block)

    override
    fun video(block : VIDEO.() -> Unit) : Unit = super.video(block)

}

public class VIDEO(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("video", consumer, initialAttributes) {
    var width : String by StringAttribute("width")
    var onabort : String by StringAttribute("onabort")
    var contenteditable : Boolean by BooleanAttribute("contenteditable")
    var onloadedmetadata : String by StringAttribute("onloadedmetadata")
    var onscroll : String by StringAttribute("onscroll")
    var onseeking : String by StringAttribute("onseeking")
    var id : String by StringAttribute("id")
    var onload : String by StringAttribute("onload")
    var ondragstart : String by StringAttribute("ondragstart")
    var src : String by StringAttribute("src")
    var oninput : String by StringAttribute("oninput")
    var EnableViewState : Boolean by BooleanAttribute("EnableViewState")
    var ontimeupdate : String by StringAttribute("ontimeupdate")
    var onshow : String by StringAttribute("onshow")
    var onclick : String by StringAttribute("onclick")
    var onfocus : String by StringAttribute("onfocus")
    var Visible : Boolean by BooleanAttribute("Visible")
    var contextmenu : String by StringAttribute("contextmenu")
    var OnPreRender : String by StringAttribute("OnPreRender")
    var onstalled : String by StringAttribute("onstalled")
    var onprogress : String by StringAttribute("onprogress")
    var draggable : Draggable by EnumAttribute("draggable", draggableValues)
    var OnDisposed : String by StringAttribute("OnDisposed")
    var item : String by StringAttribute("item")
    var oncanplay : String by StringAttribute("oncanplay")
    var oncontextmenu : String by StringAttribute("oncontextmenu")
    var SkinID : String by StringAttribute("SkinID")
    var subject : String by StringAttribute("subject")
    var classes : String by StringAttribute("class")
    var height : String by StringAttribute("height")
    var runat : Runat by EnumAttribute("runat", runatValues)
    var onerror : String by StringAttribute("onerror")
    var onformchange : String by StringAttribute("onformchange")
    var onseeked : String by StringAttribute("onseeked")
    var onloadeddata : String by StringAttribute("onloadeddata")
    var ondurationchange : String by StringAttribute("ondurationchange")
    var onmouseover : String by StringAttribute("onmouseover")
    var OnUnload : String by StringAttribute("OnUnload")
    var onmousewheel : String by StringAttribute("onmousewheel")
    var ondrag : String by StringAttribute("ondrag")
    var ondragleave : String by StringAttribute("ondragleave")
    var onplaying : String by StringAttribute("onplaying")
    var autoplay : Boolean by BooleanAttribute("autoplay")
    var onforminput : String by StringAttribute("onforminput")
    var onkeyup : String by StringAttribute("onkeyup")
    var onratechange : String by StringAttribute("onratechange")
    var onkeydown : String by StringAttribute("onkeydown")
    var onmousedown : String by StringAttribute("onmousedown")
    var onchange : String by StringAttribute("onchange")
    var onkeypress : String by StringAttribute("onkeypress")
    var OnLoad : String by StringAttribute("OnLoad")
    var itemprop : String by StringAttribute("itemprop")
    var loop : Boolean by BooleanAttribute("loop")
    var onvolumenchange : String by StringAttribute("onvolumenchange")
    var ondblclick : String by StringAttribute("ondblclick")
    var onreadystatechange : String by StringAttribute("onreadystatechange")
    var ondragenter : String by StringAttribute("ondragenter")
    var hidden : Boolean by BooleanAttribute("hidden")
    var lang : String by StringAttribute("lang")
    var onwaiting : String by StringAttribute("onwaiting")
    var onpause : String by StringAttribute("onpause")
    var OnInit : String by StringAttribute("OnInit")
    var accesskey : String by StringAttribute("accesskey")
    var autobuffer : Boolean by BooleanAttribute("autobuffer")
    var style : String by StringAttribute("style")
    var onemptied : String by StringAttribute("onemptied")
    var dir : Dir by EnumAttribute("dir", dirValues)
    var onselect : String by StringAttribute("onselect")
    var onloadstart : String by StringAttribute("onloadstart")
    var ondragover : String by StringAttribute("ondragover")
    var onsuspend : String by StringAttribute("onsuspend")
    var onmouseup : String by StringAttribute("onmouseup")
    var tabIndex : String by StringAttribute("tabIndex")
    var poster : String by StringAttribute("poster")
    var EnableTheming : Boolean by BooleanAttribute("EnableTheming")
    var role : String by StringAttribute("role")
    var onmousemove : String by StringAttribute("onmousemove")
    var controls : Boolean by BooleanAttribute("controls")
    var onmouseout : String by StringAttribute("onmouseout")
    var onplay : String by StringAttribute("onplay")
    var oncanplaythrough : String by StringAttribute("oncanplaythrough")
    var onended : String by StringAttribute("onended")
    var onblur : String by StringAttribute("onblur")
    var data_MsgId : String by StringAttribute("data-MsgId")
    var ondrop : String by StringAttribute("ondrop")
    var OnDataBinding : String by StringAttribute("OnDataBinding")
    var oninvalid : String by StringAttribute("oninvalid")
    var spellcheck : Boolean by BooleanAttribute("spellcheck")
    var title : String by StringAttribute("title")
    var data_FolderName : String by StringAttribute("data-FolderName")
    var onsubmit : String by StringAttribute("onsubmit")

    override
    fun source(content : String) : Unit = super.source(content)

}

