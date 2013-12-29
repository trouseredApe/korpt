
<%@ page import="org.krpt.Exemplery" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'exemplery.label', default: 'Exemplery')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-exemplery" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-exemplery" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list exemplery">
			
				<g:if test="${exempleryInstance?.addressId}">
				<li class="fieldcontain">
					<span id="addressId-label" class="property-label"><g:message code="exemplery.addressId.label" default="Address Id" /></span>
					
						<span class="property-value" aria-labelledby="addressId-label"><g:fieldValue bean="${exempleryInstance}" field="addressId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${exempleryInstance?.evidenceId}">
				<li class="fieldcontain">
					<span id="evidenceId-label" class="property-label"><g:message code="exemplery.evidenceId.label" default="Evidence Id" /></span>
					
						<span class="property-value" aria-labelledby="evidenceId-label"><g:fieldValue bean="${exempleryInstance}" field="evidenceId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${exempleryInstance?.branchId}">
				<li class="fieldcontain">
					<span id="branchId-label" class="property-label"><g:message code="exemplery.branchId.label" default="Branch Id" /></span>
					
						<span class="property-value" aria-labelledby="branchId-label"><g:fieldValue bean="${exempleryInstance}" field="branchId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${exempleryInstance?.departmentId}">
				<li class="fieldcontain">
					<span id="departmentId-label" class="property-label"><g:message code="exemplery.departmentId.label" default="Department Id" /></span>
					
						<span class="property-value" aria-labelledby="departmentId-label"><g:fieldValue bean="${exempleryInstance}" field="departmentId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${exempleryInstance?.fname}">
				<li class="fieldcontain">
					<span id="fname-label" class="property-label"><g:message code="exemplery.fname.label" default="Fname" /></span>
					
						<span class="property-value" aria-labelledby="fname-label"><g:fieldValue bean="${exempleryInstance}" field="fname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${exempleryInstance?.lname}">
				<li class="fieldcontain">
					<span id="lname-label" class="property-label"><g:message code="exemplery.lname.label" default="Lname" /></span>
					
						<span class="property-value" aria-labelledby="lname-label"><g:fieldValue bean="${exempleryInstance}" field="lname"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:exempleryInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${exempleryInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
