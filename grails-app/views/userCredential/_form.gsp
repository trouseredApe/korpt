<%@ page import="org.krpt.UserCredential" %>



<div class="fieldcontain ${hasErrors(bean: userCredentialInstance, field: 'password', 'error')} ">
	<label for="password">
		<g:message code="userCredential.password.label" default="Password" />
		
	</label>
	<g:textField name="password" value="${userCredentialInstance?.password}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userCredentialInstance, field: 'userId', 'error')} required">
	<label for="userId">
		<g:message code="userCredential.userId.label" default="User Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="userId" type="number" value="${userCredentialInstance.userId}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: userCredentialInstance, field: 'userName', 'error')} ">
	<label for="userName">
		<g:message code="userCredential.userName.label" default="User Name" />
		
	</label>
	<g:textField name="userName" value="${userCredentialInstance?.userName}"/>
</div>

