
package Examen;

/*@author BETTERLEE */
public class kpop extends Clase_Padre{
        String nombreCancion = "Love dive";
       String  artista= "IVE";
       int año= 2022;
    String disquera="Startship";
       String  compositor= "Sophia Brennan";
        String album= "Ive 2do Single";

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
      
        }
}
