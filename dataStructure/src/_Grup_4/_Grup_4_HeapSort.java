package _Grup_4;

import java.util.Arrays;

public class _Grup_4_HeapSort {
	
	public _Grup_4_HeapSort(int dizi[]) {
		
		int gercekDizi[] = new int [dizi.length];
		   int geciciDizi[] = new int [dizi.length];
		   for(int i = 0; i<gercekDizi.length ; i++) {
			   gercekDizi[i]=dizi[i];
			   geciciDizi[i]=dizi[i];
		   }
		long startTime = System.currentTimeMillis(); 
		HeapSort(gercekDizi);
		long endTime = System.currentTimeMillis();
		System.out.print("Heap Sort " +dizi.length+ " elemanlı " );
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
	public void HeapSort(int dizi[]) {
        int n = dizi.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(dizi, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = dizi[0];
            dizi[0] = dizi[i];
            dizi[i] = temp;
            heapify(dizi, i, 0);
        }
    }
    void heapify(int dizi[], int n, int i)
    {
        int largest = i;
        int sol = 2 * i + 1;
        int sag = 2 * i + 2;

        if (sol < n && dizi[sol] < dizi[largest])
            largest = sol;

        if (sag < n && dizi[sag] < dizi[largest])
            largest = sag;
        
        if (largest != i) {
            int swap = dizi[i];
            dizi[i] = dizi[largest];
            dizi[largest] = swap;
            heapify(dizi, n, largest);
        }
    }
        
	}
