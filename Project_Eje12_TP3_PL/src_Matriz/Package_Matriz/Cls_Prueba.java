package Package_Matriz;

public class Cls_Prueba {

	public static void main(String[] args) {
		Cls_Matriz_Rala matriz=new Cls_Matriz_Rala();
		Cls_Matriz_Rala matriz2=new Cls_Matriz_Rala();
		//Cls_Matriz_Rala matriz3=new Cls_Matriz_Rala();
		
		matriz.Carga_Matriz_Rala();
		matriz.Mostrar_Matriz_Rala();
		System.out.println("----------------------------");
		matriz2.Carga_Matriz_Rala();
		matriz2.Mostrar_Matriz_Rala();
		//System.out.println(matriz.getDimension_Matriz());
		System.out.println("-------------Comparacion de Matrices Ralas---------------");
		if(matriz.Compara_Matrices(matriz, matriz2)){
			System.out.println("TRUE...Las Matrices Ralas son iguales");
		}
		else{System.out.println("FALSE...Las Matrices Ralas NO son iguales");}
		System.out.println("-------------Suma de Matrices Ralas---------------");
		matriz.Suma_Matrices_Ralas(matriz,matriz2);
		//matriz3.Mostrar_Matriz_Rala();
	}


}
