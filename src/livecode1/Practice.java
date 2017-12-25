package livecode1;

import java.util.HashSet;
import java.util.Scanner;

public class Practice {
	public String StringPermutation(String input){
		return printPermutation("",input);
	}
	public String printPermutation(String prefix, String input){
		if(input.length() == 0){
			return prefix;
		}
		else{
			for(int i = 0; i < input.length(); i++){
				printPermutation(prefix + input.charAt(i),input.substring(0, i) + input.substring(i+1,input.length()));
			}
		}
		return prefix;
	}
	public static void main(String args[]){
		Practice p = new Practice();
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		//p.findYuan(input);
		p.StringPermutation(input);
		
	}
	public void findYuan(String input){
		HashSet<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0; i < input.length(); i++){
			if(set.contains(input.charAt(i))){
				sb1.append(input.charAt(i));
			}
			else{
				sb2.append(input.charAt(i));
			}
		}
		System.out.println(sb1);
		System.out.println(sb2);
	}
}
