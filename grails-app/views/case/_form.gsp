<%@ page import="org.krpt.Case" %>



<div class="fieldcontain ${hasErrors(bean: incidentInstance, field: 'departmentId', 'error')} ">
	<label for="departmentId">
		<g:message code="incident.departmentId.label" default="Department Id" />
		
	</label>
	<g:field name="departmentId" type="number" value="${incidentInstance.departmentId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: incidentInstance, field: 'branchId', 'error')} ">
	<label for="branchId">
		<g:message code="incident.branchId.label" default="Branch Id" />
		
	</label>
	<g:field name="branchId" type="number" value="${incidentInstance.branchId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: incidentInstance, field: 'date', 'error')} ">
	<label for="date">
		<g:message code="incident.date.label" default="Date" />
		
	</label>
	<g:datePicker name="date" precision="day"  value="${incidentInstance?.date}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: incidentInstance, field: 'addressId', 'error')} ">
	<label for="addressId">
		<g:message code="incident.addressId.label" default="Address Id" />
		
	</label>
	<g:field name="addressId" type="number" value="${incidentInstance.addressId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: incidentInstance, field: 'amount', 'error')} ">
	<label for="amount">
		<g:message code="incident.amount.label" default="Amount" />
		
	</label>
	<g:field name="amount" value="${fieldValue(bean: incidentInstance, field: 'amount')}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: incidentInstance, field: 'accusedId', 'error')} required">
	<label for="accusedId">
		<g:message code="incident.accusedId.label" default="Accused Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="accusedId" type="number" value="${incidentInstance.accusedId}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: incidentInstance, field: 'evidenceId', 'error')} required">
	<label for="evidenceId">
		<g:message code="incident.evidenceId.label" default="Evidence Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="evidenceId" type="number" value="${incidentInstance.evidenceId}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: incidentInstance, field: 'userId', 'error')} required">
	<label for="userId">
		<g:message code="incident.userId.label" default="User Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="userId" type="number" value="${incidentInstance.userId}" required=""/>
</div>

