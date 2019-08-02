
public class Checkpoint {
	public static void main(String[] args) {
              Checkpoint checkpoint=new Checkpoint();
              Double[] array= {23.8,50.7,999.4,1.3, 9.6};
              int[] arr= {3,7,4,90,43,50};
              int x=7;
              String[] ar= {"g", "u", "w", "a", "d", "g"};
              
              
              checkpoint.sortNumber(array);
              boolean v=checkpoint.integer(arr, x);
              checkpoint.order(ar);
              for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
              for (int i = 0; i < arr.length; i++) {
				System.out.println(v);
			}
              for (int i = 0; i < ar.length; i++) {
  				System.out.println(ar[i]);
  			}
              
              
	}

	void sortNumber(Double[] array) {
       for (int i = 0; i < array.length-1; i++) {
		for (int j = i+1; j < array.length; j++) {
			if(array[i]>array[j]) {
				int k=i;
				i=j;
				j=k;
				
			}
		}
	}
	}
	boolean integer(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==x) {
				return true;
			}
		}
		return false;
	}
	void order(String[] ar) {
		for (int i = 0; i < ar.length-1; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i].compareTo(ar[j])>0) {
				String l=ar[i];
				ar[i]=ar[j];
				ar[j]=l;
			}
			}
			
		}
		
	}
	
}
