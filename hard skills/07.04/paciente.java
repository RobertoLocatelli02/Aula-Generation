
public class paciente {
	
	private String nome;
	private String tipoDeConsulta;
	private String dias;
	private String medico;
	private int totalConsultas;
	
	public paciente (String nome, String tipoDeConsulta, String dias, String medico, int totalConsulta) {
		this.nome = nome;
		this.tipoDeConsulta = tipoDeConsulta;
		this.dias = dias;
		this.medico = medico;
		this.totalConsultas = totalConsultas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoDeConsulta() {
		return tipoDeConsulta;
	}

	public void setTipoDeConsulta(String tipoDeConsulta) {
		this.tipoDeConsulta = tipoDeConsulta;
	}

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public int getTotalConsultas() {
		return totalConsultas;
	}

	public void setTotalConsultas(int totalConsultas) {
		this.totalConsultas = totalConsultas;
	}
	
	public void imprimirInformacoes() {
		System.out.println("Nome do paciente: " + nome + "\nTipo de consulta médico: " + tipoDeConsulta + "\nDias da consulta: " + dias + "\nDoutor(a): " + medico + "\nTotal de consultas já atendidas: " + totalConsultas);
	}
}
