public class VariosString {
    public static void main(String[] args) {
        String s1 = "hola a todos";
        char arregloChar[] = new char[5];

        System.out.printf("s1: %s", s1);

        //prueba del metodo length
        System.out.printf("\nLongitud de s1: %d",s1.length()); //length explora el rango de la cadena con indice 1

        //itera atravez de los caracteres en s1 con charAt y muestra la cadena invertida
        System.out.print("\nLa cadena invertida es: ");

        for(int i=s1.length()-1;i>=0;i--){
            //System.out.println("valor de i: " + i);
            System.out.printf("%s",s1.charAt(i)); //charAt explora el rango de la cadena con indice 0
        }

        s1.getChars(0,4,arregloChar,0);
        for(char caracter : arregloChar)
            System.out.print(caracter);
    }
}
