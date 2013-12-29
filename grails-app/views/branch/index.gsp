
<%@ page import="org.krpt.Branch" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'branch.label', default: 'Branch')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-branch" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-branch" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="addressId" title="${message(code: 'branch.addressId.label', default: 'Address Id')}" />
					
						<g:sortableColumn property="contactId" title="${message(code: 'branch.contactId.label', default: 'Contact Id')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'branch.name.label', default: 'Name')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${branchInstanceList}" status="i" var="branchInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${branchInstance.id}">${fieldValue(bean: branchInstance, field: "addressId")}</g:link></td>
					
						<td>${fieldValue(bean: branchInstance, field: "contactId")}</td>
					
						<td>${fieldValue(bean: branchInstance, field: "name")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${branchInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
