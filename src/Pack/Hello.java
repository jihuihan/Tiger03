package Pack;

import java.io.*;//���� �����̶� ���� ���ϵ� ī��
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;



//�����
//ex)
/*
public class Hello {
	public static void main(String[] args) {	
		
	}
}
*/
//������ ����Ǭ��?�˰����� �����ϴ� �� ���ݱ��� ���ŷ� ������ �� Ǯ����.
//����� ���� �����̴�.
//�ڹٰ��� 
//1.3���� ģ������ ������ �ټ� �ִ°�? ������ ������ �� ��
//2.�ڹ� �ʱ�å->�߱�å
//���� :������ �� ����� �� �ִٴ� �����Ʒ�����
//������ �����Ѵ�.>>�ذ� :�˰���
//���ع��� Ǫ�� ���� �ݴ��̴�. �⺻������ �˰��� �ذ�ɷ��� �ȵǴµ� Ǫ�� ���� ������ �����̴�.
//�켱�� �ڷᱸ��å�̳� �˰���å�� ���� ������ �ϰ� ���ع����� ���� ���� ��õ�Ѵ�.
//�ڷᱸ��,�˰��� �����Ͱ� �Ǿ��ִٴ� �����Ͽ� Ǫ�� �� �����̴�.
//�Ｚ�̳� ���� ����ǿ� ���ߺμ��� �� �� �Ǳ������ ġ�µ�....�׶� ���� ��Ÿ�� ������ ���´�.



//EX104)
//1.GIT����
//2.�α���
//3.�������丮��(����) ����
//4.���� ����� �ּ� https://github.com/jihuihan/Tiger01

//ex105)
public class Hello {
	public static void main(String[] args) {	
		System.out.println(1);
	}
}





/*
class Lion extends Thread{
	static int num=0;
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		System.out.println(num+"Thread �� �����");
	}
}
class Tiger extends Thread{
	public void run() {
		System.out.println("tiger run");
		for (int i = 0; i < 4; i++) {
			System.out.println("���Ӵ��");
			//Ŭ���̾�Ʈ�� 1�ʵڿ� ������ ���̶�� ����
			try {Thread.sleep(1000);} catch (Exception e) {}
			System.out.println(i+"�� ������ ���ӵ�=======================");
			
			Thread t= new Lion();
			t.start();
			Lion.num++;
			
			}
		
		
		System.out.println("tiger thread Exit");
		
	}
}
public class Hello {
	public static void main(String[] args) {	
		System.out.println("start");
		
		Thread t = new Tiger();
		t.start();
		
		new Scanner( System.in ).nextInt();
		System.out.println("end");
	}
}

*/
//ex102)
/*
 * class Tiger extends Thread{
	public void run() {
		Thread t2 = new Lion();
		t2.start(); // ȣ���̰� ���̾��� �ߵ���Ų��.
		System.out.println("ȣ���̰� �ߵ��Ǹ� �ݵ�� ��� �´�.");
		int num = new Scanner( System.in ).nextInt();
		System.out.println("ȣ���� ����");
	}
}
class Lion extends Thread{
	public void run() {
		System.out.println("���ڰ� �ߵ��Ǹ� �ݵ�� ��� �´�.");
		int num = new Scanner( System.in ).nextInt();
		System.out.println("���� ����");
	}
}
public class Hello {
	public static void main(String[] args) {
		System.out.println("start");
		Thread t1 = new Tiger();
		t1.start();
		int num = new Scanner( System.in ).nextInt();
		
		System.out.println("end");
	}
}
*/









/*
public class Hello {
	public static void main(String[] args) {	
		//���1
		//System.out.println("���ڸ� �Է��ϼ���");
		
		//for (int i = 0; i < 3; i++) {
			//int num = (new Scanner( System.in)).nextInt();
			//System.out.println("�Էµ� ����"+num);
		//}
		//System.out.println("���α׷��� �����");
		
		//���2
//		Scanner scanner =new Scanner(System.in);
//		for (int i = 0; i < 3; i++) {
//			int num = (new Scanner( System.in)).nextInt();
//			System.out.println("�Էµ� ����"+num);
//		}
//		System.out.println("���α׷��� �����");
		
		//���3
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���");
			int num=new Scanner(System.in).nextInt();
			if(num==999) {
				System.out.println("Ż��Ǳ� �Ϻ�����");
				break;
			}
			System.out.println(num*100);
		}
	}
}

*/

//ex100)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("���ڸ� �Է��ϼ���");
		//Ű����κ��� ���ڸ� �Է¹޴� �ڵ�
		//���1
		//int num = (new Scanner( System.in)).nextInt();
		
		//���2
		Scanner scanner =new Scanner(System.in);
		System.out.println(100);
		//���ŷ �Լ�(sleep) �� �̻� �������� ����<->�ͺ��ŷ
		int num=scanner.nextInt();
		System.out.println(200);

		System.out.println("ȣ����1"+num);
		int num = (new Scanner( System.in)).nextInt();

	}
}
*/

/*
//ex99)
//���� ���� �����̵Ǿ ���� ���α׷��� ������ ��ġ�� �ʴ� ���α׷��� �ۼ��� �� �����带 ����Ѵ�.
class Tiger extends Thread{
	//�����带 ����Ϸ��� �ϸ�ThreadŬ������
	//�޼ҵ� �Ѱ��� �ݵ�� �������̵��ؾ� �Ѵ�.�θ�� �ڽ� �����̸����� ���� ��
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ȣ����"+i);
			try {Thread.sleep(0);} catch (Exception e) {}//0��û���� ª�� �ð� ���� �����
		}
		
	}
}
public class Hello {
	public static void main(String[] args) {	
		System.out.println("���� ����");
		Thread t = new Tiger();//��ĳ����
		t.start();//������ �ߵ�! ���� ����� ���� �ְ� �� �Ʒ��� ����� ���� �ִ�.
		for (int i = 0; i < 10; i++) {
			System.out.println("�ڳ���"+i);
			try {Thread.sleep(0);} catch (Exception e) {}//0��û���� ª�� �ð� ���� �����
		}
		System.out.println("���� ��");
	}
}

*/
/*
//ex98)
class Tiger extends Thread{
	//�����带 ����Ϸ��� �ϸ�ThreadŬ������
	//�޼ҵ� �Ѱ��� �ݵ�� �������̵��ؾ� �Ѵ�.�θ�� �ڽ� �����̸����� ���� ��
	public void run() {
		System.out.println("������ ����");
		System.out.println("B run call");
		System.out.println("������ ��");
		
	}
}
public class Hello {
	public static void main(String[] args) {	
		System.out.println("���� ����");
		//��ĳ�������� ��ü�� �����Ǿ���.
		Thread t = new Tiger();
		//�����带 �ߵ���Ų��.
		//�ݵ�� run()�޽�带 ȣ���ϰ� �Ǿ���.
		t.start();
		//main�� run�� ���α׷��� ���� ����ȴ�.
		
		//1�ʰ� �������� ���� �ݵ��try catch�����ؾ���
		try {Thread.sleep(1000);} catch (Exception e) {}//������ ���ÿ� �����Ϸ��� ��.1�ʰ� ���������ϱ� run()(=������)�� �����
		System.out.println("���� ��");
}
}
*/
/*
class A{
	void start() {
		System.out.println("start call");
		run();
	}
	void run() {
		System.out.println("A run call");
	}
}
class B extends A{
	void run() {
		System.out.println("������ ����");
		System.out.println("B run call");
		System.out.println("������ ��");
		System.out.println(1);
	}
}
public class Hello {
	public static void main(String[] args) {	
		System.out.println(1);
		A a= new B();
		a.start();
	}
}
*/
/*
//ex96)
//test.txt��� ������ ������ �� �� ���α׷��� ����ȴ�.
public class Hello {
	public static void main(String[] args) {
		
		//���� �Է�
		System.out.println(3);
		 try {
			Reader r = new FileReader("test.txt");
			
			while( true ) {
				int readData = r.read();//���� �Ѱ��� �о����.apple�� a
				char Data=(char)readData;//��  ����(���� int�̹Ƿ�) �ڵ尪�� ���ڷ� ��ȯ�����ּ���
				System.out.println(readData+":"+Data);
				if(readData == -1) {//���� ���ڰ� ������ -1�� �����Ѵ�.
					System.out.println("��� �����͸� �о���");
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(4);
	}
}

*/

/*
public class Hello {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			Writer w = new FileWriter("test.txt");
			w.write("apple");
			w.write("\n");
			w.write("����ȭ");
			w.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(2);
		
		//���� �Է�
		System.out.println(3);
		 try {
			Reader r = new FileReader("test.txt");
			
			while( true ) {
				int readData = r.read();//���� �Ѱ��� �о����.apple�� a
				char Data=(char)readData;//��  ����(���� int�̹Ƿ�) �ڵ尪�� ���ڷ� ��ȯ�����ּ���
				System.out.println(readData+":"+Data);
				if(readData == -1) {//���� ���ڰ� ������ -1�� �����Ѵ�.
					System.out.println("��� �����͸� �о���");
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(4);
	}
}


*/















//ex95)
/*public class Hello {
	public static void main(String[] args) {
		//���� �����:�������� ������ ����� �� Ȥ�� ������� ������ �о���̴� ��
		//��.......�׷��� ���� ������ ����±�?
		//�׷��ٸ� �ڹٿ��� � ǥ�� Ŭ������ ������ �������ٱ�???
		System.out.println(1);
		try {
			//�������� �Ѳ��� ����.
			Writer w = new FileWriter("sample.txt");//sample text������ ������
			
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 8; j++) {
					if((i+j)%2==0) {
						w.write("O ");
					}else {
						w.write("X ");
					}
				}
				
				w.write("\n");
			}
			
			
			//�������� �Ѳ��� �ݴ´�.
			w.close();
			
		
		} catch (Exception e) {
			
		}
		System.out.println(2);

	}
}
*/
//ex94)
/*
public class Hello {
	public static void main(String[] args) {
		//���� �����:�������� ������ ����� �� Ȥ�� ������� ������ �о���̴� ��
		//��.......�׷��� ���� ������ ����±�?
		//�׷��ٸ� �ڹٿ��� � ǥ�� Ŭ������ ������ �������ٱ�???
		System.out.println(1);
		try {
			//�������� �Ѳ��� ����.
			Writer w = new FileWriter("test.txt");
			
			//���Ͽ� ���ڿ��� ���
			w.write("apple");
			w.write("\n");//�ٹٲ�
			w.write("����ȭ �糪�� ��ñ�");
			w.write("\n");//�ٹٲ�
			w.write("���� ��� ��");
			
			//�������� �Ѳ��� �ݴ´�.
			w.close();
			
		
		} catch (Exception e) {
			
		}
		System.out.println(2);

	}
}
*/
/*
//ex93)
public class Hello {
	public static void main(String[] args) {	
		//ex1)
		class Tiger{
			int data;
			int getData() {
				return data;
			}
			void setData(int data) {
				this.data=data;
			}
		}
		Tiger tiger =new Tiger();
		tiger.setData(100);
		System.out.println(tiger.getData());
		
		class Lion{
			String data;
			
			String getData() {
				return data;
			}
			void setData(String data) {
				this.data=data;
			}
		}
		Lion lion=new Lion();
		lion.setData("����");
		System.out.println(lion.getData());
		//ex2)���׸� ����
		class Dog<T>{
		T data;
		
		T getData() {
			return data;
		}
		void setData(T data) {
			this.data=data;
		}
	}
		Dog<Integer> dog=new Dog<Integer>();//Dog<Integer>//t�� ���������� ��Ƽ���� �� �ٲ�
		dog.setData(200);
		System.out.println(dog.getData());
		
		Dog<String>dog1=new Dog<String>();
		dog1.setData("������");
		System.out.println(dog.getData());
		
		Dog<Float>dog2=new Dog<Float>();
		dog2.setData(3.14f);
		System.out.println(dog2.getData());
		
		Dog<Boolean>dog3=new Dog<Boolean>();
		dog3.setData(false);
		System.out.println(dog3.getData());
		//���׸��������� ǥ��Ŭ������ ����� ����ߴ�.
		//LinkedList<Integer> mt = new LinkedList<Integer>(); 
}

}
*/
/*
//ex92)
public class Hello {
	public static void main(String[] args) {	
		//LinkedList<Integer> master =new LinkedList<Integer>;//LinkedList<Integer> Ŭ���� �̸����κ���
		LinkedList<Integer> mt=new LinkedList<Integer>();
		System.out.println(mt.size());//�����;� �ȿ� �������� ��� �ֳ���?
		//insert,add
		mt.add(99);//88��� ������ �ϳ� ����
		System.out.println(mt.size());//�����;� ������ � �ֳ���?
		mt.add(88);//88��� ������ �ϳ� ����
		System.out.println(mt.size());//�����;� ������ � �ֳ���?
		//0 11 22 33
		for (int i = 0; i < 10; i++) {
			mt.add(i*10+i);
		}
		System.out.println(mt.size());
		
		//(R)ead
		//Read�� ��� 1(�� ������� ����)
		System.out.println(mt);//���ָӴϰ� ������ �ִ� �������� �� ������
		//Read�� ��� 2
		System.out.println(mt.get(6));
		System.out.println("----------------------");
		//for (int i = 0; i < 12; i++) {
		for (int i = 0; i < mt.size(); i++){//���ָӴϰ� �������ִ� ������
		//int num=mt.get(i);//��� ° �ּ���
		//System.out.println(num);
			System.out.print(mt.get(i)+" ");
		}System.out.println();
		//Read�� ���3
		//������ for�� forEach��
		for(Integer nn : mt) {//������ �� �� integer ������ ���ָӴϰ� �������ִ� �����ŭ���� ���鼭 ������ �� ���� nn�� �ϳ��� �����Ѵ�.
			System.out.println(nn+" ");
	}System.out.println();
	
		//���ڱ� ::�迭�� �Ұ��մϴ�.
		//�迭�� forEach���� ����.
		int[]ar=new int [] {2,3,4,5,6}; //�����͸� �ʱ�ȭ�Ͽ� �迭 ����
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]+" ");
		}System.out.println();
		System.out.println("======================================");
		for(int data:ar) {
			System.out.println(data+" ");
		}System.out.println();
		
		//������� ������ �߳� Create ,Read
		//Update
		mt.set(5, 123456);//5��° �ִ� �����͸� 123456���� �ٲ��ּ���
		for(Integer nn:mt) {
			System.out.println(nn+" ");
		}System.err.println();
		
		//Delete>> Remove, erase
		mt.remove(2);
		for (Integer nn : mt) {
			System.out.println(nn+" ");
		}System.out.println();
		
		//55�� ã�Ƽ� �����ϼ���
		for (int i = 0; i < mt.size(); i++) {
			int num = mt.get(i);
			if(num==55) {
				System.out.println(num+"ã�Ҵ�");
				mt.remove(i);
				break;
			}
		}
		
		//CRUD�� �̿��� ����Ÿ ���� ���α׷��� �ϸ� �ݷ����� ���Ѱ��ΰ�? �ڹ�å�� �� �� �������� �Ǿ���.
}
}
*/
/*
public class Hello {
	public static void main(String[] args) {	
	//String:ǥ�� Ŭ�����ε�..
	//String�� �޼ҵ带 ����غ���....��¥ ������
		//			0 123 456789
		String sss="����ȭ�����Ǿ����ϴ�.";
		//char charAt(int index) �μ������� �Ѱ� ���ּ���. ��Ÿ������ ���ϵ˴ϴ�. �� charAt �޼ҵ��� ���ϰ��� char
		
		//ex1)
		System.out.println(sss.charAt(3));//���� ������ �ȰŴϱ� ��µȰ�
		char ch=sss.charAt(3);
		System.out.println(ch);

		class MyString{
			char charAt(int index) {//���ڰ� ���ϵȴ�
				//index�� �̿��ؼ� ��ġ�� ���ڸ� ã�� �ڵ常 �ۼ����� �ʾҴ�.
				return '��';
			}
		}
		MyString ms=new MyString();
		System.out.println(ms.charAt(3));
		char ch1=ms.charAt(3);
		System.out.println(ch1);
		
		//ex2)
		System.out.println(sss.indexOf("ȭ��"));//ȭ���� ã�� �� �ε��� ��ȯ
		
		int num=sss.indexOf("ȭ��");
		if(num== -1) {
			System.out.println("��ã��");
			
		}else {
			System.out.println(num+"��° ����");
		}
		System.out.println("__________________________");
		//ex3)int length()//������ int�� �� ���޵Ǵ� �μ��� ����.
		//1.�������.
		sss.length();
		//2.������ �޴´�.
		int size =sss.length();
		System.out.println(size);
		//3.������� �ٷ� ����
		System.out.println(sss.length());
		
		//ex4)
		System.out.println(sss.replace("����", "������"));
		//�����ϼ��� (sss��ü�� ���� �ȹٲ��....)
		System.out.println(sss);
		//
		//String replace() ��Ʈ���� ���ϵȴٴ� �� �ٲ� �����ttt�� ����Ǿ� ������ �� ���̴�.
		 String ttt = sss.replace("����", "������");
		 System.out.println(ttt);
		
		 //ex5)substring
		 //"����ȭ�����Ǿ����ϴ�."
		 System.out.println(sss.substring(2));
		 System.out.println(sss.substring(2,7));
				
		 //ex6)
		 String str="ApplE";
		 System.out.println(str.toUpperCase());//upper �빮�ڷ� �ٲ��
		 System.out.println(str.toLowerCase());
	}
}
*/
/*
//ex90)
public class Hello {
	public static void main(String[] args) {
		// ���� >> ���ڿ��� �ٲټ���.
		int n1 = 1234;
		System.out.println(n1 + 1000);
		String s = Integer.toString(n1);
		System.out.println(s + 1000);
		
		// ���ڿ��εȼ��ڰ� �ִµ� >> ��¥ ���ڷ� �ٲټ���.
		String s2 = "5678";
		System.out.println(s2 + 1000);
		int n2 = Integer.parseInt(s2);
		System.out.println(n2+1000);
		
		//int:4byte������ �ٷ�� ǥ��Ÿ��
		//Integer: 4byte ������ �ٷ�� Ŭ�����̴�.
		//Ŭ������ �� ����մϱ�? ����ϱ� ���� �޼ҵ带 �����Ϸ���
		
		//int>>  ���� (wrapper)   >>Integer
		//String s3="5678";
		//int n3=int.parseInt(s2);
		float f1;
		Float f2;
	}
}
*/
/*
public class Hello {
	public static void main(String[] args) {
		
		//ǥ��Ŭ�������� �����Ǵ� �޼ҵ带 ����ҷ��� �ϴµ�
		//unhandle exception�� �߰� �Ǹ�
		//try catch�� ��������.
		System.out.println("ȣ����1");
		
		for(int i=0;i<5;i++) {
			
			//1�ʴ� 1000ms
			try {
				Thread.sleep(1000);//�ߴ� ��ǻ�;� ���ʵ��� ������� Thread ��� Ŭ������ �ִ�.
			} catch (Exception e) {
				
			}
		
			
			System.out.println(i);
			
		}System.out.println("ȣ����2");
	}
}
*/




//ex88)
//ex88)
/*class A{
	void m1() {
		try {
			throw new Exception(); // �ͼʼ��� �߻��Ѵ�.			
		} catch (Exception e) {
			System.out.println("�ͼ��� �߻�");
		}
	}
	// throws Exception : ����ó���� �޽�� �ȿ��� ���ϰڴ�.
	// ȣ�� m2()�� ����ϴ� ���� ������ �׳��� ó���ض��� ���� ������.
	void m2() throws Exception{
		throw new Exception(); // �ͼʼ��� �߻��Ѵ�.	
	}
}

public class Hello {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		System.out.println("ȣ����1");
		try {
			a.m2();			
		} catch (Exception e) {
			System.out.println("�ͼ��� �߻�2");
		}
		System.out.println("ȣ����2");
	}
}
*/









/*
//ex87-1)����ó�� ���(���� �ܰ����� ���� �ϱ�)
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ȣ����1");
		//�⺻��. try+ctrl space ù��° �� ����
		
		try {
			//���ܰ� �߻��� ���� �ְ� �߻����� ���� ���� �ִ�.
			int a = 16/0;
		}catch(Exception e) {
			//���ܰ� �߻��ϸ� catch�� ����. �߻����� ������ catch��ü�� �����Ѵ�.
			//System.out.println("���ܹ߻�");
			e.printStackTrace();//�ͼ����� ������ ������ش�.(������ �ƴϴ�.)
		}
		
		//ex1)ArithmeticException:�������� ����
		//����(�ͼ���)�� �߻��ϸ� ���α׷��� �ߴ�(����)�Ǿ� ������.
		System.out.println("ȣ����2");
		System.out.println("-------------------------------------------");
		//��? ���ܰ� �߻��߳�.>>���α׷� �����ؾ���>>�߸��� �����̴�.
		//���α׷��Ӱ� �ذ��� �ϸ� ���α׷��� ��� ������ ���̴�. ��� �ǹ��̴�.
		
		//ex2)Null Exception
		
		String s="�ڳ���";
		System.out.println(s);
		s="������ ���� �Ǿ����ϴ�.";
		System.out.println(s.length());
		
		try {
			s = null;
			s.length();
			
		} catch (Exception e) {
			//System.out.println("���ܹ߻�");// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("ȣ����3");
		//String s="�ڳ���";
		//System.out.println(s);
		//s="������ ���� �Ǿ����ϴ�.";
		//System.out.println(s.length());//s�� ���̸� ��� 10�ڰ� ����
		//s=null;//�ƹ��͵� �ȳִ´�. ��ü ��ü�� �ٶ����� ����� ������. 
		//System.out.println(s.length());//���� �� 
		
		//ex3)ArrayIndexOutOfBoundsException:�߸����ǰ� �ִ�.
		//0,1,2
		int[] ar=new int [3];
		ar[0]=10;
		System.out.println("���� ����");
		try {
			ar[3]=20;
			
		} catch (Exception e) {
			System.out.println("Out of")
			;
		}
		System.out.println("ȣ����4");
		
		
	}//>>>>>>>>>>���Ⱑ ����
}
*/
//ex86-6)
//�޼ҵ忡�� �μ� ������ �ʿ��� ���� ����ؾ� ������
//���¿� �������� �ʰ� ������ ���α׷��� �ۼ��ȴٸ�
//�μ� ������ ���� �ʴ� ���� �ӵ����� ���鿡�� �����ϴ�.
/*class Baduk{
	//�ʵ带 �����.
	int a;//�� ��Ʈ�� ����ϱ� ������, �÷���,��ž������ �� �� �ִ�.
	AI ai;//�ʵ�
	Baduk( AI ai ){//������
		//�ʵ��� ai = �μ� ai;
		this.ai=ai;//�μ��� ���޵� ai�� ���Խ�����
		System.out.println("�뱹�� �غ��մϴ�.");
		ai.myName();
	}
	void play() {
		System.out.println("�ٵϰ�⸦ �����մϴ�.");
		ai.play();
	}
	void stop() {
		System.out.println("�ٵϰ�⸦ �����մϴ�.");
	//ai.stop();
	}
	
}
interface AI{
	void myName();
	void play();
}

class AlphaGo implements AI{
	public void myName() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
	public void play() {
		System.out.println("���İ� ����� �ϰ� �ֽ��ϴ�.");
	}
}
class BetaGo implements AI{
	public void myName() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}
	public void play() {
		System.out.println("��Ÿ�� ����� �ϰ� �ֽ��ϴ�.");
	}
}
public class Hello {
	public static void main(String[] args) {
		Baduk b1 = new Baduk(new AlphaGo());
		b1.play();
		System.out.println("=============================");
		Baduk b2 = new Baduk(new BetaGo());
		b2.play();
	}
}

*/

//ex85-5)
/*
class Baduk{
	Baduk( AI ai ){
		System.out.println("�뱹�� �غ��մϴ�.");
		ai.myName();
	}
	void play(AI ai) {
		System.out.println("�ٵϰ�⸦ �����մϴ�.");
		ai.play();
	}
	void stop(AI ai) {
		System.out.println("�ٵϰ�⸦ �����մϴ�.");
	//ai.stop();
	}
	
}
interface AI{
	void myName();
	void play();
}

class AlphaGo implements AI{
	public void myName() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
	public void play() {
		System.out.println("���İ� ����� �ϰ� �ֽ��ϴ�.");
	}
}
class BetaGo implements AI{
	public void myName() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}
	public void play() {
		System.out.println("��Ÿ�� ����� �ϰ� �ֽ��ϴ�.");
	}
}
public class Hello {
	public static void main(String[] args) {
		Baduk b1 = new Baduk(new AlphaGo());
		b1.play(new AlphaGo());
		System.out.println("=============================");
		Baduk b2 = new Baduk(new BetaGo());
		b2.play(new BetaGo());
	}
}

*/


//ex86-5) 
/*
class Baduk{
	Baduk( AI ai ){
		System.out.println("�뱹�� �غ��մϴ�.");
		ai.myName();
	}
	void play(AI ai) {
		System.out.println("�ٵϰ�⸦ �����մϴ�.");
		ai.play();
	}
}
interface AI{
	void myName();
	void play();
}

class AlphaGo implements AI{
	public void myName() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
	public void play() {
		System.out.println("���İ� ����� �ϰ� �ֽ��ϴ�.");
	}
}
class BetaGo implements AI{
	public void myName() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}
	public void play() {
		System.out.println("��Ÿ�� ����� �ϰ� �ֽ��ϴ�.");
	}
}
public class Hello {
	public static void main(String[] args) {
		Baduk b1 = new Baduk(new AlphaGo());
		b1.play(new AlphaGo());
		System.out.println("=============================");
		Baduk b2 = new Baduk(new BetaGo());
		b2.play(new BetaGo());
	}
}
*/
/*
//ex86-4)
class Baduk{
Baduk( AI ai ){
	System.out.println("�뱹�� �غ��մϴ�.");
	ai.myName();
}

void play() {
	System.out.println("�ٵϰ�⸦ �����մϴ�.");
}
}
interface AI{
 void myName();//�ڵ� ������ ���ϰ� �������̽��� �����ϰ� �ֳ�
}

class AlphaGo implements AI{
public void myName() {
	System.out.println("�ΰ������� ���İ��Դϴ�.");
}
}
class BetaGo implements AI{
public void myName() {
	System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
}
}

public class Hello {
public static void main(String[] args) {
	Baduk b1 = new Baduk(new AlphaGo());
	b1.play();
	System.out.println("=============================");
	Baduk b2 = new Baduk(new BetaGo());
	b2.play();

}
}
*/

//ex86-3) 
/*class Baduk{
	Baduk( AI ai ){
		System.out.println("�뱹�� �غ��մϴ�.");
		ai.myName();
	}

	void play() {
		System.out.println("�ٵϰ�⸦ �����մϴ�.");
	}
}
abstract class AI{
	abstract void myName();
}

class AlphaGo extends AI{
	void myName() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
}
class BetaGo extends AI{
	void myName() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}
}
class GammaGo extends AI{
	void myName() {
		System.out.println("�ΰ������� �������Դϴ�.");
	}
}
public class Hello {
	public static void main(String[] args) {
		Baduk b1 = new Baduk(new AlphaGo());
		b1.play();
		System.out.println("=============================");
		Baduk b2 = new Baduk(new BetaGo());
		b2.play();
		System.out.println("=============================");
		Baduk b3 = new Baduk(new GammaGo());
		b3.play();
	}
}
*/
//ex86-2)
/*class Baduk{
	Baduk( AlphaGo alphaGo ){
		System.out.println("�뱹�� �غ��մϴ�.");
		alphaGo.myName();
	}
	Baduk( BetaGo betaGo ){
		System.out.println("�뱹�� �غ��մϴ�.");
		betaGo.myName();
	}
	void play() {
		System.out.println("�ٵϰ�⸦ �����մϴ�.");
	}
}

class AlphaGo{
	void myName() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
}

class BetaGo{
	void myName() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}
}

public class Hello {
	public static void main(String[] args) {
		Baduk b1 = new Baduk(new AlphaGo());
		b1.play();
		System.out.println("=============================");
		Baduk b2 = new Baduk(new BetaGo());
		b2.play();
	}
}
*/
//ex86-1)
/*class Baduk{
	Baduk(){
		System.out.println("�뱹�� �غ��մϴ�.");
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
	void play() {
		System.out.println("�ٵϰ�⸦ �����մϴ�.");
	}
}

public class Hello {
	public static void main(String[] args) {	
		Baduk b =new Baduk();
		b.play();
	}
}

*/

/*
class A{}
class B{
	void m1() {
		System.out.println("���� �θ�B�� m1 �޽��");
	}
}
interface C{
	void cry();
}
interface D{
	void walk();
}
interface E{}

class Tiger extends B implements C, D, E{
	public void cry() {
		System.out.println("����");
	}
	public void walk() {
		System.out.println("���");
	}
}
class Lion extends B implements C, D, E{
	public void cry() {
		System.out.println("������������");
	}
	public void walk() {
		System.out.println("�ͽ��ͽ�");
	}
}
public class Hello {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.m1();
		t.cry();
		t.walk();
		Lion l = new Lion();
		l.m1();
		l.cry();
		l.walk();
	}
}
*/

/*
interface Tiger{//Ŭ������ Ŭ���� ���̴� extends �������̽���  Ŭ������ ���ø���Ʈ
	void m1();
	void m2();
}

class Lion implements Tiger{
	//�θ�(�������̽�)�� �������� ���ϴ� ���� �ڽ��� �����ϴ°�implements
	public void m1() {//�������̽��� �����ϴ� �޼ҵ� �տ��� �ݵ�� publicŰ���带 �ٿ����Ѵ�.
		System.out.println(1);
	}
	public void m2() {
		System.out.println(2);
	}
}

public class Hello {
	public static void main(String[] args) {	
		System.out.println(1000);
		Lion lion=new Lion();
		lion.m1();
		lion.m2();
	}
}
*/
/*
//ex83)
interface �ѱ�����{
	 void �Ա�();//�������̽� abstract�Ⱥٿ��� ����Ʈ�� �ٿ��ִ�.
	 void ���();
	 void ��ü();
}
class �츮���� implements �ѱ�����{
	 public void �Ա�(){
		 System.out.println("�츮���� �Ա��Դϴ�.");
	 };//���� �������̽��̴�.
	 public void ���(){};
	 public void ��ü(){};
	 void ����(){
		 System.out.println("���ڴ� �� 5�ۼ�Ʈ�Դϴ�.");
	 };//���ڸ� �߰��ؼ� �αⰡ ����
}

class �������� implements �ѱ�����{
	public void �Ա�(){};//���� �������̽��̴�.
	public void ���(){
		System.out.println("�������� ����Դϴ�.");
	};
	public void ��ü(){};
	void ����(){
		System.out.println("�������ڴ� �� 8�ۼ�Ʈ �Դϴ�.");
	};//�츮�� ����޴��� ���� ����Ұž�
}
public class Hello {
	public static void main(String[] args) {	
		�츮���� t1 = new �츮����();
		t1.�Ա�();
		t1.����();
		�������� t2 = new ��������();
		t2.���();
		t2.����();
	}
}
*/
//ex82)
/*
public class Hello {
	public static void main(String[] args) {	
		abstract class �ѱ�����{
			abstract void �Ա�();//���� �����佺�̴�.
			abstract void ���();
			abstract void ��ü();
			}
		class �츮���� extends �ѱ�����{
			 void �Ա�(){}//���� �������̽��̴�.
			 void ���(){}
			 void ��ü(){}
			 void ����(){}//���ڸ� �߰��ؼ� �αⰡ ����
		}
		class �������� extends �ѱ�����{
			 void �Ա�(){}//���� �������̽��̴�.
			 void ���(){}
			 void ��ü(){}
			 void ����(){}//�츮�� ����޴��� ���� ����Ұž�
		}
	}
}
*/
/*
 //ex81)
public class Hello {
	public static void main(String[] args) {	
		abstract class ��������{
			void Į() {
				System.out.println("���� Į");
			}
			abstract void ����();
		}
		class ���׳�1 extends ��������{
			void ����() {
				System.out.println("���� ����");
			}
		}
		
		class ���׳�2 extends ��������{
			void ����() {
				System.out.println("ũ����Ż ����");
			}
		}
		//�������� a=new ��������();
		�������� a =new ���׳�1();
		a.Į();
		a.����();
		
		�������� b =new ���׳�2();
		b.Į();
		b.����();
	}
}
*/

/*
public class Hello {
	public static void main(String[] args) {	
		abstract class A{
			//�߻�(abstract) �޼ҵ�
			//�߻� Ŭ���� �̾�� �Ѵ�.
			//�߻� �޽��
			//�ڵ� �ۼ��� �̿ϼ� �Ǿ���.�ϼ��� �ڽ��� ��Ų��.
			abstract void m1();
		}
		//�θ� �̿ϼ��� �ڵ尡 ������ �ڽ��� �ݵ��
		//�� �ڵ带 �ϼ� ���Ѿ� �Ѵ�.
		//�������� �ݵ�� �������̵��ؾ��Ѵ�.
		class B extends A{
			void m1() {
				System.out.println(1);
			}
		}
		//�۽�Ʈ�� Ŭ������ ��ü�� ���� �� �� ����.
		A a=new A();
		a.m1();
}
}
*/
/*
public class Hello {
	public static void main(String[] args) {	
		class A{
			void m1() {
				
			}
		}
		class B extends A{
			void m1() {
				System.out.println(1);
			}
		}
		class C extends A{
			void m1() {
				System.out.println(1);
			}
			
		}
		class D extends A{
			void m1() {
				System.out.println(1);
			}
			
		}
		class Z{
			void m2(int a, String b, Z c, B d) {
				
			}
		}
		class Tiger{
			
		}
		class Lion{
			//int a =10, String b="�ҳ���, Tiger c =new Tiger();
			//void m1(Tiger t) {
				
			//}
		//}
		//Lion lion =new lion;
	//	lion.m1(10,"�ҳ���",new Tiger());
	}
}

*/

/*������..Ȱ�� �پ��� ������ ����� ������ �ȴ�. ��� �ؼ� ������

public class Hello {
	public static void main(String[] args) {	
		class A{}
		class B extends A{}
		A a=new B();
		
		class Animal{
			void cry()
			
		}
*/

//ex76)���� �߿� /������ 
/*public class Hello {
	public static void main(String[] args) {	
		class A{
			void m1() {
				System.out.println(1);
			}
			//�����ε�
	//		void m1(int a) {
		//		System.out.println(1);
			//}
			
			//�������̵� �θ�޼ҵ��̸��̶� �ڽĸ޼ҵ� �̸��� �Ȱ��� ��.
			void m3() {
				System.out.println(31);
			}
		}
		class B extends A{
			
			void m2() {
				System.out.println(2);
			}
			//�������̵�
			void m3() {
				System.out.println(32);
			}
		}
		//�ؿ� ������ B�� �����???�ƹ� ���谡 ����.
		//1.��= �� �ڽĲ� ���Ĵٺ���.
		A a=new A();
		a.m1();
		a.m3();
		
		//2.��=��
		B b=new B();
		b.m1();//�θ��� �͵� ����.
		b.m2();
		b.m3();//32
		
		//3.��=��;�� �����̵�.//���ڰ���(��ĳ����) 1.�ڽ��� �Ĵٺ��� ������ �ڽ� ���� ���� ������ ������ ����.
		A c=new B();
		c.m1();//�ڽĿ� ���� �����ؾ���1
		c.m3();//32 

		//4. ��=��;// �ڹٿ����� ������ �ȵ�(Ȥ�ó� ������ �ȴٸ� �ٿ�ĳ�����̶�� �Ѵ�.)���� ������ ���.
		
	}
}

*/



/*
//ex75)����Ʈ�� ��������� �ڵ��
public class Hello {
	public static void main(String[] args) {	
		//class Tiger{
			
		//}
		//class Lion extends Tiger{
			
	//	}
		class Tiger{
			//Tiger(){} ���� �ȸ���� ����Ʈ�� �����ڸ� �����.
			
			//Tiger this;
			
		}class Lion extends Tiger{
			//Lion(){
		//}	//super();
			//Lion this;
		
		
		
		
	}
}
*/

/*
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			Tiger(){
				System.out.println(1);
				}
			Tiger(int a){
				System.out.println(3);
				}
			
			}
		class Lion extends Tiger{
			Lion(){
				//����!super�� �ݵ�� ������ �Լ��� ù�ٿ��� ���� �� �ִ�.
				//super(10);//���� �����ʰ� ������°� ����.
				System.out.println(2);
			}
			Lion(int b){
				super(b);
				System.out.println(4);
			}
			Lion(int a, int b){
				super(a*b);
				System.out.println(4);
			}
		}
		Lion t=new Lion();//�翬�� �θ� Ÿ�̾ ��ü�� ������ �ȴ�.�θ� �����ڰ� ���� ȣ���� �ǰ� �ڽ� �����ڰ� ȣ���̵ȴ�.
		//�θ� �����ڰ� ȣ��ǰ��� �ڽ� �����ڰ� ȣ��???
		Lion t2 =new Lion(10);
		Lion t3 =new Lion(3,4);
	}
}

*/
//ex)
/*
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			Tiger(){
				System.out.println(1);
				}
			}
		class Lion extends Tiger{
			Lion(){
		//		super();//�θ� �����ڸ� ȣ���ϼ���, ������ �ڵ����� �����ȴ�.����Ʈ�� ������ �ȴ�. ������ ����
				System.out.println(2);
			}
		}
		Lion t=new Lion();//�翬�� �θ� Ÿ�̾ ��ü�� ������ �ȴ�.�θ� �����ڰ� ���� ȣ���� �ǰ� �ڽ� �����ڰ� ȣ���̵ȴ�.
		//�θ� �����ڰ� ȣ��ǰ��� �ڽ� �����ڰ� ȣ��???
	}
}

*/

/*
//ex72)
class Tiger{
	static int num=0;
	int count=0;
	Tiger(){
		num++;
		count++;
	}
}
public class Hello {
	public static void main(String[] args) {	
		
	}
}
*/
//ex71)
//static int num=0; �����ϵǸ� ���� �ö�´�. Ŭ���� �ȿ��� ����.
//class�ȿ��� count�� �ִ°��̳� �ٸ�����.
/*class Tiger{
	static int num=0;
	int count;
}

public class Hello {
	public static void main(String[] args) {	
		//���⼭ �̹� NUM�� ��������ִ�.
		Tiger t1= new Tiger();//�ڱ� �ڽ���count��� ������ �����.
		Tiger t2= new Tiger();//�ڱ� �ڽ��� count��� ������ �����.t1,t3�� �ٸ���.
		Tiger t3= new Tiger();//�ڱ� �ڽ��� count��� ������ �����.t1,t2�� �ٸ���.
		t1.count++;//1
		System.out.println(t1.count);//1���
		t2.count++;//
		System.out.println(t1.count);//t2�� ������Ű�� ���� t1�� Ȯ���غ��� t1���� ������ �ȳ�ģ��.
		System.out.println("_________________________________________");
		t1.num++;//t123��� ������ �޸𸮸� ����.
		System.out.println(t1.num);
		t2.num++;//2
		t3.num++;//3
		System.out.println(t1.num);
		Tiger.num++;//4
		System.out.println(t3.num);
		
	}
}
*/
/*
//ex70)
class Tiger{
	//static ������ �ݵ�� ���� �ʱ�ȭ �Ǿ�� �Ѵ�.
	static int num = 10;
	int count = 20;
	
	static void m1() {
		System.out.println(1);
	}
	void m2() {//��ü �������Ѵٴ� �����Ͽ� �� �� ����.// count�� m2�� new�� �̿��� ��ü ������ �ƴϸ�
											 //��� ���Ѵ�.
		
	}
	//10
	//1
	static void m3() {//��ü �������Ѵٴ� �����Ͽ� �� �� �ִ�.
		System.out.println(num);
		m1();
		//������ ���.
		//System.out.println(count);//static�� �ƴϱ� ������ �� �� ����.
		//�̰� ���� ���. static void�޼ҵ�� ����ƽ���� ����� �͸� �� �� �ִ�.
		//m2();
	}
}
public class Hello {
	public static void main(String[] args) {	
		System.out.println(Tiger.num);//��ü�� ������Ű�� �ʰ� �� �� �ִ�.
		Tiger.m3();
		//Tiger.m2()//static�� �ƴϱ� ������ ����
		
	//	Tiger t= new Tiger();
	//	System.out.println(t.count);//static�� �����Ƿ� ȣ�� �Ұ�
	}
}
*/

/*
//ex69)
public class Hello {
	int num=10;
	void method() {
		System.out.println();
	}
	public static void main(String[] args) {	
		//static�Ⱥٿ����Ƿ� �޼ҵ带 ��������� �� ����.
		Hello h = new Hello();
		h.method();
		System.out.println(h.num);
	}
}
*/


//main�� ȣ���ϴ� ��ü�� �ü��(�� OS)
//Hello.main();static���� �޸𸮰� �ֱ� ������ os���� ȣ���� �� �ִ�.
/*public class Hello {
			//�ʵ�
	static int a= 100;//static�� �Ⱥ����� �׳� Ʋ�� ���̶� �Ʒ� ���θ޼ҵ忡�� ������� ����.
			//������
			//Hello(){}
			//�޽��
	static void method(){
		System.out.println("��");
	}
	public static void main(String[] args) {
		//static�Լ� �ȿ��� ���Ǵ� ���͵��� static�̾�� �Ѵ�.
		System.out.println(1);
		System.out.println(a);
		method();
	}
}
*/
//ex67)
/*class Tiger{
	static int a=10;
	static void method() {
	 	System.out.println("���� ����ƽ");
	}
}

public class Hello {
	public static void main(String[] args) {	
		//Ŭ������ ���赵�̱� ������
		//��ü�� ������Ű��(new���) ������ ����� �� ����.
		//�׷��� staticŰ���带 ����ϸ� 
		//��ü�� ������Ű�� �ʰ� ����� �� �ִ�.
		System.out.println(Tiger.a);
		Tiger.method();
	}
}
*/
/*
//ex66)
public class Hello {
	public static void main(String[] args) {	
		class Apple{
			void m1() {
				System.out.println(1);
			}
			void m2() {
				System.out.println("�θ� �޼ҵ�");
			}
			
		}
		class Banana extends Apple{//is a�� ����ǳ� ���ǻ� ����
			void m2() {
				System.out.println("�ڽ� �޼ҵ�");
			}
			void m3() {
				System.out.println(4);
				super.m2();//�̸��� �ߺ��Ǵ��� �θ���� ����
				
			}
		}
		Banana b= new Banana();
		//b.m2();
		b.m3();
		
	}
	
}
*/
/*
//ex65)
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			void m1() {
				System.out.println(1);
			}
			void m2() {//2���� 1���� �θ� �� �ִ���
				m1();
				System.out.println(2);
				
			}
			void m3() {//3���� 2���� �θ� �� �ִ���
				m2();//this.m2();
				System.out.println(3);
			}
			//����.
			void m4() {	
				m5();
				System.out.println(4);
			}
			void m5() {				
				m4();
			System.out.println(5);
		}
			//�ڽ��� �ڽ��� ȣ���ϴ� ���� ���� ���� ���ȣ���̶�� �Ѵ�.
			//���α׷��� �߸� ¥�⸸ �Ѵٸ� ����� �� ���ִ�.
			void m6() {				
				m6();
			System.out.println(6);
		}
			
		}
		
		Tiger t = new Tiger();
		t.m1();
		t.m2();
		System.out.println("====================================================");
		t.m3();
		//t.m4();���ѷ����� ������.
		//t.m6();
	}
}
*/
/*
//ex64)
public class Hello {
	public static void main(String[] args) {	
		//�� Ŭ������ ���� ����� ã�� ���� ����.
		//Ŭ������ ����� ��Ģ������ Ʋ�� ���̴�.
		//is a ���谡 �������� ����. �������� ������ �۸��� �߸��� ���̴�.
		
		//�ȵ���̵�� �ڵ����̴�.
		//�������� �ڵ����̴�.
		//���������� �ڵ����̴�.
		class Rectangle{
			void draw1() {
				System.out.println("�簢���� �׸��ϴ�.");
			}
		}
		class Triangle extends Rectangle{
			void draw2() {
				System.out.println("�ﰢ���� �׸��ϴ�.");
			}
		}
		Triangle t = new Triangle();
		t.draw1();
		t.draw2();
		
	}
}
*/
/*
//ex63)
public class Hello {
	public static void main(String[] args) {	
		class Animal{
			void walk() {
				System.out.println("�ɾ�ϴ�.");
			}
		}
		//�ڽ��� �θ��̴�.(is a ������ Ŭ����) ����̴� �����̴�.
		class Cat extends Animal{
			
			void cry() {
				System.out.println("�߿�");
			}
		}
		//�������� �����̴�.
		class Dog extends Animal{
			
			void cry() {
				System.out.println("�۸�");
			}
		}class Tiger extends Animal{
			void cry() {
				System.out.println("����");
			}
	}
		Cat cat= new Cat();
		cat.walk();
		cat.cry();
		
		Dog dog =new Dog();
		dog.walk();
		dog.cry();
		
		Tiger tiger =new Tiger();
		tiger.walk();
		tiger.cry();
}

}
*/
/*
public class Hello {
	public static void main(String[] args) {	
	class Tiger{
		void m1() {
			System.out.println(1);
		}
		void m3() {
			System.out.println(10);
		}
	}
	class Lion extends Tiger{
		void m2() {
			System.out.println(2);
		}
		void m3() {
			System.out.println(20);//�ڱ� ���� ���� ��������.������ �θ� ���� ������.
		}
	}
	Lion a= new Lion();
	a.m1();
	a.m2();
	a.m3();
	
	
}

}
*/
/*
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			Tiger method() {//���� ������ �� �Լ�
				return this;//�Ʒ�t�� ���� �� ����
			}
		}
		Tiger t= new Tiger();
		Tiger t1= t.method().method().method();//�� �ڸ��� this�� �Դ�. �ᱹ t�� ����Ѵٴ� ���� ���� ����� ����Ѵٴ� ��. �� �ڵ�� ���ߺ��ص��� ����
		//				t1= t.method().method().method();			//�ڲ� �� �ڽ�(t)�� ������. �� �������� ���ϵ� this�� �����ϰ� ���ߺ��ص�(���ϰ��� �ȹޱ� ������)
		
	}
}
*/
/*
//ex60)
public class Hello {
	public static void main(String[] args) {	
	 class Tiger{
		 void method(int a, String b, Tiger c) {
			 //1.Tiger tt= new Tiger();
			 //return tt;
			 //2.return this;
			 //3.return c;
			 //4.
			 //return new Tiger();
		 }
	 }
	 Tiger t= new Tiger();
	 t.method(10,"ȣ����",new Tiger());
	}
}
*/
/*
//EX58)
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			Tiger m1() {
				System.out.println(1);
				return this;//�ؿ� �ִ� t�� �����ϰڴ�.
			}
			Tiger m2() {
				System.out.println(2);
				return this;
			}
			void m3() {
				System.out.println(3);
			}
		}
		//Tiger t= new Tiger();
		//Tiger t2=t.m1();
		//System.out.println(t.hashCode());
		//System.out.println(t2.hashCode());
		
		Tiger t3=new Tiger();
		//ü�̴� ���.
		t3.m1().m2();//����� �� �ִ� ����� �������� �ִ�. �����ؼ� ���߿� ������� �Ϻ��������� ������ �޾Ҵ�
		t3.m1().m2();//������� ������ �Լ��� ȣ�� �� �� �ִ�.
		t3.m1().m2().m1().m1().m2();
;	}
}


*/
//ex57)
/*
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			int m1() {
				return 100;
			}
			String m2() {
				return "ȣ����";
			}
			Tiger m3(){//tiger��ü�� ������ �� �ִ�.
				Tiger ttiiggeerr=new Tiger();
				return ttiiggeerr;//Ÿ�̰� ��ü�� �����ϼ���
			}
		}
		Tiger t= new Tiger();
		//100�� ����ϱ� ���ؼ� ����ڵ忡 �ɾ���.
		System.out.println(t.m1());
		//���ڿ��� ���ϵ�
		System.out.println(t.m2());
		//���Ϲ��� ��ü �̸��� num�̶�� �ϰڴ�.
		Tiger num = t.m3();
		//num�̳� ttiiggeerr�̳� ������ ���̴�.
		//1.num.m1();���ϵ� ���� �����ϴ� ��
		//2.int n = num .m1();������ �޾Ƽ� ����ϴ� ���
		//3.syso(num.m1())����ڵ忡 �ٷ� �����ϴ� ���
		System.out.println(num.m1());
		System.out.println(num.m2());
		
	}
}
*/
//EX56)
/*
public class Hello {
	public static void main(String[] args) {	
		class Lion{
			void myNameIs() {
				System.out.println("����");
			}
		}
		class Tiger{
			void m1() {
				System.out.println(1);
			}
			//int a = ; �������� �����ֱ⸦ ��ٸ�
			void m2(int a) {
				System.out.println(2);	
			}
			//String s =;�������� �����ֱ⸦ ��ٸ�
			void m3(String s) {
				System.out.println(3);
			}//Lion lion =; //new Lion();
			//��ü�� �μ������ϰ� �ִ�.
			void m4(Lion lion) {
				System.out.println(4);
				lion.myNameIs();
			}
		}
		Tiger t=new Tiger();
		t.m1();
		t.m2(10);
		t.m3("ȣ����");
		t.m4(new Lion());
	}
}

*/
/*
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			int num;
			int count;
			Tiger(int num,int count){
				this.num=num;
				this.count=count;
			}
			void show() {
				//	System.out.println(num+" "+ count);
				System.out.println(this.num+" "+ this.count);
			}
		}
		Tiger t1= new Tiger(88,99);
		t1.show();
		Tiger t2=new Tiger(66,77);
		t2.show();
	}
	
}


*/
//54)
/*
public class Hello {
	public static void main(String[] args) {	
		
		class Tiger{
			int x,y;
			Tiger(int a, int b){
				this.x=a;//�����̵Ǳ� ������ this �����̰���
				this.y=b;
			}
		}
		Tiger t1=new Tiger(10,20);
		System.out.println(t1.x+" "+t1.y);
		System.out.println("============================");
		class Lion{
			int x,y;//�ʵ带 �ʱ�ȭ���������� ����Ʈ ���� 0 ,�ڱ�����̶� �ʱ�ȭ�� �ȵȴ�.
			//ó������ �̸��� �Ȱ��� ���� ����..���ϰ� ���δ�.
			Lion(int x, int y){
				//�μ�x=�μ�x;
				//�μ�y=�μ�y;
				this.x=x;//�ڱ����/�ڱ��ڽ��� ����� ����Ų�� this.x
				this.y=y;//�ڱ����
			}
		}
		Lion t2= new Lion(10,20);
		System.out.println(t2.x+" "+t2.y);//this�� �¾�� �̰�
		
		int a =3;
		//�ڵ�μ��� �ϵ��� ��ġ�� ����.
		a=a;//�ڱ����
	}
}
*/
/*
public class Hello {
	public static void main(String[] args) {
		//this�� Ŭ���� �ȿ����� ����� �� �ִ� Ű�����̴�.
	
		class Tiger{
			void method1() {
				//�ᱹ this�� ������ ������� ��ü�� �ǹ��Ѵ�.
				System.out.println("2:"+this.hashCode());
			}
		}
		//this=t1��ü�Դϴ�.
		Tiger t1=new Tiger();
		System.out.println("1:"+t1.hashCode());//������ȣ
		t1.method1();
		
		//this=t2��ü�Դϴ�.
		Tiger t2=new Tiger();
		System.out.println("3:"+t2.hashCode());
		t2.method1();
		
	}
}
*/

//ex52)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		//9.���α׷��Ӱ� �����ڸ� ������ ������
		//�����ڴ� �ڵ����� ����� ����.
		//�׷��ٸ� ���α׷��Ӱ� �����ڸ� �����
		//�ڵ����� �ȸ���� �ش�.
		//���α׷��Ӵ� �Ⱦ����� ����Ʈ �����ڸ� �̸� �������´�.
		//Ȥ�ó� �����ڸ� �߰� �� ���� �ֱ� ������
		class Tiger{
			Tiger(){}
			Tiger(int a, int b){
				
			}
		}
		//���⼭�� ����Ʈ �����ڸ� ������ ������
		//t2��ü�� ������ �� ������ ���.
		Tiger t1= new Tiger(10,20);//�μ������� ���� �ʴ� �Լ�(������)�� ȣ���ض��� ��
		Tiger t2=new Tiger();//�����ڸ� ������� ������ ����Ʈ �����ڰ� ����������ʴ´�.
	}
}
*/


//ex51)
/*
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			int aa,bb;
			//������ �޽��, ������ �޽��, ������ �޽��..
			//�����ڵ� �޼ҵ��̴�. ���� �������̵� �� �� �ִ�.
			//�����ڴ� ������ ����. ���� �μ��� �ٸ��� �� �� �ִ�.
			Tiger(){
				System.out.println("��������1");
			}
			Tiger(int xx, int yy){
				System.out.println("��������1");
				aa=xx;
				bb=yy;
			}
			void show() {
				System.out.println(aa+" "+bb);
			}
		}
		Tiger t1 =new Tiger();
		Tiger t2 =new Tiger(10,20);
		t1.show();
		t2.show();
		Tiger t3 =new Tiger(1000,2000);//��ü������ ���ϴ� ���� �ְ� �ʱ�ȭ �� �� �ִ�.
		t3.show();
	}
}

*/

//50)
/*
public class Hello {
	public static void main(String[] args) {
		// 8. �����ڸ� ����ϴ� ���� : ��� �ʵ� �ʱ�ȭ�� ����
		class Tiger{
			int aa, bb;
			Tiger(){
				System.out.println("������ ��");
				aa = 10;
				bb = 20; // �̰� �������� �����޼� ���̴�.
			}
			
			void show() {
				System.out.println( aa + " " + bb );
			}
		}
		System.out.println(1);
		Tiger tiger = new Tiger();
		System.out.println(2);
		System.out.println( tiger.aa + " " + tiger.bb );
		tiger.show();
	}
}
*/
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		class Tiger{
			//1.�ʵ�
			//2.������
			//1)�����ڵ� ������ �޼ҵ�(�Լ�)�̴�.
			//2)�޼ҵ� �̸��� �ݵ�� Ŭ���� �̸��� �����ؾ��Ѵ�.
			//3)�����ڴ� return���� ���� �� ����.(������) ���ϰ��� �����Ƿ�void������ �ڵ����� �ʴ´�.
			//4)�����ڴ� ���α׷��Ӱ� ȣ�� �� �� ����.(�ڵ�ȣ��ȴ�.)
			//5)�ڵ�ȣ��Ǵ� ������ ��ü�� ������ �� ȣ��ȴ�.
			//6)��ü�� ������Ű�� Ű���� new�� ����� �� ȣ��ȴ�.
			//7)���α׷����� ��ü(�ν��Ͻ�) �Ѱ��� �� �ѹ��� �����ڸ� ȣ���� �� �ִ�.
			Tiger() {
				System.out.println("ȣ����");
			}
			//3.�޼ҵ�
			void methoid01() {}
	}
		System.out.println(1);
		Tiger t1=new Tiger();//>>�� �������� �����ڰ� �ڵ����� ȣ��Ǿ���.
		System.out.println(2);
		Tiger t2=new Tiger();//>>�� �������� ȣ��Ǿ���.
		System.out.println(3);
}
*/
/*
public class Hello {
	public static void main(String[] args) {	
		class Cal{
			int a,b;
			
			void setData(int x, int y){
				a=x;
				b=y;
			}
			void add() {
				System.out.println(a+b);
			}
			void sub() {
				System.out.println(a-b);
			}
			void mul() {
				System.out.println(a*b);
			}
			void div() {
				if(b==0) {
					System.out.println("�и� 0�� �� �� �����ϴ�.");
					return;//���⼭ �Լ��� Ż���ϼ���
				}
				System.out.println(a/b);
			}
		}
		
		Cal cal = new Cal();
		cal.a=10;
		cal.b=4;
		cal.sub();
		cal.mul();
		System.out.println("========================");
		cal.setData(20, 6);
		cal.add();
		cal.div();
		
		
		
	}
}
*/
//ex47)
/*public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			int a =10,b=20;
			void showMeTheALLField() {
				System.out.println(a+" "+b);//Ŭ���� �����̱⶧���� �������� �� �� �ִ�.
			}
			void showMeTheALLField(int c) {
				System.out.println(a+" "+b+" "+c);//Ŭ���� �����̱⶧���� �������� �� �� �ִ�.
			}
		}
		
		Tiger t= new Tiger();
		System.out.println(t.a);
		System.out.println(t.b);
		
		t.showMeTheALLField();
		t.showMeTheALLField(50);
	}
}
*/

//ex46)
/*
public class Hello {
	public static void main(String[] args) {
		//�������� 1������.�޼ҵ� �����ε��� ���� �����غ���
		//�޼ҵ� �̸��� �ߺ��ؼ� �۸��� �� ������
		//�μ��� ������ �ٸ��ų�, �μ��� Ÿ���� �ٸ� ����
		//�޼ҵ� �̸��� �ߺ��ؼ� �۸��� �� �ִ�.
		//�̰��� �������� �޼ҵ� �����ε��̶�� �Ѵ�.
		System.out.println("ex");
		class Tiger{
			void apple() {
				System.out.println(1);
			}
			
			//�Լ��̸��� �ߺ��ؼ� ����Ҽ��� �ִ�.
			//���Ǹ� �´ٸ�:
			//����1.���޵Ǵ� �μ��� ������ �ٸ��� �ȴ�.
			void apple(int a) {
				System.out.println(2);
			}
			void apple(int a, int b) {
				System.out.println(3);
			}
			//����2. ���޵Ǵ� �μ� ������ ������
			//ǥ��Ÿ���� �ٸ��� �ȴ�.
			void apple(float a) {
				System.out.println(2);
			}
		}
		
		Tiger t= new Tiger();
		t.apple(10);
		t.apple(10,30);
		t.apple(10.0f);
		
		class Lion{
			void apple(int a) {
				System.out.println(1);
			}
			void apple(long a) {
				System.out.println(2);
			}
			void apple(int a, int b) {
				System.out.println(3);
				
			}
			void apple(long a, int b) {
				System.out.println(4);
			}
		}
		System.out.println("--------------------------------");
		Lion lion =new Lion();
		//(int)�� ���� ���� Ÿ��ĳ����
		lion.apple((int)10);//int�� ����
		lion.apple((long)10);//long���� ����
		lion.apple((int)3,4);
		lion.apple((long)3,4);
		
	}
}

*/
//ex45)
/*public class Hello {
	public static void main(String[] args) {	
		//ǥ��Ÿ��
		int a =10;
		char b = '��';//����
		//1�� �̻��� ���ڿ��̴�. �����string
		//ù�ڴ� �빮��.
		
		//�ڹٿ��� �����ǰ� �ִ� ǥ�� Ŭ���� String
		String c="����ȭ ���� �Ǿ����ϴ�.";//���� ������ �̷��� ����.
		
		//Ŭ������ ���� �� �� ���� �ƴѵ���?
		String d = new String("�ε鷹���� �Ǿ����ϴ�.");//(���������δ� �̷��� ���� ��)�̷��� �ᵵ�Ǵµ� 
		
		System.out.println(c);
		System.out.println(d);
		
		class Tiger{
			void m1(int a, int b, String s, char ch) {
				System.out.println(a+" "+b);
				System.out.println(s);
				System.out.println(ch);
				
			}
		}
		
		Tiger t= new Tiger();
		t.m1(10, 20, "�������� ���ư��ϴ�.", '��');
	}
}
*/
/*
//ex44)
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			int m1(){//int���� �ݵ�� ���ϰ��� ������.
				if(false) {
					System.out.println(1);
					return 100;//�Լ� Ż��
				}else {
					System.out.println(2);
					return 200;//�Լ� Ż��
				}
			}
				//System.out.println(1234); ������ �ȵ� �Լ� Ż���ϱ� ������
				int m2(int num){//int���� �ݵ�� ���ϰ��� ������.
					if(num%2==0) {
						System.out.println("�μ��� ¦���Դϴ�.");
						return 100;//�Լ� Ż��
					}else {
						System.out.println("�μ��� Ȧ���Դϴ�.");
						return 200;//�Լ� Ż��
					}
				
				
			}
		}
		Tiger t=new Tiger();
		System.out.println(t.m1());
		System.out.println(t.m2(10) * 3);
		System.out.println(t.m2(11) * 3);
		//Tiger t = new Tiger();
		//t.m1();//���ϰ� ����
		
	}
}
*/
//ex43)
/*
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			//�޼ҵ� �⺻�� 4����
			void m1() {}
			void m2(int num) {}//�μ������ϰ� ���ϰ� ����
			int m3() {return 0;}//�μ����� ���ϰ� ����
			int m4(int num) {return 0;}//�μ����޵� �ϰ� ���ϰ��� ����
			
			//�޼ҵ��� Ȯ��
			//void m5(int a, b, c){<<�̰� ������ ���.
			void m5(int a,int b, int c) {
				System.out.println(a*b+c);
			}
			
			int m6(int a , int b) {
				//System.out.println("ȣ����");
				return a*b;
			}
			
			int m7(int a, int b) {
				int sum =1;
				for (int i = 0; i < b; i++) {
					//�ݺ� Ƚ��b��ŭ 2�� ���Ѵ�.
					//sum = sum*2;
					
					//�ݺ� Ƚ�� b��ƴ a�� ���Ѵ�.
					//a�� bȽ����ŭ ���Ѵ�.
					sum=sum*a;
				}
				return sum;
			}
		}
		Tiger t=new Tiger();
		t.m5(3,4,5);
		t.m5(5,10,30);
		System.out.println(t.m7(3,4));
		System.out.println(t.m7(2,8));
		System.out.println(t.m7(3,8));
	}
}
*/
/*
//ex42)
//�����ʼ�
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		class Tiger{
			//�⺻�� 1:void�� ���ٶ�� ���� ������.
			//���ϰ��� ����.
			void method01() {
				System.out.println(1);
				
			}
			//�⺻��2
			//���� �����ϴ� ���� '�μ�'(�Ķ��Ʈ)�� �����Ѵ�.
			void method02(int num) {
				System.out.println(2);
			}
			//�⺻��3:������ �Ǵµ� �� ���ϵǴ� �޸� ũ��� int�̴�
			//�׾��ٰ� ����� return�̶�� ���ڰ� �־�� �Ѵ�.
			int method03() {//���ϰ��� ��������void�� ���� �������� ���ش�.
				System.out.println(3);
				return 1234;//�޼ҵ�� return�� ������ �Լ��� Ż���մϴ�.
				//System.out.println(4);//����� ������� �ʴ� �ڵ�
			}
			//�⺻��4
			int method04(int num) {//�μ����޵� �ް� ���ϰ��� �ְ�
				System.out.println(4);
				return num*10;
			}
		}
		
		Tiger t1=new Tiger();
		t1.method01();
		t1.method02(1000);
		//���ϰ� �ȹ޸���
		t1.method03();
		//2.���ϰ� �޴� ����
		int nn=t1.method03();
		System.out.println(nn);//���� nn
		//3.�޾Ƽ� ��¿� �ٷ� �����Ѵ�.
		 System.out.println(t1.method03());
		//�������� ���ϵ� ���� ���� �ڲ� �������� �ϸ�ȵȴ�.
		 //System.out.println(t1.method01());
		 //int tt =t1.method01();
		 
		 //4.
		System.out.println("===================================");
		t1.method04(7);//���ϰ� �ޱ� ������ �ȹ޴� ���� 
		//�Ʒ� �޾Ƽ�db�� �����ϰ��� ��¹����� ����غ�
		int db = t1.method04(7);//db�� ���� ���� ���� ������.
		//���ϵ� ���� Ȯ���غ���
		System.out.println(db);
		
		//���ϵ� ���� ��¿� �ٷ� ����.
		System.out.println(t1.method04(9));
	}
}
*/
//ex41)�޽��, �Լ�(function)
/*
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			//int num =7;
			void cry(int num) {
				for (int i = 0; i < num; i++) {
				 	System.out.println("��"+i);			
				}
		
			}
		}
		Tiger tiger = new Tiger();
		tiger.cry(27);
		
	}
}
*/

//ex40)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		class Tiger{
			//3.�޽�� :apple�� �޽�� �̸��̴�.
			//�� �޽�� ȣ���� ������ �ȵǴ���?Ŭ���� �ȿ� �ۼ��� ���� ���赵�̴�.
			void apple() {
				System.out.println("�޽�� ȣ��");
			}
			
			void banana(){//�Լ�
					System.out.println("��");
					System.out.println("��");
					System.out.println("��");
			}
		}
		Tiger tiger = new Tiger();
		System.out.println(1);
		//apple()�̶�� �޼ҵ带 �θ���.(��:ȣ��)
		tiger.apple();//��ȣ ����ݰ�
		System.out.println(2);
		tiger.banana();
		System.out.println(3);
		tiger.apple();
		System.out.println(4);
		for (int i = 0; i < 5; i++) {
			tiger.apple();
		}
	}
	
}
*/
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		class Tiger{
			int a,b;
		}
		Tiger t1=new Tiger();
		//����Ʈ ���� 0�� �ʱ�ȭ�ȴ�. �ƹ��͵� �ȳ־��� ��� 
		System.out.println(t1.a +" "+t1.b);
		
		class Lion{
			int a=100,b=200;
		}
		Lion l1=new Lion();
		//����Ʈ ���� 0�� �ʱ�ȭ�ȴ�. �ƹ��͵� �ȳ־��� ��� 
		System.out.println(l1.a +" "+l1.b);
		
		l1.a=300;
		l1.b=400;
		System.out.println(l1.a+" "+l1.b);
	}
}

*/
		
	
//ex38)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		//����
		int a;//4byte�� �޸𸮸� �޴´�.
		int b,c;
		//����(��),�йи�,���(���� ���Ǵ� ���)
		class Tiger{
			//2.�ʵ�(field)
			int a;//�޸𸮸� �޶�� �ϴ� ���� �´´�.(���⼭ ������ �޴� ���� �ƴ�. ���� ���̶�� ���赵�� ��� �س��� ��)���ȿ� �ִ� a�� �ܺο��ִ� a�� �ٸ�����̴�.
			int b,c;
			
		}
		//�̶� �޸𸮸� ���� ���̴�.
		Tiger t1 = new Tiger();//()�� ��������.
		//��Ʈ�� �̿��ϴ� ���� ü�̴�(chaining)�̶�� �Ѵ�.
		t1.a=10; 
		t1.b=20;
		t1.c=30;
		System.out.println(t1.a);
		System.out.println(t1.b+t1.c);
		System.out.println("===================================");
		Tiger t2= new Tiger();//()�� ��������
		t2.a=40;
		t2.b=50;
		t2.c=60;
		System.out.println(t2.a+t2.b);
		
		//ex2)
		class Lion{
			byte a;
			short b;
			char c;
			int d;
			long e;
			float f;
			double g;
			boolean h;
		}
		Lion lion = new Lion();
		lion.a =10;
		lion.b =20000;
		lion.c ='��';
		lion.d =30;
		lion.e =40;
		lion.f =3.14f;
		lion.g =3.14;
		lion.h =true;
		System.out.println(lion.d);
		
	}
}
*/
/*
//ex37)
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		//Ŭ���� �̸��� ù�ڸ� �빮�ڷ� �ۼ��ϴ� ���� �����̴�.
		//���� = �Ϲ����� ���
		class Tiger{
			//1.������(construtor)
			
			//2.�ʵ�(field)
			
			//3.�޼ҵ�(method)
			
		}
		
		
		
	}
}


//ex36)
//���� ��ġ���� Ŭ������ ����� ���� �����̴�.
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		//���⼭ �׽�Ʈ�� �ص� �����ϴ�. 16�� ��ġ�� ����ϴ� ��������
		//�׽�Ʈ�� ����� �ϰڴ�.
		
		// Ŭ������ �������.
		class Airplane{//Ŭ����: ����� Ŭ���� Ŭ���� �̸�
			
		}
		
		// ��ü�� �����.
		//����:int[]ar=new int[4];�� �����ϴ�.
		Airplane air747 = new Airplane();
		Airplane air748 = new Airplane();
		Airplane air749 = new Airplane();
		//��ü�� ������ȣ�� ��µȴ�.(������ȣ) �¾ ���� ������ȣ�� ������ ���´�
		System.out.println(air747.hashCode());
		System.out.println(air748.hashCode());
		System.out.println(air749.hashCode());//hashcode������ȣ���
	}
}
*/
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		
		int[] ar = new int[7];
		
		for(int i=0;i<ar.length;i++) {//�迭 �ȿ� �����ϰ� �����ͳְ�
			ar[i]=new Random().nextInt(100); 
		}
		for(int i=0;i<ar.length;i++) {//���
			System.out.println(ar[i]+" "); 
		}System.out.println();
		System.out.println("===================================");
		
		for (int i = 0; i < 7; i++) {
			for (int j =0; j < 7; j++) {
				System.out.print("["+i+" "+j+"]");
			}System.out.println();//�ٹٲ�
		}System.out.println("===================================");
		for (int i = 0; i < 7; i++) {
			for (int j = i+1; j < 7; j++) {
				System.out.print("["+i+" "+j+"]");
			}System.out.println();//�ٹٲ�
		}System.out.println("===================================");
		//���� ������ �ϴ� ���α׷� �˰���(�߿��߿�)
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if(ar[i]<ar[j]) {
					int temp;
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
			
		}
		//�� ����� ����Ѵ�.
		for(int i=0;i<ar.length;i++) {//���
			System.out.print(ar[i]+" "); 
		}System.out.println();
		
		
	}
}
*/
//ex34)
/*public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		//�ܺο��� ����ͼ� ���Ǵ� ��ɵ��� ctrl space�� �̿�����
		//Ŀ���� m�ڿ� �����ؼ�ctrl space 
		//new Random().nextInt(10);
		//10�� �����ϸ� : 0 ~ 9���� ���� �߿��� 1���� �־��ش�. num��
		//ex1)1���� ���� ���� �����ȿ� �����ؼ� Ȱ��.
		int num = new Random().nextInt(100);
		System.out.println(num);
		
		//ex2)
		//�����ϰ� ���ڸ� �̾Ƽ� ������� �����Ų��.
		System.out.println(new Random().nextInt(10));
		System.out.println("=======================");
		
		//ex3)�Ϲ������� �� ����� ����. ������ �޾Ƽ� ����.
		for (int i = 0; i < 7; i++) {
			int nn = new Random().nextInt(100);
			System.out.print(nn+" ");
			
		}System.out.println();
		System.out.println("=======================");
		//ex4)
		for (int i = 0; i < 7; i++) {
			System.out.print(new Random().nextInt(10)+" ");
		}System.out.println();
	}	
}
*/
/*
//ex32)
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		
		//int[] ar =new int[8];
		
		//8���� Ȯ���� �ȴ�.
		int[] ar=new int[] {3,4,5,7,8,1,3,9};
		System.out.println(ar[2]);
		System.out.println(ar[7]);
		
		//�ణ�� ����
		System.out.println("�迭�� ������"+ar.length);
		for (int i = 0; i < 8; i++) {
			System.out.print(ar[i]+" ");
		}System.out.println();
		System.out.println("===========================");
		for (int i = 0; i < ar.length/2; i++) {
			//System.out.println("ȣ����");
			System.out.println(ar[i]+ar[7-i]);
		}
	}
}
*/
/*
//ex31)
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		
		//�迭(array)
		//short[] test =new short[10];
		//��ģ���� ��������.
		//����ϴ� ��ȣ�� 0������ ����ϱ� ������ 0������ 4��������
		//�� �� �ִ�. 5����� ���Ѵ�. 6���� �� ���Ѵ�.
		int[] ar=new int[5];
		ar[0]=10;//ù��° �� ���
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
		//ar[5]=60;�ȵȴ�
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]+" "+ar[4]);
		
		System.out.println(ar[2]+ar[4]);//�迭���� ���� ����
		System.out.println("===========================");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(ar[i]+" ");
		}System.out.println();
		
		System.out.println("ȣ����");
		//�������α׷��� ©���� �𸣰�����
		//�ؿ��� ������ 40�� �ʿ��մϴ�.
	}
}
*/
//ex30)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		for(int i=0;i<5;i++) {
			//System.out.println(i);
			System.out.print(i+" ");
		}
		System.out.println("ȣ����");//�ٹٲ޸� �Ͼ��(ĳ���� ����)
		
		//ex2)���� for �Ǵ� ����for �ʹ� �߿�
		for(int i=0;i<3;i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("["+i+" "+j+']');
			}System.out.println();
		}
		System.out.println("ȣ����");
	}
}
*/
//ex29)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		for (int i = 0; i <11; i++) {
			
		
		switch(i%5) {//0 1 2 3 4
		case 0:
			System.out.println("�ҳ���");
			break;
			
		case 1:
			System.out.println("�߳���");
			break;
			
		case 2:
			System.out.println("�볪��");
			break;
			
		default:
			System.out.println("�ε鷹");
			break;
		}
		
	}
		
}
}
*/
//ex28)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		//:  ,   ;
		//1. �ϱ� case�� ������ ���ڰ� ������ �ȵȴ�.
		//2. case �ڿ��� ������ �� �� ����.
		//3. break;�� ������ ����.
		int num=20;
		int test=10;
		switch(num) {
		case 10://���⿡ case test: �̶�� �� �� ����.
			System.out.println("ȣ����");
			break;//switch������ �������ϴ�.
		case 20:
			System.out.println("�ڳ���");
			break;//switch������ �������ϴ�.
		case 30:
			System.out.println("������");
			break;//switch������ �������ϴ�.
		default:
			System.out.println("�� ����Ʈ");
			break;
		}
	}
}
*/
//ex27)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		
		int count=10;
		count++;
		++count;System.out.println(count);
		
		int a=3, b;
		b=a++;//���� ����<-�ݴ밳��->���� ����(++a)
		System.out.println(a+" "+b);
		

		int c=3, d;
		d=++c;//���� ����<-�ݴ밳��->���� ����(++a)
		System.out.println(c+" "+d);
	}
}
*/
/*
//ex26)��ڼ� ��� ���α׷�(�ݶ��� �˰���)//�⺻��
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		
		int num =2021;
		while(true) {
			System.out.println(num);
			
			if(num % 2==0) {//¦�� �Դϱ�
				num=num/2;
			}else {
				num=num*3+1;
			}
			if(num==1) {
				System.out.println("��1�̴�. Ż��");
				break;		
			}
		}
		System.out.println("ȣ����");
	}
}
*/
//ex25)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		
		//ex1)
		//���ѹݺ�
		//int count =0;
		//while(true) {
		//	System.out.println("ȣ����"+count);
		//	count++;
		//}

		//ex2)
		int count =0;
		while(count<10) {
		System.out.println("ȣ����"+count);
		count++;
		}
		System.out.println("Ż���");
		System.out.println("===========================");		
		//ex3)
		count =0;
		while(true) {
			System.out.println("ȣ����"+count);
			count++;
			if(count==3) {
				System.out.println("Ż��Ǳ� �Ϻ�����"+ "");
				break;
			}
		}
		System.out.println("Ż���2");
}

}
*/
//ex24)
/*public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		//�ջ� ���α׷�
		int sum = 0;
		for (int a = 1; a <= 10; a++) {
			sum=sum+a;
			
	//a:1>>1 >>0+1
	//a:2>>3 >>0+1+2
	//a:3>>6 >>0+1+2+3
	//a:4>>10>>0+1+2+3+4
	//a:5>>15>>0+1+2+3+4+5
			
		}
		System.out.println("��"+sum);
		System.out.println("end");
		System.out.println("===========================");
		
		//EX2)
		sum=0;
		for (int a = 1; a <= 10; a++) {
			sum=sum+a;
			System.out.println(sum);
		}
		System.out.println("===========================");
		//EX3)
		//2�� �¼�, 2�� N��
		int ss=1;
		for (int a = 0; a < 4 ; a++) {
			ss = ss * 3;
			//2=1*2
			//4=2*2
			//8=4*2
			//16=8*2
		
		}
		System.out.println(ss);
	}
		
	
	
}
*/
/*
//ex23)
public class Hello {
	public static void main(String[] args) {
		//���ϴ� ������ ��� ���α׷�(�ϱ�)
		System.out.println("ex");
		for(int a=0;a<10;a++) {
			System.out.println(19+" * "+ a +"="+ 19 * a);
		}
		System.out.println("===========================");
		//ex2)
		int num =77;
		for(int a=0; a<10;a++) {
			System.out.println(num+" * "+ a +"="+ num * a);
		}
	}
}

//ex22)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		int num=0;
		System.out.println(num);
		num=num+3;
		System.out.println(num);
		num=num+1;
		System.out.println(num);
		num++;//���׿��� num=num+1����� ���� �����̴�.
		System.out.println(num);
		++num;//
		System.out.println(num);
		num=num-1;
		System.out.println(num);
		System.out.println("===========================");
		num--;
		System.out.println(num);
		--num;
		System.out.println(num);
		System.out.println("===========================");
		
		for(int a=0;a<500;a++) {
			//System.out.println("ȣ����"+10);
			System.out.println("ȣ����"+a);
		}
	}
}
*/
//ex21)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		
		//ex1)4ȸ �ݺ�
		System.out.println("start");
		for(int a=0;a<4;a=a+1) {
			System.out.println(a);
		}
		System.out.println("end");
		
		//ex2)10ȸ �ݺ� for���ȿ� ������ ���ǰͰ� ���ĵ� �������.
		for(int a=0;a<10;a=a+1) {
			System.out.println(a);
		}
		System.out.println("end");
		
	}
}
*/
//ex20)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		//ex1)
		//n���߿� �ݵ�� 1���� ���õȴ�.
		if(false) {
			System.out.println(1);
		}
		else if(false){
			System.out.println(2);
		}else if(true){
			System.out.println(3);
		}else {
			System.out.println(4);
		}
		System.out.println(5);
		
		//ex2)
		int jumsu =73;
		
		if( jumsu>=90) {
			System.out.println("A�Դϴ�");
		}else if(jumsu>=80) {
			System.out.println("B�Դϴ�");
		}else if(jumsu>=70) {
			System.out.println("c�Դϴ�");
		}else if(jumsu>=60) {
			System.out.println("D�Դϴ�");
		}else {
			System.out.println("F�Դϴ�.");
		}
	}
}

*/
//ex19)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		
		//ex1)
		if(false || false){
			System.out.println(1000);
		}	
		System.out.println(2000);
											//���
		System.out.println(false||false); 	//false
		System.out.println(false||true);	//true	
		System.out.println(true||false);	//true
		System.out.println(true||true);		//true
		System.out.println("===========================");
		
		int key =0 , money=10000;
		if(key > 0 || money>15000) {
			System.out.println("������ �����մϴ�.");
		}else{
			System.out.println("������ ���� �� �� �����ϴ�.");
			if(key<=0) {
					System.out.println("Ű�� �غ��ϼ���");
			}
			if(money<15000) {
					System.out.println("���� �غ��ϼ���");
			}
		}
		System.out.println("===========================");
		//��AND								//���
		System.out.println(false && false); //false
		System.out.println(false && true);	//false	
		System.out.println(true && false);	//false
		System.out.println(true && true);	//true
		
		int a =1 , b=5000000;
		if(a > 0 && b>15000) {
			System.out.println("������ �����մϴ�.");
		}else{
			System.out.println("������ ���� �� �� �����ϴ�.");
		
		}
		// (+)					 (*)���ϸ� �߰��� ���̳���
		//A || B(0:false 1true) A && B		
		//0	0 0					0 0 0
		//0 1 1					0 0 1
		//1 1 0					1 0 0
		//1 1 1					1 1 1
		
		//||�� &&�� �� �����ڶ�� �Ѵ�.
		//���� ������
		if(!false) {
			System.out.println("������");
		}
		if( !(3 < 2) ) {//false�� ������ true�̴�.
			System.out.println("�޹���");
		}
	}
}
*/
//ex18)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		
		//
		//¥��:¦¦
		//�쵿:¦Ȧ
		//«��:ȦȦ
		//����:Ȧ¦
		//�ƹ� ���ڳ� �ҷ���!34�̷��� ���� �߽��ϴ�.
		//3:¦������ Ȧ������ 4:¦������ Ȧ������
		//
		int num =63;
		//3�� 4�� �и�����
		int a=num/10;
		int b=num%10;
		
		System.out.println(a+" "+b);
		if(a%2==0) {//¥�� �ƴϸ� �쵿
			if(b%2==0) {
				System.out.println("¥��");
			}else {
				System.out.println("�쵿");
			}
		}else {
				if(b%2==0) {
					System.out.println("«��");
				}else {
					System.out.println("����");
				}
			}
		}
	}
*/
//ex17)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		//2�߿� �ݵ��(�߿�), 1���� �����ϰ� ���� ��
		//����ϴ� ���� if(){}else{}
		if(false) {
			System.out.println(1);
		}else {
			System.out.println(2);
		}
		System.out.println(3);
		System.out.println("----------------------------------------");
		
		//ex2)
		if(30>60) {
			System.out.println(4);
		}else {
			System.out.println(5);
		}
		
		//ex3)10���� ������ �������� 0~9���� �� 2�� ������ 1Ȥ�� 0
		if(12345%2 == 0) {
			System.out.println("¦���� ��������");
		}else {
			System.out.println("Ȧ���� ��������");
		}
		
		//ex4)
		System.out.println(1109211/1000000);
		if(1109211/000000 == 1) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
	}	
	
	
}
*/
//ex16
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		//ex1)
		if(3 > 2){
			System.out.println(1);
		}
		System.out.println(2);
		System.out.println("----------------------------------------");
		//ex2)1�� �̻� if���� ����� �� �ִ�.
		if(3 < 2){
			System.out.println(3);
		}
		System.out.println(4);
		System.out.println("---------------------------------------");
		//ex3)if�� �ȿ� if���� ����� �� �ִ°�?
		if(false){
			System.out.println(5);
			if(false) {
				System.out.println("ȣ����");
			}
			System.out.println("������");
		}
		System.out.println(6);
		System.out.println("---------------------------------------");
		//EX4)if�� �ȿ� if���� ����� �� �ִ°�? ������ ��, �ݵ�� �ٸ� true,false�� ����
		//�� ����� �����ϰ� �����ؼ� ���� ����� ������ Ȯ���� �� ���ּ���.
		System.out.println("small ex4");
		if(true){
			System.out.println(1);
			if(3>2) {
				System.out.println(2);
				if(false) {
					System.out.println(3);
				}
				System.out.println(4);
			}
			System.out.println(5);
			if(6 != 7) {
				System.out.println(6);
				
			}
			System.out.println(7);
		}
		System.out.println(8);
	}
	
}
*/



//ex15)
/*
public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println("ex");
		//���....
		//if,for,while,switch
		//�� 4�� ����� () {}�� ���������� �����Ѵ�.
		
		//if(����)
		//ex1)
		//{}�� block�̶� �Ѵ�.
		//true, false�� �ٲپ �׽�Ʈ �ϼ���
		if(false)
		{
			System.out.println(100);
		}
		System.out.println(200);
		System.out.println("-------------------------------");	
		
		System.out.println(30>20);//true��� ���� ���´�.
		System.out.println(30<20);//false��� ���� ���´�.
		if(30 < 20)
		{
			System.out.println(300);
			System.out.println(400);
		}
		System.out.println(500);
		
		System.out.println("-------------------------------");	
		
		//��Ұ��踦 ���� ���� 6������ �ִµ� �̰��� �񱳿����ڶ�� �Ѵ�.
		//�񱳿����� 6���� �־ ����������� ����غ���
		//A>B
		//A<B
		//A>=B
		//A<=B
		//A==B : ==�� 2�� ����ѰͿ� ���� ������
		//A!=B : ���� �ʴ���
		if(30 != 300)
		{
			System.out.println(600);
			System.out.println(700);
		}
		System.out.println(800);
		System.out.println(30 != 300);
		
	}
		
}
*/	
//ex14)
/*
public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println("ex");
		
		System.out.println(3*4+5);
		
		//����� ���ʿ��� ���������� ����Ǿ� 35�� ������ ������...����� �׷��� �ʴ�
		//������ ���� ������� ������ �������� ���� �켱������ ���� �����̴�.
		//����� 23�̴�.
		System.out.println(3+4*5);
		//���� 35�� ����� �ϰ� �;��ٸ� ��� �ؾ� �ϳ�?
		System.out.println((3+4)*5);
		
		int a=3,b=4,c=5,d=6;
		//3+20+6
		System.out.println((a+b)*(c+d));
	}
}
*/
//ex13)�ܿ��� �ϴ� �ڵ�***���� �� �����ض�**********************
/*public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println("ex13");
		//a��b <����Ÿ ��ȯ ���α׷�>exchange��� ��
		int a=10, b=20;
		int temp;
		System.out.println(a+" "+b);
		
		temp=a; //temp:10
		a=b;	//a:20 �� �ڵ� ������ a�� b�� ������.
		b=temp; //b:10
		System.out.println(a+" "+b);
	}
}
*/
/*
//ex)12
public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println("ex12");
		
		//ex1)����+����
		System.out.println(10+30);
		//ex2)����+���ڿ�=��������� ������ �Ѵ�. ���ڸ� �������ش�. ���ڿ�����
		System.out.println(10+"ȣ����");
		//ex3)���ڿ�+����=��������� ������ �Ѵ�. 
		System.out.println("ȣ����"+10);
		//ex4)���ڿ�+���ڿ�= ��������� ������ �Ѵ�.
		System.out.println("ȣ����"+"������");
		//ex5)������� �����̴�.
		System.out.println(30+40+"������");
		//ex6)���ڿ��� ������ ���� ����̾ȵȴ�.
		System.out.println("������"+30+40);
		//ex7)
		System.out.println(30+"������"+40);
		//ex8)
		System.out.println("30"+"40");//���ڿ� ����� �ϴ� ��
		//ex9)
		System.out.println(30+"40");	
		//ex10)
		System.out.println(30+" "+40);
		//ex11)
		int a=88, b=99;
		System.out.println(a+" "+b);
		//ex12):ū�� ���� ���α׷��̴�.
		//������ �ݵ�� ��𼱰� �ʱ�ȭ�� �־�� �Ѵ�.
		int apple;
		System.out.println(apple);
		//ex13):ū�� ���� ���α׷��̴�.
		//������ �ݵ�� ��𼱰� �ʱ�ȭ�� �־�� �Ѵ�.
		int a1=10,a2,a3;
		a3=a1+a2;
		System.out.println(a3);		

	}
}
*/

//ex)11
/*
public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println("ex11");
		
		//ex1)
		int a;//��������
		a=100;//���� �ʱ�ȭ
		System.out.println(a+100);
		
		//ex2)
		//��������� ���ÿ� �������� �ʱ�ȭ �Ѵ�.
		int b = 200;
		System.out.println(b-100);
		
		//ex3)
		int c =77;		
		System.out.println(c);
		//�� ���� ������ �Ǹ� �������� ������ �Ҿ� ������.
		//������ ���ο� ���� ����Ѵ�.
		c=88;
		System.out.println(c);
		
		c=99;
		System.out.println(c);
		System.out.println("-------------------------------");	
		//ex4)
		int d1=10;
		int d2=20;
		System.out.println(d1+d2);
		//ex5)
		int e1 =10, e2=20,e3=30;
		System.out.println(e1+e2+e3);
		e1=40;
		e2=50;
		System.out.println(e1+e2+e3);
	}
}
*/
//EX10)
/*public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("ex");
		short a=-50;
		//char�� ������ ����� �� ����.
		//��ſ� char�� ����� 2�� ����� �� �ִ�.
		//char b=-50;//Character
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println("-------------------------------");
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		
		//char�� Ư���� �뵵�� ���ȴ�.
		//��������� �ϱ����ؼ� ���Ǵ� ���� ���� �幰��.
		//����: ''���� ������ ǥ���Ѵ�.
		//���ڿ�:" "���� ������ ǥ���Ѵ�.
		//char�� Ư���� �뵵�� ���ڸ� ���Թޱ� ���ؼ� ���ȴ�.
		char c;
		//�̷��� �ְ� �Ǹ� ���������� c�� �ƽ�Ű �ڵ��ȣ 65�� ������.
		c='A';
		System.out.println(c);
		c='��';
		System.out.println(c);
		c=66;
		System.out.println(c);
		System.out.println("-------------------------------");
		c='Q';
		System.out.println(c);
		System.out.println((int)c);//Q�� �ƽ�Ű��ȣ�� ���� ���� ��
		c='��';
		System.out.println((int)c);//�ѱ��� �����ڵ�
	}
}
*/
//ex9)
/*
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("ex");
		byte apple;
		//-128 ~ +127
		apple = 127;
		System.out.println(apple);
		
		byte orange;
		orange=-128;
		System.out.println(orange);
		System.out.println("-------------------------------");
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println("-------------------------------");
		short melon;
		melon = 10;
		System.out.println(melon);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println("-------------------------------");
		int WM;//integer
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("-------------------------------");
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		
		
	}
}
*/
/*
//ex)8(�ϱ�)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.err.println("ex8");
		//byte�� �޸� 1�� �ּ���
		byte apple;
		//2�� �ּ���
		short aa;
		char bb;
		//4�� �ּ���.(����)
		int cc;
		//8�� �ּ���
		long dd;
		//34>> ���� 3.14 >>�Ҽ� 
		//4�� �ּ���(�Ҽ�)
		float ee;
		//8�� �ּ���(�Ҽ�)
		double ff;
		//1�� �ּ���
		boolean gg;
	}	
	
}
*/
//ex7)
/*
public class Hello 
{
	public static void main(String[] args) 
	{
		//�����̸� �۸��
		byte apple;
		//1.�����̸��� �ߺ��ؼ� �۸��� �� ����.
		//byte apple
		//2.��ҹ��ڴ� �����Ѵ�.
		byte banana100;
		//byte 9banana;
		//3.ù���ڸ� ���ڰ� �ƴ϶�� ���ڸ� ����� �� �ִ�.
		//4.
		//_,$�� ������ Ư�����ڴ� ����� �� ����.
		byte oran_ge;
		byte oran$ge;
		//byte oran#ge;
		
		//�ѱ��� ���������� ����� �� ������ ���Ѵ�.
		//������ ������, ���Ѵ�.
		byte ���;
		���=99;
		System.out.println(���);	
		//6.�� �ܾ� �̻����� �۸��ؾ� �� ��
		//ī��ǥ����� ����Ѵ�.
		byte AppleNumber;
	}
}

*/
//ex6)

/*public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println(100);
		//byte:��ǻ�;� ���� 1�� ��
		//byte:��ǻ�;� �޸� �Ѱ� ��.
		// �׸��� �� �޸� �̸��� apple�̶�� �ϰڴ�.
		//�޸𸮰� �ϴ� ������ ���ڸ� ����ϴ� �� ����� ����.
		//��ǻ�;� �޸� 1�� �ְ� �� �̸��� apple�̶�� �ϰڴ�.
		//��ǻ�;� �޸� 1�� �ְ� �����̸��� apple�̶�� �ϰڴ�.

		byte apple;
		//���� ���Կ����� ���ͷ� ��ɳ�
		apple=15;
		System.out.println(20);
		System.out.println(apple);
		System.out.println("---------------------------");
		
		byte banana;
		byte orange;
		banana=10;
		orange=20;
		System.out.println(banana);
		System.out.println(orange);
		System.out.println("---------------------------");
		System.out.println(banana + orange);
		System.out.println(banana - orange);
		System.out.println(banana * orange);
		System.out.println(banana / orange);
		System.out.println(banana % orange);
		
		
	}+
	
}
*/
//ex5)
/*
public class Hello 
{
	public static void main(String[] args) 
	{	//�ܼ�â�� �Ǵ� ���â�� �巡���ؼ� ������ �ٿ�����.(��ŷ)
		//ctrl+(+,-)
		System.out.println("������");
		System.out.println("�޹���");
		System.out.println("�䳢");
		System.out.println("------------------");//���м� ���۷���
		
		//����� �Ͼ�� �ִ�.
		//���)19
		System.out.println(15+4);
		//���ڿ� ����� ���̴�.
		//���)15+4
		System.out.println("15+4");
		System.out.println("------------------");
		//��Ģ�����̶�� ������, ��������̴�.
		System.out.println(17+4);
		System.out.println(17-4);
		System.out.println(17*4);
		//���� ����� �ȴ�.
		System.out.println(17/4);
		//�������� ��� �ȴ�.
		System.out.println(17%4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
*/
//ex4)
/*
 public class Hello 
{
	public static void main(String[] args) 
	{
		/*��ǻ�Ϳ��� ��� ����� ���� ��
		//System.out.println�� �̿��Ѵ�.
		//""���̿� ���� ����ϰ� ���� ���ڿ��� �ִ´�.
		���ڿ��̶� �Ѱ� �̻��� ���ڵ��� �����̴�.
		System.out.println("ȣ����1");
		System.out.println("ȣ����2");
		System.out.println("ȣ����3");
	}
	

}*/