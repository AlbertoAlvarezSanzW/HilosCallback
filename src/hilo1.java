


public class hilo1 extends Thread{

    //"hilo1" -  Cuando se ejecute dormirá por 4 segundos y devolverá un
    // número aleatorio entre 4 y 20.


    @Override
    public void run() {
        try{
            System.out.println("Inicio de hilo 1");
            sleep(4000);
            principal.variableStatic = (int)(Math.random()*(20-4+1)+4);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
