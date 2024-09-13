package day26;

public class Multi_Dimensional_Array {

	public static void main(String[] args) {
		int[][] x = {
				{3,5,89},
				{456,67,895},
				{1,3,5,7,9}
		};
		
		for(int row =0;row<x.length;row++) {
			for(int col=0;col<x[row].length;col++) {
				System.out.print(x[row][col]+"\t");
			}
			System.out.println();
		}
		String[][] words = new String[2][];
		System.out.println(words[0]);
		words[0] = new String[3];
		words[0][1]="hi bhuvana";
		System.out.println(words[0][1]);
		words[0][0]="Welcome";
		System.out.println(words[0][0] );

	}

}
