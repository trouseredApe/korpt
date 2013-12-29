
<%@ page import="org.krpt.Evidence" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'evidence.label', default: 'Evidence')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-evidence" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-evidence" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list evidence">
			
				<g:if test="${evidenceInstance?.mediaLocation}">
				<li class="fieldcontain">
					<span id="mediaLocation-label" class="property-label"><g:message code="evidence.mediaLocation.label" default="Media Location" /></span>
					
						<span class="property-value" aria-labelledby="mediaLocation-label"><g:fieldValue bean="${evidenceInstance}" field="mediaLocation"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${evidenceInstance?.mediaType}">
				<li class="fieldcontain">
					<span id="mediaType-label" class="property-label"><g:message code="evidence.mediaType.label" default="Media Type" /></span>
					
						<span class="property-value" aria-labelledby="mediaType-label"><g:fieldValue bean="${evidenceInstance}" field="mediaType"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${evidenceInstance?.impactStatement}">
				<li class="fieldcontain">
					<span id="impactStatement-label" class="property-label"><g:message code="evidence.impactStatement.label" default="Impact Statement" /></span>
					
						<span class="property-value" aria-labelledby="impactStatement-label"><g:fieldValue bean="${evidenceInstance}" field="impactStatement"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${evidenceInstance?.incidentId}">
				<li class="fieldcontain">
					<span id="incidentId-label" class="property-label"><g:message code="evidence.incidentId.label" default="Incident Id" /></span>
					
						<span class="property-value" aria-labelledby="incidentId-label"><g:fieldValue bean="${evidenceInstance}" field="incidentId"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:evidenceInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${evidenceInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
