
<%@ page import="org.krpt.Evidence" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'evidence.label', default: 'Evidence')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-evidence" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-evidence" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="mediaLocation" title="${message(code: 'evidence.mediaLocation.label', default: 'Media Location')}" />
					
						<g:sortableColumn property="mediaType" title="${message(code: 'evidence.mediaType.label', default: 'Media Type')}" />
					
						<g:sortableColumn property="impactStatement" title="${message(code: 'evidence.impactStatement.label', default: 'Impact Statement')}" />
					
						<g:sortableColumn property="incidentId" title="${message(code: 'evidence.incidentId.label', default: 'Incident Id')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${evidenceInstanceList}" status="i" var="evidenceInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${evidenceInstance.id}">${fieldValue(bean: evidenceInstance, field: "mediaLocation")}</g:link></td>
					
						<td>${fieldValue(bean: evidenceInstance, field: "mediaType")}</td>
					
						<td>${fieldValue(bean: evidenceInstance, field: "impactStatement")}</td>
					
						<td>${fieldValue(bean: evidenceInstance, field: "incidentId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${evidenceInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
