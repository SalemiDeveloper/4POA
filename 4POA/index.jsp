<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rastreie Aqui</title>
</head>
<body>
<form action="BuscaCep" method="post">
Nome: <input type="text" id="nome" name="nome">
<br/>

Escolha uma forma para contatarmos você sobre sua encomenda: 
<br/>

<input type="checkbox" id="contatoEmail" name="contato" value="Email">
<label for="contatoEmail"> Email</label><br/>
<input type="checkbox" id="contatoTelefone" name="contato" value="Telefone">
<label for="contatoTelefone"> Telefone</label><br/>
<input type="checkbox" id="contatoCelular" name="contato" value="Celular">
<label for="contatoCelular"> Celular</label><br/>

<label for="escolaridade">Qual seu grau de escolaridade?</label>

<select name="escolaridade" id="escolaridade">
  <option value="ensinomedio">Ensino Médio</option>
  <option value="ensinosuperior">Ensino Superior</option>
  <option value="posgraduado">Pós Graduação</option>
  
</select>
<br/>

<label for="etnia">Qual sua etnia?</label>
<select name= "etnia" id="etnia" >
  <option value="preto">Preto</option>
  <option value="branco">Branco</option>
  <option value="pardo">Pardo</option>
</select> 
<br/>

<br/> <br/>CEP:<br/>
<input type="text" id="cep" name="cep">
<input type="submit" value="Enviar">
</form>
</body>
</html>
