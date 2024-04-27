<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="cep.Endereco" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rastreie Aqui</title>
</head>
<body>
<%Endereco end = (Endereco)session.getAttribute("End");%>
<br/>
Rua:<%=end.getLogradouro() %>
<br/>
Bairro:<%=end.getBairro() %>
<br/>
Localidade:<%=end.getLocalidade() %>



<p>Nome: <%= session.getAttribute("nome") %></p>

<p>Contato: <%= session.getAttribute("contato")%></p>

<p>Grau de Escolaridade: <%= session.getAttribute("escolaridade") %></p>

<p>Etnia: <%= session.getAttribute("etnia") %></p>
<p>CEP: <%= session.getAttribute("cep") %></p>

</body>
</html>
