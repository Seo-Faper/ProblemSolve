package ����2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Sloution {
	public static void main(String args[]) throws FileNotFoundException{
		System.out.println("----------------[PI VS HUMAN]------------------");
		System.out.println(">1. ���ָ� ���� ");
		System.out.println(">2. n��° �ڸ����� ����");
		System.out.print(">�Է�>");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		switch(k) {
		case 1:{
			MaxOfPi();
			break;
		}
		case 2:{
			NofPi();
			break;
		}
		default:{
			System.out.println("1 or 2 ");
			System.exit(-1);
		}
		}	
	}
	public static void answer(int n) {
		try {
			FileReader fr = new FileReader("src/pi.txt");
			int data = 0;
			int count = -2;
			int line = 0;
			while((data = fr.read())!= -1){
				System.out.print((char)data);
				Thread.sleep(5);
				count++;
				line++;
				if(line>40) {
					System.out.println(); 
					line = 0;
				}
				if(n==count) break;
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void NofPi() {
		// TODO Auto-generated method stub
		
	}

	private static void MaxOfPi() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------[���ĸ�]-----------------");
		System.out.println("�ִ��� �� �� �ִµ� ���� �Է��ϰ� ���ϸ� ���� !�� ���̽ͽÿ�.");
		String x = "";
		while(!sc.next().contains("!")) {
			 x = sc.toString();
		}
		System.out.println(x);
	}
	
}
