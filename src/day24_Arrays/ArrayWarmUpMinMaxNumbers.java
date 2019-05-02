package day24_Arrays;

public class ArrayWarmUpMinMaxNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int [] num =  { 25,10,20};
		
		int temp;
		
		for(int i =0; i<num.length; i++) {
			for(int j= i+1; j<num.length; j++){
				if(num[j]>num[i]) {
					temp= num[j];
					num[j]= num[i];
					num[i]= temp;
					
				}
			}
		}System.out.println("max value is "+ num[0]);System.out.println("min value is "+ num[num.length-1]);
		
		
	}

}
