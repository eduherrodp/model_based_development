package modelbaseddevelopment.template;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// Esta clase abstracta define los pasos para elaborar un paquete de decoración con piedras
public abstract class PaqueteDecoracion {
    final void elaboracion() {
        laminar();
        cortarMedida();
        if(solicitudAcabado()) {
            darAcabado();
        }
        empaquetar();
    }
    // Este método se encarga de solicitar al usuario las medidas para cortar las láminas de piedra
    public void cortarMedida() {
        Scanner datos = new Scanner(System.in);
        int Medida1, Medida2;
        System.out.print("Medida de largo: ");
        Medida1 = datos.nextInt();
        System.out.print("Medida del ancho: ");
        Medida2 = datos.nextInt();
        System.out.println("Láminas cortadas en medidas de: " + Medida1 + " x " + Medida2);
    }
    abstract void darAcabado();
    public void laminar() {
        System.out.println("Piedra cortada en láminas delgadas");
    }
    public void empaquetar() {
        System.out.println("Paquetes con 5 piedras listos");
    }
    boolean solicitudAcabado() {
        String answer = respuestaUsuario();
        if(answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
    String respuestaUsuario() {
        String answer = null;
        System.out.println("¿Desea darle acabado a las láminas? (y/n)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }catch  (Exception ioe) {
            System.out.println("Error al leer la respuesta");
        }
        if(answer == null) {
            return "no";
        }
        return answer;
    }
}
