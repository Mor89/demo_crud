
package recursohumano;

import java.sql.SQLException;// Libreria para conexiones con base de datos
import java.util.Scanner;


public class MenuPrincipal {
    //throws especifica el tipo de excepion que puede ocasionar
    public static void main(String[] args)throws SQLException {
        desplegarMenu();
    }

    static void desplegarMenu() throws SQLException {
     Scanner opcionSeleccionada = new Scanner(System.in);
     String opcionMenu;
     // Menú a desplegar
        System.out.println("*******************************************************");
        System.out.println("|         CRUD DE JAVA EN CONSOLA                     |");
        System.out.println("*******************************************************");
        System.out.println("|Opciones:                                            |");
        System.out.println("|         1. Crear registros                          |");
        System.out.println("|         2. Consultar registros                      |");
        System.out.println("|         3. Actualizar registros                     |");
        System.out.println("|         4. Eliminar registros                       |");
        System.out.println("|         5. Salir                                    |");
        System.out.println("*******************************************************");
        System.out.println("Seleccionar opcion: ");
        opcionMenu = opcionSeleccionada.next(); 
        
        //Despiegue de menú basado en las opción seleccionada
        switch(opcionMenu){
            case "1": 
                 Create create = new Create();
                break;
            case "2": 
                 Read read = new Read();
                break;
            case "3": 
                 Update update = new Update();
                break;
            case "4": 
                 Delete delete = new Delete();
                break;
            case "5": 
                 System.exit(0);
                break;  
            default: 
                System.out.println("Seleccion invalida!");
            break;    
        }
     }         
    }    
