
<%@ page import="org.krpt.Accused" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'accused.label', default: 'Accused')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-accused" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-accused" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list accused">
			
				<g:if test="${accusedInstance?.fname}">
				<li class="fieldcontain">
					<span id="fname-label" class="property-label"><g:message code="accused.fname.label" default="Fname" /></span>
					
						<span class="property-value" aria-labelledby="fname-label"><g:fieldValue bean="${accusedInstance}" field="fname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accusedInstance?.lname}">
				<li class="fieldcontain">
					<span id="lname-label" class="property-label"><g:message code="accused.lname.label" default="Lname" /></span>
					
						<span class="property-value" aria-labelledby="lname-label"><g:fieldValue bean="${accusedInstance}" field="lname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accusedInstance?.addressId}">
				<li class="fieldcontain">
					<span id="addressId-label" class="property-label"><g:message code="accused.addressId.label" default="Address Id" /></span>
					
						<span class="property-value" aria-labelledby="addressId-label"><g:fieldValue bean="${accusedInstance}" field="addressId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accusedInstance?.changeBy}">
				<li class="fieldcontain">
					<span id="changeBy-label" class="property-label"><g:message code="accused.changeBy.label" default="Change By" /></span>
					
						<span class="property-value" aria-labelledby="changeBy-label"><g:fieldValue bean="${accusedInstance}" field="changeBy"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accusedInstance?.lastUpdate}">
				<li class="fieldcontain">
					<span id="lastUpdate-label" class="property-label"><g:message code="accused.lastUpdate.label" default="Last Update" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdate-label"><g:formatDate date="${accusedInstance?.lastUpdate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${accusedInstance?.createDate}">
				<li class="fieldcontain">
					<span id="createDate-label" class="property-label"><g:message code="accused.createDate.label" default="Create Date" /></span>
					
						<span class="property-value" aria-labelledby="createDate-label"><g:formatDate date="${accusedInstance?.createDate}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:accusedInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${accusedInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
