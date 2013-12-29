
<%@ page import="org.krpt.UserCredential" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'userCredential.label', default: 'UserCredential')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-userCredential" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-userCredential" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="password" title="${message(code: 'userCredential.password.label', default: 'Password')}" />
					
						<g:sortableColumn property="userId" title="${message(code: 'userCredential.userId.label', default: 'User Id')}" />
					
						<g:sortableColumn property="userName" title="${message(code: 'userCredential.userName.label', default: 'User Name')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${userCredentialInstanceList}" status="i" var="userCredentialInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${userCredentialInstance.id}">${fieldValue(bean: userCredentialInstance, field: "password")}</g:link></td>
					
						<td>${fieldValue(bean: userCredentialInstance, field: "userId")}</td>
					
						<td>${fieldValue(bean: userCredentialInstance, field: "userName")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${userCredentialInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
