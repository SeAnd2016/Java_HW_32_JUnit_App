package core;

public class App {
	public static void main(String[] args) {math();}
	public static void math() {
		System.out.println(minFunction(4,8));
		System.out.println(maxFunction(4,8));
		System.out.println(avgFunction(4,8));
	}
	
	public static int minFunction(int n1, int n2) {
		int min; if (n1 > n2) min = n2; else min = n1; return min;}
	public static int maxFunction(int n1, int n2) {
		int max; if (n1 < n2) max = n2; else max = n1; return max;}
	public static int avgFunction(int n1, int n2) {
		int avg; avg = (n1 + n2) / 2; return avg;}
	}
