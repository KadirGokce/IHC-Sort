package _Grup_4;

import java.util.Arrays;

public class _Grup_4_InsertionSort {
   
   public void _Grup_4_InsertionSort(int[] dizi) {
	   
	   
	   int gercekDizi[] = new int [dizi.length];
	   int geciciDizi[] = new int [dizi.length];
	   for(int i = 0; i<dizi.length ; i++) {
		   gercekDizi[i]=dizi[i];
		   geciciDizi[i]=dizi[i];
	   } 
	   int oncekiDeger, indeksDegeri, anahtar ;
	   long startTime = System.currentTimeMillis();
	   for (indeksDegeri = 1; indeksDegeri < gercekDizi.length; indeksDegeri++) {
           
           anahtar = gercekDizi[indeksDegeri];
           oncekiDeger = indeksDegeri-1;
           
           
           while(oncekiDeger >=0 && gercekDizi[oncekiDeger] < anahtar ){
        	   gercekDizi[oncekiDeger+1] = gercekDizi[oncekiDeger];
               oncekiDeger--;
           }
          
           gercekDizi[oncekiDeger+1] = anahtar;
           
       }
	   
	   long endTime = System.currentTimeMillis();
	   System.out.print("Insertion Sort  " +dizi.length+ " elemanlı " );
	   if (geciciDizi[0]==1 && geciciDizi[1]==2) {
		   System.out.print(" küçükten büyüğe sıralı ");
	   }
	   else if(geciciDizi[0]==100 || geciciDizi[0]==1000 || geciciDizi[0]==50000 || geciciDizi[0]==500000  || geciciDizi[0]==2500000) {
		   System.out.print("büyükten küçüğe sıralı");
	   }
	   else {
		   System.out.print("karışık sıralı");
	   }
	   System.out.println();
	   
      if (gercekDizi.length==100 && geciciDizi[0]==1) {
		   
		    System.out.println(Arrays.toString(gercekDizi));
  
       } 
       double estimatedTime = endTime - startTime; 
       System.out.println("\nGeçen süre " + estimatedTime + " milisaniyedir" );
       
       System.out.println("Kullanilan Hafiza   :  " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024 + " Kilobayt");
   }
   
}
