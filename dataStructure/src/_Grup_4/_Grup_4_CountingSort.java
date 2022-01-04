package _Grup_4;

import java.util.Arrays;

public class _Grup_4_CountingSort {
  
	public void _Grup_4_CountingSort(int dizi[]) {
		int gercekDizi[] = new int [dizi.length];
		   int geciciDizi[] = new int [dizi.length];
		   for(int i = 0; i<gercekDizi.length ; i++) {
			   gercekDizi[i]=dizi[i];
			   geciciDizi[i]=dizi[i];
		   }
	  long startTime = System.currentTimeMillis(); 
	  int size = gercekDizi.length;
	  int[] output = new int[size + 1];
	  int max = gercekDizi[0];
	  for (int i = 1; i < size; i++) {
		  if (gercekDizi[i] > max)
			  max = dizi[i];
	  }
	  int[] count = new int[max + 1];
	  for (int i = 0; i < max; ++i) {
		  count[i] = 0;
	  }
	  for (int i = 0; i < size; i++) {
      count[gercekDizi[i]]++;
	  }
	  for (int i = 1; i <= max; i++) {
		  count[i] += count[i - 1];
	  }
	  for (int i = size - 1; i >= 0; i--) {
		  output[count[gercekDizi[i]] - 1] = gercekDizi[i];
		  count[gercekDizi[i]]--;
	  }

	  for (int i = 0; i < size; i++) {
		  gercekDizi[i] = output[output.length-(2+i)];
	  }
	  System.out.print("Counting Sort " +dizi.length+ " elemanli " );
	  if (geciciDizi[0]==1 && geciciDizi[1]==2) {
		   System.out.print(" kucukten buyuge sirali ");
	   }
	   else if(geciciDizi[0]==100 || geciciDizi[0]==1000 || geciciDizi[0]==50000 || geciciDizi[0]==500000  || geciciDizi[0]==2500000) {
		   System.out.print("buyukten kucuge sirali");
	   }
	   else {
		   System.out.print("karisik sirali");
	   }
	   System.out.println();
	  if (gercekDizi.length==100 && geciciDizi[0]==1) {
		   
		    System.out.println(Arrays.toString(gercekDizi));

     } 
	 
	  long endTime = System.currentTimeMillis();
      double estimatedTime = endTime - startTime; 
      System.out.println("\nGecen sure " + estimatedTime + " milisaniyedir" );  
      
      System.out.println("Kullanilan Hafiza   :  " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024 + " Kilobayt");
                            
      }
        
  
}