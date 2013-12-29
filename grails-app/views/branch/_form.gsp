<%@ page import="org.krpt.Branch" %>



<div class="fieldcontain ${hasErrors(bean: branchInstance, field: 'addressId', 'error')} required">
	<label for="addressId">
		<g:message code="branch.addressId.label" default="Address Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="addressId" type="number" value="${branchInstance.addressId}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: branchInstance, field: 'contactId', 'error')} required">
	<label for="contactId">
		<g:message code="branch.contactId.label" default="Contact Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="contactId" type="number" value="${branchInstance.contactId}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: branchInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="branch.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${branchInstance?.name}"/>
</div>

