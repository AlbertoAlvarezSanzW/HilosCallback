public class principal {

    //A- La clase principal iniciará 2 hilos al que llamará "Hilo1" y "Hilo2".



    // crearemos una variableStatic que nos hara de callback
    static int variableStatic = 0;

    public principal() throws InterruptedException {

        hilo1 h1 = new hilo1();
        hilo2 h2 = new hilo2(this);
        h1.start();
        h1.join();
        h2.start();

    }

    public void llamada(String nombre, String nombre1){
        System.out.println(nombre);
        System.out.println(nombre1);
    }
}
