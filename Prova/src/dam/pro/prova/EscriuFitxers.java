package dam.pro.prova;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EscriuFitxers {

	public static String introdueixNomFitxer(){
		String nomFitxer;
		//llegirem del teclat!!!!
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Introdueix el nom del fitxer:");
		nomFitxer = sc.nextLine();
		sc.close();
		return nomFitxer;
	}
	
	public static void llegirFitxer(String nomFitxer){
		File f;
		
		ArrayList <String> aNoms = new ArrayList <String>();
		
		f = new File("C:\\Users\\Alvaro\\Desktop\\"+nomFitxer);
		
		FileReader fr;
		
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea;
	        int i=0;
	        System.out.println("Contingut del fitxer sense ordenar...");
	        while((linea=br.readLine())!=null){
	        	aNoms.add(linea);
	            System.out.println(aNoms.get(i)+"-"+i);
	            i++;
	        }
	        fr.close();
	        EscriuFitxers.ordenaArrayNoms(aNoms);
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		String nf;
		//llegim nom del fitxer
		nf=introdueixNomFitxer();
		//mètode que llig un fitxer
		llegirFitxer(nf);
	}
	
	
	public static void ordenaArrayNoms(ArrayList<String> llistat){
		int x = llistat.size();
		String a[] = new String[x];
		
	
		
		for(int i=0;i<x;i++){
			try{
				a[i]= llistat.get(i);
			}catch(IndexOutOfBoundsException p) {
				p.printStackTrace();
			}
		}
		
		Arrays.sort(a);
		llistat.clear();
		
		List l=Arrays.asList(a);
		ArrayList <String> al = new ArrayList(l);
		
		for(int i=0;i<x;i++){
			llistat.add(a[i]);
		}
		
		System.out.println("Contingut del fitxer ORDENAT...");
		
		try{
		for(int i=0;i<x;i++){
			System.out.println(llistat.get(i));
		}
		}catch(IndexOutOfBoundsException p) {
			p.printStackTrace();
		}		
		
	}
	
}
