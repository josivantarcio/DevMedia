package aula18;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa{
	
	private String nome;
	private String sobrenome;
	private LocalDate dtNascimento;
	
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
		return dtNascimento;
	}
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public CalculaIdade getIdadeCalculada(){
		return new Idade();
	}
	
	
	
	//** Class Interna for Calculo da Idade.
			private class Idade implements CalculaIdade{
	
			@Override
			public int getAno() {
				Period p = Period.between(LocalDate.now(), dtNascimento);	
				return p.getYears();
			}
	
			@Override
			public int getMes() {
				Period p = Period.between(LocalDate.now(), dtNascimento);
				return p.getMonths();
			}
	
			@Override
			public int getDias() {
				Period p = Period.between(LocalDate.now(), dtNascimento);
				return p.getDays();
			}
			
		}
	
}
