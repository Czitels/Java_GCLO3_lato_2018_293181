/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author bitel
 */
public class ExtendedSystemCache extends SystemCache{
    void exportCSV( String path )throws IOException{
        FileOutputStream stream = new FileOutputStream(path);
        exportCSV(stream);
    }
    void exportCSV(FileOutputStream file) throws IOException
    {
        OutputStream stream = file;
        exportCSV(stream);
        
        
    }
    void exportCSV(OutputStream stream) throws IOException{
        StringBuilder sb = new StringBuilder();
        for(HashMap.Entry<Parameter, Double> entry: cache.entrySet()){
            Parameter key = entry.getKey();
            for(Double x: key.values){
                sb.append(x.toString());
                sb.append(", ");
            }
            Double value = entry.getValue();
            sb.append(value.toString());
            sb.append("\n");
        }
        try (Writer writer = new OutputStreamWriter(stream)) {
            writer.write(sb.toString());
        }
    }

    void serialize( String path ) throws IOException{
        try (FileOutputStream file = new FileOutputStream(path)) {
            serialize(file);
        }
    }
    void serialize ( FileOutputStream file ) throws IOException{
        try (ObjectOutputStream stream = new ObjectOutputStream(file)) {
            serialize(stream);
        }
    }
    void serialize ( ObjectOutputStream stream ) throws IOException{
        stream.writeObject(cache);
    }
    void deserialize( String path ) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(path);
        deserialize(file);
        file.close();
    }
    void deserialize( FileInputStream file ) throws IOException, ClassNotFoundException {
        ObjectInputStream stream = new ObjectInputStream(file);
        deserialize(stream);
        stream.close();
    }
    void deserialize( ObjectInputStream stream ) throws IOException, ClassNotFoundException {
        cache = (HashMap<Parameter,Double>) stream.readObject();
    }
    void improtCSV(String path) throws IOException
    {
        File file = new File(path);
        importCSV(file);
    }
    void importCSV(File file) throws IOException
    {
        Scanner scanner= new Scanner(file);
        importCSV(scanner);
    }

    void importCSV(Scanner input)
    {
        ArrayList<Double> arr = new ArrayList<Double>();
        double output = 0.0;
        while(input.hasNext())
        {
            String data = input.next();
            String[] elem = data.split(",");

            boolean out = false;

            for(int i = 0; i < elem.length; i++)
            {
                if(i==5)
                {
                    out = true;
                }
                else if(out == false)
                {
                    arr.add(Double.parseDouble(elem[i]));
                }
                else
                {
                    output = Double.parseDouble(elem[i]);
                }
            }

            double [] tab = new double[arr.size()];
            for(int i = 0; i < arr.size(); i++)
            {
                tab[i] = arr.get(i);
            }

            put(tab,output);
            arr.clear();

        }
        input.close();
    }
}
