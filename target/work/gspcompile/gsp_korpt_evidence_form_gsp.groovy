import org.krpt.Evidence
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_korpt_evidence_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/evidence/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: evidenceInstance, field: 'mediaLocation', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("evidence.mediaLocation.label"),'default':("Media Location")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("mediaLocation"),'value':(evidenceInstance?.mediaLocation)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: evidenceInstance, field: 'mediaType', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("evidence.mediaType.label"),'default':("Media Type")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("mediaType"),'value':(evidenceInstance?.mediaType)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: evidenceInstance, field: 'impactStatement', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("evidence.impactStatement.label"),'default':("Impact Statement")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("impactStatement"),'value':(evidenceInstance?.impactStatement)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: evidenceInstance, field: 'incidentId', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("evidence.incidentId.label"),'default':("Incident Id")],-1)
printHtmlPart(7)
invokeTag('field','g',34,['name':("incidentId"),'type':("number"),'value':(evidenceInstance.incidentId),'required':("")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387756172000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
