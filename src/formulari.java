import java.util.Scanner;

import com.utils.forms.FormsBuilder;
public class formulari {
    public static void main(String[] args) {
        String name, mail;
        int age;
        double quota;
        
        String title = "Soci forn de pa";
        char titleSub = '*', separator = '#';

        FormsBuilder.printTitle(title, titleSub);
        name = FormsBuilder.getValueString("Nom");
        age = FormsBuilder.getValueInt("Edat");
        mail = FormsBuilder.getValueString("Correu electrònic");
        quota = FormsBuilder.getValueDouble("Quota que paga");

        FormsBuilder.divider(separator);

        FormsBuilder.printTitle("Validació de dades", titleSub);

        FormsBuilder.printValue("Name", name);
        FormsBuilder.printValue("Edat", Integer.toString(age));
        FormsBuilder.printValue("Correu electrònic", mail);
        FormsBuilder.printValue("Quota que paga", Double.toString(quota));
        
        FormsBuilder.getValueString("Validacío");
    
        // TODO fer la logica que torna a prguntar dades si no son correctes

        FormsBuilder.divider(separator);

        FormsBuilder.printValue("El soci", name);
        double discount = com.utils.store.Discounts.calculateDiscount(quota);
        FormsBuilder.printValue("Descompte aplicat", Double.toString(discount * 100) + "%");
        }
}
