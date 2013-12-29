import org.krpt.Department
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_korpt_department_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/department/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: departmentInstance, field: 'contactId', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("department.contactId.label"),'default':("Contact Id")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("contactId"),'type':("number"),'value':(departmentInstance.contactId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: departmentInstance, field: 'addressId', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("department.addressId.label"),'default':("Address Id")],-1)
printHtmlPart(5)
invokeTag('field','g',18,['name':("addressId"),'type':("number"),'value':(departmentInstance.addressId),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: departmentInstance, field: 'name', 'error'))
printHtmlPart(6)
invokeTag('message','g',23,['code':("department.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("name"),'value':(departmentInstance?.name)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387756149000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
