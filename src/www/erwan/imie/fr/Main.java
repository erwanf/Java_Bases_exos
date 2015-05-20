package www.erwan.imie.fr;

/**
 * @autor Erwan
 */


import java.util.Scanner;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {
/**
 *
 */

/*Exercice 1*/
        /*
        Scanner scan = new Scanner(System.in);
        int age;
        age = scan.nextInt();

        if (age>=12){
            System.out.println("Cadet");
        }else if (age>=10){
            System.out.println("Minime");
        }
        else if(age>=8){
            System.out.println("Pupille");
        }
        else if(age>=6){
            System.out.println("Poussin");
        }
        else{
            System.out.println("Trop jeune");
        }

*/


   /*Exercice 2*/
/*
        int nb = 13;
        if (nb % 2 == 0){
            System.out.println("pair");
        }
        else{
            System.out.println("impair");
        }
*/
        /*Exercice 3*/
/*
        String mot = "blbabl";
        int taille = mot.length();
        if (taille > 3 && taille < 10){
            System.out.println("OK");
        }
        else{
            System.out.println("KO");
        }
*/
        /*Exercice 4*/
/*
        int nbPhotocop = 14;
        double prix=0;
        int ii = 1;
        while (ii<=nbPhotocop) {
            if (ii <= 10) {
                prix +=  0.1;
            } else if (ii <= 30) {
                prix +=  0.08;
            } else {
                prix += 0.05;
            }
            ii++;
        }
        System.out.println("Le prix total est de : " + prix);
*/
        /*Exercice 5*/
/*
        int n = 15, somme = 0, ii = 0;
        while (ii <= n){
            somme = somme + ii;
            ii++;
        }
        System.out.println(somme);
*/
        /*Exercice 6*/
/*
        int n = 4, fact = 1, ii = 1;
        while (ii <= n){
            fact = fact * ii;
            ii++;
        }
        System.out.println(fact);
*/
        /*Exercice 7*/
/*
        for(int ii = 0; ii <=100; ii++){
            System.out.println(ii + " ");
        }
        System.out.println();
        int ii = 0;
        while (ii <= 100){
            System.out.print(ii + " ");
            ii++;
        }
        ii = 0;
        System.out.println();
        do{
            System.out.print(ii + " ");
            ii++;
        }while(ii != 101);

*/
        /*Exercice 8*/
/*
        for(int ii = 0; ii <=100; ii++){
            System.out.print(ii + " ");
        }
        System.out.println();
        int ii = 0;
        while (ii != 101){
            System.out.print(ii + " ");
            ii++;
        }
        ii = 0;
        System.out.println();
        do{
            System.out.print(ii + " ");
            ii++;
        }while(ii != 101);
*/
        /*Exercice 9*/
/*
            String ch = "Bonjour";
            char[] tCaracs;
            tCaracs = ch.toCharArray();
            int a = tCaracs.length;
            for(int ii = a-1; ii >= 0 ; ii--){
                System.out.println(tCaracs[ii]);
            }
*/
        /*Exercice 10*/
/*
        String verbe = "balancer";
        String[] tabPro = {"je ", "tu ", "il/elle ", "nous ", "vous ", "ils/elles "};
        String[] tabTerm = {"ais", "ais", "ait", "ions", "iez", "aient"};
        String verbeSansEr = verbe.substring(0, verbe.length() - 2);
        char lettreAvantEr = verbeSansEr.charAt(verbeSansEr.length() - 1);
        String premiereLettre = verbe.substring(0, 1);
        verbeSansEr = verbeSansEr.substring(0, verbeSansEr.length() - 1);
        for (int ii = 0; ii < tabPro.length; ii++) {
            if (ii == 0 && (premiereLettre.equals("a") ||
                    premiereLettre.equals("e") ||
                    premiereLettre.equals("i") ||
                    premiereLettre.equals("o") ||
                    premiereLettre.equals("u"))) {
                System.out.print("j\'" + verbeSansEr);

            } else {
                System.out.print(tabPro[ii] + verbeSansEr);
            }
            if ((lettreAvantEr == 'g') && (ii != 3 && ii != 4)) {
                System.out.print(lettreAvantEr);
                System.out.print('e');
            } else if ((lettreAvantEr == 'c') && (ii != 3 && ii != 4)) {

                System.out.print("ç");
            } else {
                System.out.print(lettreAvantEr);
            }
            System.out.println(tabTerm[ii]);
        }
*/
        /*Exercice 11*/
/*
        int[] tab = {12,15,19,20,10,5};
        double total= 0;
        double moyenne;
        for(int n : tab){
            System.out.println(n);
            total = total + n;
        }
        moyenne = total / tab.length;
        System.out.println(moyenne);
*/

        /*Exercice 12*/
/*
        int[] tab = {1,2,3,4,5,6,7,8,9};
    for(int n : tab)
    System.out.print(n+" ");
    System.out.println("");
        int v = tab[tab.length-1];
        for(int ii = tab.length-1; ii >= 0; ii--){
            if (ii == 0){
                tab[0] = v;
            }else{
                tab[ii] = tab[ii - 1];
            }
        }
        for(int n : tab)
        System.out.print(n + " ");
*/
        /*Exercice 13*/
/*
        int nombre = 12;
        char c = '*';
        for(int ii = 0; ii < nombre; ii++){
            for(int jj = 0; jj <= ii; jj++){
                System.out.print(c);
            }
            System.out.println();
        }
*/
        /*Exercice 14*/
/*
        int[] tab = {5,7,30,25,10};
        int min, max;
        if (tab.length > 0){
            min = max = tab[0];
            for(int ii = 1; ii < tab.length; ii++){
                if (tab[ii] < min){
                    min = tab[ii];
                }
                if (tab[ii] > max){
                    max = tab[ii];
                }
            }
            System.out.println("Le plus grand écart est de " + Math.abs(max - min));
        }
        else{
            System.out.println("Le tableau est vide!");
        }
*/
        /*Exercice 15*/
/*
        int n = 13;
        for (int ii = 1; ii <= 10; ii++){
            System.out.println(n + " * " + ii + " = " + n * ii);
        }
*/
        /*Exercice 16*/
/*
        int n = 15;
        do {
            if (n % 2 == 0) {
                System.out.println(n + " est pair");
                n += 3;
                continue;
            }
            if (n % 3 == 0) {
                System.out.println(n + " est multiple de 3");
                n += 5;
            }
            if (n % 5 == 0) {
                System.out.println(n + " est multiple de 5");
                break;
            }
            n += 1;
        } while (true);
*/
/*
        0 est pair
        3 est multiple de 3
        9 est multiple de 3
        15 est multiple de 3
        20 est multiple de 5
  */      
        /*Exercice 17*/
/*
        int n, p;
        n = 0;
        while (n <= 5) {
            n++;
        }
        System.out.println("A : n = " + n);
        n = p = 0;
        while (n <= 8) {
            n += p++;
        }
        System.out.println("B : n = " + n);
        n = p = 0;
        while (n <= 8) {
            n += ++p;
        }
        System.out.println("C : n = " + n);
        n = p = 0;
        while (p <= 5) {
            n += p++;
        }
        System.out.println("D : n = " + n);
        n = p = 0;
        while (p <= 5) {n += ++p;
        }
        System.out.println("E : n = " + n);
    */
        /*Exercice 18*/
/*
        int n = 12;
        for (int ii = 1; ii <= n; ii++) {
            for (int jj = n - ii; jj >= 0; jj--) {
                System.out.print(" ");
            }
            for (int kk = 1; kk <= ii; kk++) {
                System.out.print("* ");
            }
            System.out.println();


        }
*/
        /*Exercice 19*/
/*
        int a = 1234;
        int b=0;
        while (a>0){
            b=10*b+a%10;
            a=a/10;
        }
        System.out.println(b);
 */
        /*Exercice 20*/
        //Faire deux euros avec des pièces
/*
        int p1 = 2;
        int p2 = 5;
        int p3 = 10;
        int nb = 0;
        for (int ii = 0; ii <= 10; ii++){
            for (int jj = 0; jj <= 20; jj++){
                for (int kk = 0; kk <= 50; kk++){
                    if (ii * p3 + jj * p2 + kk * p1 == 100){
                        System.out.print("1 euro = ");
                        nb++;
                        if (ii != 0){
                            System.out.print(ii + " X 10c ");
                            if (jj != 0 || kk != 0) System.out.print("+ ");
                        }
                        if (jj != 0){
                            System.out.print(jj + " X 5c ");
                            if (kk != 0) System.out.print("+ ");
                        }
                        if (kk != 0){
                            System.out.print(kk + " X 2c");
                        }
                        System.out.println();
                    }
                }
            }
        }
        System.out.println(nb);
*/
        /*Exercice 21*/
/*
        boolean premier = true;
        for (int ii = 2; ii <= 100; ii++){
            for(int jj = 2; jj <= ii-1; jj++){
                if (ii % jj == 0){
                    premier = false;
                    break;
                }
            }
            if (premier){
                System.out.println(ii + " est un nombre premier.");
            }
            premier = true;
        }
*/
        /*Exercice 22*/
    /*
        int nbRandom = (int)(Math.random()*15 + 5);
        System.out.println(nbRandom);
    */
        /*Exercice 23*/
/*
        int[] tab = {1,2,3,4,3};
        boolean consecutif = true;
        for (int ii = 0; ii < tab.length -1; ii++){
            if ((tab[ii] != tab[ii+1] + 1) && (tab[ii] != tab[ii+1] - 1)){
                consecutif = false;
                break;
            }
        }
        System.out.println(consecutif);

*/
        /*Exercice 24*/

/*
        int[] tab=new int[99999999];
// affectation de valeurs au tableau en random
        for (int iij=0;iij<99999999;iij++){
            tab[iij]=(int) Math.random()*100;
        }
        int nb;
        boolean modif;
// mise en place d'un calcul de temps du trie à bulle
        long debut = System.currentTimeMillis();
//tri à bulle
        for(int jj = tab.length - 1; jj >= 1; jj--){
            modif = false;
            for (int ii = 0; ii < jj; ii++){
                if (tab[ii] > tab[ii+1]){
                    nb = tab[ii];
                    tab[ii] = tab[ii + 1];
                    tab[ii + 1] = nb;
                    modif = true;
                }
            }
// Si je n'ai pas eu de modification, alors, le tableau est déjà trié
            if(!modif){
                break;
            }
        }
// Affichage du tableau trié
        for (int n : tab){
       //     System.out.print(n + " ");
        }
// resultat du temps d'execution
        System.out.println("");
        System.out.println(System.currentTimeMillis()- debut);



//trie avec la methode aaray.sort de Java
        int[] tab2 = tab;
        long debut2 = System.currentTimeMillis();
        Arrays.sort(tab2);
        for (int n : tab2){
      //      System.out.print(n + " ");
        }
        System.out.println("");
        System.out.println(System.currentTimeMillis()- debut2);

 */


        /*Exercice 25*/

        int[][] plateau = new int[10][10];
        int nbDep=0, xD, yD, xO, yO, cptObs = 0;
        boolean place = false;
// Creation du plateau
        for (int ii = 0; ii <= 9; ii++){
            for (int jj = 0; jj <= 9; jj++){
                if (ii == 0 || ii == 9 || jj == 0 || jj == 9){
                    plateau[ii][jj] = 0;
                }
                else{
                    plateau[ii][jj] = 1;
                }
            }
        }
// Creation des obstacles
        while (cptObs < 8){
            xO = (int)(Math.random()*7) + 1;
            yO = (int)(Math.random()*7) + 1;
            // Si on est pas déjà sur un obstacle, on en place un
            if (plateau[xO][yO] != 0){
                plateau[xO][yO] = 0;
                cptObs++;
            }
        }
// Placer la reine
        do{
            xD = (int)(Math.random()*7) + 1;
            yD = (int)(Math.random()*7) + 1;
            // Si on est pas sur un obstacle, on place la reine
            if (plateau[xD][yD] != 0){
                place = true;
                plateau[xD][yD] = 4;
            }
        }while(!place);
        // Afficher mon plateau :
        for(int ii = 0; ii <= 9; ii++) {
            for (int jj = 0; jj <= 9; jj++){
                System.out.print(plateau[ii][jj] + " ");
            }
            System.out.println();
        }
        // Calculer les déplacements de la reine grâce à la méthode récursive dep
        for (int uu = -1; uu <= 1; uu++){
            for(int vv = -1; vv <=1; vv++){
                if (uu != 0 || vv != 0){nbDep = nbDep + Dame.dep(uu, vv, xD+uu, yD+vv, plateau);
                }
            }
        }
        System.out.println("La dame peut faire " + nbDep +  " déplacements.");


        /************************************************************************
         * **************************  Fin  *************************************
         * **********************************************************************/


    }
}


