import java.util.Scanner;

public class Ex65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Human[] arr = new Human[n];
		for(int i = 0; i<n; i++) arr[i] = new Human(i);
		
		for(int i = 0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[i].setH(x);
			arr[i].setW(y);
			arr[i].setRate(0);
		}
		for(int i = 0; i<n; i++) {
			int rate = 0;
			for(int j = 0; j<n; j++) {
				if(!arr[i].equals(arr[j])) {
				//	System.out.println(arr[i].toString());
					switch(comapreSize(arr[i], arr[j])) {
						case -1:

							break;
						case 0:
							break;
						case 1:
							rate++;
							break;
					}

				}
				
			}
			arr[i].setRate(rate);
		}
		for(int i = 0; i<n; i++)
		System.out.print(arr[i].toString()+" ");
		
	}
	public static int comapreSize(Human p1, Human p2) {
		if(p1.getW()>p2.getW()&& p1.getH()>p2.getH()) {
			return -1; // A>B
		}else if(p1.getW()<p2.getW()&& p1.getH()<p2.getH()) {
			return 1; // A<B
		}else {
			return 0; // A ? B (알 수 없을 때)
		}
	}
static class Human{
		private int H = 0;
		private int W = 0;
		private int rate = 0;
		
		public int getRate() {
			return rate;
		}

		public void setRate(int rate) {
			this.rate = rate;
		}
		int num = 0;
		public Human(int n) {
			num = n;
		}
		
		public int getH() {
			return H;
		}
		public void setH(int h) {
			H = h;
		}
		public int getW() {
			return W;
		}
		public void setW(int w) {
			W = w;
		}

		@Override
		public String toString() {
			return String.valueOf(rate+1);
		}

		
	}
}
