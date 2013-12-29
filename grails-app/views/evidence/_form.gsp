<%@ page import="org.krpt.Evidence" %>



<div class="fieldcontain ${hasErrors(bean: evidenceInstance, field: 'mediaLocation', 'error')} ">
	<label for="mediaLocation">
		<g:message code="evidence.mediaLocation.label" default="Media Location" />
		
	</label>
	<g:textField name="mediaLocation" value="${evidenceInstance?.mediaLocation}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: evidenceInstance, field: 'mediaType', 'error')} ">
	<label for="mediaType">
		<g:message code="evidence.mediaType.label" default="Media Type" />
		
	</label>
	<g:textField name="mediaType" value="${evidenceInstance?.mediaType}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: evidenceInstance, field: 'impactStatement', 'error')} ">
	<label for="impactStatement">
		<g:message code="evidence.impactStatement.label" default="Impact Statement" />
		
	</label>
	<g:textField name="impactStatement" value="${evidenceInstance?.impactStatement}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: evidenceInstance, field: 'incidentId', 'error')} required">
	<label for="incidentId">
		<g:message code="evidence.incidentId.label" default="Incident Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="incidentId" type="number" value="${evidenceInstance.incidentId}" required=""/>
</div>

