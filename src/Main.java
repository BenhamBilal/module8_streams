import gebruiker.Gebruiker;

import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner textInput = new Scanner(System.in);
//        Gebruiker admin = new Gebruiker("Adman","admin@ehb.be");
//
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("admin.txt"))){
//            oos.writeObject(admin);
//
//
//        }catch (IOException ios){
//            System.out.println("Fout met het wegschrijven van bestand");
//        }
//
//
//
//        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("admin.text"))){
//            Gebruiker userData = (Gebruiker) ois.readObject();
//            System.out.println(userData);
//        }catch (IOException e){
//            System.out.println("Fout met inlezen van het bestand");
//        }catch (ClassNotFoundException cnfe){
//            System.out.println("opgeslagen gegevens zijn niet van het type 'gebruiker'");
//        }

       /* // try with resources, zorgt achterliggend voor een close,en beheert alles
        try (FileWriter writer = new FileWriter("test.txt")) {
            while (! line.equals("STOP")){
                writer.append(line);
                line = textInput.nextLine();

            }
        } catch (IOException e) {
            System.out.println("geen geldig pad of bestand");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))){
            String gelezenUitInvoer = reader.readLine();
            System.out.println(gelezenUitInvoer);



        }catch (FileNotFoundException fnfe){
            System.out.println("Bestand niet gevonden");
        }catch (IOException ieo){
            System.out.println("Probleem met het bastand");
        }

        */


        try (FileWriter output = new FileWriter("dem.txt")) {
            String geschrevenText = textInput.nextLine();
            while (!(geschrevenText.equals("STOP"))) {
                output.append(geschrevenText + "\n");
                geschrevenText = textInput.nextLine();
            }
        } catch (IOException e) {
            System.out.println("Er is een uitvoer en invoer probleem");
        }


    }


}
