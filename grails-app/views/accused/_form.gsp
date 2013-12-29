<%@ page import="org.krpt.Accused" %>



<div class="fieldcontain ${hasErrors(bean: accusedInstance, field: 'fname', 'error')} ">
	<label for="fname">
		<g:message code="accused.fname.label" default="Fname" />
		
	</label>
	<g:textField name="fname" value="${accusedInstance?.fname}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: accusedInstance, field: 'lname', 'error')} ">
	<label for="lname">
		<g:message code="accused.lname.label" default="Lname" />
		
	</label>
	<g:textField name="lname" value="${accusedInstance?.lname}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: accusedInstance, field: 'addressId', 'error')} ">
	<label for="addressId">
		<g:message code="accused.addressId.label" default="Address Id" />
		
	</label>
	<g:field name="addressId" type="number" value="${accusedInstance.addressId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: accusedInstance, field: 'changeBy', 'error')} ">
	<label for="changeBy">
		<g:message code="accused.changeBy.label" default="Change By" />
		
	</label>
	<g:textField name="changeBy" value="${accusedInstance?.changeBy}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: accusedInstance, field: 'lastUpdate', 'error')} ">
	<label for="lastUpdate">
		<g:message code="accused.lastUpdate.label" default="Last Update" />
		
	</label>
	<g:datePicker name="lastUpdate" precision="day"  value="${accusedInstance?.lastUpdate}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: accusedInstance, field: 'createDate', 'error')} required">
	<label for="createDate">
		<g:message code="accused.createDate.label" default="Create Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="createDate" precision="day"  value="${accusedInstance?.createDate}"  />
</div>

