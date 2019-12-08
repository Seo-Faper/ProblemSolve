package ½ÃÁð2;

public class Ex06 {
	static String log = "";
	static int count = 0;
	public static void main(String[] args) {
		String dir ="LULLLLLLU";
		int x = 5, y = 5;
		boolean flag = true;
		while(flag) {
			move(x,y);
			char command = dir.charAt(0);
			dir = dir.substring(1);
			switch(command) {
			case 'U':
				x--;
				break;
			case 'D':
				x++;
				break;
			case 'L':
				y--;
				break;
			case 'R':
				y++;
				break;
			}
			if(dir.length()==0) {
				flag = false;
			}
		}
		System.out.println(count);
	}

	private static void move(int x, int y) {
		if(x<0) {
			x=0;
		}
		if(y<0) {
			y=0;
		}
		// TODO Auto-generated method stub
		String i ="["+x+","+y+"]"; 
		if(!log.contains(i)) {
			count++;
		//	System.out.println(log);
		}
		log = i+log;
	}
}
