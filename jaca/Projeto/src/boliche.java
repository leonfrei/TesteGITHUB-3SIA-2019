public class boliche {
	String corBola;
	double raio;

	public boliche(String corbola, double tamanho){
	this.corBola = corbola;
	this.raio = tamanho;
	}
	//n�o � nescessario
	public boliche() {
		
	this(null, 0);
	}
	public boliche maiorBola(boliche bola2, boliche bola3) {
		//essa � a bola 1 
		boliche maior = this;
		if(bola2.raio > this.raio && bola2.raio > bola3.raio){
			maior = bola2;
		}else {
			if(this.raio > bola2.raio && this.raio > bola3.raio) {
				maior = this;
			}else {
				maior = bola3;
			}
		}
		
		return maior;
		
	
	}


public String retornarDados(){
	String aux = "";
	
	aux = corBola+" "+raio;
	
	return aux;                                    
}








}
