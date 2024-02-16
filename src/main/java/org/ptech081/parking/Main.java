package org.ptech081.parking;
import org.ptech081.parking.entities.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      
        //crear carros con los constructores:
       Carro carrito1 = new Carro("ASB 456" , TipoVehiculo.MOTO); 

       Carro carrito2 = new Carro();
       carrito2.placa = "ASD 123";
       carrito2.tipovehiculo = TipoVehiculo.MOTO;

       //crear Clientes

       Cliente cliente1 = new Cliente("Julian", "Londoño", 10278965L);
       Cliente cliente2 = new Cliente("Brayan", "Morales", 1034281342L);


       //Invocar el metodo addCar:
       cliente1.addCar(carrito1);
       cliente1.addCar("ASB 456", TipoVehiculo.BUS);
       cliente2.addCar(carrito2);
       cliente2.addCar("ASD 123", TipoVehiculo.MOTO);
       
       
       // Crear cupos
       Cupo cupo1 = new Cupo('A');
       Cupo cupo2 = new Cupo('B');  

       //Crear dos registros
       LocalDate fechaInicio = LocalDate.now();
       LocalTime horaInico = LocalTime.now();
       LocalDate fechaFin = LocalDate.of(2024, Month.MARCH, 24);     
       LocalTime horaFin = LocalTime.of(9, 30, 0);
       List<Registro> misRegistros = new ArrayList<Registro>();
       //Crear primer registro
       Registro registro1 = new Registro(fechaInicio, horaInico, fechaFin, horaFin, 5000L, cupo1, cliente1.misCarros.get(0), cliente1 );
        
       //Crear segundo registro
       LocalDate fechaInicio2 = LocalDate.now();
       LocalTime horaInico2 = LocalTime.now();
       LocalDate fechaFin2 = LocalDate.of(2024, Month.JUNE, 25);     
       LocalTime horaFin2 = LocalTime.of(16, 30, 0);

       Registro registro2 = new Registro(fechaInicio2, horaInico2, fechaFin2, horaFin2, 8000L, cupo2, cliente1.misCarros.get(1), cliente2);
       
       //añadir el registro a la lista 
       misRegistros.add(registro1);
       misRegistros.add(registro2);

       System.out.println("Registros de E/S parking");
       for(Registro r : misRegistros){
        System.out.println("Cliente: " + r.cliente.nombre + " " + r.cliente.apellido + "|" + r.carro.placa + " " + r.carro.tipovehiculo + "|" + r.valor +  "|" + r.fechaInicio + " " + r.horaInicio +  "|");
       }

    }
     
}