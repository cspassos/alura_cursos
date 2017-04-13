package br.com.jkavdev.alura.xml.teste.aula1.exercicios;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

//Utilize a classe DocumentBuilderFactory para carregar o nosso arquivo XML na mem�ria 
//e ler o valor do atributo formaDePagamento, 
//lembre-se que o m�todo parse retorna um Document 
//e atrav�s dele podemos acessar qualquer elemento atrav�s do m�todo getElementsByTagName.

public class atividade8 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		Document document = builder.parse("src/vendas.xml");

		String formaDePagamento = document.getElementsByTagName("formaDePagamento").item(0).getTextContent();
		System.out.println(formaDePagamento);
	}

}
