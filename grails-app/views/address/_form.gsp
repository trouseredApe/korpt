<%@ page import="org.krpt.Address" %>



<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="address.address.label" default="Address" />
		
	</label>
	<g:textField name="address" value="${addressInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'city', 'error')} ">
	<label for="city">
		<g:message code="address.city.label" default="City" />
		
	</label>
	<g:textField name="city" value="${addressInstance?.city}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'postalcode', 'error')} ">
	<label for="postalcode">
		<g:message code="address.postalcode.label" default="Postalcode" />
		
	</label>
	<g:textField name="postalcode" value="${addressInstance?.postalcode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'province', 'error')} ">
	<label for="province">
		<g:message code="address.province.label" default="Province" />
		
	</label>
	<g:textField name="province" value="${addressInstance?.province}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'country', 'error')} ">
	<label for="country">
		<g:message code="address.country.label" default="Country" />
		
	</label>
	<g:textField name="country" value="${addressInstance?.country}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'phone', 'error')} ">
	<label for="phone">
		<g:message code="address.phone.label" default="Phone" />
		
	</label>
	<g:textField name="phone" value="${addressInstance?.phone}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="address.email.label" default="Email" />
		
	</label>
	<g:textField name="email" value="${addressInstance?.email}"/>
</div>

