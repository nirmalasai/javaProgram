package StringPrograms;

public class Seperatealphnumbersplchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a1bfgd456dhsh@#$%";
		char[] ch=s.toCharArray();
		String alpha= "";
		String num="";
		String spc="";
		for(int i=0;i<ch.length;i++) {

			if(s.charAt(i)>='A'&&s.charAt(i)<'Z'||s.charAt(i)>='a'&&s.charAt(i)<'z') {
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				num=num+s.charAt(i);	
			}
			else {
				spc=spc+s.charAt(i);
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spc);
	}

}
