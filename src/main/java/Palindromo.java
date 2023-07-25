public class Palindromo {
    //función para eliminar espacios y convertir a minúsculas
    public static String limpiarTexto(String texto) {
        return texto.replaceAll("\\s", "").toLowerCase();
    }

    //invertir texto
    public static String invertirCadena(String frase) {
        StringBuilder invertido = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) {
            invertido.append(frase.charAt(i));
        }
        return invertido.toString();
    }

    public static boolean esPalindromo(String frase) {
        String fraseLimpia = limpiarTexto(frase);
        String invertido = invertirCadena(fraseLimpia);
        return fraseLimpia.equals(invertido);
    }

    public static void main(String[] args) {
        String texto = "Anita lava la tina";
        if (esPalindromo(texto)) {
            System.out.println(texto);
            System.out.println("es palindromo");
        } else {
            System.out.println(texto);
            System.out.println("no es palindromo");
        }
    }
}
