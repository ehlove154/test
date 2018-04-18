import java.util.Arrays;
public class Ex03 {
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[] {}));
	}
	public static int max(int[] arr){
		if(arr.length==0 || arr==null){
			return -999999;
			
		}
//		if(arr==null){
//			return -999999;
//			
//		}
		Arrays.sort(arr);
		return arr[arr.length-1];
	}


}
