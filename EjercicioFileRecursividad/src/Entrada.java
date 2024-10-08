import java.io.File;

public class Entrada {
    public static void main(String[] args) {
        //Ejercicio 1 - Listar el nombre de todos los ficheros ubicados en un directorio (carpeta ficheros)
        File ficherosDeDirectorio1 = new File("src/resources/directorio1");
        File[] listado1 = ficherosDeDirectorio1.listFiles();

        for(int x=0; x<listado1.length; x++){
            System.out.println("Este es el listado de los ficheros de una carpeta (ejercicio 1): " + listado1[x].getName());
        }


        //Ejercicio 2 - Crear un subdirectorio dentro de la carpeta anterior y listar el nombre de los archivos
        File ficherosDeDirectorio2 = new File("src/resources/directorio1/Subdirectorio");
        File[] listado2 = ficherosDeDirectorio2.listFiles();

        for(File list:listado2){
            System.out.println("Este es el resultado de la subcarpeta (ejercicio 2): " + list.getName());
        }

        //Ejercicio 3 - Listar el nombre de todos los ficheros y directorios de una ruta concreta, como por ejemplo C:/Users
        //Forma 1
        /*File ficherosDeDirectorio3 = new File("C:\\Users");
        File[] listado3 = ficherosDeDirectorio3.listFiles();


        for(File list:listado3){
            System.out.println("Este es el listado de ficheros y directorios de Users (ejercicio 3): " + list.getName());
                if(list.isDirectory()){     //Habria que hacer esto por cada nivel, lo suyo es crear un método que se repita
                    File ficherosSubdirectorio = new File("C:\\Users\\"+list.getName());
                    File [] ficherosub = ficherosSubdirectorio.listFiles();
                    for(File list2 : ficherosub){
                        System.out.println("\t Este es el listado de ficheros y directorios de Users (ejercicio 3): " + list2.getName());
                    }
                }
        }*/

        //Forma 2 --> creamos otra clase para los métodos

        ParaMetodoRecursivo recursividad = new ParaMetodoRecursivo();
        recursividad.lecturaRecursiva("C:\\Users");
    }
}
