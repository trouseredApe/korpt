<%@ page import="org.krpt.Contact" %>



<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'departmentId', 'error')} ">
	<label for="departmentId">
		<g:message code="contact.departmentId.label" default="Department Id" />
		
	</label>
	<g:field name="departmentId" type="number" value="${contactInstance.departmentId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'branchId', 'error')} ">
	<label for="branchId">
		<g:message code="contact.branchId.label" default="Branch Id" />
		
	</label>
	<g:field name="branchId" type="number" value="${contactInstance.branchId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="contact.email.label" default="Email" />
		
	</label>
	<g:textField name="email" value="${contactInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'fname', 'error')} ">
	<label for="fname">
		<g:message code="contact.fname.label" default="Fname" />
		
	</label>
	<g:textField name="fname" value="${contactInstance?.fname}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'lname', 'error')} ">
	<label for="lname">
		<g:message code="contact.lname.label" default="Lname" />
		
	</label>
	<g:textField name="lname" value="${contactInstance?.lname}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'phone', 'error')} ">
	<label for="phone">
		<g:message code="contact.phone.label" default="Phone" />
		
	</label>
	<g:textField name="phone" value="${contactInstance?.phone}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'primary', 'error')} ">
	<label for="primary">
		<g:message code="contact.primary.label" default="Primary" />
		
	</label>
	<g:checkBox name="primary" value="${contactInstance?.primary}" />
</div>

