class Bucles {
    public static void main(String[] args){

        // For each -> for num in listaNum
        String[] listaAzules = {"Azul", "Añil","Indigo","Cobalto","Klein","Celeste"};
        for (String azul : listaAzules){
            System.out.println(azul);
        }

        // For -> No existe en python (este es el 'verdadero')
        for (int contador = 0 ; contador < 10 ; contador++){
            System.out.println(contador);
        }

        // i de Iterador
        for (int i = 0 ; i < 10 ; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        // bucle teniendo en cuenta la longitud de la lista
         for (int i = 0 ; i < listaAzules.length ; i++){
            System.out.println(listaAzules[i]);
        }

        // Bucles For anidados
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print("" + i + j + " ");
            }
            System.out.println();
        }

        // Bucle While
        salir = false;
        int contador = 5;
        while (!salir){
            System.out.println("Escribe salir:");
            palabra = sc.nextLine();
            if (palabra.equals("salir")){
                salir = true;
            }
        }
    }
}