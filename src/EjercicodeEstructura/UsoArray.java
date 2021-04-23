package EjercicodeEstructura;

public class UsoArray {

	public static void main(String[] args) {
	int [][] matrix= 
		   {
		     {1,2,3,4,5},
			 {6,7,8,9,10},
			 {11,12,13,14,55},
			 {21,222,32,42,5}
	  };
	
	for (int[] fila:matrix) {
	System.out.println();	
	for (int j :fila) {
			System.out.print(j+"  ");
			
			
	}
		}
	
	
	}

}
