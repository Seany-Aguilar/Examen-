
package Examen;

// @author BETTERLEE
 
public class Heavy_Metal extends Clase_Padre{
         double duracion= 3.52;
          String nombreCancion= "Follow you";
        String artista= "Brig me the Horizon";
        int año=2016;
        String disquera="Sumerian Records";
        String compositor= "Oliver Sykes";
        String album= "That's The Spirit";
    @Override
    public void padre(String nombreCancion, String artista, int año) {
 
    }
    @Override
    public void padre(String disquera, String compositor, String album){

    }
    
    public void padre(double duracion){
        System.out.println("Duracion: " + duracion);
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
             System.out.println("Duracion: " + duracion );
        }

}
