Projeto Livraria do Curso de Jsf do Alura

Depend�ncias usadas
	
	javax.faces-2.1.14.jar
	
Criando uma tabela de duas colunas

	<h:panelGrid columns="2">
	
Criando label e inputs

	<h:outputLabel value="Titulo: " for="titulo" />
	<h:inputText id="titulo" value="#{livroBean.livro.titulo}"/>
	<h:outputLabel value="ISBN: " for="isbn" />
	<h:inputText id="isbn" value="#{livroBean.livro.isbn}"/>
	<h:outputLabel value="Pre�o: " for="preco" />
	<h:inputText id="preco" value="#{livroBean.livro.preco}"/>
	<h:outputLabel value="Data de Lan�amento: " for="dataLancamento" />
	<h:inputText id="dataLancamento" value="#{livroBean.livro.dataLancamento}"/>
	
Criando bot�o com uma a��o ligado ao um bean gerenci�vel do JSF

	<h:commandButton value="Gravar" action="#{livroBean.gravar}"/>

Criando o bean que gerenciar� os livros
	
	@ManagedBean
	public class LivroBean {
	
Vinculando os dados do campo com um objeto do bean

	value="#{livroBean.livro.titulo}"
	
Utilizando fun��o ap�s o bean ser criado

	@PostConstruct
	public void posCriacao() {
		System.out.println("objeto LivroBean foi criado");
	}
	
Podemos usar tamb�m o actionListener para chamar um fun��o, as diferen�as entre o action, � que actionListener � chamado primeiro e o m�todo deve sempre retornar void

	actionListener="#{bean.metodo}"

	
