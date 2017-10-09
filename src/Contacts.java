import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {

    private static ArrayList<Personne> l=new ArrayList<Personne>();
    Scanner sc=new Scanner(System.in);
    private static int vtemp;


     public void menu(){
         int refaire=1;
         while (refaire==1){
         if (l.size()==0){
             System.out.println("repertoire vide ");
             System.out.println("tappez 1) pour ajouter un contact ");
             vtemp = sc.nextInt();
             if(vtemp==1){
                 ajoutC();
             }
         }
         else{
             System.out.println("Menu: tapez le numéro correspondant a votre demande");
             System.out.println("1) repertoire");
             System.out.println(" 2) ajouter contact");
             System.out.println("  3) supprimer contact");
             System.out.println("   4) modifier contact");
             System.out.println("    5) chercher un contact");
             System.out.println("     6) afficher un contact");
             int demande=sc.nextInt();
             switch (demande){
                 case 1:afficherep();break;    /*a voir*/
                 case 2: ajoutC();break;
                 case 3: supc();break;
                 case 4: modifc();break;
                 case 5: cherchec();break;
                 default:
                     System.out.println("tappez un chiffre entre 1 et 6!!");
             }

         }
             System.out.println("avez vous finis ? si oui tappez 0");
             refaire=sc.nextInt();
         }

     }

     public void afficherep(){
         for (int i=0;i<l.size();i++){
             System.out.println(l.get(i));
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
         l.remove(nsup);

     } public void modifc(){
        String nom,prenom,tel,mail;
        System.out.println("selectionnez le contact a modifier ");
        int nmodif=sc.nextInt();
        System.out.println("modifier le nom ? 0>>oui ,1>>non");
        int v=sc.nextInt();
        if (v==0){
            System.out.println("nom:");
            nom=sc.next();
            l.get(nmodif).setNom(nom);
        }
        System.out.println( "modifier le prenom ?  0>>oui ,1>>non");
        int a=sc.nextInt();
        if (a==0){
            System.out.println("prenom:");
            prenom=sc.next();
            l.get(nmodif).setPrenom(prenom);
        }
        System.out.println( "modifier le tel ? 0>>oui ,1>>non");
        int b=sc.nextInt();
        if (b==0){
            System.out.println("tel: ");
            tel=sc.next();
            l.get(nmodif).setTel(tel);
        }

        System.out.println( "modifier le mail ? 0>>oui ,1>>non");
        int c=sc.nextInt();
        if (c==0){
            System.out.println("mail:");
            mail=sc.next();
            l.get(nmodif).setMail(mail);

        } }
        public void cherchec() {
         boolean b=false;
         int i=0;
            System.out.println("tappez le nom du contact ");
            String nom=sc.next();
            while(b==false && i<=l.size()){
               if ( l.get(i).getNom()==nom){
                   b=true;
               }
               else i++;
            }
            System.out.println(l.get(i));
     }


}
