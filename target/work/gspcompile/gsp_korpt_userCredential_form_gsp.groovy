import org.krpt.UserCredential
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_korpt_userCredential_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/userCredential/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userCredentialInstance, field: 'password', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("userCredential.password.label"),'default':("Password")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("password"),'value':(userCredentialInstance?.password)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userCredentialInstance, field: 'userId', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("userCredential.userId.label"),'default':("User Id")],-1)
printHtmlPart(5)
invokeTag('field','g',18,['name':("userId"),'type':("number"),'value':(userCredentialInstance.userId),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userCredentialInstance, field: 'userName', 'error'))
printHtmlPart(6)
invokeTag('message','g',23,['code':("userCredential.userName.label"),'default':("User Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("userName"),'value':(userCredentialInstance?.userName)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387756058000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
