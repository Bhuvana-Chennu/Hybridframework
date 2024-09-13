package day26;

public class Cunstructur_Demo {
	public Cunstructur_Demo() {
		System.out.println("This is in  the default constructer");
	}
	
/*	public Cunstructur_Demo(int a,int b) {
		System.out.println("I am in the parameterized constructor");
		System.out.println(a+b);
	}*/
	public Cunstructur_Demo(String str) {
		System.out.println(str);
	}
	
	public void m1() {
		System.out.println("This is m1 method");
	}

	public static void main(String[] args) {
		Cunstructur_Demo cd = new Cunstructur_Demo();
		//Cunstructur_Demo cd1 = new Cunstructur_Demo(4,5);
		Cunstructur_Demo c= new Cunstructur_Demo("Hello");
		
	//	int[] a = new int[5];
		//a[0]=1;
		int a[] = {1,2,3,45,6};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		String[] fruits = {"apple","banana","guava","strawberry"};
	/*	for(int i =0; i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}*/
		
		String[] text = new String[3];
		System.out.println(text[0]);
		text[0] = "hai";
		System.out.println(text[0]);
		
		
	}

}
