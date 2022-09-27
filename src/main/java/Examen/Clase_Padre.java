
package Examen;

//@author BETTERLEE
 
public abstract class Clase_Padre {

protected String nombreCancion;
protected String artista;
protected int año;
protected String disquera;
protected String compositor;
protected String album;

    public abstract void padre(String nombreCancion, String artista, int año);
    public void padre(){
        System.out.println("Nombre de la cancion: \n" + nombreCancion +
                "\nArtista: \n" + artista +
                 "\nAño de lanzamiento: \n" + año);
        
        
    }
    public void padre(String disquera, String compositor, String album){
        System.out.println("\nEl sello discografico coorresponde a: \n" + disquera);
        System.out.println("\nCompositor: "+ compositor + 
                "\nEl nombre del album es: \n" + album  );
    }


}
