import java.io.*;
public class GenerarCompra{
    public static void generarCompra(){
        FileWriter flwriter = null;
            try {
                flwriter = new FileWriter("C:/Users/aleja/Desktop/compra.sql");
                BufferedWriter bfwriter = new BufferedWriter(flwriter);
                for (int i = 3000 ; i <= 3050; i++){
                    int provedor = (int) (Math.random()*(7030-7000+1)+7000);
                    int no_emp   = (int) (Math.random()*(150-100+1)+100);
                    bfwriter.write("("+i+","+provedor+",'"+fecha()+"',"+no_emp+"),\n");
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
