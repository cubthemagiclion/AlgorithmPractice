import java.util.*;

public class HourGlass {

	public HourGlass() {
		// TODO Auto-generated constructor stub
	}
    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
        int max = -63;
        int lastSum = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                int cur = returnSum(arr, i, j, lastSum);
                max = max >  cur ? max : cur;
                lastSum = cur;
            }
        }
        return max;
    }
    
    public static int returnSum(List<List<Integer>> arr, int i, int j, int lastSum) {
            lastSum = 0;
            lastSum += arr.get(i - 1).get(j - 1);
            lastSum += arr.get(i - 1).get(j);             
            lastSum += arr.get(i - 1).get(j + 1);
            lastSum += arr.get(i).get(j);
            lastSum += arr.get(i + 1).get(j - 1);
            lastSum += arr.get(i + 1).get(j);
            lastSum += arr.get(i + 1).get(j + 1);          
        
        return lastSum;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] first = new Integer[] { 1,1,1,0,0,0};
		List<Integer> f = Arrays.asList(first);
		Integer[] second = new Integer[] {0,1, 0, 0, 0, 0};
		List<Integer> s = Arrays.asList(second);
		Integer[] third = new Integer[] {1, 1, 1, 0, 0, 0};
		List<Integer> t = Arrays.asList(third);
		Integer[] forth = new Integer[] {		0, 0, 2, 4, 4, 0};
		List<Integer> fo = Arrays.asList(forth);
		Integer[] fifth = new Integer[] {		0, 0, 0, 2, 0, 0};
		List<Integer> fi = Arrays.asList(fifth);
		Integer[] sixth = new Integer[] {		0 ,0 ,1 ,2 ,4 ,0};
		List<Integer> sixx = Arrays.asList(sixth);
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		arr.add(f);
		arr.add(s);
		arr.add(t);
		arr.add(fo);
		arr.add(fi);
		arr.add(sixx);
		HourGlass hehe = new HourGlass();
		System.out.print(hehe.hourglassSum(arr));

	}

}
