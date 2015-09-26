package Package_Matriz;
/**
 * Interfaz para la estrucutra de datos de una Matriz de objetos
 * Especificaciones de los metodos que se implementaran en la clase/s que implementen esta interfaz
 * En la interfaz se espesifican los metodos NO se realiza su implementacion
 * @author 
 *
 */
public interface Interface_Matriz {
	public int getNroFilas();
	public int getNroColumnas();
	public Object[][] getMatriz();
	public void setMatriz(Object[][] matriz);
	public void setNroFilas(int nroFilas);
	public void setNroColumnas(int nroColumnas);
	public int getDimension_Matriz();
	public void limpiaMatriz();
	public void actualiza(Object objElemento, int posicionFila, int posicionColumna);
	public Object devuelve(int posicionFila, int posicionColumna);
	public void  Mostrar_Matriz();
}
