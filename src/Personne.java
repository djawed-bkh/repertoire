public class Personne {
   static private String nom;
    private String prenom;
    private String tel;
    private String mail;

    public Personne(String nom, String prenom, String tel, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
    }


    public String toString() {
        return "nom:  "+this.nom+"  prenom:  "+this.prenom+"   tel:  "+this.tel+"  mail:  "+this.mail;
    }

    /* getters and setters */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    /* getters and setters */
}
