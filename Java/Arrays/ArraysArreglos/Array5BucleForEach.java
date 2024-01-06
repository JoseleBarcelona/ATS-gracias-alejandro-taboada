package Arrays.ArraysArreglos;
//BUCLE FOR EACH
public class Array5BucleForEach {
    public static void main(String[] args) {
        String[] nombres = {"José", "Núria", "Neus", "Papa", "Mama"};

        for (String i: nombres){  //Sintaxis del bucle for each
            //Dentro del iterador i se van a copiar todos los elementos que tenga la array nombres
            System.out.println(i);

        }
    }
}
/*
Código ejecutado

José
Núria
Neus
Papa
Mama

Process finished with exit code 0
 */