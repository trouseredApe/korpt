import org.krpt.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_korpt_user_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userInstance, field: 'fname', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("user.fname.label"),'default':("Fname")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("fname"),'value':(userInstance?.fname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'lname', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("user.lname.label"),'default':("Lname")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("lname"),'value':(userInstance?.lname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'addressId', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("user.addressId.label"),'default':("Address Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("addressId"),'value':(userInstance?.addressId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'gender', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("user.gender.label"),'default':("Gender")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("gender"),'value':(userInstance?.gender)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'admin', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("user.admin.label"),'default':("Admin")],-1)
printHtmlPart(2)
invokeTag('textField','g',42,['name':("admin"),'value':(userInstance?.admin)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'credential', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("user.credential.label"),'default':("Credential")],-1)
printHtmlPart(9)
invokeTag('select','g',50,['id':("credential"),'name':("credential.id"),'from':(org.krpt.UserCredential.list()),'optionKey':("id"),'required':(""),'value':(userInstance?.credential?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'credentialId', 'error'))
printHtmlPart(10)
invokeTag('message','g',55,['code':("user.credentialId.label"),'default':("Credential Id")],-1)
printHtmlPart(9)
invokeTag('field','g',58,['name':("credentialId"),'type':("number"),'value':(userInstance.credentialId),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'incidents', 'error'))
printHtmlPart(11)
invokeTag('message','g',63,['code':("user.incidents.label"),'default':("Incidents")],-1)
printHtmlPart(2)
invokeTag('select','g',66,['name':("incidents"),'from':(org.krpt.Case.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(userInstance?.incidents*.id),'class':("many-to-many")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'superUser', 'error'))
printHtmlPart(12)
invokeTag('message','g',71,['code':("user.superUser.label"),'default':("Super User")],-1)
printHtmlPart(2)
invokeTag('textField','g',74,['name':("superUser"),'value':(userInstance?.superUser)],-1)
printHtmlPart(13)
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
