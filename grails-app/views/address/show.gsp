
<%@ page import="org.krpt.Address" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'address.label', default: 'Address')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-address" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-address" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list address">
			
				<g:if test="${addressInstance?.address}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="address.address.label" default="Address" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:fieldValue bean="${addressInstance}" field="address"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${addressInstance?.city}">
				<li class="fieldcontain">
					<span id="city-label" class="property-label"><g:message code="address.city.label" default="City" /></span>
					
						<span class="property-value" aria-labelledby="city-label"><g:fieldValue bean="${addressInstance}" field="city"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${addressInstance?.postalcode}">
				<li class="fieldcontain">
					<span id="postalcode-label" class="property-label"><g:message code="address.postalcode.label" default="Postalcode" /></span>
					
						<span class="property-value" aria-labelledby="postalcode-label"><g:fieldValue bean="${addressInstance}" field="postalcode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${addressInstance?.province}">
				<li class="fieldcontain">
					<span id="province-label" class="property-label"><g:message code="address.province.label" default="Province" /></span>
					
						<span class="property-value" aria-labelledby="province-label"><g:fieldValue bean="${addressInstance}" field="province"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${addressInstance?.country}">
				<li class="fieldcontain">
					<span id="country-label" class="property-label"><g:message code="address.country.label" default="Country" /></span>
					
						<span class="property-value" aria-labelledby="country-label"><g:fieldValue bean="${addressInstance}" field="country"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${addressInstance?.phone}">
				<li class="fieldcontain">
					<span id="phone-label" class="property-label"><g:message code="address.phone.label" default="Phone" /></span>
					
						<span class="property-value" aria-labelledby="phone-label"><g:fieldValue bean="${addressInstance}" field="phone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${addressInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="address.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${addressInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:addressInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${addressInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
