
<%@ page import="org.krpt.Accused" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'accused.label', default: 'Accused')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-accused" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-accused" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="fname" title="${message(code: 'accused.fname.label', default: 'Fname')}" />
					
						<g:sortableColumn property="lname" title="${message(code: 'accused.lname.label', default: 'Lname')}" />
					
						<g:sortableColumn property="addressId" title="${message(code: 'accused.addressId.label', default: 'Address Id')}" />
					
						<g:sortableColumn property="changeBy" title="${message(code: 'accused.changeBy.label', default: 'Change By')}" />
					
						<g:sortableColumn property="lastUpdate" title="${message(code: 'accused.lastUpdate.label', default: 'Last Update')}" />
					
						<g:sortableColumn property="createDate" title="${message(code: 'accused.createDate.label', default: 'Create Date')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${accusedInstanceList}" status="i" var="accusedInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${accusedInstance.id}">${fieldValue(bean: accusedInstance, field: "fname")}</g:link></td>
					
						<td>${fieldValue(bean: accusedInstance, field: "lname")}</td>
					
						<td>${fieldValue(bean: accusedInstance, field: "addressId")}</td>
					
						<td>${fieldValue(bean: accusedInstance, field: "changeBy")}</td>
					
						<td><g:formatDate date="${accusedInstance.lastUpdate}" /></td>
					
						<td><g:formatDate date="${accusedInstance.createDate}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${accusedInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
