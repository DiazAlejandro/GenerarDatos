import java.io.*;
public class GenerarDetalleCompra{
    static String  observacion [] = {"Sin Novedad","Sin Novedad","Cancelación",
                             "Sin Novedad", "Cancelacion", "Sin Novedad"};
    public static void generarDetalleCompra(){

        FileWriter flwriter = null;
            try {
                flwriter = new FileWriter("C:/Users/aleja/Desktop/compra.sql");
                BufferedWriter bfwriter = new BufferedWriter(flwriter);
                for (int i = 3000 ; i <= 3050; i++){
                    int veces = (int)(Math.random()*2)+1;
                    for (int j = 0 ; j <= veces ; j++){
                        int producto = (int) (Math.random()*(8130-8100+1)+8100);
                        int cantidad = (int) (Math.random()*10)+1;
                        bfwriter.write("("+i+","+producto+","+cantidad+",'"+observacion[(int)(Math.random()*observacion.length)]+"'),\n");
                    }
                }
        bfwriter.close();
        System.out.println("Archivo creado satisfactoriamente..");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
