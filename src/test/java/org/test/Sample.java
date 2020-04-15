package org.test;

public class Sample {

	public static void main(String[] args) {
		long ctm = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("hai");
		 for (int i = 0; i < 2100; i++) {
			sb.append("hello");
		}
		 System.out.println("time Taken by string buffer:"+(System.currentTimeMillis()-ctm)+"ms");
		 ctm = System.currentTimeMillis();
		
		StringBuilder sb1 = new StringBuilder("hai");
		 for (int i = 0; i < 2100; i++) {
				sb1.append("hello");
		}
		 System.out.println("time Taken by string builer:"+(System.currentTimeMillis()-ctm)+"ms");
	}
}
