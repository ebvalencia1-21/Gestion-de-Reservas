/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionreservas;
import java.util.Scanner;

public class GestionReservas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("===REGISTRO DE NUEVA RESERVA===");
        System.out.print("Nombre del Cliente: ");
        String cliente = sc.nextLine();
        
        System.out.print("Tipo de Habitacion (simple, doble, suite): ");
        String tipo = sc.nextLine();
        
        System.out.print("Numero de Noches: ");
        int noches = sc.nextInt();
        
        System.out.print("Precio por Noche: ");
        double precio = sc.nextDouble();

        ReservaHotel reserva = new ReservaHotel(cliente, tipo, noches, precio);

        int op;
        do {
            System.out.println("==MENU DE GESTION HOTELERA==");
            System.out.println("1. Mostrar Estado y Datos de Reserva");
            System.out.println("2. Confirmar Reserva 'ocupado')"); //(Check-In -> 
            System.out.println("3. Finalizar Reserva 'finalizado')"); //(Check-Out -> 
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    reserva.mostrarReserva();
                    break;
                case 2:
                    reserva.confirmarReserva();
                    break;
                case 3:
                    reserva.finalizarReserva();
                    break;
                case 4: break;
                
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (op != 4);

        sc.close();
    }
}
