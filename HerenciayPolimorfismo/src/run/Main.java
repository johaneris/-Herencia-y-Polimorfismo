package run;
import models.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehiculo[] vehiculos  = new Vehiculo[] {
                new Carro("Toyota", "Corolla", 50),
                new Moto("Yamaha", "MT-07"),
                new Camion("Toyota", "FH", 300)
        };

        for (Vehiculo v : vehiculos) {
            if (v instanceof Combustible) {
                Combustible c = (Combustible) v;
                c.recargar(20);
            }
        }

        System.out.println("== Moverse ==");
        for (Vehiculo v : vehiculos) {
            System.out.println(v.mover());
        }

    }
}