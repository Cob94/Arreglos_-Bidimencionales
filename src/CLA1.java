import java.util.Scanner;
public class CLA1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int arreglo_bid [][] = new int [3][4];
		arreglo_bid [1] [0]= 4;
		
		System.out.println(arreglo_bid [1] [0]);
		int arreglo_Tri [] [][] = new int [3][4];
		arreglo_Tri [1] [2] [0]= 4;
		System.out.println(arreglo_bid [1] [0]);*/
	//---------------------------------------------
		Scanner mi_s=new Scanner(System.in);
		// arreglo bidimensional
		// lo declaramos con dos corchetes
		
		int arreglo_bidd [] [];
		// luego declaramos la extensión del arreglo 
		
		arreglo_bidd = new int [2] [3];
		for(int i=0; i<2;i++){
		for(int j=0;j<3;j++){
			arreglo_bidd [i] [j]= mi_s.nextInt();
		}
		}
		for(int i=0; i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print("i:"+i+",");
				System.out.print("j:"+j+",");
			}
	}
	}
}
