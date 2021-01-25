package ch12.ex;
import java.util.*; 

class StringTokenizerEx3 { 
	public static void main(String args[]) { 
		String source = "1,��õ��,100,100,100|2,�ڼ���,95,80,90|3,���ڹ�,80,90,90";
		StringTokenizer st = new StringTokenizer(source, "|"); 
		int ktot =0, etot=0, mtot=0;
        int k=0, e=0, m=0;
        System.out.println("��ȣ\t �̸�\t ����\t  ����\t  ����\t  �հ� \t");
        System.out.println("=============================================");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			StringTokenizer st2 = new StringTokenizer(token, ","); 
			int index=0; int tot=0;
			while(st2.hasMoreTokens()) {
				
				switch (index) {
				case 2 : {
					k=Integer.parseInt(st2.nextToken());
					System.out.print(k+"\t");
					ktot+=k; tot+=k; break;
					
				}
				case 3 : {
					e=Integer.parseInt(st2.nextToken());
					System.out.print(e+"\t");
					etot+=e; tot+=e; break;
				}
				case 4 : {
					m=Integer.parseInt(st2.nextToken());
					System.out.print(m+"\t");
					mtot+=m; tot+=m; break;
				}
				default : {
					System.out.print(st2.nextToken()+"\t");
				}
				}
			
					
				index++;
			}
			System.out.println(tot);
		}
		 System.out.println("=============================================");
			System.out.print("�հ� \t \t"+ktot+"\t"+etot+"\t"+mtot+"\t"+(ktot+etot+mtot));
	} // main�� ��
}
