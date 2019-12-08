import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Sloution {
	public static void main(String args[]) throws FileNotFoundException{
		try {
			FileReader fr = new FileReader("src/Sloution.java");
			int data = 0;
			//System.out.println("나자신을 출력! ");
			while((data = fr.read())!= -1){
				System.out.print((char)data);
				Thread.sleep(50);
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
	
}
