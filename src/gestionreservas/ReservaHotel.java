/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionreservas;

public class ReservaHotel {
    // Atributos
    private String nombreCliente;
    private String tipoHabitacion; // simple, doble, suite
    private int numeroNoches;
    private double precioPorNoche;
    private String estado; // "reservado", "ocupado", "finalizado"

    public ReservaHotel() {
    }

    public ReservaHotel(String nombreCliente, String tipoHabitacion, int numeroNoches, double precioPorNoche) {
        this.nombreCliente = nombreCliente;
        this.tipoHabitacion = tipoHabitacion;
        this.numeroNoches = numeroNoches;
        this.precioPorNoche = precioPorNoche;
        this.estado = "reservado";
    }

    // Métodos 
    
    public double calcularTotal() {
        return numeroNoches * precioPorNoche;
    }

    public void confirmarReserva() {
        if (this.estado.equals("reservado")) {
            this.estado = "ocupado";
            System.out.println("Reserva confirmada. El cliente ahora está HOSPEDADO (ocupado).");
        } else {
            System.out.println("No se puede confirmar. El estado actual es: " + this.estado);
        }
    }

    public void finalizarReserva() {
        if (this.estado.equals("ocupado")) {
            this.estado = "finalizado";
            System.out.println("Reserva concluida con exito (finalizado).");
        } else {
            System.out.println("No se puede finalizar una reserva que no esté en estado 'ocupado'.");
        }
    }

    public void mostrarReserva() {
        System.out.println("==DETALLE DE LA RESERVA==");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Tipo de Habitacion: " + tipoHabitacion);
        System.out.println("Numero de Noches: " + numeroNoches);
        System.out.println("Precio por Noche: $" + precioPorNoche);
        System.out.println("Estado Actual: " + estado.toUpperCase());
        System.out.println("Total a Pagar: $" + calcularTotal());
    }
}
