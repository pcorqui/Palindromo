public class ValidacionEntrada {

    //valida el primer nombre
    public static boolean validarPrimerNombre(String primerNombre){
        String validacion = "\\code\\\\";
        return primerNombre.matches("code");
    }

    public static void main(String[] args) {
        System.out.println(validarPrimerNombre("freecodecamp"));
    }
}
