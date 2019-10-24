/*ASSIGNMENT NUMERO 4 LABORATORIO DI RETI A.A 2019-2020
Nome Assignment : FileCrawler.java

Autore : Enrico Tomasi
Numero Matricola : 503527

OVERVIEW : Programma che stampa il contenuto di una directory e di tutte le 
sotto-directory associate
*/
package filecrawler;

import java.io.File;
import java.io.FileFilter;

/*
    @Class Filter

    @OVERVIEW : Filtra i contenuti della visita alle sotto-directory restituendo
    un booleano che indica se il file riscontrato è una directory o meno, quindi
    accettandolo solo in caso affermativo e facendo in modo che la classe Examiner
    inserisca, per mezzo dei metodi GetDirectories della classe FileList e 
    listfiles() della classe file,solo ed esclusivamente nomi di directory nella lista di scansione.
*/
public class Filter implements FileFilter
{
    public Filter()
    {
    }

    @Override
    public boolean accept(File f) 
    {
       return f.isDirectory();
    }
}
