package week3_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> CityName = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		String CityNameTemp = new String();
		int CityCount = 0;
		
		CityNameTemp = in.next();
		while(!CityNameTemp.equals("###"))
		{
			CityName.add(CityNameTemp);
			CityNameTemp = in.next();
		}
		
		int[][] Distance = new int[CityName.size()][CityName.size()];
		for(int i=0; i<CityName.size();i++)
		{
			for(int j=0; j<CityName.size();j++)
			{
				Distance[i][j] = in.nextInt();
				}
		}
		
		String CityName1 = new String(in.next());
		String CityName2 = new String(in.next());
		int CityIndex1 = CityName.indexOf(CityName1);
		int CityIndex2 = CityName.indexOf(CityName2);
		
		System.out.print(Distance[CityIndex1][CityIndex2]);
		
	}
}


