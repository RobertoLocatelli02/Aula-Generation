
public class pacienteTeste {
	public static void main(String[] args) {
		
		paciente[] paciente = new paciente[3];
		
		paciente[0] = new paciente ("Roberto", "psic�logo", "toda sexta-feira", "Dr. Jos�", 4);
		paciente[1] = new paciente ("Maria", "fisioterapia", "toda segunda-feira e quarta-feira", "Dra. Joana", 12);
		paciente[2] = new paciente ("Joaquim", "exame de rotina", "todo m�s", "Dr. Jo�o", 8);
		
		for (paciente loop: paciente) {
			loop.imprimirInformacoes();
			System.out.println();
		}
	}
}
