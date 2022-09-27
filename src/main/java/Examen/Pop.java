
package Examen;

// @author BETTERLEE
 
public class Pop extends Clase_Padre{
       String disquera = "Sony Music";
       String compositor = "Harry Styles ";
        String album = "Harry's House";
        String nombreCancion =" As it Was";
       String  artista = "Harry Styles";
       int  año= 2022;
    @Override
    public void padre(String nombreCancion, String artista, int año) {

    }
     @Override
    public void padre(String disquera, String compositor, String album){

    }
    public void padre (String compositor2){
        compositor2= " Mitchell Rowell";
        System.out.println("El segundo compositor es: " + compositor2);
    }
     @Override
        public void padre(){
            System.out.println(
                "Nombre de la cancion: \n" + nombreCancion +
                "\n Artista: \n" + artista +
                "\nAño de lanzamiento: \n" + año);
             System.out.println("\nEl sello discografico coorresponde a: \n" + disquera);
             System.out.println("\nCompositor: "+ compositor + 
                "\nEl nombre del album es: \n" + album  );
        }
    }
    

