
<%@ page import="org.krpt.User" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-user" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-user" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="fname" title="${message(code: 'user.fname.label', default: 'Fname')}" />
					
						<g:sortableColumn property="lname" title="${message(code: 'user.lname.label', default: 'Lname')}" />
					
						<g:sortableColumn property="addressId" title="${message(code: 'user.addressId.label', default: 'Address Id')}" />
					
						<g:sortableColumn property="gender" title="${message(code: 'user.gender.label', default: 'Gender')}" />
					
						<g:sortableColumn property="admin" title="${message(code: 'user.admin.label', default: 'Admin')}" />
					
						<th><g:message code="user.credential.label" default="Credential" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${userInstanceList}" status="i" var="userInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${userInstance.id}">${fieldValue(bean: userInstance, field: "fname")}</g:link></td>
					
						<td>${fieldValue(bean: userInstance, field: "lname")}</td>
					
						<td>${fieldValue(bean: userInstance, field: "addressId")}</td>
					
						<td>${fieldValue(bean: userInstance, field: "gender")}</td>
					
						<td>${fieldValue(bean: userInstance, field: "admin")}</td>
					
						<td>${fieldValue(bean: userInstance, field: "credential")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${userInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
