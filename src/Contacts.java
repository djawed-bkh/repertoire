import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {

    private static ArrayList<Personne> l=new ArrayList<Personne>();
    Scanner sc=new Scanner(System.in);
    private static int vtemp;


     public void menu(){
         if (l.size()==0){
             System.out.println("repertoire vide ");
             System.out.println("tappez 1) pour ajouter un contact ");
             vtemp = sc.nextInt();
             if(vtemp==1){
                 ajoutC();
             }
         }
     }
     public void afficherep(){
         for (int i=0;i<l.size();i++){
             System.out.println("nom"+l.get()+"prenom"+this.prenom+"tel"+this.tel+"mail"+this.mail;);
         }
     }
    public void ajoutC(){
                String nom,prenom,tel,mail;
                System.out.println("nom:");
                nom=sc.next();
                System.out.println("prenom:");
                prenom=sc.next();
                System.out.println("tel");
                tel=sc.next();
                System.out.println("mail");
                mail=sc.next();
                l.add(new Personne(nom,prenom,tel,mail));
    }
     public void supc(){

         System.out.println("selectioner le numéro du contact a suprimer ");
         int nsup=sc.nextInt();

     }

}
