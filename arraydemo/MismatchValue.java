	   	
package arraydemo;

public class MismatchValue {

    public static void main(String[] args) {
    	/*int[] a = {10, 20, 30};
        int[] b = {10, 20, 40};

        int result = Arrays.compare(a, b);

        System.out.println(result);

        int[] no1 = {10, 20, 30, 40};
        int[] no2 = {10, 20, 35, 40};

        System.out.println(Arrays.mismatch(no1, no2));*/
    	
        int[] no1 = {10, 20, 30, 40};
        int[] no2 = {10, 20, 35, 40};

        int mismatch = -1;
        int length = Math.min(no1.length, no2.length);

        for (int i = 0; i < length; i++) {
            if (no1[i] != no2[i]) {
                mismatch = i;
                break;
            }
        }

        if (mismatch == -1 && no1.length != no2.length) {
            mismatch = length;
        }

        System.out.println("Mismatch index: " + mismatch);
        
        
        //Array Compare
        
        
       int[] a = {10, 20, 30};
        int[] b = {10, 20, 40};

        int result = 0;
        int len = Math.min(a.length, b.length);

        for (int i = 0; i < len; i++) {
            if (a[i] < b[i]) {
                result = -1;
                break;
            } else if (a[i] > b[i]) {
                result = 1;
                break;
            }
        }

        if (result == 0) {
            result = Integer.compare(a.length, b.length);
        }

        System.out.println(result);
    }
}
