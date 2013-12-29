<%@ page import="org.krpt.Exemplery" %>



<div class="fieldcontain ${hasErrors(bean: exempleryInstance, field: 'addressId', 'error')} ">
	<label for="addressId">
		<g:message code="exemplery.addressId.label" default="Address Id" />
		
	</label>
	<g:field name="addressId" type="number" value="${exempleryInstance.addressId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: exempleryInstance, field: 'evidenceId', 'error')} ">
	<label for="evidenceId">
		<g:message code="exemplery.evidenceId.label" default="Evidence Id" />
		
	</label>
	<g:field name="evidenceId" type="number" value="${exempleryInstance.evidenceId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: exempleryInstance, field: 'branchId', 'error')} ">
	<label for="branchId">
		<g:message code="exemplery.branchId.label" default="Branch Id" />
		
	</label>
	<g:textField name="branchId" value="${exempleryInstance?.branchId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: exempleryInstance, field: 'departmentId', 'error')} ">
	<label for="departmentId">
		<g:message code="exemplery.departmentId.label" default="Department Id" />
		
	</label>
	<g:textField name="departmentId" value="${exempleryInstance?.departmentId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: exempleryInstance, field: 'fname', 'error')} ">
	<label for="fname">
		<g:message code="exemplery.fname.label" default="Fname" />
		
	</label>
	<g:textField name="fname" value="${exempleryInstance?.fname}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: exempleryInstance, field: 'lname', 'error')} ">
	<label for="lname">
		<g:message code="exemplery.lname.label" default="Lname" />
		
	</label>
	<g:textField name="lname" value="${exempleryInstance?.lname}"/>
</div>

