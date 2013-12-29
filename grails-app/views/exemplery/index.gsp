
<%@ page import="org.krpt.Exemplery" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'exemplery.label', default: 'Exemplery')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-exemplery" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-exemplery" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="addressId" title="${message(code: 'exemplery.addressId.label', default: 'Address Id')}" />
					
						<g:sortableColumn property="evidenceId" title="${message(code: 'exemplery.evidenceId.label', default: 'Evidence Id')}" />
					
						<g:sortableColumn property="branchId" title="${message(code: 'exemplery.branchId.label', default: 'Branch Id')}" />
					
						<g:sortableColumn property="departmentId" title="${message(code: 'exemplery.departmentId.label', default: 'Department Id')}" />
					
						<g:sortableColumn property="fname" title="${message(code: 'exemplery.fname.label', default: 'Fname')}" />
					
						<g:sortableColumn property="lname" title="${message(code: 'exemplery.lname.label', default: 'Lname')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${exempleryInstanceList}" status="i" var="exempleryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${exempleryInstance.id}">${fieldValue(bean: exempleryInstance, field: "addressId")}</g:link></td>
					
						<td>${fieldValue(bean: exempleryInstance, field: "evidenceId")}</td>
					
						<td>${fieldValue(bean: exempleryInstance, field: "branchId")}</td>
					
						<td>${fieldValue(bean: exempleryInstance, field: "departmentId")}</td>
					
						<td>${fieldValue(bean: exempleryInstance, field: "fname")}</td>
					
						<td>${fieldValue(bean: exempleryInstance, field: "lname")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${exempleryInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
