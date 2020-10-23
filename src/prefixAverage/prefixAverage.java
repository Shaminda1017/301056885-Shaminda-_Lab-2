package prefixAverage;

import java.util.Random;

public class prefixAverage {
	
	public static void main(String[] arg) {
		double[] x = new double[300];
		Random r = new Random();
			for(int i=0; 1<x.length; i++) {
			x[i] = r.nextInt(100);
			}
	long startTime = System.currentTimeMillis();
	
	double[] a = prefixAverage1(x);
	long endTime = System.currentTimeMillis();
	long executeTime = endTime-startTime;
	System.out.println("Execute method prefixAverage1, executetime:"+executeTime);
	
	System.out.println();
	
	startTime = System.currentTimeMillis();
	double[] b = prefixAverage2(x);
	endTime = System.currentTimeMillis();
	executeTime = endTime-startTime;
	System.out.println("Execute method prefixAverage2, executetime:"+executeTime);
	
	}
	public static double[] prefixAverage1(double[] x) {
		int n = x.length;
		double [] a = new double[n]; 
		for (int j=0; j < n; j++) {
		double total = 0;
		for (int i=0; i <= j; i++) {
			total += x[i];
		}
		a[j] = total / (j+1);
		}
		return a;
	}
	
	public static double []  prefixAverage2(double [] x) {
		int n = x.length;
		double[] a = new double[n];
		double total = 0;
		for (int j=0; j< n; j++) {
			total += x[j];
			a[j] = total / (j+1);
		}
		return a;
	}
}
