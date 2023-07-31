package principal;

public class Introduccion {
    public static void main(String[] args) {
        String mensaje = " Este es un mensaje formado por caracteres ";
        String mensaje2 = mensaje.toUpperCase();
        int edad = 18;
        // Diferencias entre un tipo de Dato primitivo y uno Estructurado
        // Los primitivos no tienen propiedades ni métodos
        // edad.  --> no devuelve ninguna acción predeterminada (método)
        // Los tipos de datos estructurados tienen un conjunto de métodos muy útiles además de propiedades.
        System.out.println("El mensaje sin trim: " + mensaje);
        System.out.println("El mensaje con trim: " + mensaje.trim());
        System.out.println(mensaje);
        /////////////////////////////////////////////////////////////////
        System.out.println("=== Conociendo String ===");
        System.out.println("El método LENGTH");
        System.out.println("Sirve para retornar la longitud de la cadena de acaracteres. Cuenta los caracteres que la conforman");
        System.out.println("La longitud de mensaje es: " + mensaje.length());
        System.out.println("El método toUpperCase");
        System.out.println("Reemplaza cada caracter de la cadena por su par pero en Mayúscula.");
        System.out.println("Aplicando toUpperCase: " + mensaje.toUpperCase());
        System.out.println("El método toLowerCase");
        System.out.println("Reemplaza cada caracter de la cadena por su par pero en minúsculas.");
        System.out.println("Aplicando toLowerCase: " + mensaje.toLowerCase());
        System.out.println("El método equals");
        System.out.println("Este método nos permite comparar dos cadenas de carcateres.");
        // Primero comparo utilizando el operador ==
        if (mensaje.equalsIgnoreCase(mensaje2)) { //if(mensaje.toLowerCase().equals(mensaje2.toLowerCase())){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        System.out.println("El método concat");
        System.out.println("Sirve para unir o enlazar dos cadenas de caracteres");
        String salida = mensaje.concat(", esta es la continuación de la cadena");
        System.out.println(salida);
        System.out.println("El método charAt");
        System.out.println("Nos retorna el caracter presente en la posición agregada, no debe exceder la longitud de la cadena - 1");
        System.out.println("El caracter en la posición 10 es: " + mensaje.charAt(10));
        System.out.println("El método startsWith");
        System.out.println("Nos devuelve true si es que la cadena inicia con los caracteres proporcionados");
        String telefono = "+59172653366";
        if (telefono.startsWith("+591")) {
            System.out.println("El formato del número es correcto");
        } else {
            System.out.println("Ingrese un número válido (Utilice +591 por delante)");
        }
        System.out.println("El método endsWith");
        System.out.println("Nos devuelve true si es que la cadena termina con los caracteres proporcionados");
        String correo = "eduardofc@gmail.COM";
        if (correo.toLowerCase().endsWith(".com")) {
            System.out.println("Bienvenido al sistema");
        } else {
            System.out.println("No se completó el registro.");
        }
        System.out.println("El método contains");
        System.out.println("Retorna true si encuentra los caracteres proporcionados dentro de la cadena de estudio.");
        if (mensaje.contains("por")) {
            System.out.println("La contraseña cumple con lo solicitado");
        } else {
            System.out.println("Debe incluir la palabra por dentro de la contraseña ");
        }
        System.out.println("El método replace");
        System.out.println("Reemplaza los caracteres buscados por los caracteres nuevos, devuelve una nueva cadena.");
        System.out.println("Reemplazando las e por las i: " + mensaje.toLowerCase().replace("e", "i"));
        System.out.println("Remplazando mensaje por texto: " + mensaje.toUpperCase().replace("MENSAJE", "texto"));
        System.out.println("Reemplazando es por las tu: " + mensaje.toLowerCase().replace("es", "tu"));
        System.out.println("El método substring");
        System.out.println("Permite obtener un fragmento de la cadena original a través de sus posiciones");
        System.out.println("Cuando se le facilita un sólo parámetro, nos devuelve desde esa posición hasta el final.");
        System.out.println("Cuando se utilizan dos parámetros, nos devuelve el fragmento en el rando formado.");
        System.out.println("Obtenemos el fragmento a partir de la posición 20:");
        System.out.println(mensaje.substring(20));
        System.out.println("Obtenemos el fragmento a partir de la posición 20 hasta la 27:");
        System.out.println(mensaje.substring(20, 27));
        // Para cuando querramos la posición de un caracter
        System.out.println("El método indexOf");
        System.out.println("Devuelve la posición del caracter o palabra (Si es una palabra la posición del primer caracter)");
        System.out.println("caso contrario devuelve -1. SOLO ENCUENTRA LA PRIMERA OCURRENCIA");
        System.out.println("Buscamos e: " + mensaje.indexOf("e"));
        System.out.println("Buscamos t: " + mensaje.indexOf("t"));
        System.out.println("Buscamos or: " + mensaje.indexOf("or"));
        System.out.println("Buscamos mensaje: " + mensaje.indexOf("mensaje"));
        System.out.println("Buscamos letra: " + mensaje.indexOf("letra"));
    }
}
