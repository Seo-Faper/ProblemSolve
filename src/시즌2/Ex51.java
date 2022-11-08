
public class Ex51 {
	public static void main(String[] args) {
		char[][] map = {{'*'}};
		printMap(map);
	}

	private static void printMap(char[][] map) {
		// TODO Auto-generated method stub
		for(int i = 0; i<map.length; i++) {
			for(int j = 0; j<map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}
