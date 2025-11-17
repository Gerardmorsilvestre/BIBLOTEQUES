import com.utils.forms.FormsBuilder;
public class formulari {
    public static void main(String[] args) {
        FormsBuilder.printTitle("Formulari de Registre d'Usuaris");
        FormsBuilder.printValue("Nom", "Joan Pérez");
        FormsBuilder.printValue("Edat", "30");
        FormsBuilder.printValue("Correu Electrònic", "joan.perez@example.com");
        FormsBuilder.divider('-');
        FormsBuilder.printTitle("Informació Addicional");
        FormsBuilder.printValue("País", "Espanya");
        FormsBuilder.printValue("Ciutat", "Barcelona");
        FormsBuilder.divider('-');
        FormsBuilder.printValue("Registre Complet", "Gràcies per registrar les teves dades!");


    }
}
