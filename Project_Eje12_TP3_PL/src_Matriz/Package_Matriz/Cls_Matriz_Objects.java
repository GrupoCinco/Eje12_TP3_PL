package Package_Matriz;
/**
 * clase correspondiente a la implementacion de atributos y metodos
 * de una Matriz de Objects
 * 
 *
 */
public class Cls_Matriz_Objects implements Interface_Matriz{
	
		//Atributos de la clase
		private Object[][] matriz;
		private int nroFilas=0, nroColumnas=0;
		
		//constructor de la clase ,Inicializa los atributos de la clase
		public Cls_Matriz_Objects (int nroFilas, int nroColumnas){
			this.setNroFilas(nroFilas);
			this.setNroColumnas(nroColumnas);
			this.matriz=new Object[this.nroFilas][this.nroColumnas];		
		}
		public Cls_Matriz_Objects (){
			this.setNroFilas(0);
			this.setNroColumnas(0);
		}
		//METODOS DE LA CLASE
		public Object[][] getMatriz(){return matriz;}
		public void setMatriz(Object[][] matriz) {this.matriz = matriz;}
		public void setNroFilas(int nroFilas) {this.nroFilas = nroFilas;}
		public void setNroColumnas(int nroColumnas) {this.nroColumnas = nroColumnas;}
		public int getNroFilas(){ return this.nroFilas;}//Devuelve nro de filas de la matriz
		public int getNroColumnas(){ return this.nroColumnas;}//Devuelve el nro de columnas de la matriz
		
		//limpia la matriz ,la matriz vale null
		public void limpiaMatriz(){
			for (int i=0;i<getNroFilas();i++){
				for (int j=0;j<getNroColumnas();j++){
					this.matriz[i][j]=null;
				}
			}
		}	
		//Actualiza un elemento de la matriz de una posicion especifica
		public void actualiza(Object objElemento, int posicionFila, int posicionColumna){
			if (posicionFila>=getNroFilas() || posicionFila<0){
					System.out.println("Error actualiza. Posicion fila inexistente ");
				}else{
					if (posicionColumna>=getNroColumnas() || posicionColumna<0){
						System.out.println("Error actualiza. Posicion columna inexistente ");
					}else{
						this.matriz[posicionFila][posicionColumna]=objElemento;
					}}}
		//devuelve el elemento de la matriz de una posicion especifica
		public Object devuelve(int posicionFila, int posicionColumna){
			Object objElemento=null;

			if (posicionFila>=getNroFilas() || posicionFila<0){
				System.out.println("Error devuelve. Posicion fila inexistente ");
			}else{
				if (posicionColumna>=getNroColumnas() || posicionColumna<0){
					System.out.println("Error devuelve. Posicion columna inexistente ");
				}else{
					objElemento = this.matriz[posicionFila][posicionColumna];
				}				
			}		
			return objElemento;
		}
		public int getDimension_Matriz(){
			
			return this.getNroFilas()*this.getNroColumnas();
			
		}
		public void  Mostrar_Matriz(){
			for (int i=0;i<getNroFilas();i++){
				for (int j=0;j<getNroColumnas();j++){
				     System.out.print(this.matriz[i][j] + " ");
	            }
	            System.out.println();}
	        }
				
	}

