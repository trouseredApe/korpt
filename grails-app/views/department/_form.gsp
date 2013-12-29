<%@ page import="org.krpt.Department" %>



<div class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'contactId', 'error')} ">
	<label for="contactId">
		<g:message code="department.contactId.label" default="Contact Id" />
		
	</label>
	<g:field name="contactId" type="number" value="${departmentInstance.contactId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'addressId', 'error')} required">
	<label for="addressId">
		<g:message code="department.addressId.label" default="Address Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="addressId" type="number" value="${departmentInstance.addressId}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="department.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${departmentInstance?.name}"/>
</div>

