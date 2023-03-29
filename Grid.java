/*
Grid.java
A Samus
13.03.2023*/

public class Grid{
	public static void main(String[] args){
		String[][] dash;
		dash=new String[10][10];

		for(int i=0;i<dash.length;i++){

			for(int j=0;j<dash.length;j++){

				dash[i][j]="-";
				System.out.print(dash[i][j]);
			}
			System.out.println();
		}


	}

}