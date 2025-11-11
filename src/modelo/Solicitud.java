package modelo;

import java.util.List;

public class Solicitud extends Thread {
    private String nombreUsuario;
    private Zona zona;
    private List<Butaca> butacasCompradas= new ArrayList<>();
    private int numeroEntradas;

    private static final int MAX_INTENTOS = 3
    private static final Random rand = new Random();

    public Solicitud(Usuario usuario, Zona zona, int numEntradas) {
        this.usuario = usuario;
        this.zona = zona;
        this.numEntradas = numEntradas;
    }

    public void run (){
        int intentos=0;
        boolean comprado= false;
        while (intentos < MAX_INTENTOS && !comprado){
            intentos++;
            System.out.println(nombreUsuario+"intenta comprar"+ numEntradas + " entradas (intento " + intentos + ")"))
            synchronized (zona){
                List <Butaca> seleccionadas= buscarButacasContiguas();
                if (seleccionadas.isEmpty()){
                    System.out.prinln ("No hay suficientes butacas contiguas");
                    continue;
                }
                //bloquear temporalmente
                for (Butaca b: seleccionadas){

                }

            }

        }


    }
}
