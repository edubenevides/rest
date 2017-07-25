package rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import model.Resultado;

public class UltimoResultado {

	public Resultado extraiResultado() {
		
		Document doc = null;
		String url = "http://loterias.caixa.gov.br/wps/portal/loterias/landing/lotofacil";
		List <Integer> numerosResultado = new ArrayList<Integer>();
		List <String> dadosConcurso = new ArrayList<>();
		Resultado resultado = new Resultado();

        try {
        	doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   String [] numeros = doc.getElementsByClass("simple-table lotofacil").text().split(" ");
	   String [] info = doc.getElementsByClass("title-bar clearfix").select("h2").text().split(" ");
	   for (int i = 0; i < numeros.length; i++) {
		numerosResultado.add(new Integer(numeros[i]));
	   }
	   for (int i = 0; i < info.length; i++) {
		dadosConcurso.add(info[i]);
	   }
	   dadosConcurso.forEach((dado)-> System.out.println(dado));
	   numerosResultado.forEach((num)->System.out.print(num+" "));
	   resultado.setNumerosSorteados(numerosResultado);
	   resultado.setNumeroConcurso(dadosConcurso.get(2));
	   return resultado;
	}
	

   public static void main(String[] args) {
	   new UltimoResultado().extraiResultado();
   }
}
