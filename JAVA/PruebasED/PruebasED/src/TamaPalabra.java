public class TamaPalabra {

    public static String tamaPalabra(int n, String palabra){
        int longitudPalabra = palabra.length();
        
        if (longitudPalabra < n){
            for (int i = longitudPalabra ; i < n ; i++){
                palabra += "-";
            }
        } else if (longitudPalabra > n){
                String aux = "";
                for (int i = 0 ; i < n ; i++){
                    aux += palabra.charAt(i);
                }
                palabra = aux;
        }
        return palabra;
    }

    public static void main(String[] args){
        int numero = 5;
        String palabra = "";

        int[] numerosDePrueba = {-2,0,3,5,10};
        String[] palabrasDePrueba = {"","pan","verde","patata","hipopotamo","esternocleido"};
        
        if (args.length == 1 && args[0].equals("prueba")){    // [!] Con String hay que poner .equals no vale el ==
            for (int numPr : numerosDePrueba){
                System.out.println("Para el número: " + numPr);

                for (String palPr : palabrasDePrueba){
                System.out.println(tamaPalabra(numPr,palPr));
                }
            }
        } else if (args.length != 2){
            System.out.println("--- Número de argumentos incorrecto ---");
        } else {
            numero = Integer.parseInt(args[0]);
            palabra = args[1];

            System.out.println(tamaPalabra(numero,palabra));
        }
    } 
}  