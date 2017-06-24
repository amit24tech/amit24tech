package Rough;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class Demo {

public static void main(String[] args) throws IOException {
	
	readfile();
}
	
public static void readfile() throws IOException
{
	FileReader fileReader=new FileReader("demo.txt");
	Map<String, Integer> m=new HashMap<String,Integer>();
	BufferedReader br=new BufferedReader(fileReader);
	String s;
	String [] sa = null;
	
	while((s=br.readLine())!=null)
	{
		sa=s.split(" ");

	}
for(String st:sa)
{
	m.put(st,m.containsKey(st)?m.get(st)+1:1);
	
}

Set<Entry<String, Integer>> set=m.entrySet();
for(Entry<String , Integer> e:set)
{
if(e.getValue()>1)
{System.out.println(e.getKey()+ " is reapeted "+e.getValue()+"times");}
}







}

}


