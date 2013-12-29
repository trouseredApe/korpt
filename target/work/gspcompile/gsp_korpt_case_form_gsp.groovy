import org.krpt.Case
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_korpt_case_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/case/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: incidentInstance, field: 'departmentId', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("incident.departmentId.label"),'default':("Department Id")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("departmentId"),'type':("number"),'value':(incidentInstance.departmentId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: incidentInstance, field: 'branchId', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("incident.branchId.label"),'default':("Branch Id")],-1)
printHtmlPart(2)
invokeTag('field','g',18,['name':("branchId"),'type':("number"),'value':(incidentInstance.branchId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: incidentInstance, field: 'date', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("incident.date.label"),'default':("Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',26,['name':("date"),'precision':("day"),'value':(incidentInstance?.date),'default':("none"),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: incidentInstance, field: 'addressId', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("incident.addressId.label"),'default':("Address Id")],-1)
printHtmlPart(2)
invokeTag('field','g',34,['name':("addressId"),'type':("number"),'value':(incidentInstance.addressId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: incidentInstance, field: 'amount', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("incident.amount.label"),'default':("Amount")],-1)
printHtmlPart(2)
invokeTag('field','g',42,['name':("amount"),'value':(fieldValue(bean: incidentInstance, field: 'amount'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: incidentInstance, field: 'accusedId', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("incident.accusedId.label"),'default':("Accused Id")],-1)
printHtmlPart(9)
invokeTag('field','g',50,['name':("accusedId"),'type':("number"),'value':(incidentInstance.accusedId),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: incidentInstance, field: 'evidenceId', 'error'))
printHtmlPart(10)
invokeTag('message','g',55,['code':("incident.evidenceId.label"),'default':("Evidence Id")],-1)
printHtmlPart(9)
invokeTag('field','g',58,['name':("evidenceId"),'type':("number"),'value':(incidentInstance.evidenceId),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: incidentInstance, field: 'userId', 'error'))
printHtmlPart(11)
invokeTag('message','g',63,['code':("incident.userId.label"),'default':("User Id")],-1)
printHtmlPart(9)
invokeTag('field','g',66,['name':("userId"),'type':("number"),'value':(incidentInstance.userId),'required':("")],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387823532000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
