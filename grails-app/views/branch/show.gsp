
<%@ page import="org.krpt.Branch" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'branch.label', default: 'Branch')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-branch" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-branch" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list branch">
			
				<g:if test="${branchInstance?.addressId}">
				<li class="fieldcontain">
					<span id="addressId-label" class="property-label"><g:message code="branch.addressId.label" default="Address Id" /></span>
					
						<span class="property-value" aria-labelledby="addressId-label"><g:fieldValue bean="${branchInstance}" field="addressId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${branchInstance?.contactId}">
				<li class="fieldcontain">
					<span id="contactId-label" class="property-label"><g:message code="branch.contactId.label" default="Contact Id" /></span>
					
						<span class="property-value" aria-labelledby="contactId-label"><g:fieldValue bean="${branchInstance}" field="contactId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${branchInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="branch.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${branchInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:branchInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${branchInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
