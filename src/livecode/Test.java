package livecode;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Test t = new Test();
//		Scanner reader = new Scanner(System.in);
//		System.out.println("Enter a String Please");
//		String input = reader.nextLine();
		int[] input = {1,2,7,16,10};
		//t.removeRepeat(input);
		int[] result = t.twoSum(input, 9);
		System.out.println(input[result[0]]);
		System.out.println(input[result[1]]);
		//t.isPalindrome(input);
		//reader.close();
	}
	public String reverseString(String input){
		char[] array = input.toCharArray();
		int i = 0;
		int j = array.length - 1;
		while(i < j){
			swap(array,i,j);
			i++;
			j--;
		}
		return new String(array);
	}
	private void swap(char[] array, int i, int j){
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public void isPalindrome(String input){
		int i = 0;
		int j = input.length() - 1;
		while(i < j){
			if(input.charAt(i) != input.charAt(j)){
				System.out.println("is not palindrome");
				return;
			}
			i++;
			j--;
		}
		System.out.println("is palindrome");
	}
	public void removeRepeat(int[] array){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < array.length; i++){
			if(!map.containsKey(array[i])){
				map.put(array[i], 1);
			}
			else{
				map.put(array[i], map.get(array[i]) + 1);
			}
		}
		System.out.println(map.keySet());
	}
	public int[] twoSum(int[] array, int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < array.length; i++){
			if(!map.containsKey(array[i])){
				map.put(target - array[i], i);
			}
			else{
				return new int[]{map.get(array[i]),i};
			}
		}
		return new int[]{0, 0};
	}
}






