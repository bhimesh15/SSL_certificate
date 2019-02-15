<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Certificate Management Screen</title>
</head>
<body>
	<div align="center">
			
		<table border="1">

			<th>cer_id</th>
			<th>cer_domain_name</th>
			<th>cer_domain_name</th>
			<th>cer_domain_name</th>
			<th>Action</th>
			<c:forEach var="certificate" items="${listCertificates}">
				<tr>
					<td>${certificate.cer_id}</td>
					<td>${certificate.cer_domain_name}</td>
					<td>${certificate.pinned_to_Akamai}</td>
					<td>${certificate.origin_Cert}</td>
					<td><a href="editCertificate?cer_id=${certificate.cer_id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteCertificate?cer_id=${certificate.cer_id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Certificate Register <a href="newCertiticate">here</a>
		</h4>
	</div>
</body>
</html>