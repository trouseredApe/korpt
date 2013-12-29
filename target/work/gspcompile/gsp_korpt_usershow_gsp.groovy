import org.krpt.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_korpt_usershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
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
if(true && (userInstance?.fname)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("user.fname.label"),'default':("Fname")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(userInstance),'field':("fname")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.lname)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("user.lname.label"),'default':("Lname")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(userInstance),'field':("lname")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.addressId)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("user.addressId.label"),'default':("Address Id")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(userInstance),'field':("addressId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.gender)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("user.gender.label"),'default':("Gender")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(userInstance),'field':("gender")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.admin)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("user.admin.label"),'default':("Admin")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(userInstance),'field':("admin")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.credential)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("user.credential.label"),'default':("Credential")],-1)
printHtmlPart(27)
createTagBody(3, {->
expressionOut.print(userInstance?.credential?.encodeAsHTML())
})
invokeTag('link','g',75,['controller':("userCredential"),'action':("show"),'id':(userInstance?.credential?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.credentialId)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("user.credentialId.label"),'default':("Credential Id")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(userInstance),'field':("credentialId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.incidents)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("user.incidents.label"),'default':("Incidents")],-1)
printHtmlPart(31)
for( i in (userInstance.incidents) ) {
printHtmlPart(32)
createTagBody(4, {->
expressionOut.print(i?.encodeAsHTML())
})
invokeTag('link','g',94,['controller':("case"),'action':("show"),'id':(i.id)],4)
printHtmlPart(33)
}
printHtmlPart(34)
}
printHtmlPart(17)
if(true && (userInstance?.superUser)) {
printHtmlPart(35)
invokeTag('message','g',102,['code':("user.superUser.label"),'default':("Super User")],-1)
printHtmlPart(36)
invokeTag('fieldValue','g',104,['bean':(userInstance),'field':("superUser")],-1)
printHtmlPart(16)
}
printHtmlPart(37)
createTagBody(2, {->
printHtmlPart(38)
createTagBody(3, {->
invokeTag('message','g',112,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',112,['class':("edit"),'action':("edit"),'resource':(userInstance)],3)
printHtmlPart(39)
invokeTag('actionSubmit','g',113,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(40)
})
invokeTag('form','g',115,['url':([resource:userInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',117,[:],1)
printHtmlPart(42)
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
