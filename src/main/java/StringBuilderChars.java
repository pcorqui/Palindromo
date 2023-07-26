public class StringBuilderChars {
    public static void main(String[] args) {
        StringBuilder bufer = new StringBuilder("hola a todos");
        System.out.printf("bufer = %s\n", bufer.toString());
        System.out.printf("Caracter en 0: %s\nCaracter en 3: %s\n\n",bufer.charAt(0),bufer.charAt(3));
        char arregloChars[] = new char[bufer.length()];
        bufer.getChars(0,bufer.length(),arregloChars,0);
        System.out.print("Los caracteres son: ");
        for (char character: arregloChars)
            System.out.print(character);

        bufer.setCharAt(0,'H');
        bufer.setCharAt(7,'T');
        System.out.printf("\n\nbufer = %s",bufer.toString());
        bufer.reverse();
        System.out.printf("\n\nbufer = %s\n",bufer);

        //palindromo con string builder
        String anita = "anita lava la tina";
        String limpio = anita.replaceAll("\\s","");
        StringBuilder palindromo = new StringBuilder(limpio);
        palindromo.reverse();
        System.out.println(palindromo.toString().replaceAll("\\s",""));

        if(limpio.equalsIgnoreCase(palindromo.toString().replaceAll("\\s","")))
            System.out.printf("si es palindromo");
        else
            System.out.printf("no es palindromo");
    }
}
