import java.io.*;
public class GenerarCliente{
    private static int size = 450;
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
                    "Emmanuel","Jorge","Pablo", "Herberto","Catalina","Larissa","Martina","Tomás","Santiago","Facundo",
                    "Juan Francisco","Daniel Alejandro","María Del Rosario","Oriana","Jeremias","Franco Emanuel","Alan Gabriel",
                    "Gonzalo Agustin","Giuliana","Maximiliano","Natalia","Francisco Agustin","Rocio Ailen","Luz María","Sofia Micaela",
                    "Julieta Belén","Maria Del Carmen","Braian Nicolás","Camila","Agustina","Martina","Karen Ayelén","Milagros Abigail",
                    "Aylen","Natalia Soledad","Rocio","Antonella","Magdalena","Priscila","Carla","Luna","Rosario","Francisco Tomas",
                    "Noelia","Gabriela"};
     static String calle [] = {"Almendros","Av. Lazaro Cardenas", "Bosque", "Constitucion", "Constituyentes",
                "Ilustres", "Niños Héroes", "Elizeo Jimenez", "Periferico", "Valdivia", "Flores", "Palmeras", 
                "Azules","Puerta Blanca", "Emiliano Zapata", "Montes verdes","Malvira","Cosmes","Le Verité",
                "Sandoval","Nicolas","Hidalgo", "Independencia", "Amperson","Morelos","Benito Juárez","José María Morelos",
                "Miguel Hidalgo","Armenta y López","Berriozábal","Aurelio Valdivieso",
                "García Vigil","Gustavo Díaz Ordáz","Humboldt","Ignacio Allende","Jesús Carranza","J.P. García","20 de Noviembre",
                "Constitución","Reforma","Unión","Cinco de Mayo","General Porfirio Díaz","Manuel Fernández Fiallo","Mariano Abasolo",
                "Mariano Matamoros","M. Bravo","Melchor Ocampo","Murguía","Pino Suárez","Quetzalcóatl","Tinoco y Palacios" };

    public static void generarCliente(){
        FileWriter flwriter = null;
            try {
                flwriter = new FileWriter("C:/Users/aleja/Desktop/clientesChepe.sql");
                BufferedWriter bfwriter = new BufferedWriter(flwriter);
                for (int i = 1000 ; i <= 1040; i++){
                    int num = (int) (Math.random()*500)+1;
                    bfwriter.write("("+i+",'"+name[(int) (Math.random()*name.length)]+" "+
                        apellido[(int) (Math.random()*apellido.length)]+" "+
                        apellido[(int) (Math.random()*apellido.length)]+"','"+
                        calle[(int)(Math.random()*calle.length)]+" #"+num+"'),\n");
                }
        bfwriter.close();
        System.out.println("Archivo creado satisfactoriamente..");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}