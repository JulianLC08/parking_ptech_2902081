package org.ptech081.parking;
import org.ptech081.parking.entities.*;

public class Main {
    public static void main(String[] args) {
      
        //crear carros con los constructores:
       Carro carrito1 = new Carro("ASB 456" , TipoVehiculo.MOTO); 

       Carro carrito2 = new Carro();
       carrito2.placa = "ASD 123";
       carrito2.tipovehiculo = TipoVehiculo.MOTO;

       //crear Clientes

       Cliente cliente1 = new Cliente("Julian", "Londoño", 10278965L);

       //Invocar el metodo addCar:
       cliente1.addCar(carrito1);
       cliente1.addCar("ASD 123", TipoVehiculo.BUS);

       //Recorrer los carros del cliente
       for(Carro c : cliente1.misCarros){
            System.out.println(c.placa + " " + "----" + " " + c.tipovehiculo);
            
       }
    }
    
}