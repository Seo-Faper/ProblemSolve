package ½ÃÁð2;

public class Ex03 {
	static byte[][] map = null;
	static int answer = 0;
	public static void main(String[] args) {
		String dir = "LULLLLLLU";
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
		System.out.println(answer);
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	private static void move(int x, int y) {
		// TODO Auto-generated method stub
		if(x<0) x = 0;
		if(y<0) y = 0;
		
	}
}
