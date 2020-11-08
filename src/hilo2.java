
/*
"hilo2" - Cuando se ejecute se iniciará un bucle que se repetirá el número de veces que haya devuelto el "hilo1".
en el cual, por cada iteración, este hilo se dormirá por 2 segundos. Al despertar devolverá, a través de un callback
 un string diciendo el número de veces que se ha ejecutado y el tiempo que ha tardado (calculalo usando timestamps).

 */
public class hilo2 extends Thread{

    principal clasePrincial;

    public hilo2(principal clasePrincial){
        this.clasePrincial = clasePrincial;
    }

    @Override
    public void run() {
        // variableEstatica = al metodo principal y el metodo dentro de el
        int variableEstatica = principal.variableStatic;
        long empieza = System.currentTimeMillis();

        for (int i = 0; i< variableEstatica; i++ ){
            try{
                sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        Long acaba = (System.currentTimeMillis()-empieza)/1000;

        String cadena = "El programa se ha ejecutado:"+variableEstatica;
        String tiempo = "Ha tardado :"+acaba+ "segundos";

        clasePrincial.llamada(cadena,tiempo);
    }
}
