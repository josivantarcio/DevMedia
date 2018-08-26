package aula18;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa{
	
	private String nome;
	private String sobrenome;
	private LocalDate dtPartida;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public LocalDate getDtNascimento() {
		return dtPartida;
	}
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtPartida = dtNascimento;
	}
	public CalculaIdade getIdadeCalculada(){
		return new Idade();
	}
	
	
	
	//** Class Interna for Calculo da Idade.
			private class Idade implements CalculaIdade{
	
			@Override
			public int getAno() {
				Period p = Period.between(LocalDate.now(), dtPartida);	
				return p.getYears();
			}
	
			@Override
			public int getMes() {
				Period p = Period.between(LocalDate.now(), dtPartida);
				return p.getMonths();
			}
	
			@Override
			public int getDias() {
				Period p = Period.between(LocalDate.now(), dtPartida);
				return p.getDays();
			}
			
		}
	
}
