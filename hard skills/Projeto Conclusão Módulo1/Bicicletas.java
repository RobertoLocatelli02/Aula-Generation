
public class Bicicletas extends Locacao {

		private String Modelo; // montain bike, street, corrida 
		private String Tamanho;// infantil, adolescente, adulto
		

	
		// contrutores
		
		public Bicicletas () {
			
		}
		
		public Bicicletas (String Modelo, String Tamanho,double valor,int x) {
	
			super(valor,x);
			this.Modelo = Modelo;
			this.Tamanho = Tamanho;
		
						
		}
		
		// métodos
		
		public String getModelo() {
			return Modelo;
		}
		public void setModelo(String modelo) {
			Modelo = modelo;
		}
		public String getTamanho() {
			return Tamanho;
		}
		public void setTamanho(String tamanho) {
			Tamanho = tamanho;
		}
			
		
}
