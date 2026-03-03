import java.util.*;

public class paciente {

    private String nombre;
    private int edad;
    private double peso;
    private double presionArterial;
    private boolean estable;


    public paciente(String nombre, int edad, double peso, double presionArterial, boolean estable) {

        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.presionArterial = presionArterial;
        this.estable = estable;

    }
    public void cumplirAnios() {
        edad = edad + 1;
    }
    public void aumentarPeso(double cantidad){
       peso =  peso + cantidad ;
    }
    public void disminuirPeso(double cantidad ) {
        peso = peso - cantidad ;
    }
    public void subirPresion(double valor){
        presionArterial = presionArterial + valor;
    }
    public void bajarPresion(double valor){
        presionArterial = presionArterial - valor;
    }
    public void empeorarEstado(){
        estable = false;
    }
    public void mejorarEstado(){
        estable = true;
    }
    public void mostrarHistoriaClinica(){
        System.out.println("Historial del Paciente");
        System.out.println("Nombre"+ nombre);
        System.out.println("Edad" + edad);
        System.out.println("Peso" + peso);
        System.out.println("Presion Arterial"+presionArterial);

        if (estable == true){
            System.out.println("Estado Estable");
        } else {
            System.out.println("Estado Inestable");
        }
    }
    public String getNombre() {
        return nombre;
    }
}
