package finalproject;

import java.lang.Integer;


public class Calculation {
	
	

	public double integrand(String c1, String c2, String c3, String e1, String e2, String e3, String d1, String d2, String d3, String upperRange, String lowerRange)
	{
		
		
		int a = Integer.valueOf(c1).intValue(); //c
		int d = Integer.valueOf(e1).intValue(); //e
		int i = Integer.valueOf(d1).intValue(); //d
		
		int b = Integer.valueOf(c2).intValue(); //c
		int e = Integer.valueOf(e2).intValue(); //e
		int j = Integer.valueOf(d2).intValue(); //d
		
		int c = Integer.valueOf(c3).intValue(); //c
		int f = Integer.valueOf(e3).intValue(); //e
		int k = Integer.valueOf(d3).intValue(); //d
		
		int g = Integer.valueOf(upperRange).intValue(); //u
		int h = Integer.valueOf(lowerRange).intValue(); //l
		
		
		int z = d+1;
		int x = e+1;
		int w = f+1;
		
		double ul = Math.pow(g,z);
		double il = Math.pow(g,x);
		double ol = Math.pow(g,w);
		
		double hl = Math.pow(h, z);
		double jl = Math.pow(h, x);
		double kl = Math.pow(h, w);
		
		double y = (((a*ul)/(i*z)) + ((b*il)/(j*x)) + ((c*ol)/(k*w)));
		double t = (((a*hl)/(i*z)) + ((b*jl)/(j*x)) + ((c*kl)/(k*w)));
		
		double u = y-t;
		
		return u;
	}
	
}