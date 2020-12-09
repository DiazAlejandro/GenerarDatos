import java.io.*;
public class GenerarDVenta{
    double descuento [] = {0.05,0.01,0.00,0.10,0.15,0.05,0.01,0.00,0.02,0.03,0.04,0.05,0.06,0.07,0.10};
    String observacion [] = {"Sin Novedad","Sin Novedad","Cancelación",
                             "Sin Novedad", "Cancelacion", "Sin Novedad"};
    public void generarDVenta(){
        FileWriter flwriter = null;
            try {
                flwriter = new FileWriter("C:/Users/aleja/Desktop/participantes.sql");
                BufferedWriter bfwriter = new BufferedWriter(flwriter);
                for (int i = 5000 ; i <= 5050; i++){
                    int cantidadCompra = (int)(Math.random()*5)+1;
                    
                    for (int j = 0 ; j < cantidadCompra ; j++){
                        int codigoProducto = (int)(Math.random()*(8130-8100+1)+8100);
                        int cantidad = (int)(Math.random()*10)+1;
                        bfwriter.write("("+i+","+codigoProducto+","+cantidad+","+
                            descuento[(int) (Math.random()*descuento.length)]+",'"+observacion[(int)(Math.random()*observacion.length)]+"'),\n");    
                    }
                    
                }
        bfwriter.close();
        System.out.println("Archivo creado satisfactoriamente..");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
