
<%@ page import="org.krpt.User" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-user" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-user" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list user">
			
				<g:if test="${userInstance?.fname}">
				<li class="fieldcontain">
					<span id="fname-label" class="property-label"><g:message code="user.fname.label" default="Fname" /></span>
					
						<span class="property-value" aria-labelledby="fname-label"><g:fieldValue bean="${userInstance}" field="fname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.lname}">
				<li class="fieldcontain">
					<span id="lname-label" class="property-label"><g:message code="user.lname.label" default="Lname" /></span>
					
						<span class="property-value" aria-labelledby="lname-label"><g:fieldValue bean="${userInstance}" field="lname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.addressId}">
				<li class="fieldcontain">
					<span id="addressId-label" class="property-label"><g:message code="user.addressId.label" default="Address Id" /></span>
					
						<span class="property-value" aria-labelledby="addressId-label"><g:fieldValue bean="${userInstance}" field="addressId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.gender}">
				<li class="fieldcontain">
					<span id="gender-label" class="property-label"><g:message code="user.gender.label" default="Gender" /></span>
					
						<span class="property-value" aria-labelledby="gender-label"><g:fieldValue bean="${userInstance}" field="gender"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.admin}">
				<li class="fieldcontain">
					<span id="admin-label" class="property-label"><g:message code="user.admin.label" default="Admin" /></span>
					
						<span class="property-value" aria-labelledby="admin-label"><g:fieldValue bean="${userInstance}" field="admin"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.credential}">
				<li class="fieldcontain">
					<span id="credential-label" class="property-label"><g:message code="user.credential.label" default="Credential" /></span>
					
						<span class="property-value" aria-labelledby="credential-label"><g:link controller="userCredential" action="show" id="${userInstance?.credential?.id}">${userInstance?.credential?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.credentialId}">
				<li class="fieldcontain">
					<span id="credentialId-label" class="property-label"><g:message code="user.credentialId.label" default="Credential Id" /></span>
					
						<span class="property-value" aria-labelledby="credentialId-label"><g:fieldValue bean="${userInstance}" field="credentialId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.incidents}">
				<li class="fieldcontain">
					<span id="incidents-label" class="property-label"><g:message code="user.incidents.label" default="Incidents" /></span>
					
						<g:each in="${userInstance.incidents}" var="i">
						<span class="property-value" aria-labelledby="incidents-label"><g:link controller="case" action="show" id="${i.id}">${i?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.superUser}">
				<li class="fieldcontain">
					<span id="superUser-label" class="property-label"><g:message code="user.superUser.label" default="Super User" /></span>
					
						<span class="property-value" aria-labelledby="superUser-label"><g:fieldValue bean="${userInstance}" field="superUser"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:userInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${userInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
