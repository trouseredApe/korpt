
<%@ page import="org.krpt.Contact" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'contact.label', default: 'Contact')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-contact" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-contact" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list contact">
			
				<g:if test="${contactInstance?.departmentId}">
				<li class="fieldcontain">
					<span id="departmentId-label" class="property-label"><g:message code="contact.departmentId.label" default="Department Id" /></span>
					
						<span class="property-value" aria-labelledby="departmentId-label"><g:fieldValue bean="${contactInstance}" field="departmentId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${contactInstance?.branchId}">
				<li class="fieldcontain">
					<span id="branchId-label" class="property-label"><g:message code="contact.branchId.label" default="Branch Id" /></span>
					
						<span class="property-value" aria-labelledby="branchId-label"><g:fieldValue bean="${contactInstance}" field="branchId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${contactInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="contact.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${contactInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${contactInstance?.fname}">
				<li class="fieldcontain">
					<span id="fname-label" class="property-label"><g:message code="contact.fname.label" default="Fname" /></span>
					
						<span class="property-value" aria-labelledby="fname-label"><g:fieldValue bean="${contactInstance}" field="fname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${contactInstance?.lname}">
				<li class="fieldcontain">
					<span id="lname-label" class="property-label"><g:message code="contact.lname.label" default="Lname" /></span>
					
						<span class="property-value" aria-labelledby="lname-label"><g:fieldValue bean="${contactInstance}" field="lname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${contactInstance?.phone}">
				<li class="fieldcontain">
					<span id="phone-label" class="property-label"><g:message code="contact.phone.label" default="Phone" /></span>
					
						<span class="property-value" aria-labelledby="phone-label"><g:fieldValue bean="${contactInstance}" field="phone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${contactInstance?.primary}">
				<li class="fieldcontain">
					<span id="primary-label" class="property-label"><g:message code="contact.primary.label" default="Primary" /></span>
					
						<span class="property-value" aria-labelledby="primary-label"><g:formatBoolean boolean="${contactInstance?.primary}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:contactInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${contactInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
