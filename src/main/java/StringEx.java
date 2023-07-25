public class StringEx {

    public static void main(String[] args) {

        //los string son inmutables: su contenido de caracteres no puede modificarse una vez que son creados
        //ya que la clase String no proporciona metodos que permitan
        //modificar el contenido de un objeto String
        String st = "hola mundo"; //string literal
        char chr[] = {'s','t','r','i','n','g'};
        String st2 = new String(chr); //char array convertido en string
        String st3 = new String("ejemplo"); //objeto string

        System.out.println(st);
        System.out.println(st2);
        System.out.println(st3);

        //Java trata a todas las literales de cadena con el mismo contenido como un solo objeto String que
        //tiene muchas referencias. Esto ayuda a conservas memoria.

        //algunos metodos de los string son:
        System.out.println(st.length()); //it returns the length of a string
        System.out.println(st.substring(3)); //It returns a substring for the specified begin and end indexes.
        System.out.println(st.contains("mun")); //after matching the sequence of char value, it returns true or false
        System.out.println(st.replaceAll("\\s","")); //remplaza todos los espacios por nada
    }
}
