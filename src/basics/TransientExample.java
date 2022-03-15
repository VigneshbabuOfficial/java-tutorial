package basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientExample implements Serializable {

	private static final long serialVersionUID = -3236229881342374903L;

	public int nonTrans = 0;

	public String nonTransStr = "nonTransStr";

	public transient int transInt = 0;

	private static void serialize() {

		TransientExample tr = new TransientExample();

		tr.nonTrans = 100;
		tr.nonTransStr = "edison";
		tr.transInt = 99;

		try {

			FileOutputStream fileOut = new FileOutputStream("D:\\testing\\transient-demo.txt");

			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(tr);
			out.close();
			fileOut.close();
			System.out.println("serialized data is stored in " + "D:\\testing\\transient-demo.txt");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void deserialize() {

		TransientExample objFromFile = null;

		try {

			FileInputStream fileIn = new FileInputStream("D:\\testing\\transient-demo.txt");

			ObjectInputStream in = new ObjectInputStream(fileIn);

			objFromFile = (TransientExample) in.readObject();

			in.close();
			fileIn.close();

			System.out.println("Deserialization completed :");
			System.out.println(" objFromFile.nonTransStr = " + objFromFile.nonTransStr);
			System.out.println(" objFromFile.nonTrans = " + objFromFile.nonTrans);
			System.out.println(" objFromFile.transInt = " + objFromFile.transInt);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public static void main(String[] args) {
		serialize();
		
		deserialize();
	}

}
