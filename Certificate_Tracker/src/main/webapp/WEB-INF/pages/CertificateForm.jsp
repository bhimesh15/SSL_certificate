<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Certificate</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Certificate</h1>
        <form:form action="saveCertiticate" method="post" modelAttribute="certificateDetail">
        <table>
            <form:hidden path="cer_id"/>
            <tr>
                <td>Certificate Name:</td>
                <td><form:input path="cer_domain_name" /></td>
            </tr>
            <tr>
                <td>PinnedToAkamai):</td>
                <td><form:input path="pinned_to_Akamai" /></td>
            </tr>
            <tr>
                <td>Original Certificate Name:</td>
                <td><form:input path="origin_Cert" /></td>
            </tr>
            <%-- <tr>
                <td>Telephone:</td>
                <td><form:input path="telephone" /></td>
            </tr> --%>
            <tr>
            <td>CertificateUpdateOrigin</td>
            <td>
            <form:select path="Cert_updated_at_origin">
			<form:option value="Select" label="Select" />
            <form:options items="${listData}" />
            </form:select>
            </td>
            </tr>
            
            <tr>
            <td>CertificateUpdateAkamai</td>
            <td>
            <form:select path="new_cert_pinned_at_Akamai">
			<form:option value="Select" label="Select" />
            <form:options items="${listData}" />
            </form:select>
            </td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
            
            <%-- <tr>
	            <td>
		        <ul>
		            <form:select path="Cert_updated_at_origin">
		                <form:option value="samsung">SAMSUNG</form:option>
		                <form:option value="nokia">NOKIA</form:option>
		            </form:select>
		        </ul>
			    </td>
            </tr>
            
             <tr>
	            <td>
		        <ul>
		            <form:select path="new_cert_pinned_at_Akamai">
		                <form:option value="samsung">SAMSUNG</form:option>
		                <form:option value="nokia">NOKIA</form:option>
		            </form:select>
		        </ul>
			    </td>
            </tr> --%>
            
            
        </table>
        </form:form>
    </div>
</body>
</html>