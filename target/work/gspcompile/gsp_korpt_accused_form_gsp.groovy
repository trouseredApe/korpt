import org.krpt.Accused
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_korpt_accused_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/accused/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: accusedInstance, field: 'fname', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("accused.fname.label"),'default':("Fname")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("fname"),'value':(accusedInstance?.fname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: accusedInstance, field: 'lname', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("accused.lname.label"),'default':("Lname")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("lname"),'value':(accusedInstance?.lname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: accusedInstance, field: 'addressId', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("accused.addressId.label"),'default':("Address Id")],-1)
printHtmlPart(2)
invokeTag('field','g',26,['name':("addressId"),'type':("number"),'value':(accusedInstance.addressId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: accusedInstance, field: 'changeBy', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("accused.changeBy.label"),'default':("Change By")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("changeBy"),'value':(accusedInstance?.changeBy)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: accusedInstance, field: 'lastUpdate', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("accused.lastUpdate.label"),'default':("Last Update")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',42,['name':("lastUpdate"),'precision':("day"),'value':(accusedInstance?.lastUpdate),'default':("none"),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: accusedInstance, field: 'createDate', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("accused.createDate.label"),'default':("Create Date")],-1)
printHtmlPart(9)
invokeTag('datePicker','g',50,['name':("createDate"),'precision':("day"),'value':(accusedInstance?.createDate)],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387756077000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
