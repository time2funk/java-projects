package lesson3;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListArray l = new ListArray();

		for (int i = 10; i > 0; i--) {
			l.add(i);
		}

//		l.show();
		for(int i = 0; i < l.length(); i++){
			System.out.print( l.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		l.addObj("obj");
		l.addObj(200);
		l.addObj(true);

		l.showObjs();

		System.out.println();
		System.out.println();
		
		String s1 = "s";
		String s2 = "s";
		
		System.out.println( s1.equals(s2) );
		System.out.println( 1 == 1 );
	}


}
