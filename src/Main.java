public class Main {
    public static void main(String[] args) {

        //Try: Intentar hacer el bloque de codigo

        //Catch: En case de que no, atrapa la excepcion y hacer este codigo

        //Finally: Es un bloque opcional, que se puede agregar al try catch que se ejecuta siempre

        //Throw: Arrojar(lanzar) y el nombre que se elija de la excepción va a provocar la excepcion que ejecute el try o el catch

        //Throws: Arroja, que se puede utilizar en un metodo para decirle que excepción(nombre de la excepción) arroje en particular.

        //Excepción arithmeticException
        try {
            int resultado = 3/0;
        }catch (Exception indivisible){//Exception y el nombre que se le da a la excepción (Indivisible)
            System.out.println("No se puede dividir por 0!!!!");
        }

        int edades [] = {15, 20, 35, 12};

        //ArrayIndexOutOfBoundsException
        try {
            System.out.println("La edad de la posición 4 es: " + edades[4]);
        }catch (Exception indiceInexistente){
            System.out.println("La posición 4 no existe");
        }







    }
}

/*
    EXCEPCIONES:
        (Algo que no es comun que pase y se trata de forma especial para solucionarla)

        -Una excepción es un evento que ocurre durante la ejecución de un programa
         que rompe el flujo normal de ejecución.
        -Cuando se habla de excepciones nos referimos a UN EVENTO EXCEPCIONAL
         (algo muy dificil que pase o fuera de lo común).

         Posibles causas de excepciones:
            -Errores dee hardware (componentes fisicos).
            -Operaciones matemáticas no posibles (Ejemplo: dividir entre 0)
            -Errores de programa (Ejemplo: error de desbordamiento de un arreglo)
            -Apertura de un archivo inexistente.
            -Entre otras...

         Tipos de excepciones:
            -Propias de java como lenguaje
            -Personalizadas


         Excepciones propias de java:

                                                    Object

                                                   Throwable (Arrojable)

                        Error (Errores)                                          Exception

  OutOfMemoryError          StackOverflowError              RuntimeException                    IOException

  LinkageError             IllegalArgumentException           IndexOutBoundsException         FileNotFoundException

  NumberFormatException    ArithmeticException              ArrayIndexOutOfBoundsException      ScketException


        -El error no permite que continue la ejecucion del programa
        -La excepcion se puede capturar y hacer que e flujo del programa se redirija y continuar funcionando.



        Excepciones Personalizadas:

            -TRY: Bloque donde puede ocurrir la excepción (codigo donde se continua con el flujo normal del programa).
            -CATCH: Es como el "ELSE" del TRY (se ejecuta al dispararse una excepción en el bloque TRY).
            -FINALLY: Bloque de codigo que se ejecuta siempre (sin importar si hubieron errores o no).
            -THROW: Lanzar una excepción cualquiera.
            -THROWS: Determinar qué excepciones puede lanzar un método.



*/