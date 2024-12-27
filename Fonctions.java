import java.util.ArrayList;
import java.util.Scanner;

public class Fonctions {
    ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void ajouter ( ) {
        System.out.println("entrer le nom");
        String nom = scanner.nextLine();
        System.out.println("entrer l'age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("entrer l'email");
        String email = scanner.nextLine();
        System.out.println("entrer l'password");
        String motdepasse= scanner.nextLine();
        System.out.println("entrer le role");
        String rolename = scanner.nextLine();

        Role role = new Role(rolename);
        utilisateurs.add(new Utilisateur(nom,age, email, motdepasse, role));
        System.out.println(" ajjouter avec succés!");
    }

    public void afficher() {
        if (utilisateurs.size() < 0) {
            System.out.println("accune utilisateur a afficher !");

        }
        for (Utilisateur user : utilisateurs) {
            System.out.println(user);
        }
    }
public void supprimer(){
    System.out.println("entrer le nom");
    String nom = scanner.nextLine();
 if (utilisateurs.size() < 0) {
     System.out.println("accune supprimer !");
 }else{
    utilisateurs.removeIf(utilisateur -> utilisateur.getNom().equals(nom));

}
    }

    public void search(){
        String valueSearch;
        ArrayList<Utilisateur> usersFound = new ArrayList<>();
        System.out.print("Enter Email ou le nom   de l'utilisateur à rechercher : ");
        valueSearch = scanner.nextLine();

        for (Utilisateur utilisateur : utilisateurs){
            if (utilisateur.getNom().contains(valueSearch)
                    || utilisateur.getEmail().contains(valueSearch)
                    || utilisateur.getRole().getRoleName().contains(valueSearch)){

                usersFound.add(utilisateur);
            }
        }

        if (usersFound.isEmpty()){
            System.out.println("Aucun utilisateur trouve!");

        }else {
            for (Utilisateur utilisateur : usersFound){
                System.out.println(utilisateur);
            }
        }


    }

    public void modifierUtilisateur(){
        System.out.print("Enter nom de l'utilisateur à modifier : ");
        String nom = scanner.nextLine();
        scanner.nextLine();
        System.out.println("1. Modifier le nom " +
                "\n 2. Modifier l'age " +
                "\n 3. Modifier l'email \n" +
                " 4. Modifier le role ");

        System.out.print("Enter your choice: ");
        String choix = scanner.nextLine();
        scanner.nextLine();
        for (Utilisateur utilisateur : utilisateurs){  // foreach
            if (utilisateur.getNom().equals(choix)){

                switch (choix){
                    case "1":
                        System.out.print("Enter le nouveau nom : ");
                        utilisateur.setNom(scanner.nextLine());


                        break;
                    case "2":
                        System.out.print("Enter le nouvel age : ");
                        utilisateur.setAge(scanner.nextInt());
                        break;
                    case "3":
                        System.out.print("Enter le nouvel email : ");
                        utilisateur.setEmail(scanner.nextLine());
                        break;
                    case "4":
                        System.out.print("Enter le nouveau role : ");
                        String rolename = scanner.nextLine();
                        Role role = new Role(rolename);
                        break;
                    default:
                        System.out.println("Choix invalide!");

                }
            }
        }
    }
}



