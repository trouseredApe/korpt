
<%@ page import="org.krpt.Case" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'incident.label', default: 'Incident')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-incident" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-incident" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="departmentId" title="${message(code: 'incident.departmentId.label', default: 'Department Id')}" />
					
						<g:sortableColumn property="branchId" title="${message(code: 'incident.branchId.label', default: 'Branch Id')}" />
					
						<g:sortableColumn property="date" title="${message(code: 'incident.date.label', default: 'Date')}" />
					
						<g:sortableColumn property="addressId" title="${message(code: 'incident.addressId.label', default: 'Address Id')}" />
					
						<g:sortableColumn property="amount" title="${message(code: 'incident.amount.label', default: 'Amount')}" />
					
						<g:sortableColumn property="accusedId" title="${message(code: 'incident.accusedId.label', default: 'Accused Id')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${incidentInstanceList}" status="i" var="incidentInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${incidentInstance.id}">${fieldValue(bean: incidentInstance, field: "departmentId")}</g:link></td>
					
						<td>${fieldValue(bean: incidentInstance, field: "branchId")}</td>
					
						<td><g:formatDate date="${incidentInstance.date}" /></td>
					
						<td>${fieldValue(bean: incidentInstance, field: "addressId")}</td>
					
						<td>${fieldValue(bean: incidentInstance, field: "amount")}</td>
					
						<td>${fieldValue(bean: incidentInstance, field: "accusedId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${incidentInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
