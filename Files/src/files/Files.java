/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author bitel
 */
public class Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ScatterSystem system = new ScatterSystem();
        ExtendedSystemCache cache = new ExtendedSystemCache();
        double[] input = { 1, 3, 6, 8 ,12 };
        Double output = cache.get( input );
        if( output == null )
        {
            output = system.makeOperation( input );
            cache.put( input, output );
        }
        cache.exportCSV("C:\\MyJavaProjects\\Files\\test2.csv");
        //cache.serialize("C:\\MyJavaProjects\\Files\\test1.csv");
        ExtendedSystemCache mycache = new ExtendedSystemCache();
        File file = new File("C:\\MyJavaProjects\\Files\\test2.csv");
        //FileOutputStream fileForSerialization = new FileOutputStream("C:\\MyJavaProjects\\Files\\test1.csv");
        //cache.serialize(fileForSerialization);
        mycache.importCSV(file);
        System.out.println("as");
    }
    
}
