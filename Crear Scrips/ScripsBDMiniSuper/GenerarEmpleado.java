import java.io.*;
import java.util.Calendar;
import java.util.Random;
import java.text.SimpleDateFormat;

public class GenerarEmpleado{
    private static int size = 150;
    static String [] apellido = {"Chávez","Morales","García","Hernandez","Sanchez","Lopez","Revilla","Cruz",
                    "Gómez","Valencia","Hernández","Agustín", "González", "Arce", "Blas","Mendoza","Dominguez",
                    "Fuentes","Fabian","Ibañez","Luna","Lacio","Muñoz","Mayoral","Mecinas","Cruz","Miranda",
                    "Gurrión","Ojeda","Orozco", "Sánchez","Porras","Yescas","Rendón","Robles","Rodriguez",
                    "Vargas","Flores","Torres","Villanueva","Aguilar","Quintero","Aguirre","Santos","Barragán",
                    "Barrita","Caballero","Navarro","Ramírez","Bustamante","Peña","Guzmán", "Fernández","Montaño",
                    "Sandoval","Toledo","Villegas","Zárate"};
     static String [] name = {"Kevin","Laura","Diego","Jesús","José","Alma","Silvia","Arturo","Erick","Deisy",
                    "Shuany","Marcos","Uziel","Ivan","Alexis","Enrique","Vanessa","Joselyne","Itzel","Marianna","María",
                    "Abril","Monserrath","Rosario","Soledad","Obed","Carlos","Aldahir","Fernando","Alejandro","Eric",
                    "Baruc","Alejandra","Omar", "Oscar","Camila","Aranza","Lorena","Itzel","Ximena","Sofía","Jennifer",
                    "Cintia","Gilberto","Karen", "Manuel","David","Ester","Maritza","Ángel","Yovany","Citlally",
                    "Emmanuel","Jorge","Pablo", "Herberto","Catalina","Larissa"};
     static String calle [] = {"Almendros","Av. Lazaro Cardenas", "Bosque", "Constitucion", "Constituyentes",
                "Ilustres", "Niños Héroes", "Elizeo Jimenez", "Periferico", "Valdivia", "Flores", "Palmeras", 
                "Azules","Puerta Blanca", "Emiliano Zapata", "Montes verdes","Malvira","Cosmes","Le Verité",
                "Sandoval","Nicolas ST.","Hidalgo", "Independencia", "Amperson","Morelos"};
    static String puesto [] = {"Ayudante General", "Cajero", "Almacen", "Vendedor"};
    static double salario [] = {2000.00,2300.00,1900.00,2400.00};

    public static void generarEmpleados(){
        FileWriter flwriter = null;
            try {
                flwriter = new FileWriter("C:/Users/aleja/Desktop/participantes.txt");
                BufferedWriter bfwriter = new BufferedWriter(flwriter);
                for (int i = 100 ; i <= size; i++){
                    int val = (int)(Math.random()*puesto.length);
                    bfwriter.write("("+i+",'"+name[(int) (Math.random()*name.length)]+"','"+
                        apellido[(int) (Math.random()*apellido.length)]+"','"+
                        apellido[(int) (Math.random()*apellido.length)]+"','"+bornDate1()+
                        "','"+contratationDate()+"','"+puesto[val]+"',"+salario[val]+"),\n");
                }
        bfwriter.close();
        System.out.println("Archivo creado satisfactoriamente..");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String bornDate1(){
        int day   = (int) (Math.random()*28)+1;
        int month = (int) (Math.random()*12)+1;
        int year  = (int) (Math.random()*30)+1970;
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
        return d+"-"+m+"-"+year;
    }

    public static String contratationDate(){
        int day   = (int) (Math.random()*28)+1;
        int month = (int) (Math.random()*12)+1;
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
        return d+"-"+m+"-"+year;
    }
}
