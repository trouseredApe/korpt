
<%@ page import="org.krpt.Contact" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'contact.label', default: 'Contact')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-contact" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-contact" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="departmentId" title="${message(code: 'contact.departmentId.label', default: 'Department Id')}" />
					
						<g:sortableColumn property="branchId" title="${message(code: 'contact.branchId.label', default: 'Branch Id')}" />
					
						<g:sortableColumn property="email" title="${message(code: 'contact.email.label', default: 'Email')}" />
					
						<g:sortableColumn property="fname" title="${message(code: 'contact.fname.label', default: 'Fname')}" />
					
						<g:sortableColumn property="lname" title="${message(code: 'contact.lname.label', default: 'Lname')}" />
					
						<g:sortableColumn property="phone" title="${message(code: 'contact.phone.label', default: 'Phone')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${contactInstanceList}" status="i" var="contactInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${contactInstance.id}">${fieldValue(bean: contactInstance, field: "departmentId")}</g:link></td>
					
						<td>${fieldValue(bean: contactInstance, field: "branchId")}</td>
					
						<td>${fieldValue(bean: contactInstance, field: "email")}</td>
					
						<td>${fieldValue(bean: contactInstance, field: "fname")}</td>
					
						<td>${fieldValue(bean: contactInstance, field: "lname")}</td>
					
						<td>${fieldValue(bean: contactInstance, field: "phone")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${contactInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
