import org.krpt.Exemplery
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_korpt_exempleryshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/exemplery/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'exemplery.label', default: 'Exemplery'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (exempleryInstance?.addressId)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("exemplery.addressId.label"),'default':("Address Id")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(exempleryInstance),'field':("addressId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (exempleryInstance?.evidenceId)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("exemplery.evidenceId.label"),'default':("Evidence Id")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(exempleryInstance),'field':("evidenceId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (exempleryInstance?.branchId)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("exemplery.branchId.label"),'default':("Branch Id")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(exempleryInstance),'field':("branchId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (exempleryInstance?.departmentId)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("exemplery.departmentId.label"),'default':("Department Id")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(exempleryInstance),'field':("departmentId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (exempleryInstance?.fname)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("exemplery.fname.label"),'default':("Fname")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(exempleryInstance),'field':("fname")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (exempleryInstance?.lname)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("exemplery.lname.label"),'default':("Lname")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(exempleryInstance),'field':("lname")],-1)
printHtmlPart(16)
}
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(29)
createTagBody(3, {->
invokeTag('message','g',83,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',83,['class':("edit"),'action':("edit"),'resource':(exempleryInstance)],3)
printHtmlPart(30)
invokeTag('actionSubmit','g',84,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(31)
})
invokeTag('form','g',86,['url':([resource:exempleryInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',88,[:],1)
printHtmlPart(33)
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
