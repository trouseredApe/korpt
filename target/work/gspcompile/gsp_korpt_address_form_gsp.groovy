import org.krpt.Address
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_korpt_address_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/address/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: addressInstance, field: 'address', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("address.address.label"),'default':("Address")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("address"),'value':(addressInstance?.address)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'city', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("address.city.label"),'default':("City")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("city"),'value':(addressInstance?.city)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'postalcode', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("address.postalcode.label"),'default':("Postalcode")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("postalcode"),'value':(addressInstance?.postalcode)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'province', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("address.province.label"),'default':("Province")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("province"),'value':(addressInstance?.province)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'country', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("address.country.label"),'default':("Country")],-1)
printHtmlPart(2)
invokeTag('textField','g',42,['name':("country"),'value':(addressInstance?.country)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'phone', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("address.phone.label"),'default':("Phone")],-1)
printHtmlPart(2)
invokeTag('textField','g',50,['name':("phone"),'value':(addressInstance?.phone)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'email', 'error'))
printHtmlPart(9)
invokeTag('message','g',55,['code':("address.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('textField','g',58,['name':("email"),'value':(addressInstance?.email)],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387756095000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
