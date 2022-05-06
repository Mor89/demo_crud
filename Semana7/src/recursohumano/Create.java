
package recursohumano;

import java.sql.SQLException;
import java.util.Scanner;

public class Create {

    Create() throws SQLException {
        Scanner leer = new Scanner(System.in);
        Persona person = new Persona();
        System.out.println("<<CREAR REGISTRO>>");
        
        //Datos para Guardar Registros 
        System.out.println("Nombre");
        person.setNomPersona(leer.nextLine());

        System.out.println("Correo Electronico");
        person.setEmailPersona(leer.nextLine());

        System.out.println("Telefono:");
        person.setTelPersona(leer.nextLine());

        String tabla = "tb_contacto";
        String camposTabla = "nom_contacto, email_contacto, tel_contacto";
        String valoresCampos = "'" + person.getNomPersona() + "','" + person.getEmailPersona() + "','"
                + person.getTelPersona() + "'";

        ConexionCRUD utilerias = new ConexionCRUD();

        utilerias.guardarRegistros(tabla, camposTabla, valoresCampos);
        MenuPrincipal.desplegarMenu();
    }
}
