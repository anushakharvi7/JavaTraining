package comparableAndComparator;

import java.util.Arrays;
public class Driver {

	public static void main(String[] args) {
		
		AshithGf ar[]= {
				new AshithGf("Chetana",21,101,"B+",235687645678l,91d,10000.00),
				new AshithGf("Chiragi",18,102,"A+",235846925678l,72d,10080.00),
				new AshithGf("Anvitha",31,48,"AB+",235674125868l,86d,150000.00),
				new AshithGf("akshada",20,251,"O+",946387645678l,78d,200000.00),
				new AshithGf("pooja",17,192,"B+",235687649534l,95d,150900.00),
				new AshithGf("sara",18,144,"O+",965845445678l,88d,20500.00)
		};
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		
	}

}
