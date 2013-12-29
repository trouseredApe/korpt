
<%@ page import="org.krpt.UserCredential" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'userCredential.label', default: 'UserCredential')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-userCredential" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-userCredential" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list userCredential">
			
				<g:if test="${userCredentialInstance?.password}">
				<li class="fieldcontain">
					<span id="password-label" class="property-label"><g:message code="userCredential.password.label" default="Password" /></span>
					
						<span class="property-value" aria-labelledby="password-label"><g:fieldValue bean="${userCredentialInstance}" field="password"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userCredentialInstance?.userId}">
				<li class="fieldcontain">
					<span id="userId-label" class="property-label"><g:message code="userCredential.userId.label" default="User Id" /></span>
					
						<span class="property-value" aria-labelledby="userId-label"><g:fieldValue bean="${userCredentialInstance}" field="userId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userCredentialInstance?.userName}">
				<li class="fieldcontain">
					<span id="userName-label" class="property-label"><g:message code="userCredential.userName.label" default="User Name" /></span>
					
						<span class="property-value" aria-labelledby="userName-label"><g:fieldValue bean="${userCredentialInstance}" field="userName"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:userCredentialInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${userCredentialInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
