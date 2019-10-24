/*ASSIGNMENT NUMERO 4 LABORATORIO DI RETI A.A 2019-2020
Nome Assignment : FileCrawler.java

Autore : Enrico Tomasi
Numero Matricola : 503527

OVERVIEW : Programma che stampa il contenuto di una directory e di tutte le 
sotto-directory associate
*/
package filecrawler;
/*
    @Class MainClass
    @Overview Classe che implementa il ciclo di vita del programma
*/
public class MainClass
{
    /*
    MainClass Path NumberOfPrinters

    @METHOD main
    @OVERVIEW Metodo principale che implementa la scansione ricorsiva della directory
    @PAR Path Percorso della directory da esaminare
    @PAR NumberOfPrinters Numero di printers che accedono concorrentemente alla
         lista delle directory per stamparne il contenuto
    */
    public static void main(String[] args) 
    {
       FileList directories = new FileList();
       
       directories.add(args[0]);
       
       int k = Integer.valueOf(args[1]);
       
       new Examiner(directories).start();
       
       for(int i=0; i<k; i++)
       {
            new Printer(directories).start();
       }
       
    }    
}
