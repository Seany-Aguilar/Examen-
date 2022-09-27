
package Examen;

//@author BETTERLEE

public class PopRock  extends Clase_Padre{
 public String reproductor;
     
     String nombreCancion= "Why won't you love me?";
        String artista= "5SOS";
        int año=2019;
        String disquera="Sony music";
        String compositor= "Luke Hemmings";
        String album= "Youngblood";
    @Override
    public void padre(String nombreCancion, String artista, int año) { 
    }
    
    @Override
    public void padre(String disquera, String compositor, String album){
       
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
             System.out.println("Solo disponible en: " + reproductor);
        }

}
