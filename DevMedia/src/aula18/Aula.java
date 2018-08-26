package aula18;

import java.time.LocalDate;

public class Aula {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		//Testando...
		pessoa.setNome("Josevan");
		pessoa.setSobrenome("Oliveira");
		pessoa.setDtNascimento(LocalDate.of(2018, 10, 7));
		
		System.out.printf(
				"Olá %s %s! Faltam %d Anos, %d Meses e %d Dias para sua partida.",
				pessoa.getNome(),
				pessoa.getSobrenome(),
				pessoa.getIdadeCalculada().getAno(),
				pessoa.getIdadeCalculada().getMes(),
				pessoa.getIdadeCalculada().getDias()
				);
	}

}
