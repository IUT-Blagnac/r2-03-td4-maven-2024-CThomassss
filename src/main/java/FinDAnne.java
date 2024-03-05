
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (votre nom)
 */ 
import java.util.Scanner;
public class FinDAnne
{
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Saisir un numéro de mois ? ");
        int mois = scanner.nextInt();
        
        System.out.print("Saisir une année ? ");
        int annee = scanner.nextInt();
        
        
        while (mois < 1 || mois > 12) {
            System.out.println("Mois invalide. Le mois doit être compris entre 1 et 12.");
            System.out.print("Saisir un numéro de mois ? ");
            mois = scanner.nextInt();
        }
        while (annee <= 1500 || annee >=2090) {
            System.out.println("annee invalide. Le mois doit être compris entre 1 et 12.");
            System.out.print("Saisir une année ? ");
            annee = scanner.nextInt();
        } 
        afficherMoisEtJours(mois, annee);
    }
    
    public static void afficherMoisEtJours(int mois, int annee) {
        String[] nomsMois = {
            "Janvier", "Février", "Mars", "Avril", "Mai", "Juin",
            "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"
        };
        
        int [] joursMois = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        
        for (int i = mois - 1; i < 12; i++) {
            System.out.println(nomsMois[i] + " " + annee + ", " + joursMois[i] + " jours");
        }
    }
        public static boolean estBissextile(int annee) {
        boolean bissextile = false;
        if (annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0)) {
            bissextile = true;
        }
        return bissextile;
    }
        
    }




