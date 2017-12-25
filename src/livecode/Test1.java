package livecode;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
	public void permutations(String input){
		helper("", input);
	}
	private void helper(String pre, String input){
		if(input.length() == 0){
			System.out.println(pre);
		}
		else{
			for(int i = 0; i < input.length(); i++){
				boolean flag = false;
				for(int j = 0; j < i; j++){
					if(input.charAt(j) == input.charAt(i))
						flag = true;
				}
				if(flag)
					continue;
				helper(pre + input.charAt(i),input.substring(0, i) + input.substring(i+1, input.length()));
			}
		}
	}
	public String sortString(String input){
		char[] array = input.toCharArray();
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length; j++){
				if(array[i] < array[j]){
				swap(array, i, j);
			}	
		}
		}
		return new String(array);
	}
	private void swap(char[] array, int a, int b){
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	public static void main(String[] args){
		Test1 t = new Test1();
		String input = "aecbd";
		//t.permutations(input);
		//t.checkAna(input, target);
		System.out.println(t.sortString(input));
	}
	public void checkAna(String input, String target){
		char[] arrayInput = input.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < input.length(); i++){
			if(arrayInput[i] == ' '){
				continue;
			}
			if(!map.containsKey(arrayInput[i])){
				map.put(arrayInput[i], 1);
			}
			else{
				map.put(arrayInput[i], map.get(arrayInput[i]) + 1);
				
			}
		}
		for(int i = 0; i < target.length(); i++){
			if(target.charAt(i) == ' '){
				continue;
			}
			if(!map.containsKey(target.charAt(i))){
				System.out.println("NOT Anagram");
				return;
			}
			else{
				map.put(target.charAt(i), map.get(target.charAt(i)) - 1);
			}
		}
		for(Character key: map.keySet()){
			if(map.get(key) != 0){
				System.out.println("NOT Anagram");
				return;
			}
		}
		System.out.println("IS Anagram");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
