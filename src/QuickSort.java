import java.util.Scanner;

public class QuickSort {
    static int i=0;
    static int size;
    public static int partition(int[] a, int begin, int end) {
        int pivot, temp, L, R;
        i++; //연산 횟수
        L = begin;
        R = end;
        pivot = (int)((begin+end)/2);
  //      System.out.println(i+"단계: pivot="+a[pivot]);
         //1. while(L<R)인경우
        while(L<R) {
            while((a[L]<=a[pivot]) && (L<=R)) L++;
            while((a[R]>a[pivot]) && (L<=R)) R--;
            if(L<=R) { 
                temp = a[L];
                a[L] = a[R];
                a[R] = temp;
                if(R == pivot) { // L과 R 원소를 교환하여 결과적으로 pivot 원소의 위치가 변경된 경우
                    for(int t=0;t<size;t++) {
                 //       System.out.print(a[t]+" ");
                    }
              //      System.out.println();
                    return L; // L은 확정된 pivot의 위치
                }
            }
        }
        //2. while(L>R)인 경우
        temp = a[pivot];
        a[pivot] = a[R];
        a[R] = temp;
        for(int t=0;t<size;t++) {
    //        System.out.print(a[t]+" ");
        }
  //      System.out.println();
        return R;//R은 확
    }
    
    public static void quickSort(int[] a, int begin, int end) {
        if(begin<end) {
            int p = partition(a, begin, end); 
            quickSort(a, begin, p-1);// pivot의 왼쪽 부분집합에 대해 퀵 정렬 재귀호출
            quickSort(a, p+1, end);//pivot의 오른쪽 부분집합에 대해 퀵 정렬 재귀호출
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] list = new int[n];
    	for(int i = 0; i<n; i++) {
    		list[i] = sc.nextInt();
    	}
    	sc.close();
        size = list.length;
        quickSort(list, 0, size-1);
        for(int i = list.length-1; i>=0; i--) {
        	System.out.println(list[i]);
        }
    }
 
}