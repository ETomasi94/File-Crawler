# File-Crawler
A folder searching programs that lists all the files inside a directory's sub-directories

OVERVIEW : Given the path of the directory from which start searching and the number of threads you would delegate the task, this program will list all its sub-directories in addition to all files stored in those.

HOW-TO-USE IT:
Open the program in a terminal passing a string representing the path of the starting directory and an integer number representing the number of threads searching, then the list of all directories and files within will be displayed in output.

FILES:
MainClass.java - The main class implementing program's lifecycle.
FileList.java - Class implementing a list of files by means of an encapsulated Linked List of Strings, a method to get all directories' list ready and another method to print their content.
Examiner.java - Class implementing a producer that examines the directories by means of FileList's GetDirectories method.
Printer.java - Class implementing a consumer that prints the content of all directories by means of FileList's Print method.
Filter.java / InverseFilter.java - Class implementing a searching filter in order for the file lists methods to return only Directories' (Filter) and Files' (InverseFilter) names.


WRITTEN BY : Enrico Tomasi ON DATE : 24/10/2019
