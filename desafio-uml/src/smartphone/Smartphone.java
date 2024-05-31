package smartphone;

import navegadorInternet.NavegadorInternet;
import phone.Telefone;
import reprodutorMusica.ReprodutorMusica;

public class Smartphone implements NavegadorInternet, ReprodutorMusica, Telefone {

	@Override
	public void ouvirMusica() {
		// TODO Auto-generated method stub
		System.out.println("tocando musica");
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("pausa musica");
	}

	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		System.out.println("seleciona musica");
	}

	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("exibe página");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("cria nova aba");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("atualiza página");
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("ligando");
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("atendeu!");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("iniciando correio de voz");
		
	}

}
