package iphone;

import navegadorweb.NavegadorWeb;
import reprodutormusical.ReprodutorMusical;
import telefone.Telefone;

public class Iphone implements ReprodutorMusical, NavegadorWeb, Telefone{

	public static void main(String[] args) {
		Iphone iphoneBiel = new Iphone();

		iphoneBiel.ligar("850992845195");
		iphoneBiel.navegar("https://www.google.com");
		iphoneBiel.tocarMusica("Expresso");
	}

	@Override
	public void ligar(String numeroTelefone) {
		System.out.println("ligando para: " + numeroTelefone);
		
	}

	@Override
	public void navegar(String url) {
		System.out.println("buscando por: " + url);
		
	}

	@Override
	public void tocarMusica(String nomeMusica) {
		System.out.println("tocando: " + nomeMusica);
		
	}

}
