package Package_Matriz;
import java.util.Scanner;
/*
 * 
 * 
 */

public class Cls_Matriz_Rala extends Cls_Matriz_Objects {
	//ATRIBUTOS
	private Scanner teclado;
	private Object[][] matriz;
//Constructores que Inicilizan la Matriz
public Cls_Matriz_Rala(int nroFilas, int nroColumnas) {
		super(nroFilas, nroColumnas);}

public Cls_Matriz_Rala() {
			super();
	}
public void Carga_Matriz_Rala(){
	 teclado = new Scanner(System.in);
	 int valor;
     System.out.print("Cuantas fila tiene la matriz:");
     this.setNroFilas( teclado.nextInt()); 
     System.out.print("Cuantas columnas tiene la matriz:");
     this.setNroColumnas(teclado.nextInt());
     this.matriz=new Object[this.getNroFilas()][this.getNroColumnas()];
     this.setMatriz(matriz);
     for (int f = 0; f < this.getMatriz().length; f++) {
         for (int c = 0; c <this.getMatriz()[f].length; c++) {
             System.out.print("ingrese un numero:");
             valor=teclado.nextInt();
             if(valor!=0){
            	 this.actualiza(valor,f,c);}
             }
     }
 }
public void  Mostrar_Matriz_Rala(){
	for (int i=0;i<getNroFilas();i++){
		for (int j=0;j<getNroColumnas();j++){
			if(this.devuelve(i,j)==null){
				System.out.print(0 + " ");
			}else{
		     System.out.print(this.matriz[i][j] + " ");
        }
        }System.out.println();
    }
	}
public boolean Compara_Matrices(Cls_Matriz_Rala matriz1,Cls_Matriz_Rala matriz2){
	/**
	 * Dos matrices son iguales cuando tienen la misma dimensión y los elementos que ocupan la misma posición en ambas son iguales
	 * Pre Cond:Las Matrices a comparar deben estar creadas y cargadas previamente
	 * Pos Cond:Devuele un valor booleano si la matrices son iguales o no
	 */
	if(matriz1.getDimension_Matriz()==matriz2.getDimension_Matriz()){//Verifico la condicion de que ambas matrices tienen la misma dimension
		for (int i=0;i<getNroFilas();i++){//ciclo para recorrer las filas de las matrices
			for (int j=0;j<getNroColumnas();j++){//ciclo para recorrer las columnas de las matrices
				if(matriz1.devuelve(i,j)!=matriz2.devuelve(i,j)){return false;}//Comparo elemento a elemento de ambas matrices de la misma posicion ,si alguna comparacion no es igual retorno FALSE
			}
		}
	return true;}//retorna TRUE si al recorrer las dos matrices de dimenciones iguales y elementos  iguales en possiciones (i,j)
	else{return false;}}//retorna FALSE si no cumple la codicion de que ambas matrices tienen que ser de la  misma dimension

public void Suma_Matrices_Ralas(Cls_Matriz_Rala matriz1,Cls_Matriz_Rala matriz2 ){
	/**
	 * Si dos  matrices  tienen la misma dimensión ,se pueden sumar.
	 * La matriz suma se obtienen sumando los elementos de las dos matrices que ocupan la misma posición.
	 * Pre Cond:Ambas matrices deben estar creadas y cargadas previamente 
	 * Pos Cond:Devuelve la suma de dos matrices ralas
	 */
	Cls_Matriz_Rala matriz_aux =new Cls_Matriz_Rala(matriz1.getNroFilas(),matriz1.getNroColumnas());
	matriz_aux=matriz1;
	if(matriz1.getDimension_Matriz() != matriz2.getDimension_Matriz()){//Verifico la condicion de que ambas matrices tienen la misma dimension
		System.out.println("ERROR..Las Matrices son de dimenciones Distintas,No es posible realizar la suma ");}
	else {
		for (int i=0;i<getNroFilas();i++){//ciclo para recorrer las filas de las matrices
			for (int j=0;j<getNroColumnas();j++){//ciclo para recorrer las columnas de las matrices
			//como no alamaceno el valor 0 en la matriz ,para no ocupar memoria ,realizo preguntas cuando quiero sumar ceros con otros elementos
					if(matriz1.devuelve(i,j)==null && matriz2.devuelve(i,j)!=null){matriz_aux.actualiza(matriz2.devuelve(i,j),i,j);}
					else if(matriz1.devuelve(i,j)!=null && matriz2.devuelve(i,j)==null){matriz_aux.actualiza(matriz1.devuelve(i,j),i,j);}
					else if(matriz1.devuelve(i,j)==null && matriz2.devuelve(i,j)==null){matriz_aux.actualiza(null,i,j);}
					else{matriz_aux.actualiza((int)matriz1.devuelve(i,j)+(int)matriz2.devuelve(i,j),i,j);}
			}}
	matriz_aux.Mostrar_Matriz_Rala();//Despues de Realizar la suma de las matrices ,muestro la matriz suma} 
	}
}
	
}}




