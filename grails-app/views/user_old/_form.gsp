<%@ page import="org.krpt.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'fname', 'error')} ">
	<label for="fname">
		<g:message code="user.fname.label" default="Fname" />
		
	</label>
	<g:textField name="fname" value="${userInstance?.fname}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'lname', 'error')} ">
	<label for="lname">
		<g:message code="user.lname.label" default="Lname" />
		
	</label>
	<g:textField name="lname" value="${userInstance?.lname}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'addressId', 'error')} ">
	<label for="addressId">
		<g:message code="user.addressId.label" default="Address Id" />
		
	</label>
	<g:textField name="addressId" value="${userInstance?.addressId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'gender', 'error')} ">
	<label for="gender">
		<g:message code="user.gender.label" default="Gender" />
		
	</label>
	<g:textField name="gender" value="${userInstance?.gender}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'admin', 'error')} ">
	<label for="admin">
		<g:message code="user.admin.label" default="Admin" />
		
	</label>
	<g:textField name="admin" value="${userInstance?.admin}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'credential', 'error')} required">
	<label for="credential">
		<g:message code="user.credential.label" default="Credential" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="credential" name="credential.id" from="${org.krpt.UserCredential.list()}" optionKey="id" required="" value="${userInstance?.credential?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'credentialId', 'error')} required">
	<label for="credentialId">
		<g:message code="user.credentialId.label" default="Credential Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="credentialId" type="number" value="${userInstance.credentialId}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'incidents', 'error')} ">
	<label for="incidents">
		<g:message code="user.incidents.label" default="Incidents" />
		
	</label>
	<g:select name="incidents" from="${org.krpt.Case.list()}" multiple="multiple" optionKey="id" size="5" value="${userInstance?.incidents*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'superUser', 'error')} ">
	<label for="superUser">
		<g:message code="user.superUser.label" default="Super User" />
		
	</label>
	<g:textField name="superUser" value="${userInstance?.superUser}"/>
</div>

