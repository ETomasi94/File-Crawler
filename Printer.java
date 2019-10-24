/*ASSIGNMENT NUMERO 4 LABORATORIO DI RETI A.A 2019-2020
Nome Assignment : FileCrawler.java

Autore : Enrico Tomasi
Numero Matricola : 503527

OVERVIEW : Programma che stampa il contenuto di una directory e di tutte le 
sotto-directory associate
*/
package filecrawler;

/*
    @CLASS Printer

    @OVERVIEW : Classe che implementa un thread consumatore che stampa i nomi
    dei file nelle directory elencate in una lista passata come parametro.
*/
public class Printer extends Thread
{
    FileList directories = null;
    
    public Printer(FileList dir)
    {
        this.directories = dir;
    }
   
    public void run()
    {
        try
        {
            directories.Print();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
