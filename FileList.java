/*ASSIGNMENT NUMERO 4 LABORATORIO DI RETI A.A 2019-2020
Nome Assignment : FileCrawler.java

Autore : Enrico Tomasi
Numero Matricola : 503527

OVERVIEW : Programma che stampa il contenuto di una directory e di tutte le 
sotto-directory associate
*/
package filecrawler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;

/*
    @CLASS FileList
    @Overvierw Implementazione di una lista di File che incapsula una LinkedList
    di stringhe
*/
public class FileList 
{
    LinkedList<String> files = null;
    
    public FileList()
    {
        files = new LinkedList();
    }
    
    public LinkedList<String> GetList()
    {
        return files;
    }
    
    public void add(String s)
    {
        files.add(s);
    }
    
    public void remove()
    {
        files.poll();
    }
    
    public File RetrieveFirst()
    {
        String s = files.peek();
        
        File f = new File(s);
        
        return f;
    }
    
    /*
        @METHOD GetDirectories
        @OVERVIEW Metodo che visita ricorsivamente tutte le sottodirectory di 
        una directory passata come parametro di tipo File
    
        @PAR f Directory da cui iniziare la ricerca
    */
     public synchronized void GetDirectories(File f) throws FileNotFoundException
    {
      Filter fiter = new Filter();
      
      File[] DirContent = f.listFiles(fiter);
      
      if(DirContent == null)
      {
          return;
      }
  
      for(File dir : DirContent)
      {
          files.add(dir.getAbsolutePath());
          GetDirectories(dir);
      }
    }
    
    /*
        @METHOD Print
        @OVERVIEW Metodo che stampa tutti i file contenuti nelle directory elencata
        in una lista specifica
     */
    public synchronized void Print()
    {
        if(files == null)
        {
            return;
        }
        
        while(!files.isEmpty())
        {
           InverseFilter filter = new InverseFilter();
            
            String path = files.poll();
            File f = new File(path);
            
            File[] filelist = f.listFiles(filter);
            
            System.out.println("----DIRECTORY ANALIZZATA: "+f+" --------\n");
            
            if((filelist.length == 0))   
            {
                System.out.println("<DIRECTORY VUOTA>\n");
            }
            
            for(File fl : filelist)
            {
                System.out.println("File : "+fl.getName()+"\n");
            }
        }
    }    
}
