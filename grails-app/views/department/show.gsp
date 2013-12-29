
<%@ page import="org.krpt.Department" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'department.label', default: 'Department')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-department" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-department" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list department">
			
				<g:if test="${departmentInstance?.contactId}">
				<li class="fieldcontain">
					<span id="contactId-label" class="property-label"><g:message code="department.contactId.label" default="Contact Id" /></span>
					
						<span class="property-value" aria-labelledby="contactId-label"><g:fieldValue bean="${departmentInstance}" field="contactId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${departmentInstance?.addressId}">
				<li class="fieldcontain">
					<span id="addressId-label" class="property-label"><g:message code="department.addressId.label" default="Address Id" /></span>
					
						<span class="property-value" aria-labelledby="addressId-label"><g:fieldValue bean="${departmentInstance}" field="addressId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${departmentInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="department.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${departmentInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:departmentInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${departmentInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
