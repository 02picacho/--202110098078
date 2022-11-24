package work;

import java.util.ArrayList;
import java.util.Scanner;

public interface ISignUp {
	 public void print();
	 public boolean addStudent (int stuType);
	 public static IParams parse() throws Exception{
		 Scanner reader = new Scanner(System.in);
		 System.out.print("������");
		 SchoolSystem.big=reader.nextInt();
		 System.out.print("�а����");
		 SchoolSystem.middle=reader.nextInt();
		 System.out.print("С�����");
		 SchoolSystem.small=reader.nextInt();
		 IParams ip = new IParams() {
			public int getBig() {
				return SchoolSystem.big;
			}

			@Override
			public int getMedium() {
				return SchoolSystem.middle;
			}

			@Override
			public int getSmall() {
				return SchoolSystem.small;
			}

			@Override
			public ArrayList<Integer> getPlanSignUp() {
				ArrayList<Integer> input = new ArrayList<Integer>();
				System.out.print("����༶��");
				Integer a = reader.nextInt();
				input.add(a);
				System.out.print("����༶��");
				Integer b = reader.nextInt();
				input.add(b);
				System.out.print("����༶��");
				Integer c = reader.nextInt();
				input.add(c);
				System.out.print("����༶��");
				Integer d = reader.nextInt();
				input.add(d);
				return input;
			}
			 
		 };
		return ip;
		 
	 };


}
