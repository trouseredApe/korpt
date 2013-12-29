
<%@ page import="org.krpt.Case" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'incident.label', default: 'Incident')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-incident" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-incident" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list incident">
			
				<g:if test="${incidentInstance?.departmentId}">
				<li class="fieldcontain">
					<span id="departmentId-label" class="property-label"><g:message code="incident.departmentId.label" default="Department Id" /></span>
					
						<span class="property-value" aria-labelledby="departmentId-label"><g:fieldValue bean="${incidentInstance}" field="departmentId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${incidentInstance?.branchId}">
				<li class="fieldcontain">
					<span id="branchId-label" class="property-label"><g:message code="incident.branchId.label" default="Branch Id" /></span>
					
						<span class="property-value" aria-labelledby="branchId-label"><g:fieldValue bean="${incidentInstance}" field="branchId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${incidentInstance?.date}">
				<li class="fieldcontain">
					<span id="date-label" class="property-label"><g:message code="incident.date.label" default="Date" /></span>
					
						<span class="property-value" aria-labelledby="date-label"><g:formatDate date="${incidentInstance?.date}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${incidentInstance?.addressId}">
				<li class="fieldcontain">
					<span id="addressId-label" class="property-label"><g:message code="incident.addressId.label" default="Address Id" /></span>
					
						<span class="property-value" aria-labelledby="addressId-label"><g:fieldValue bean="${incidentInstance}" field="addressId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${incidentInstance?.amount}">
				<li class="fieldcontain">
					<span id="amount-label" class="property-label"><g:message code="incident.amount.label" default="Amount" /></span>
					
						<span class="property-value" aria-labelledby="amount-label"><g:fieldValue bean="${incidentInstance}" field="amount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${incidentInstance?.accusedId}">
				<li class="fieldcontain">
					<span id="accusedId-label" class="property-label"><g:message code="incident.accusedId.label" default="Accused Id" /></span>
					
						<span class="property-value" aria-labelledby="accusedId-label"><g:fieldValue bean="${incidentInstance}" field="accusedId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${incidentInstance?.evidenceId}">
				<li class="fieldcontain">
					<span id="evidenceId-label" class="property-label"><g:message code="incident.evidenceId.label" default="Evidence Id" /></span>
					
						<span class="property-value" aria-labelledby="evidenceId-label"><g:fieldValue bean="${incidentInstance}" field="evidenceId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${incidentInstance?.userId}">
				<li class="fieldcontain">
					<span id="userId-label" class="property-label"><g:message code="incident.userId.label" default="User Id" /></span>
					
						<span class="property-value" aria-labelledby="userId-label"><g:fieldValue bean="${incidentInstance}" field="userId"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:incidentInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${incidentInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
