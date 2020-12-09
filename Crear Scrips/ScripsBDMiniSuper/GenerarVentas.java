import java.io.*;
public class GenerarVentas{
    static String [] formaPago = {"Efectivo","Tarjeta de Crédito","Tarjeta de Débito","Vales de Despensa"};
    public static void generarVentas(){
        FileWriter flwriter = null;
            try {
                flwriter = new FileWriter("C:/Users/aleja/Desktop/ventas.sql");
                BufferedWriter bfwriter = new BufferedWriter(flwriter);
                for (int i = 5000 ; i <= 5050; i++){
                    int noEmpleado = (int) (Math.random() * (150-100+1)+100);
                    int noCliente = (int) (Math.random()*(560-500+1)+500);
                    bfwriter.write("("+i+",'"+fecha()+"','"+formaPago[(int) (Math.random()*formaPago.length)]+"',"+noEmpleado+","+noCliente+"),\n");
                }
        bfwriter.close();
        System.out.println("Archivo creado satisfactoriamente..");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String fecha(){
        int day   = (int) (Math.random()*28)+1;
        int month = 01;//(int) (Math.random()*12)+1;
        int year  = (int) (Math.random()*10)+2009;
        String m, d;
        if (day < 10){
            d = "0"+day;
        }else{
            d = ""+day;
        }

        if (month <10){
            m = "0"+month;
        }else{
            m = ""+month;
        }
        return d+"-"+"06"+"-"+2020;
    }
}
