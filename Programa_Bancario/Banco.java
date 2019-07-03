

	             /**
	* FECHA MIERCOLES 3 DE JULIO DEL 2019
 	*INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	* NOMBRE : BRYAN GONZALEZ 
 	* NOMBRE DE PROGRAMA : PROGRAMA BANCARIO
 	* MATERIA : PROGRAMACION VISUAL
 	* NIVEL : CUARTO DE SISTEMAS NOCTURNO
 	*/
	public class  Banco {
    	private float saldo;

    	public Banco(float saldo) {
        this.saldo = saldo;
    	}

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void calcular(float monto ,int op){
        
        switch(op){
            case 1: 
                saldo+=monto;
              
                	break;
            	case 2:
             	   saldo-=monto;
                	break;
                  
        }
        setSaldo(saldo);
    	}
    
	}
