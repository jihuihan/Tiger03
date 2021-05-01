package Pack;

import java.io.*;//별은 모든것이란 뜻의 와일드 카드
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;



//백업용
//ex)
/*
public class Hello {
	public static void main(String[] args) {	
		
	}
}
*/
//문제를 많이푼다?알고리즘을 공부하는 것 지금까지 배운거로 문제가 다 풀린다.
//상속은 보는 문법이다.
//자바공부 
//1.3장을 친구에게 가르쳐 줄수 있는가? 문법은 마스터 된 것
//2.자바 초급책->중급책
//백준 :문법을 잘 사용할 수 있다는 전제아래에서
//문제를 제시한다.>>해결 :알고리즘
//백준문제 푸는 것은 반대이다. 기본적으로 알고리즘 해결능력이 안되는데 푸는 것은 나중의 문제이다.
//우선은 자료구조책이나 알고리즘책을 먼저 마스터 하고 백준문제에 들어가는 것을 추천한다.
//자료구조,알고리즘 마스터가 되어있다는 전제하에 푸는 게 백준이다.
//삼성이나 현대 전산실에 개발부서로 들어갈 때 실기시험을 치는데....그때 백준 스타일 문제가 나온다.



//EX104)
//1.GIT접속
//2.로그인
//3.레파지토리를(저장) 생성
//4.나의 깃허브 주소 https://github.com/jihuihan/Tiger01

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
		System.out.println(num+"Thread 가 종료됨");
	}
}
class Tiger extends Thread{
	public void run() {
		System.out.println("tiger run");
		for (int i = 0; i < 4; i++) {
			System.out.println("접속대기");
			//클라이언트는 1초뒤에 접속할 것이라고 가정
			try {Thread.sleep(1000);} catch (Exception e) {}
			System.out.println(i+"번 유저가 접속됨=======================");
			
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
		t2.start(); // 호랑이가 라이언을 발동시킨다.
		System.out.println("호랑이가 발동되면 반드시 들어 온다.");
		int num = new Scanner( System.in ).nextInt();
		System.out.println("호랑이 종료");
	}
}
class Lion extends Thread{
	public void run() {
		System.out.println("사자가 발동되면 반드시 들어 온다.");
		int num = new Scanner( System.in ).nextInt();
		System.out.println("사자 종료");
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
		//사용1
		//System.out.println("숫자를 입력하세요");
		
		//for (int i = 0; i < 3; i++) {
			//int num = (new Scanner( System.in)).nextInt();
			//System.out.println("입력되 값은"+num);
		//}
		//System.out.println("프로그램이 종료됨");
		
		//사용2
//		Scanner scanner =new Scanner(System.in);
//		for (int i = 0; i < 3; i++) {
//			int num = (new Scanner( System.in)).nextInt();
//			System.out.println("입력되 값은"+num);
//		}
//		System.out.println("프로그램이 종료됨");
		
		//사용3
		while(true) {
			System.out.println("숫자를 입력하세요");
			int num=new Scanner(System.in).nextInt();
			if(num==999) {
				System.out.println("탈출되기 일보직전");
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
		System.out.println("숫자를 입력하세요");
		//키보드로부터 숫자를 입력받는 코드
		//방법1
		//int num = (new Scanner( System.in)).nextInt();
		
		//방법2
		Scanner scanner =new Scanner(System.in);
		System.out.println(100);
		//블로킹 함수(sleep) 더 이상 진행하지 않음<->넌블로킹
		int num=scanner.nextInt();
		System.out.println(200);

		System.out.println("호랑이1"+num);
		int num = (new Scanner( System.in)).nextInt();

	}
}
*/

/*
//ex99)
//누가 먼저 실행이되어도 전혀 프로그램에 영향을 끼치지 않는 프로그램을 작성할 때 쓰레드를 사용한다.
class Tiger extends Thread{
	//스레드를 사용하려고 하면Thread클래스의
	//메소드 한개를 반드시 오버라이딩해야 한다.부모와 자식 같은이름으로 쓰는 것
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("호랑이"+i);
			try {Thread.sleep(0);} catch (Exception e) {}//0엄청나게 짧은 시간 동안 쉬어라
		}
		
	}
}
public class Hello {
	public static void main(String[] args) {	
		System.out.println("메인 시작");
		Thread t = new Tiger();//업캐스팅
		t.start();//스레드 발동! 런이 실행될 수도 있고 이 아래가 실행될 수도 있다.
		for (int i = 0; i < 10; i++) {
			System.out.println("코끼리"+i);
			try {Thread.sleep(0);} catch (Exception e) {}//0엄청나게 짧은 시간 동안 쉬어라
		}
		System.out.println("메인 끝");
	}
}

*/
/*
//ex98)
class Tiger extends Thread{
	//스레드를 사용하려고 하면Thread클래스의
	//메소드 한개를 반드시 오버라이딩해야 한다.부모와 자식 같은이름으로 쓰는 것
	public void run() {
		System.out.println("스레드 시작");
		System.out.println("B run call");
		System.out.println("스레드 끝");
		
	}
}
public class Hello {
	public static void main(String[] args) {	
		System.out.println("메인 시작");
		//업캐스팅으로 객체가 생성되었다.
		Thread t = new Tiger();
		//스레드를 발동시킨다.
		//반드시 run()메쏘드를 호출하게 되었다.
		t.start();
		//main과 run은 프로그램이 같이 실행된다.
		
		//1초간 진행하지 마라 반드시try catch동반해야함
		try {Thread.sleep(1000);} catch (Exception e) {}//원래는 동시에 시작하려고 함.1초간 쉬고있으니까 run()(=위에꺼)가 실행됨
		System.out.println("메인 끝");
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
		System.out.println("스레드 시작");
		System.out.println("B run call");
		System.out.println("스레드 끝");
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
//test.txt라는 파일이 존재할 때 이 프로그램은 실행된다.
public class Hello {
	public static void main(String[] args) {
		
		//파일 입력
		System.out.println(3);
		 try {
			Reader r = new FileReader("test.txt");
			
			while( true ) {
				int readData = r.read();//글자 한개를 읽어들임.apple중 a
				char Data=(char)readData;//이  숫자(위가 int이므로) 코드값을 문자로 변환시켜주세요
				System.out.println(readData+":"+Data);
				if(readData == -1) {//읽을 글자가 없으면 -1을 리턴한다.
					System.out.println("모든 데이터를 읽었음");
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
			w.write("무궁화");
			w.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(2);
		
		//파일 입력
		System.out.println(3);
		 try {
			Reader r = new FileReader("test.txt");
			
			while( true ) {
				int readData = r.read();//글자 한개를 읽어들임.apple중 a
				char Data=(char)readData;//이  숫자(위가 int이므로) 코드값을 문자로 변환시켜주세요
				System.out.println(readData+":"+Data);
				if(readData == -1) {//읽을 글자가 없으면 -1을 리턴한다.
					System.out.println("모든 데이터를 읽었음");
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
		//파일 입출력:여러분이 파일을 만드는 것 혹은 만들어진 파일을 읽어들이는 것
		//음.......그렇군 내가 파일을 만드는군?
		//그렇다면 자바에서 어떤 표준 클래스를 나에게 제공해줄까???
		System.out.println(1);
		try {
			//싸인펜의 뚜껑을 연다.
			Writer w = new FileWriter("sample.txt");//sample text파일이 생성됨
			
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
			
			
			//싸인펜의 뚜껑을 닫는다.
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
		//파일 입출력:여러분이 파일을 만드는 것 혹은 만들어진 파일을 읽어들이는 것
		//음.......그렇군 내가 파일을 만드는군?
		//그렇다면 자바에서 어떤 표준 클래스를 나에게 제공해줄까???
		System.out.println(1);
		try {
			//싸인펜의 뚜껑을 연다.
			Writer w = new FileWriter("test.txt");
			
			//파일에 문자열을 출력
			w.write("apple");
			w.write("\n");//줄바꿈
			w.write("무궁화 당나귀 얼시구");
			w.write("\n");//줄바꿈
			w.write("파일 출력 끝");
			
			//싸인펜의 뚜껑을 닫는다.
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
		lion.setData("사자");
		System.out.println(lion.getData());
		//ex2)제네릭 문법
		class Dog<T>{
		T data;
		
		T getData() {
			return data;
		}
		void setData(T data) {
			this.data=data;
		}
	}
		Dog<Integer> dog=new Dog<Integer>();//Dog<Integer>//t를 내부적으로 인티저로 다 바꿈
		dog.setData(200);
		System.out.println(dog.getData());
		
		Dog<String>dog1=new Dog<String>();
		dog1.setData("강아지");
		System.out.println(dog.getData());
		
		Dog<Float>dog2=new Dog<Float>();
		dog2.setData(3.14f);
		System.out.println(dog2.getData());
		
		Dog<Boolean>dog3=new Dog<Boolean>();
		dog3.setData(false);
		System.out.println(dog3.getData());
		//제네릭문법으로 표준클래스를 만들어 사용했다.
		//LinkedList<Integer> mt = new LinkedList<Integer>(); 
}

}
*/
/*
//ex92)
public class Hello {
	public static void main(String[] args) {	
		//LinkedList<Integer> master =new LinkedList<Integer>;//LinkedList<Integer> 클래스 이름으로봐라
		LinkedList<Integer> mt=new LinkedList<Integer>();
		System.out.println(mt.size());//마스터씨 안에 인테져가 몇개가 있나요?
		//insert,add
		mt.add(99);//88라는 정수를 하나 넣음
		System.out.println(mt.size());//마스터씨 정수가 몇개 있나요?
		mt.add(88);//88라는 정수를 하나 넣음
		System.out.println(mt.size());//마스터씨 정수가 몇개 있나요?
		//0 11 22 33
		for (int i = 0; i < 10; i++) {
			mt.add(i*10+i);
		}
		System.out.println(mt.size());
		
		//(R)ead
		//Read의 방법 1(잘 사용하지 않음)
		System.out.println(mt);//아주머니가 가지고 있는 내용목록을 쭉 보여줌
		//Read의 방법 2
		System.out.println(mt.get(6));
		System.out.println("----------------------");
		//for (int i = 0; i < 12; i++) {
		for (int i = 0; i < mt.size(); i++){//아주머니가 가지고있는 사이즈
		//int num=mt.get(i);//몇번 째 주세요
		//System.out.println(num);
			System.out.print(mt.get(i)+" ");
		}System.out.println();
		//Read의 방법3
		//간단한 for문 forEach문
		for(Integer nn : mt) {//끄집어 낼 것 integer 무조건 아주머니가 가지고있는 사이즈만큼돈다 돌면서 끄집에 낸 것을 nn에 하나씩 저장한다.
			System.out.println(nn+" ");
	}System.out.println();
	
		//갑자기 ::배열을 소개합니다.
		//배열도 forEach문을 쓴다.
		int[]ar=new int [] {2,3,4,5,6}; //데이터를 초기화하여 배열 선언
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]+" ");
		}System.out.println();
		System.out.println("======================================");
		for(int data:ar) {
			System.out.println(data+" ");
		}System.out.println();
		
		//여기까지 무엇을 했나 Create ,Read
		//Update
		mt.set(5, 123456);//5번째 있는 데이터를 123456으로 바꿔주세요
		for(Integer nn:mt) {
			System.out.println(nn+" ");
		}System.err.println();
		
		//Delete>> Remove, erase
		mt.remove(2);
		for (Integer nn : mt) {
			System.out.println(nn+" ");
		}System.out.println();
		
		//55를 찾아서 삭제하세요
		for (int i = 0; i < mt.size(); i++) {
			int num = mt.get(i);
			if(num==55) {
				System.out.println(num+"찾았다");
				mt.remove(i);
				break;
			}
		}
		
		//CRUD를 이용한 데이타 관리 프로그램을 하면 콜렉션은 다한것인가? 자바책을 볼 수 있을정도 되었다.
}
}
*/
/*
public class Hello {
	public static void main(String[] args) {	
	//String:표준 클래스인데..
	//String의 메소드를 사용해보자....진짜 편한지
		//			0 123 456789
		String sss="무궁화꽃이피었습니다.";
		//char charAt(int index) 인수전달을 한개 해주세요. 차타입으로 리턴됩니다. 뜻 charAt 메소드의 리턴값은 char
		
		//ex1)
		System.out.println(sss.charAt(3));//뭔가 리턴이 된거니까 출력된것
		char ch=sss.charAt(3);
		System.out.println(ch);

		class MyString{
			char charAt(int index) {//문자가 리턴된다
				//index를 이용해서 위치한 문자를 찾는 코드만 작성하지 않았다.
				return '한';
			}
		}
		MyString ms=new MyString();
		System.out.println(ms.charAt(3));
		char ch1=ms.charAt(3);
		System.out.println(ch1);
		
		//ex2)
		System.out.println(sss.indexOf("화분"));//화꽃을 찾고 그 인덱스 반환
		
		int num=sss.indexOf("화꽃");
		if(num== -1) {
			System.out.println("못찾음");
			
		}else {
			System.out.println(num+"번째 있음");
		}
		System.out.println("__________________________");
		//ex3)int length()//리턴이 int가 됨 전달되는 인수는 없음.
		//1.사라진다.
		sss.length();
		//2.변수로 받는다.
		int size =sss.length();
		System.out.println(size);
		//3.출력으로 바로 연결
		System.out.println(sss.length());
		
		//ex4)
		System.out.println(sss.replace("꽃이", "나무가"));
		//주의하세요 (sss객체의 값은 안바뀐다....)
		System.out.println(sss);
		//
		//String replace() 스트링이 리턴된다는 뜻 바뀐 결과가ttt에 저장되어 리턴이 될 뿐이다.
		 String ttt = sss.replace("꽃이", "독수리");
		 System.out.println(ttt);
		
		 //ex5)substring
		 //"무궁화꽃이피었습니다."
		 System.out.println(sss.substring(2));
		 System.out.println(sss.substring(2,7));
				
		 //ex6)
		 String str="ApplE";
		 System.out.println(str.toUpperCase());//upper 대문자로 바꿔라
		 System.out.println(str.toLowerCase());
	}
}
*/
/*
//ex90)
public class Hello {
	public static void main(String[] args) {
		// 숫자 >> 문자열로 바꾸세요.
		int n1 = 1234;
		System.out.println(n1 + 1000);
		String s = Integer.toString(n1);
		System.out.println(s + 1000);
		
		// 문자열로된숫자가 있는데 >> 진짜 숫자로 바꾸세요.
		String s2 = "5678";
		System.out.println(s2 + 1000);
		int n2 = Integer.parseInt(s2);
		System.out.println(n2+1000);
		
		//int:4byte정수를 다루는 표준타입
		//Integer: 4byte 정수를 다루는 클래스이다.
		//클래스를 왜 사용합니까? 사용하기 편한 메소드를 제공하려고
		
		//int>>  랩퍼 (wrapper)   >>Integer
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
		
		//표준클래스에서 제공되는 메소드를 사용할려고 하는데
		//unhandle exception이 뜨게 되면
		//try catch를 생각하자.
		System.out.println("호랑이1");
		
		for(int i=0;i<5;i++) {
			
			//1초는 1000ms
			try {
				Thread.sleep(1000);//중단 컴퓨터야 일초동안 쉬어봐라 Thread 라는 클래스가 있다.
			} catch (Exception e) {
				
			}
		
			
			System.out.println(i);
			
		}System.out.println("호랑이2");
	}
}
*/




//ex88)
//ex88)
/*class A{
	void m1() {
		try {
			throw new Exception(); // 익셥션이 발생한다.			
		} catch (Exception e) {
			System.out.println("익셉션 발생");
		}
	}
	// throws Exception : 예외처리를 메쏘드 안에서 안하겠다.
	// 호시 m2()를 사용하는 놈이 있으면 그놈이 처리해라라는 뜻을 가진다.
	void m2() throws Exception{
		throw new Exception(); // 익셥션이 발생한다.	
	}
}

public class Hello {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		System.out.println("호랑이1");
		try {
			a.m2();			
		} catch (Exception e) {
			System.out.println("익셉션 발생2");
		}
		System.out.println("호랑이2");
	}
}
*/









/*
//ex87-1)예외처리 방법(면접 단골질문 종류 암기)
public class Hello {
	public static void main(String[] args) {	
		System.out.println("호랑이1");
		//기본형. try+ctrl space 첫번째 것 선택
		
		try {
			//예외가 발생할 수도 있고 발생하지 않을 수도 있다.
			int a = 16/0;
		}catch(Exception e) {
			//예외가 발생하면 catch로 들어간다. 발생하지 않으면 catch자체를 무시한다.
			//System.out.println("예외발생");
			e.printStackTrace();//익셉션의 종류를 출력해준다.(에러가 아니다.)
		}
		
		//ex1)ArithmeticException:수학적인 문제
		//예외(익셉션)이 발생하면 프로그램이 중단(종료)되어 버린다.
		System.out.println("호랑이2");
		System.out.println("-------------------------------------------");
		//어? 예외가 발생했네.>>프로그램 종료해야지>>잘못된 생각이다.
		//프로그래머가 해결을 하면 프로그램은 계속 진행할 것이다. 라는 의미이다.
		
		//ex2)Null Exception
		
		String s="코끼리";
		System.out.println(s);
		s="독수리 꽃이 피었습니다.";
		System.out.println(s.length());
		
		try {
			s = null;
			s.length();
			
		} catch (Exception e) {
			//System.out.println("예외발생");// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("호랑이3");
		//String s="코끼리";
		//System.out.println(s);
		//s="독수리 꽃이 피었습니다.";
		//System.out.println(s.length());//s의 길이를 출력 10자가 나옴
		//s=null;//아무것도 안넣는다. 객체 자체가 바람같이 사라져 버린다. 
		//System.out.println(s.length());//없을 무 
		
		//ex3)ArrayIndexOutOfBoundsException:잘못사용되고 있다.
		//0,1,2
		int[] ar=new int [3];
		ar[0]=10;
		System.out.println("문제 없음");
		try {
			ar[3]=20;
			
		} catch (Exception e) {
			System.out.println("Out of")
			;
		}
		System.out.println("호랑이4");
		
		
	}//>>>>>>>>>>여기가 종료
}
*/
//ex86-6)
//메소드에서 인수 전달이 필요할 때는 사용해야 하지만
//구태여 전달하지 않고도 동일한 프로그램이 작성된다면
//인수 전달은 하지 않는 것이 속도적인 측면에서 유리하다.
/*class Baduk{
	//필드를 만든다.
	int a;//이 인트는 멤버니까 생성자, 플레이,스탑에서도 쓸 수 있다.
	AI ai;//필드
	Baduk( AI ai ){//생성자
		//필드의 ai = 인수 ai;
		this.ai=ai;//인수로 전달된 ai를 대입시켜줌
		System.out.println("대국을 준비합니다.");
		ai.myName();
	}
	void play() {
		System.out.println("바둑경기를 시작합니다.");
		ai.play();
	}
	void stop() {
		System.out.println("바둑경기를 종료합니다.");
	//ai.stop();
	}
	
}
interface AI{
	void myName();
	void play();
}

class AlphaGo implements AI{
	public void myName() {
		System.out.println("인공지능은 알파고입니다.");
	}
	public void play() {
		System.out.println("알파고가 계산을 하고 있습니다.");
	}
}
class BetaGo implements AI{
	public void myName() {
		System.out.println("인공지능은 베타고입니다.");
	}
	public void play() {
		System.out.println("베타고가 계산을 하고 있습니다.");
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
		System.out.println("대국을 준비합니다.");
		ai.myName();
	}
	void play(AI ai) {
		System.out.println("바둑경기를 시작합니다.");
		ai.play();
	}
	void stop(AI ai) {
		System.out.println("바둑경기를 종료합니다.");
	//ai.stop();
	}
	
}
interface AI{
	void myName();
	void play();
}

class AlphaGo implements AI{
	public void myName() {
		System.out.println("인공지능은 알파고입니다.");
	}
	public void play() {
		System.out.println("알파고가 계산을 하고 있습니다.");
	}
}
class BetaGo implements AI{
	public void myName() {
		System.out.println("인공지능은 베타고입니다.");
	}
	public void play() {
		System.out.println("베타고가 계산을 하고 있습니다.");
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
		System.out.println("대국을 준비합니다.");
		ai.myName();
	}
	void play(AI ai) {
		System.out.println("바둑경기를 시작합니다.");
		ai.play();
	}
}
interface AI{
	void myName();
	void play();
}

class AlphaGo implements AI{
	public void myName() {
		System.out.println("인공지능은 알파고입니다.");
	}
	public void play() {
		System.out.println("알파고가 계산을 하고 있습니다.");
	}
}
class BetaGo implements AI{
	public void myName() {
		System.out.println("인공지능은 베타고입니다.");
	}
	public void play() {
		System.out.println("베타고가 계산을 하고 있습니다.");
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
	System.out.println("대국을 준비합니다.");
	ai.myName();
}

void play() {
	System.out.println("바둑경기를 시작합니다.");
}
}
interface AI{
 void myName();//코드 구현은 안하고 인터페이스만 제공하고 있네
}

class AlphaGo implements AI{
public void myName() {
	System.out.println("인공지능은 알파고입니다.");
}
}
class BetaGo implements AI{
public void myName() {
	System.out.println("인공지능은 베타고입니다.");
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
		System.out.println("대국을 준비합니다.");
		ai.myName();
	}

	void play() {
		System.out.println("바둑경기를 시작합니다.");
	}
}
abstract class AI{
	abstract void myName();
}

class AlphaGo extends AI{
	void myName() {
		System.out.println("인공지능은 알파고입니다.");
	}
}
class BetaGo extends AI{
	void myName() {
		System.out.println("인공지능은 베타고입니다.");
	}
}
class GammaGo extends AI{
	void myName() {
		System.out.println("인공지능은 감마고입니다.");
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
		System.out.println("대국을 준비합니다.");
		alphaGo.myName();
	}
	Baduk( BetaGo betaGo ){
		System.out.println("대국을 준비합니다.");
		betaGo.myName();
	}
	void play() {
		System.out.println("바둑경기를 시작합니다.");
	}
}

class AlphaGo{
	void myName() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

class BetaGo{
	void myName() {
		System.out.println("인공지능은 베타고입니다.");
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
		System.out.println("대국을 준비합니다.");
		System.out.println("인공지능은 알파고입니다.");
	}
	void play() {
		System.out.println("바둑경기를 시작합니다.");
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
		System.out.println("나는 부모B의 m1 메쏘드");
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
		System.out.println("어형");
	}
	public void walk() {
		System.out.println("어슬렁");
	}
}
class Lion extends B implements C, D, E{
	public void cry() {
		System.out.println("으러렁으러렁");
	}
	public void walk() {
		System.out.println("촐싹촐싹");
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
interface Tiger{//클래스와 클래스 사이는 extends 인터페이스와  클래스는 임플리먼트
	void m1();
	void m2();
}

class Lion implements Tiger{
	//부모(인터페이스)가 구현하지 못하는 것을 자식이 구현하는것implements
	public void m1() {//인터페이스를 구현하는 메소드 앞에는 반드시 public키워드를 붙여야한다.
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
interface 한국은행{
	 void 입금();//인터페이스 abstract안붙여도 디폴트로 붙여주다.
	 void 출금();
	 void 이체();
}
class 우리은행 implements 한국은행{
	 public void 입금(){
		 System.out.println("우리은행 입금입니다.");
	 };//세줄 인터페이스이다.
	 public void 출금(){};
	 public void 이체(){};
	 void 이자(){
		 System.out.println("이자는 년 5퍼센트입니다.");
	 };//이자를 추가해서 인기가 좋네
}

class 국민은행 implements 한국은행{
	public void 입금(){};//세줄 인터페이스이다.
	public void 출금(){
		System.out.println("국민은행 출금입니다.");
	};
	public void 이체(){};
	void 대출(){
		System.out.println("대출이자는 년 8퍼센트 입니다.");
	};//우리는 대출메뉴를 만들어서 사용할거야
}
public class Hello {
	public static void main(String[] args) {	
		우리은행 t1 = new 우리은행();
		t1.입금();
		t1.이자();
		국민은행 t2 = new 국민은행();
		t2.출금();
		t2.대출();
	}
}
*/
//ex82)
/*
public class Hello {
	public static void main(String[] args) {	
		abstract class 한국은행{
			abstract void 입금();//세줄 인터페스이다.
			abstract void 출금();
			abstract void 이체();
			}
		class 우리은행 extends 한국은행{
			 void 입금(){}//세줄 인터페이스이다.
			 void 출금(){}
			 void 이체(){}
			 void 이자(){}//이자를 추가해서 인기가 좋네
		}
		class 국민은행 extends 한국은행{
			 void 입금(){}//세줄 인터페이스이다.
			 void 출금(){}
			 void 이체(){}
			 void 대출(){}//우리는 대출메뉴를 만들어서 사용할거야
		}
	}
}
*/
/*
 //ex81)
public class Hello {
	public static void main(String[] args) {	
		abstract class 대장장이{
			void 칼() {
				System.out.println("멋진 칼");
			}
			abstract void 방패();
		}
		class 나그네1 extends 대장장이{
			void 방패() {
				System.out.println("멋진 방패");
			}
		}
		
		class 나그네2 extends 대장장이{
			void 방패() {
				System.out.println("크리스탈 방패");
			}
		}
		//대장장이 a=new 대장장이();
		대장장이 a =new 나그네1();
		a.칼();
		a.방패();
		
		대장장이 b =new 나그네2();
		b.칼();
		b.방패();
	}
}
*/

/*
public class Hello {
	public static void main(String[] args) {	
		abstract class A{
			//추상(abstract) 메소드
			//추상 클래스 이어야 한다.
			//추상 메쏘드
			//코드 작성이 미완성 되었다.완성은 자식이 시킨다.
			abstract void m1();
		}
		//부모가 미완성인 코드가 있으면 자식은 반드시
		//그 코드를 완성 시켜야 한다.
		//전문용어로 반드시 오보라이딩해야한다.
		class B extends A{
			void m1() {
				System.out.println(1);
			}
		}
		//앱스트렉 클래스는 객체를 생성 할 수 없다.
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
			//int a =10, String b="소나무, Tiger c =new Tiger();
			//void m1(Tiger t) {
				
			//}
		//}
		//Lion lion =new lion;
	//	lion.m1(10,"소나무",new Tiger());
	}
}

*/

/*다형성..활용 다양한 형태의 결과가 나오게 된다. 라고 해서 다형성

public class Hello {
	public static void main(String[] args) {	
		class A{}
		class B extends A{}
		A a=new B();
		
		class Animal{
			void cry()
			
		}
*/

//ex76)제일 중요 /다형성 
/*public class Hello {
	public static void main(String[] args) {	
		class A{
			void m1() {
				System.out.println(1);
			}
			//오버로딩
	//		void m1(int a) {
		//		System.out.println(1);
			//}
			
			//오버라이딩 부모메소드이름이랑 자식메소드 이름이 똑같은 것.
			void m3() {
				System.out.println(31);
			}
		}
		class B extends A{
			
			void m2() {
				System.out.println(2);
			}
			//오버라이딩
			void m3() {
				System.out.println(32);
			}
		}
		//밑에 한줄은 B와 어떤관계???아무 관계가 없다.
		//1.부= 부 자식꺼 안쳐다본다.
		A a=new A();
		a.m1();
		a.m3();
		
		//2.자=자
		B b=new B();
		b.m1();//부모의 것도 쓴다.
		b.m2();
		b.m3();//32
		
		//3.부=자;가 성립이됨.//부자관계(업캐스팅) 1.자식을 쳐다보고 있으면 자식 것을 보고 없으면 내것을 쓴다.
		A c=new B();
		c.m1();//자식에 없네 내꺼해야지1
		c.m3();//32 

		//4. 자=부;// 자바에서는 성립이 안됨(혹시나 성립이 된다면 다운캐스팅이라고 한다.)문법 에러가 뜬다.
		
	}
}

*/



/*
//ex75)디폴트로 만들어지는 코드들
public class Hello {
	public static void main(String[] args) {	
		//class Tiger{
			
		//}
		//class Lion extends Tiger{
			
	//	}
		class Tiger{
			//Tiger(){} 내가 안만들면 디폴트로 생성자를 만든다.
			
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
				//주의!super는 반드시 생성자 함수의 첫줄에만 적을 수 있다.
				//super(10);//생략 하지않고 적어놓는게 좋다.
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
		Lion t=new Lion();//당연히 부모 타이어도 객체가 생성이 된다.부모 생성자가 먼저 호출이 되고 자식 생성자가 호출이된다.
		//부모 생성자가 호출되고나서 자식 생성자가 호출???
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
		//		super();//부모 생성자를 호출하세요, 없으면 자동으로 생성된다.디폴트로 삽입이 된다. 생략된 형태
				System.out.println(2);
			}
		}
		Lion t=new Lion();//당연히 부모 타이어도 객체가 생성이 된다.부모 생성자가 먼저 호출이 되고 자식 생성자가 호출이된다.
		//부모 생성자가 호출되고나서 자식 생성자가 호출???
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
//static int num=0; 컴파일되면 위로 올라온다. 클래스 안에는 없다.
//class안에는 count만 있는것이나 다름없다.
/*class Tiger{
	static int num=0;
	int count;
}

public class Hello {
	public static void main(String[] args) {	
		//여기서 이미 NUM은 만들어져있다.
		Tiger t1= new Tiger();//자기 자신의count라는 변수를 만든다.
		Tiger t2= new Tiger();//자기 자신의 count라는 변수를 만든다.t1,t3와 다르다.
		Tiger t3= new Tiger();//자기 자신의 count라는 변수를 만든다.t1,t2와 다르다.
		t1.count++;//1
		System.out.println(t1.count);//1출력
		t2.count++;//
		System.out.println(t1.count);//t2를 증가시키고 나서 t1을 확인해봐야 t1에는 영향을 안끼친다.
		System.out.println("_________________________________________");
		t1.num++;//t123모두 동일한 메모리를 쓴다.
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
	//static 변수는 반드시 값이 초기화 되어야 한다.
	static int num = 10;
	int count = 20;
	
	static void m1() {
		System.out.println(1);
	}
	void m2() {//객체 생성안한다는 가정하에 쓸 수 없다.// count랑 m2는 new를 이용한 객체 생성이 아니면
											 //사용 못한다.
		
	}
	//10
	//1
	static void m3() {//객체 생성안한다는 가정하에 쓸 수 있다.
		System.out.println(num);
		m1();
		//에러가 뜬다.
		//System.out.println(count);//static이 아니기 때문에 쓸 수 없다.
		//이게 에러 뜬다. static void메소드는 스테틱으로 선언된 것만 쓸 수 있다.
		//m2();
	}
}
public class Hello {
	public static void main(String[] args) {	
		System.out.println(Tiger.num);//객체를 생성시키지 않고도 쓸 수 있다.
		Tiger.m3();
		//Tiger.m2()//static이 아니기 때문에 에러
		
	//	Tiger t= new Tiger();
	//	System.out.println(t.count);//static이 없으므로 호출 불가
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
		//static안붙였으므로 메소드를 직접사용할 순 없다.
		Hello h = new Hello();
		h.method();
		System.out.println(h.num);
	}
}
*/


//main을 호출하는 주체는 운영체제(즉 OS)
//Hello.main();static으로 메모리가 있기 때문에 os에서 호출할 수 있다.
/*public class Hello {
			//필드
	static int a= 100;//static이 안붙으면 그냥 틀일 뿐이라 아래 메인메소드에서 사용하지 못함.
			//생성자
			//Hello(){}
			//메쏘드
	static void method(){
		System.out.println("콜");
	}
	public static void main(String[] args) {
		//static함수 안에서 사용되는 모든것들은 static이어야 한다.
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
	 	System.out.println("나는 스테틱");
	}
}

public class Hello {
	public static void main(String[] args) {	
		//클래스는 설계도이기 때문에
		//객체를 생성시키기(new사용) 전에는 사용할 수 없다.
		//그런데 static키워드를 사용하면 
		//객체를 생성시키지 않고도 사용할 수 있다.
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
				System.out.println("부모 메소드");
			}
			
		}
		class Banana extends Apple{//is a에 위배되나 편의상 적음
			void m2() {
				System.out.println("자식 메소드");
			}
			void m3() {
				System.out.println(4);
				super.m2();//이름이 중복되더라도 부모것을 실행
				
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
			void m2() {//2번도 1번을 부를 수 있느냐
				m1();
				System.out.println(2);
				
			}
			void m3() {//3번이 2번을 부를 수 있느냐
				m2();//this.m2();
				System.out.println(3);
			}
			//조심.
			void m4() {	
				m5();
				System.out.println(4);
			}
			void m5() {				
				m4();
			System.out.println(5);
		}
			//자신이 자신을 호출하는 것을 전문 용어로 재귀호출이라고 한다.
			//프로그램을 잘만 짜기만 한다면 사용할 수 도있다.
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
		//t.m4();무한루프에 빠진다.
		//t.m6();
	}
}
*/
/*
//ex64)
public class Hello {
	public static void main(String[] args) {	
		//이 클래스를 만든 사람을 찾을 수가 없다.
		//클래스를 만드는 원칙에서는 틀린 것이다.
		//is a 관계가 성립하지 않음. 성립되지 않으면 작명을 잘못한 것이다.
		
		//안드로이드는 핸드폰이다.
		//아이폰은 핸드폰이다.
		//윈도우폰은 핸드폰이다.
		class Rectangle{
			void draw1() {
				System.out.println("사각형을 그립니다.");
			}
		}
		class Triangle extends Rectangle{
			void draw2() {
				System.out.println("삼각형을 그립니다.");
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
				System.out.println("걸어갑니다.");
			}
		}
		//자식은 부모이다.(is a 관계의 클래스) 고양이는 동물이다.
		class Cat extends Animal{
			
			void cry() {
				System.out.println("야옹");
			}
		}
		//강아지는 동물이다.
		class Dog extends Animal{
			
			void cry() {
				System.out.println("멍멍");
			}
		}class Tiger extends Animal{
			void cry() {
				System.out.println("어흥");
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
			System.out.println(20);//자기 것을 먼저 뒤져본다.없으면 부모 것을 뒤진다.
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
			Tiger method() {//뭔가 리턴이 된 함수
				return this;//아래t가 리턴 된 것임
			}
		}
		Tiger t= new Tiger();
		Tiger t1= t.method().method().method();//이 자리에 this가 왔다. 결국 t를 사용한다는 것은 안의 멤버를 사용한다는 뜻. 이 코드는 공중분해되지 않음
		//				t1= t.method().method().method();			//자꾸 나 자신(t)을 리턴함. 맨 마지막에 리턴된 this는 사용안하고 공중분해됨(리턴값을 안받기 때문에)
		
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
	 t.method(10,"호랑이",new Tiger());
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
				return this;//밑에 있는 t를 리턴하겠다.
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
		//체이닝 기법.
		t3.m1().m2();//사용할 수 있는 방법이 세가지가 있다. 사용안해서 공중에 사라지기 일보직전까지 리턴을 받았다
		t3.m1().m2();//사라지기 직전에 함수를 호출 할 수 있다.
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
				return "호랑이";
			}
			Tiger m3(){//tiger객체를 리턴할 수 있다.
				Tiger ttiiggeerr=new Tiger();
				return ttiiggeerr;//타이거 객체를 리턴하세요
			}
		}
		Tiger t= new Tiger();
		//100을 출력하기 위해서 출력코드에 걸었다.
		System.out.println(t.m1());
		//문자열이 리턴됨
		System.out.println(t.m2());
		//리턴받은 객체 이름을 num이라고 하겠다.
		Tiger num = t.m3();
		//num이나 ttiiggeerr이나 동일한 놈이다.
		//1.num.m1();리턴된 값을 무시하는 것
		//2.int n = num .m1();변수를 받아서 사용하는 방법
		//3.syso(num.m1())출력코드에 바로 연결하는 방법
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
				System.out.println("사자");
			}
		}
		class Tiger{
			void m1() {
				System.out.println(1);
			}
			//int a = ; 누군가가 던져주기를 기다림
			void m2(int a) {
				System.out.println(2);	
			}
			//String s =;누군가가 던져주기를 기다림
			void m3(String s) {
				System.out.println(3);
			}//Lion lion =; //new Lion();
			//객체를 인수전달하고 있다.
			void m4(Lion lion) {
				System.out.println(4);
				lion.myNameIs();
			}
		}
		Tiger t=new Tiger();
		t.m1();
		t.m2(10);
		t.m3("호랑이");
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
				this.x=a;//구분이되기 때문에 this 생략이가능
				this.y=b;
			}
		}
		Tiger t1=new Tiger(10,20);
		System.out.println(t1.x+" "+t1.y);
		System.out.println("============================");
		class Lion{
			int x,y;//필드를 초기화하지않으면 디폴트 값이 0 ,자기대입이라 초기화가 안된다.
			//처음부터 이름을 똑같이 짓지 말지..흔하게 쓰인다.
			Lion(int x, int y){
				//인수x=인수x;
				//인수y=인수y;
				this.x=x;//자기대입/자기자신의 멤버를 가르킨다 this.x
				this.y=y;//자기대입
			}
		}
		Lion t2= new Lion(10,20);
		System.out.println(t2.x+" "+t2.y);//this가 태어나면 이것
		
		int a =3;
		//코드로서의 하등의 가치가 없다.
		a=a;//자기대입
	}
}
*/
/*
public class Hello {
	public static void main(String[] args) {
		//this는 클래스 안에서만 사용할 수 있는 키워드이다.
	
		class Tiger{
			void method1() {
				//결국 this는 앞으로 만들어질 객체를 의미한다.
				System.out.println("2:"+this.hashCode());
			}
		}
		//this=t1객체입니다.
		Tiger t1=new Tiger();
		System.out.println("1:"+t1.hashCode());//민증번호
		t1.method1();
		
		//this=t2객체입니다.
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
		//9.프로그래머가 생성자를 만들지 않으면
		//생성자는 자동으로 만들어 진다.
		//그렇다면 프로그래머가 생성자를 만들면
		//자동으로 안만들어 준다.
		//프로그래머는 안쓰더라도 디폴트 생성자를 미리 만들어놓는다.
		//혹시나 생성자를 추가 할 수도 있기 때문에
		class Tiger{
			Tiger(){}
			Tiger(int a, int b){
				
			}
		}
		//여기서는 디폴트 생성자를 만들지 않으면
		//t2객체를 생성할 때 에러가 뜬다.
		Tiger t1= new Tiger(10,20);//인수전달을 하지 않는 함수(생성자)를 호출해라라는 뜻
		Tiger t2=new Tiger();//생성자를 만들었기 때문에 디폴트 생성자가 만들어지지않는다.
	}
}
*/


//ex51)
/*
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			int aa,bb;
			//생성자 메쏘드, 생성자 메쏘드, 생성자 메쏘드..
			//생성자도 메소드이다. 나도 오버라이드 할 수 있다.
			//생성자는 리턴이 없다. 전달 인수는 다르게 할 수 있다.
			Tiger(){
				System.out.println("생성자콜1");
			}
			Tiger(int xx, int yy){
				System.out.println("생성자콜1");
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
		Tiger t3 =new Tiger(1000,2000);//객체생성시 원하는 값을 넣고 초기화 할 수 있다.
		t3.show();
	}
}

*/

//50)
/*
public class Hello {
	public static void main(String[] args) {
		// 8. 생성자를 사용하는 목적 : 멤버 필드 초기화가 목적
		class Tiger{
			int aa, bb;
			Tiger(){
				System.out.println("생성자 콜");
				aa = 10;
				bb = 20; // 이게 생성자의 목적달성 끝이다.
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
			//1.필드
			//2.생성자
			//1)생성자도 일종의 메소드(함수)이다.
			//2)메소드 이름은 반드시 클래스 이름과 동일해야한다.
			//3)생성자는 return값을 가질 수 없다.(무조건) 리턴값이 없으므로void조차도 코딩하지 않는다.
			//4)생성자는 프로그래머가 호출 할 수 없다.(자동호출된다.)
			//5)자동호출되는 시점은 객체가 생성될 때 호출된다.
			//6)객체를 생성시키는 키워드 new를 사용할 때 호출된다.
			//7)프로그램에서 객체(인스턴스) 한개당 단 한번만 생성자를 호출할 수 있다.
			Tiger() {
				System.out.println("호랑이");
			}
			//3.메소드
			void methoid01() {}
	}
		System.out.println(1);
		Tiger t1=new Tiger();//>>이 시점에서 생성자가 자동으로 호출되었다.
		System.out.println(2);
		Tiger t2=new Tiger();//>>이 시점에서 호출되었다.
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
					System.out.println("분모가 0이 될 수 없습니다.");
					return;//여기서 함수를 탈출하세요
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
				System.out.println(a+" "+b);//클래스 내부이기때문에 가족끼리 쓸 수 있다.
			}
			void showMeTheALLField(int c) {
				System.out.println(a+" "+b+" "+c);//클래스 내부이기때문에 가족끼리 쓸 수 있다.
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
		//면접질문 1순위임.메소드 오버로딩에 대해 설명해봐라
		//메소드 이름은 중복해서 작명할 수 없지만
		//인수의 개수가 다르거나, 인수의 타입이 다를 때는
		//메소드 이름을 중복해서 작명할 수 있다.
		//이것을 전문용어로 메소드 오버로딩이라고 한다.
		System.out.println("ex");
		class Tiger{
			void apple() {
				System.out.println(1);
			}
			
			//함수이름을 중복해서 사용할수도 있다.
			//조건만 맞다면:
			//조건1.전달되는 인수의 개수가 다르면 된다.
			void apple(int a) {
				System.out.println(2);
			}
			void apple(int a, int b) {
				System.out.println(3);
			}
			//조건2. 전달되는 인수 개수가 같더라도
			//표준타입이 다르면 된다.
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
		//(int)를 전문 용어로 타입캐스팅
		lion.apple((int)10);//int로 가라
		lion.apple((long)10);//long으로 가라
		lion.apple((int)3,4);
		lion.apple((long)3,4);
		
	}
}

*/
//ex45)
/*public class Hello {
	public static void main(String[] args) {	
		//표준타입
		int a =10;
		char b = '한';//문자
		//1개 이상은 문자열이다. 영어로string
		//첫자는 대문자.
		
		//자바에서 제공되고 있는 표준 클래스 String
		String c="무궁화 꽃이 피었습니다.";//쓰기 쉽도록 이렇게 쓴다.
		
		//클래스를 만들 때 이 문법 아닌데요?
		String d = new String("민들레꽃이 피었습니다.");//(내부적으로는 이렇게 쓰는 것)이렇게 써도되는데 
		
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
		t.m1(10, 20, "독수리가 날아갑니다.", '한');
	}
}
*/
/*
//ex44)
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			int m1(){//int형은 반드시 리턴값을 가진다.
				if(false) {
					System.out.println(1);
					return 100;//함수 탈출
				}else {
					System.out.println(2);
					return 200;//함수 탈출
				}
			}
				//System.out.println(1234); 실행이 안됨 함수 탈출하기 때문에
				int m2(int num){//int형은 반드시 리턴값을 가진다.
					if(num%2==0) {
						System.out.println("인수는 짝수입니다.");
						return 100;//함수 탈출
					}else {
						System.out.println("인수는 홀수입니다.");
						return 200;//함수 탈출
					}
				
				
			}
		}
		Tiger t=new Tiger();
		System.out.println(t.m1());
		System.out.println(t.m2(10) * 3);
		System.out.println(t.m2(11) * 3);
		//Tiger t = new Tiger();
		//t.m1();//리턴값 무시
		
	}
}
*/
//ex43)
/*
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			//메소드 기본꼴 4가지
			void m1() {}
			void m2(int num) {}//인수전달하고 리턴값 없음
			int m3() {return 0;}//인수전달 안하고 리턴
			int m4(int num) {return 0;}//인수전달도 하고 리턴값도 있음
			
			//메소드의 확장
			//void m5(int a, b, c){<<이건 에러가 뜬다.
			void m5(int a,int b, int c) {
				System.out.println(a*b+c);
			}
			
			int m6(int a , int b) {
				//System.out.println("호랑이");
				return a*b;
			}
			
			int m7(int a, int b) {
				int sum =1;
				for (int i = 0; i < b; i++) {
					//반복 횟수b만큼 2를 곱한다.
					//sum = sum*2;
					
					//반복 횟수 b만틈 a를 곱한다.
					//a를 b횟수만큼 곱한다.
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
//복습필수
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		class Tiger{
			//기본형 1:void는 없다라는 뜻을 가진다.
			//리턴값이 없다.
			void method01() {
				System.out.println(1);
				
			}
			//기본형2
			//값을 전달하는 것을 '인수'(파라메트)를 전달한다.
			void method02(int num) {
				System.out.println(2);
			}
			//기본형3:리턴이 되는데 그 리턴되는 메모리 크기는 int이다
			//죽었다가 깨어나도 return이라는 글자가 있어야 한다.
			int method03() {//리턴값이 있을때는void를 빼고 리턴형을 써준다.
				System.out.println(3);
				return 1234;//메소드는 return을 만나면 함수를 탈출합니다.
				//System.out.println(4);//절대로 실행되지 않는 코드
			}
			//기본형4
			int method04(int num) {//인수전달도 받고 리턴값도 있고
				System.out.println(4);
				return num*10;
			}
		}
		
		Tiger t1=new Tiger();
		t1.method01();
		t1.method02(1000);
		//리턴값 안받모양꼴
		t1.method03();
		//2.리턴값 받는 모양꼴
		int nn=t1.method03();
		System.out.println(nn);//받은 nn
		//3.받아서 출력에 바로 연결한다.
		 System.out.println(t1.method03());
		//주의하자 리턴도 없는 놈을 자꾸 받으려고 하면안된다.
		 //System.out.println(t1.method01());
		 //int tt =t1.method01();
		 
		 //4.
		System.out.println("===================================");
		t1.method04(7);//리턴값 받기 싫으면 안받는 문법 
		//아래 받아서db에 저장하고나서 출력문으로 출력해봄
		int db = t1.method04(7);//db는 열배 뻥된 값을 가진다.
		//리턴된 값을 확인해보자
		System.out.println(db);
		
		//리턴된 값을 출력에 바로 연결.
		System.out.println(t1.method04(9));
	}
}
*/
//ex41)메쏘드, 함수(function)
/*
public class Hello {
	public static void main(String[] args) {	
		class Tiger{
			//int num =7;
			void cry(int num) {
				for (int i = 0; i < num; i++) {
				 	System.out.println("멍"+i);			
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
			//3.메쏘드 :apple은 메쏘드 이름이다.
			//왜 메쏘드 호출이 실행이 안되느냐?클래스 안에 작성된 것은 설계도이다.
			void apple() {
				System.out.println("메쏘드 호출");
			}
			
			void banana(){//함수
					System.out.println("바");
					System.out.println("나");
					System.out.println("나");
			}
		}
		Tiger tiger = new Tiger();
		System.out.println(1);
		//apple()이라는 메소드를 부른다.(콜:호출)
		tiger.apple();//괄호 열고닫고
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
		//디폴트 값은 0이 초기화된다. 아무것도 안넣었을 경우 
		System.out.println(t1.a +" "+t1.b);
		
		class Lion{
			int a=100,b=200;
		}
		Lion l1=new Lion();
		//디폴트 값은 0이 초기화된다. 아무것도 안넣었을 경우 
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
		//변수
		int a;//4byte의 메모리를 받는다.
		int b,c;
		//가족(집),패밀리,멤버(자주 사용되는 용어)
		class Tiger{
			//2.필드(field)
			int a;//메모리를 달라고 하는 것은 맞는다.(여기서 실제로 받는 것은 아님. 받을 것이라고 설계도에 기록 해놓는 것)집안에 있는 a과 외부에있는 a은 다른사람이다.
			int b,c;
			
		}
		//이때 메모리를 받은 것이다.
		Tiger t1 = new Tiger();//()를 잊지말자.
		//도트를 이용하는 것을 체이닝(chaining)이라고 한다.
		t1.a=10; 
		t1.b=20;
		t1.c=30;
		System.out.println(t1.a);
		System.out.println(t1.b+t1.c);
		System.out.println("===================================");
		Tiger t2= new Tiger();//()를 잊지말자
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
		lion.c ='한';
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
		//클래스 이름은 첫자를 대문자로 작성하는 것이 관례이다.
		//관례 = 암묵적인 약속
		class Tiger{
			//1.생성자(construtor)
			
			//2.필드(field)
			
			//3.메소드(method)
			
		}
		
		
		
	}
}


//ex36)
//여기 위치에서 클래스를 만드는 것이 정석이다.
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		//여기서 테스트를 해도 무방하다. 16번 위치에 써야하는 것이지만
		//테스트를 여기다 하겠다.
		
		// 클래스를 만들었다.
		class Airplane{//클래스: 만들기 클래스 클래스 이름
			
		}
		
		// 객체를 만든다.
		//참고:int[]ar=new int[4];와 유사하다.
		Airplane air747 = new Airplane();
		Airplane air748 = new Airplane();
		Airplane air749 = new Airplane();
		//객체의 고유번호가 출력된다.(민증번호) 태어날 때는 민증번호를 가지고 나온다
		System.out.println(air747.hashCode());
		System.out.println(air748.hashCode());
		System.out.println(air749.hashCode());//hashcode민증번호출력
	}
}
*/
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		
		int[] ar = new int[7];
		
		for(int i=0;i<ar.length;i++) {//배열 안에 램덤하게 데이터넣고
			ar[i]=new Random().nextInt(100); 
		}
		for(int i=0;i<ar.length;i++) {//출력
			System.out.println(ar[i]+" "); 
		}System.out.println();
		System.out.println("===================================");
		
		for (int i = 0; i < 7; i++) {
			for (int j =0; j < 7; j++) {
				System.out.print("["+i+" "+j+"]");
			}System.out.println();//줄바꿈
		}System.out.println("===================================");
		for (int i = 0; i < 7; i++) {
			for (int j = i+1; j < 7; j++) {
				System.out.print("["+i+" "+j+"]");
			}System.out.println();//줄바꿈
		}System.out.println("===================================");
		//순차 정렬을 하는 프로그램 알고리즘(중요중요)
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
		//그 결과를 출력한다.
		for(int i=0;i<ar.length;i++) {//출력
			System.out.print(ar[i]+" "); 
		}System.out.println();
		
		
	}
}
*/
//ex34)
/*public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		//외부에서 끌어와서 사용되는 명령들은 ctrl space를 이용하자
		//커서가 m뒤에 오게해서ctrl space 
		//new Random().nextInt(10);
		//10을 설정하면 : 0 ~ 9까지 숫자 중에서 1개를 넣어준다. num에
		//ex1)1번이 많이 사용됨 변수안에 저장해서 활용.
		int num = new Random().nextInt(100);
		System.out.println(num);
		
		//ex2)
		//랜덤하게 숫자를 뽑아서 출력으로 연결시킨다.
		System.out.println(new Random().nextInt(10));
		System.out.println("=======================");
		
		//ex3)일반적으로 이 방법을 쓴다. 변수를 받아서 쓴다.
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
		
		//8개가 확보가 된다.
		int[] ar=new int[] {3,4,5,7,8,1,3,9};
		System.out.println(ar[2]);
		System.out.println(ar[7]);
		
		//약간의 수정
		System.out.println("배열의 개수는"+ar.length);
		for (int i = 0; i < 8; i++) {
			System.out.print(ar[i]+" ");
		}System.out.println();
		System.out.println("===========================");
		for (int i = 0; i < ar.length/2; i++) {
			//System.out.println("호랑이");
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
		
		//배열(array)
		//short[] test =new short[10];
		//미친듯이 주의하자.
		//사용하는 번호가 0번부터 사용하기 때문에 0번부터 4번까지만
		//쓸 수 있다. 5번사용 못한다. 6번은 더 못한다.
		int[] ar=new int[5];
		ar[0]=10;//첫번째 것 사용
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
		//ar[5]=60;안된다
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]+" "+ar[4]);
		
		System.out.println(ar[2]+ar[4]);//배열끼리 덧셈 가능
		System.out.println("===========================");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(ar[i]+" ");
		}System.out.println();
		
		System.out.println("호랑이");
		//무슨프로그램을 짤지는 모르겠지만
		//밑에서 변수가 40개 필요합니다.
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
		System.out.println("호랑이");//줄바꿈만 일어난다(캐리지 리턴)
		
		//ex2)이중 for 또는 다중for 너무 중요
		for(int i=0;i<3;i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("["+i+" "+j+']');
			}System.out.println();
		}
		System.out.println("호랑이");
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
			System.out.println("소나무");
			break;
			
		case 1:
			System.out.println("중나무");
			break;
			
		case 2:
			System.out.println("대나무");
			break;
			
		default:
			System.out.println("민들레");
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
		//1. 암기 case에 동일한 숫자가 있으면 안된다.
		//2. case 뒤에는 변수가 올 수 없다.
		//3. break;를 빼먹지 말자.
		int num=20;
		int test=10;
		switch(num) {
		case 10://여기에 case test: 이라고 할 수 없다.
			System.out.println("호랑이");
			break;//switch문장이 끝났습니다.
		case 20:
			System.out.println("코끼리");
			break;//switch문장이 끝났습니다.
		case 30:
			System.out.println("독수리");
			break;//switch문장이 끝났습니다.
		default:
			System.out.println("난 디폴트");
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
		b=a++;//대입 증가<-반대개념->증가 대입(++a)
		System.out.println(a+" "+b);
		

		int c=3, d;
		d=++c;//대입 증가<-반대개념->증가 대입(++a)
		System.out.println(c+" "+d);
	}
}
*/
/*
//ex26)우박수 출력 프로그램(콜라츠 알고리즘)//기본꼴
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		
		int num =2021;
		while(true) {
			System.out.println(num);
			
			if(num % 2==0) {//짝수 입니까
				num=num/2;
			}else {
				num=num*3+1;
			}
			if(num==1) {
				System.out.println("앗1이다. 탈출");
				break;		
			}
		}
		System.out.println("호랑이");
	}
}
*/
//ex25)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		
		//ex1)
		//무한반복
		//int count =0;
		//while(true) {
		//	System.out.println("호랑이"+count);
		//	count++;
		//}

		//ex2)
		int count =0;
		while(count<10) {
		System.out.println("호랑이"+count);
		count++;
		}
		System.out.println("탈출됨");
		System.out.println("===========================");		
		//ex3)
		count =0;
		while(true) {
			System.out.println("호랑이"+count);
			count++;
			if(count==3) {
				System.out.println("탈출되기 일보직전"+ "");
				break;
			}
		}
		System.out.println("탈출됨2");
}

}
*/
//ex24)
/*public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		//합산 프로그램
		int sum = 0;
		for (int a = 1; a <= 10; a++) {
			sum=sum+a;
			
	//a:1>>1 >>0+1
	//a:2>>3 >>0+1+2
	//a:3>>6 >>0+1+2+3
	//a:4>>10>>0+1+2+3+4
	//a:5>>15>>0+1+2+3+4+5
			
		}
		System.out.println("합"+sum);
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
		//2의 승수, 2의 N승
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
		//원하는 구구단 출력 프로그램(암기)
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
		num++;//단항연산 num=num+1문장과 완전 동격이다.
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
			//System.out.println("호랑이"+10);
			System.out.println("호랑이"+a);
		}
	}
}
*/
//ex21)
/*
public class Hello {
	public static void main(String[] args) {	
		System.out.println("ex");
		
		//ex1)4회 반복
		System.out.println("start");
		for(int a=0;a<4;a=a+1) {
			System.out.println(a);
		}
		System.out.println("end");
		
		//ex2)10회 반복 for문안에 변수는 위의것과 겹쳐도 상관없다.
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
		//n개중에 반드시 1개가 선택된다.
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
			System.out.println("A입니다");
		}else if(jumsu>=80) {
			System.out.println("B입니다");
		}else if(jumsu>=70) {
			System.out.println("c입니다");
		}else if(jumsu>=60) {
			System.out.println("D입니다");
		}else {
			System.out.println("F입니다.");
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
											//결과
		System.out.println(false||false); 	//false
		System.out.println(false||true);	//true	
		System.out.println(true||false);	//true
		System.out.println(true||true);		//true
		System.out.println("===========================");
		
		int key =0 , money=10000;
		if(key > 0 || money>15000) {
			System.out.println("성문을 오픈합니다.");
		}else{
			System.out.println("성문을 오픈 할 수 없습니다.");
			if(key<=0) {
					System.out.println("키를 준비하세요");
			}
			if(money<15000) {
					System.out.println("돈을 준비하세요");
			}
		}
		System.out.println("===========================");
		//논리AND								//결과
		System.out.println(false && false); //false
		System.out.println(false && true);	//false	
		System.out.println(true && false);	//false
		System.out.println(true && true);	//true
		
		int a =1 , b=5000000;
		if(a > 0 && b>15000) {
			System.out.println("성문을 오픈합니다.");
		}else{
			System.out.println("성문을 오픈 할 수 없습니다.");
		
		}
		// (+)					 (*)곱하면 중간에 값이나옴
		//A || B(0:false 1true) A && B		
		//0	0 0					0 0 0
		//0 1 1					0 0 1
		//1 1 0					1 0 0
		//1 1 1					1 1 1
		
		//||와 &&를 논리 연산자라고 한다.
		//부정 논리연산
		if(!false) {
			System.out.println("독수리");
		}
		if( !(3 < 2) ) {//false의 부정은 true이다.
			System.out.println("앵무새");
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
		//짜장:짝짝
		//우동:짝홀
		//짬뽕:홀홀
		//탕슉:홀짝
		//아무 숫자나 불러봐!34이렇게 답을 했습니다.
		//3:짝수인지 홀수인지 4:짝수인지 홀수인지
		//
		int num =63;
		//3과 4를 분리하자
		int a=num/10;
		int b=num%10;
		
		System.out.println(a+" "+b);
		if(a%2==0) {//짜장 아니면 우동
			if(b%2==0) {
				System.out.println("짜장");
			}else {
				System.out.println("우동");
			}
		}else {
				if(b%2==0) {
					System.out.println("짬뽕");
				}else {
					System.out.println("탕슉");
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
		//2중에 반드시(중요), 1개만 실행하고 싶을 때
		//사용하는 것이 if(){}else{}
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
		
		//ex3)10으로 나누면 나머지가 0~9사이 수 2로 나누면 1혹은 0
		if(12345%2 == 0) {
			System.out.println("짝수를 나누었네");
		}else {
			System.out.println("홀수를 나누었네");
		}
		
		//ex4)
		System.out.println(1109211/1000000);
		if(1109211/000000 == 1) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
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
		//ex2)1번 이상 if문을 사용할 수 있다.
		if(3 < 2){
			System.out.println(3);
		}
		System.out.println(4);
		System.out.println("---------------------------------------");
		//ex3)if문 안에 if문을 사용할 수 있는가?
		if(false){
			System.out.println(5);
			if(false) {
				System.out.println("호랑이");
			}
			System.out.println("독수리");
		}
		System.out.println(6);
		System.out.println("---------------------------------------");
		//EX4)if문 안에 if문을 사용할 수 있는가? 복습할 때, 반드시 다른 true,false를 만들어서
		//그 결과를 예상하고 실행해서 예상 결과와 같은지 확인을 꼭 해주세요.
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
		//제어문....
		//if,for,while,switch
		//윗 4개 제어문은 () {}를 공통적으로 동행한다.
		
		//if(조건)
		//ex1)
		//{}를 block이라 한다.
		//true, false를 바꾸어서 테스트 하세요
		if(false)
		{
			System.out.println(100);
		}
		System.out.println(200);
		System.out.println("-------------------------------");	
		
		System.out.println(30>20);//true라는 값이 나온다.
		System.out.println(30<20);//false라는 값이 나온다.
		if(30 < 20)
		{
			System.out.println(300);
			System.out.println(400);
		}
		System.out.println(500);
		
		System.out.println("-------------------------------");	
		
		//대소관계를 묻는 것은 6가지가 있는데 이것을 비교연산자라고 한다.
		//비교연산자 6가지 넣어서 여러방법으로 사용해보기
		//A>B
		//A<B
		//A>=B
		//A<=B
		//A==B : ==이 2번 사용한것에 주의 같으냐
		//A!=B : 같지 않느냐
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
		
		//결과는 왼쪽에서 오른쪽으로 진행되어 35가 예상이 되지만...결과는 그렇지 않다
		//이유는 곱과 나누기는 덧셈과 뺄셈보다 연산 우선순위가 높기 때문이다.
		//결과는 23이다.
		System.out.println(3+4*5);
		//원래 35로 계산을 하고 싶었다면 어떻게 해야 하나?
		System.out.println((3+4)*5);
		
		int a=3,b=4,c=5,d=6;
		//3+20+6
		System.out.println((a+b)*(c+d));
	}
}
*/
//ex13)외워야 하는 코드***세줄 잘 이해해라**********************
/*public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println("ex13");
		//a와b <데이타 교환 프로그램>exchange라고도 함
		int a=10, b=20;
		int temp;
		System.out.println(a+" "+b);
		
		temp=a; //temp:10
		a=b;	//a:20 이 코드 때문에 a는 b를 가진다.
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
		
		//ex1)숫자+숫자
		System.out.println(10+30);
		//ex2)숫자+문자열=결과적으로 연결을 한다. 글자를 연결해준다. 문자열연결
		System.out.println(10+"호랑이");
		//ex3)문자열+숫자=결과적으로 연결을 한다. 
		System.out.println("호랑이"+10);
		//ex4)문자열+문자열= 결과적으로 연결을 한다.
		System.out.println("호랑이"+"독수리");
		//ex5)진행방향 왼쪽이다.
		System.out.println(30+40+"독수리");
		//ex6)문자열을 만나면 숫자 계산이안된다.
		System.out.println("독수리"+30+40);
		//ex7)
		System.out.println(30+"독수리"+40);
		//ex8)
		System.out.println("30"+"40");//문자열 취급을 하는 것
		//ex9)
		System.out.println(30+"40");	
		//ex10)
		System.out.println(30+" "+40);
		//ex11)
		int a=88, b=99;
		System.out.println(a+" "+b);
		//ex12):큰일 나는 프로그램이다.
		//변수는 반드시 어디선가 초기화가 있어야 한다.
		int apple;
		System.out.println(apple);
		//ex13):큰일 나는 프로그램이다.
		//변수는 반드시 어디선가 초기화가 있어야 한다.
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
		int a;//변수선언
		a=100;//변수 초기화
		System.out.println(a+100);
		
		//ex2)
		//변수선언과 동시에 변수값을 초기화 한다.
		int b = 200;
		System.out.println(b-100);
		
		//ex3)
		int c =77;		
		System.out.println(c);
		//또 값이 대입이 되면 이전값을 무조건 잃어 버린다.
		//무조건 새로운 값만 기억한다.
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
		//char는 음수를 사용할 수 없다.
		//대신에 char는 양수로 2배 사용할 수 있다.
		//char b=-50;//Character
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println("-------------------------------");
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		
		//char는 특수한 용도로 사용된다.
		//산술연산을 하기위해서 사용되는 경우는 극히 드물다.
		//문자: ''으로 문법을 표기한다.
		//문자열:" "으로 문법을 표기한다.
		//char의 특수한 용도란 문자를 대입받기 위해서 사용된다.
		char c;
		//이렇게 넣게 되면 실질적으로 c는 아스키 코드번호 65를 가진다.
		c='A';
		System.out.println(c);
		c='한';
		System.out.println(c);
		c=66;
		System.out.println(c);
		System.out.println("-------------------------------");
		c='Q';
		System.out.println(c);
		System.out.println((int)c);//Q의 아스키번호를 보고 싶을 때
		c='ㅎ';
		System.out.println((int)c);//한글은 유니코드
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
//ex)8(암기)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.err.println("ex8");
		//byte는 메모리 1개 주세요
		byte apple;
		//2개 주세요
		short aa;
		char bb;
		//4개 주세요.(정수)
		int cc;
		//8개 주세요
		long dd;
		//34>> 정수 3.14 >>소수 
		//4개 주세요(소수)
		float ee;
		//8개 주세요(소수)
		double ff;
		//1개 주세요
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
		//변수이름 작명법
		byte apple;
		//1.변수이름은 중복해서 작명할 수 없다.
		//byte apple
		//2.대소문자는 구분한다.
		byte banana100;
		//byte 9banana;
		//3.첫글자만 숫자가 아니라면 숫자를 사용할 수 있다.
		//4.
		//_,$를 제외한 특수문자는 사용할 수 없다.
		byte oran_ge;
		byte oran$ge;
		//byte oran#ge;
		
		//한글을 변수명으로 사용할 수 있지만 피한다.
		//쓸수는 있지만, 피한다.
		byte 사과;
		사과=99;
		System.out.println(사과);	
		//6.한 단어 이상으로 작명해야 할 때
		//카멜표기법을 사용한다.
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
		//byte:컴퓨터야 상자 1개 줘
		//byte:컴퓨터야 메모리 한개 줘.
		// 그리고 그 메모리 이름을 apple이라고 하겠다.
		//메모리가 하는 역할은 숫자를 기억하는 일 말고는 없다.
		//컴퓨터야 메모리 1개 주고 그 이름을 apple이라고 하겠다.
		//컴퓨터야 메모리 1개 주고 변수이름은 apple이라고 하겠다.

		byte apple;
		//변수 대입연산자 리터럴 명령끝
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
	{	//콘솔창은 또는 출력창은 드래그해서 우측에 붙여놓자.(덕킹)
		//ctrl+(+,-)
		System.out.println("독수리");
		System.out.println("앵무새");
		System.out.println("토끼");
		System.out.println("------------------");//구분선 세퍼레이
		
		//산수가 일어나고 있다.
		//결과)19
		System.out.println(15+4);
		//문자열 출력일 뿐이다.
		//결과)15+4
		System.out.println("15+4");
		System.out.println("------------------");
		//오칙연산이라고도 하지만, 산술연산이다.
		System.out.println(17+4);
		System.out.println(17-4);
		System.out.println(17*4);
		//몫이 출력이 된다.
		System.out.println(17/4);
		//나머지가 출력 된다.
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
		/*컴퓨터에서 출력 명령을 내릴 때
		//System.out.println을 이용한다.
		//""사이에 내가 출력하고 싶은 문자열을 넣는다.
		문자열이란 한개 이상의 문자들의 집합이다.
		System.out.println("호랑이1");
		System.out.println("호랑이2");
		System.out.println("호랑이3");
	}
	

}*/