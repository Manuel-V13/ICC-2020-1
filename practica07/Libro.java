/**
	* Crea una clase Libro que tenga los siguientes atributos: tı́tulo, autor y año de publicación.
	* Objetivo • Definir una clase, sus atributos y los métodos de modificación y acceso de dichos atributos. • Familiarizarse con la documentación de clases y métodos.
	* Jose Manuel Martinez Peralta
	* 10-09-2019*/

public class Libro{
	String titulo;
	String autor;
	int año;

/**
 * Metodo Default.
 * @param titulo titulo del libro
 * @param autor autor del libro
 * @param año año de publicacion
 */
public Libro(){
	this.titulo = " ";
	this.autor = " ";
	this.año= 00;
}
/**
 * Metodo con parametros 
 * @param titulo titulo del libro  
 * @param autor autor del libro
 * @param año año del libro
 */
public Libro(String titulo, String autor, int año){
	this.titulo = titulo;
	this.autor = autor;
	this.año = año;
}
/**
 * Asignar el valor de titulo 
 * @param titulo titulo del libro
 */
public void setTitulo(String titulo){
	this.titulo = titulo;
}
/**
 * Asignar el valor de autor
 * @param autor autor del libro
 */
public void setAutor(String autor){
	this.autor = autor;
}
/**
 * Asignar valor a parametro 
 * @param año año de publicacion 
 */
public void setTitulo(int año){
	this.año = año;
}
/**
 * Metodo debolver titulo
 * @param titulo  del libro
 * @return titulo del libro
 */
public String getTitulo(){
	return titulo;
}
/**
 * Metodo devolver autor 
 * @param autor del liro
 * @return autor  del libro
 */
public String getAutor(){
	return autor;
}
/**
 * Metodo devolver año
 * @param año de publicacion
 * @return año  de publicacion 
 */
public int getAño(){
	return año;
}
}
