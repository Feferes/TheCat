# TheCat
Projeto de consulta no TheCatApi.com e REST

1) É necessário ter um MongoDB rodando na máquina que for executar o projeto.
2) É necessário abrir a solução com IntelliJ (ou outro de preferencia)
3) Rode o projeto com mvnw spring-boot:run


Durante a inicialização ele irá rodar uma função que fará a consulta no site e criará populando o banco.

- Na sequencia será disponibilizado, localmente (http://localhost:8080), uma api com os seguintes métodos:
	- http://localhost:8080/cat - listando todas as raças disponiveis
	- http://localhost:8080/cat/search/findByName?name=  colocando um nome de raça será trazido as informações daquela raca
	- http://localhost:8080/cat/search/findByTemperamentContains?temperament= é filtrado por temperamento
	- http://localhost:8080/cat/search/findByOriginContains?origin= é filtrado por origem
	
- Dentro da pasta Postman contém um arquivo .json que pode ser importado no postman, lá contém as 4 chamadas prontas pra serem executadas.