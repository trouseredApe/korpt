import org.krpt.Contact
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_korpt_contact_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/contact/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: contactInstance, field: 'departmentId', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("contact.departmentId.label"),'default':("Department Id")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("departmentId"),'type':("number"),'value':(contactInstance.departmentId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: contactInstance, field: 'branchId', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("contact.branchId.label"),'default':("Branch Id")],-1)
printHtmlPart(2)
invokeTag('field','g',18,['name':("branchId"),'type':("number"),'value':(contactInstance.branchId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: contactInstance, field: 'email', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("contact.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("email"),'value':(contactInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: contactInstance, field: 'fname', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("contact.fname.label"),'default':("Fname")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("fname"),'value':(contactInstance?.fname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: contactInstance, field: 'lname', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("contact.lname.label"),'default':("Lname")],-1)
printHtmlPart(2)
invokeTag('textField','g',42,['name':("lname"),'value':(contactInstance?.lname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: contactInstance, field: 'phone', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("contact.phone.label"),'default':("Phone")],-1)
printHtmlPart(2)
invokeTag('textField','g',50,['name':("phone"),'value':(contactInstance?.phone)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: contactInstance, field: 'primary', 'error'))
printHtmlPart(9)
invokeTag('message','g',55,['code':("contact.primary.label"),'default':("Primary")],-1)
printHtmlPart(2)
invokeTag('checkBox','g',58,['name':("primary"),'value':(contactInstance?.primary)],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387756129000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
