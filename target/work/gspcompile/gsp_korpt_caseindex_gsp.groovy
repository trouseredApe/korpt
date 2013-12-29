import org.krpt.Case
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_korpt_caseindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/case/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'incident.label', default: 'Incident'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("departmentId"),'title':(message(code: 'incident.departmentId.label', default: 'Department Id'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("branchId"),'title':(message(code: 'incident.branchId.label', default: 'Branch Id'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("date"),'title':(message(code: 'incident.date.label', default: 'Date'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("addressId"),'title':(message(code: 'incident.addressId.label', default: 'Address Id'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',35,['property':("amount"),'title':(message(code: 'incident.amount.label', default: 'Amount'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',37,['property':("accusedId"),'title':(message(code: 'incident.accusedId.label', default: 'Accused Id'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( incidentInstance in (incidentInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: incidentInstance, field: "departmentId"))
})
invokeTag('link','g',45,['action':("show"),'id':(incidentInstance.id)],3)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: incidentInstance, field: "branchId"))
printHtmlPart(17)
invokeTag('formatDate','g',49,['date':(incidentInstance.date)],-1)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: incidentInstance, field: "addressId"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: incidentInstance, field: "amount"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: incidentInstance, field: "accusedId"))
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',62,['total':(incidentInstanceCount ?: 0)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387823533000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
