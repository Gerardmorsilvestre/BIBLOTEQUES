import com.utils.forms.FormsBuilder;
import java.util.Scanner;
public class formulari {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Digues el teu nom:");
        String nom = as.nextLine();
        System.out.println("Digues la teva edat:");
        String edat = as.nextLine();
        System.out.println("Digues el teu correu electrònic:");
        String correu = as.nextLine();
        System.out.println("Digues la quota que pagues:");
        String quota = as.nextLine();
        
        //if (quota >= 0,25){
        //    System.out.println("No tens descompte");
        //} else if (quota <= 0,25 && quota >= 0,75){
        //    System.out.println("Tens un descompte del 5%");
        //} else if (quota <= 0,75 && quota >=1){
        //    System.out.println("Tens un descompte del 10%");
        //}  
        
        FormsBuilder.printTitle("Soci Forn de pa");
        FormsBuilder.printValue("Nom", nom);
        FormsBuilder.printValue("Edat", edat);
        FormsBuilder.printValue("Correu Electrònic", correu);
        FormsBuilder.printValue("Quota que paga", quota);
        FormsBuilder.divider('-');
        FormsBuilder.printValue("Nom", nom);
        FormsBuilder.printValue("Edat", edat);
        FormsBuilder.printValue("Correu Electrònic", correu);
        FormsBuilder.printValue("Quota que paga", quota);
        FormsBuilder.printValue("Validació", "Si/No");
        FormsBuilder.divider('-');
        FormsBuilder.printValue("El soci", "Gràcies per registrar les teves dades!");
        FormsBuilder.printValue("Descompte", "es calcula segons la quota que paga");


    }
}
