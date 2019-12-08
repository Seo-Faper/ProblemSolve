package ½ÃÁð2;

import java.util.ArrayList;

public class Ex04 {
	class Player{
		private ArrayList<String> said;
		public void SetSaid(String word) {
			said.add(word);
		}
		public String GetSaid(int index) {
			return said.get(index);
		}
	}
	public static void main(String[] args) {
		Ex04 x = new Ex04();
		String[] w = {"tank","kick","know","wheel","land","dream",
				"mother","robot","tank"};
		x.solution(3, w);
	}
	public int[] solution(int n,String[] words) {
		int[] answer = {};
		Player[] p = new Player[n];
		int c = 0;
		for(int i = 0; i<words.length; i++) {
			if(c>n) c = 0;
			
			System.out.println(c);
			p[c].SetSaid(words[i]);
			c++;
		}
		c = 0;
		int l = 0;
		String last = "";
		String curr = "";
		String log = "";
		for(int i = 0; i<words.length;i++) {
			if(c>n) {
				l++;
				c = 0;
			}
			curr = p[c].GetSaid(l);
			if(isRule(last,curr) || log.contains(curr)) {
				System.out.println(c+","+l);
			}
			last = curr;
			c++;
			log = log+"_"+last;
		}
		return answer;
	}
	public boolean isRule(String last,String curr) {
		if(last.substring(last.length()-1,last.length()).equals(curr.substring(1))){
			return false;
		}
		return true;
	}
	
}
