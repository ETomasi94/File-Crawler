/*ASSIGNMENT NUMERO 4 LABORATORIO DI RETI A.A 2019-2020
Nome Assignment : FileCrawler.java

Autore : Enrico Tomasi
Numero Matricola : 503527

OVERVIEW : Programma che stampa il contenuto di una directory e di tutte le 
sotto-directory associate
*/
package filecrawler;

import java.io.File;
import java.util.LinkedList;
import java.io.FileNotFoundException;

/*
    @CLASS Examiner

    @OVERVIEW : Classe che implementa un thread produttore che esamina i nomi
    delle sotto-directory di una lista di directory passata come parametro e li inserisce
    in una struttura dati di tipo LinkedList
*/
public class Examiner extends Thread
{
    FileList directories = null;
    LinkedList<String> listoffiles = null;
    File start = null;
    
    public Examiner(FileList dir)
    {
        this.directories = dir;
        this.listoffiles = dir.GetList();
    }

    public void run()
    {
        try 
        {  
           File f = directories.RetrieveFirst();
            
           directories.GetDirectories(f);
        } 
        catch (Exception e) 
        {
           e.printStackTrace();
        }
        
    }
}
