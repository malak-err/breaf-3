public class Utilisateur extends Personne{
        String email;
        String motdepasse;
        Role role;

    public Utilisateur(String nom, int age,String email, String motdepasse, Role role) {
        super(nom, age);
        this.email = email;
        this.motdepasse = motdepasse;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return
                "\nRole : " + role.getRoleName() +
                "\nNom  : " + nom +
                "\nAge  :" + age +
                "\nEmail :" + email;
    }
}
