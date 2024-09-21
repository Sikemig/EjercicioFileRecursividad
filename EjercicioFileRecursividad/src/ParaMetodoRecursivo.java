import java.io.File;

public class ParaMetodoRecursivo {

    public void lecturaRecursiva(String path){
        File file =new File(path);

        File[] ficheros = file.listFiles();

        for(File item: ficheros){
            System.out.println("Este es el listado de ficheros y directorios de Users (ejercicio 3): "+item.getName());
            if(item.isDirectory()){
                lecturaSubdirectorios(item);
            }
            //Preguntamos si es directorio
            // si lo es, sacamos todos los ficheros del directorio y los muestro --> sin saber cuantas veces preguntamos (niveles de carpetas)
            //se usa la recursividad -> ejecucion que se llama a sí misma, TIENE QUE TENER UNA SALIDA
        }
    }

    private void lecturaSubdirectorios(File fichero){
        for(File file: fichero.listFiles()){
            System.out.println("\t Este es el listado de ficheros y directorios subcarpetas (ejercicio 3): "+file.getName());
            if(file.isDirectory()){
                lecturaSubdirectorios(file);
            }
        }
    }
}
