package chainChallenge;

import java.util.HashMap;

public class Chain {
	public static void main(String[] args){
	String[] input1 = {"4-2","BEGIN-3","3-4","2-END"};
	String[] input2 = {"4-2","BEGIN-3","11-77","2-END"};
	String[] input3 = {"4-2","BEGIN-3","3-9","2-END"};
	Chain t = new Chain();
	t.checkChain(input1);
	t.checkChain(input2);
	t.checkChain(input3);
	}
	public String checkChain(String[] input){
		HashMap<String, String> map = new HashMap();
		for(String chainObj : input){
			String[] pair = chainObj.split("-");
			map.put(pair[0], pair[1]);
		}
		Integer counter = 0;
		String current = "BEGIN";
		while(current != null && !current.equals("END")){
			current = map.get(current);
			++counter;
			
			if (counter > map.size())
			{
				break;
			}
		}
		if(counter ==  map.size()){
			return "GOOD";
		}
		else{
			return "BAD";
		}
	}
	}
