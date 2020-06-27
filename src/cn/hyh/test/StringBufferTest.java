package cn.hyh.test;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<26; i++) {
			sb.append((char)('a'+i));
		}
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		char a = sb.charAt(8);
		System.out.println(a);
		int hashCode = sb.hashCode();
		System.out.println(hashCode);
		String substring = sb.substring(0,6);
		System.out.println(substring);
		
		
	}
}
