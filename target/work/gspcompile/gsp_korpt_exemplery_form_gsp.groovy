import org.krpt.Exemplery
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_korpt_exemplery_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/exemplery/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: exempleryInstance, field: 'addressId', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("exemplery.addressId.label"),'default':("Address Id")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("addressId"),'type':("number"),'value':(exempleryInstance.addressId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: exempleryInstance, field: 'evidenceId', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("exemplery.evidenceId.label"),'default':("Evidence Id")],-1)
printHtmlPart(2)
invokeTag('field','g',18,['name':("evidenceId"),'type':("number"),'value':(exempleryInstance.evidenceId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: exempleryInstance, field: 'branchId', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("exemplery.branchId.label"),'default':("Branch Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("branchId"),'value':(exempleryInstance?.branchId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: exempleryInstance, field: 'departmentId', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("exemplery.departmentId.label"),'default':("Department Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("departmentId"),'value':(exempleryInstance?.departmentId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: exempleryInstance, field: 'fname', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("exemplery.fname.label"),'default':("Fname")],-1)
printHtmlPart(2)
invokeTag('textField','g',42,['name':("fname"),'value':(exempleryInstance?.fname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: exempleryInstance, field: 'lname', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("exemplery.lname.label"),'default':("Lname")],-1)
printHtmlPart(2)
invokeTag('textField','g',50,['name':("lname"),'value':(exempleryInstance?.lname)],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387756209000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
