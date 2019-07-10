# crud-basico-memoria
Crud básico feito em memória com fins apenas didáticos

Para utilizar o projeto basta importar o arquivo pom.xml na raiz da pasta do projeto. 
OBS: Esse projeto foi feito inicialmente usando a IDE IntelliJ 

Usando a IDE IntelliJ basta navegar até a pasta  ..\crud-basico-memoria\crud\src\main\java\com\study\controllers e dar run na classe CrudApplication.java



# rotas

## POST  http://localhost:8080/usuario
Adiciona um usuário

### Parâmetros
Json no body com o seguinte formato: 

{
  "email": "exemplo@exemplo.com",	
  "senha": "exemplo"
}


## GET  http://localhost:8080/usuario
Retorna todos usuários

### Parâmetros
Não necessita nenhum

## GET  http://localhost:8080/usuario/getById
Retorna um usuario pelo seu ID

### Parâmetros
Querystring no formato:

http://localhost:8080/usuario/getById?id=3


## DELETE  http://localhost:8080/usuario/delete
Apaga um usuario pelo seu id

### Parâmetros
Querystring no formato:

http://localhost:8080/usuario/delete?id=4


## PUT  http://localhost:8080/usuario/update
Modifica um usuário

### Parâmetros
Passar ID na query string EX: http://localhost:8080/usuario/update?id=3
Json no body com o seguinte formato: 

{
  "email": "exemplo@exemplo.com",	
  "senha": "exemplo"
}
