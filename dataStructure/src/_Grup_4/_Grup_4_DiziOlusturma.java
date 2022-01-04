package _Grup_4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class _Grup_4_DiziOlusturma {
	
	public _Grup_4_DiziOlusturma(int elemanSayisi) {
	int KucuktenBuyuge[] = new int [elemanSayisi];
	int BuyuktenKucuge[] = new int [elemanSayisi];
	int Dizi[] = new int [elemanSayisi];
	for(int i=0 ; i<KucuktenBuyuge.length ; i++) {
		KucuktenBuyuge[i]=i+1;
	}
	
	
	for(int i=0 ; i<BuyuktenKucuge.length ; i++) {
		BuyuktenKucuge[i]=BuyuktenKucuge.length-i;
	} 
	for (int i = 0; i < BuyuktenKucuge.length; i++) {
		Dizi[i]=BuyuktenKucuge[i];
	}
	
	diziKaristirma(Dizi);
	
	
	_Grup_4_InsertionSort insertionSort = new _Grup_4_InsertionSort();
	
	insertionSort._Grup_4_InsertionSort(KucuktenBuyuge);
	System.out.println();
	
	insertionSort._Grup_4_InsertionSort(BuyuktenKucuge);
	System.out.println();
	
	insertionSort._Grup_4_InsertionSort(Dizi);
	System.out.println();
	
	
	
	_Grup_4_CountingSort countingSort = new _Grup_4_CountingSort();
	System.out.println();
	countingSort._Grup_4_CountingSort(KucuktenBuyuge);
	System.out.println();
	
	countingSort._Grup_4_CountingSort(BuyuktenKucuge);
	System.out.println();
	
	countingSort._Grup_4_CountingSort(Dizi);
	System.out.println();
	
	
	_Grup_4_HeapSort heapSort = new _Grup_4_HeapSort(KucuktenBuyuge);
	System.out.println();
	
	heapSort = new _Grup_4_HeapSort(BuyuktenKucuge);
	System.out.println();
	
	heapSort = new _Grup_4_HeapSort(Dizi);
	System.out.println();
	
	
	
	
}
	
	static void diziKaristirma(int[] arr)
	  {
	    Random rnd = ThreadLocalRandom.current();
	    for (int i = arr.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      int a = arr[index];
	      arr[index] = arr[i];
	      arr[i] = a;
	    }
	  }
}