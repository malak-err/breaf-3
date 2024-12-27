import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fonctions fonctions = new Fonctions();
Scanner sc = new Scanner(System.in);

       while (true){
           System.out.println("MENU");
           System.out.println("1.ajouter");
           System.out.println("2.afficher");
           System.out.println("3.modifier");
           System.out.println("4.rechercher");
           System.out.println("5.supprimer");
           System.out.println("6.quitter");
           System.out.print("Entrer un choix :");
           int choix = sc.nextInt();
           switch (choix){
               case 1:
                   fonctions.ajouter();
                   break;
                   case 2:
                       fonctions.afficher();
                       break;
                       case 3:
                           fonctions.modifierUtilisateur();
                           break;
                           case 4:
                               fonctions.search();
                               break;
                               case 5:
                                   fonctions.supprimer();
                                   break;

                                   case 6:
                                       System.out.println("GoodBye");
                                       break;
                                       default:
                                           System.out.println("choix invalide");
           }


       }

    }
}