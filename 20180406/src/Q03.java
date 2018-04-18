/*
 * 3. 1怨� 45�궗�씠�쓽 以묐났�릺吏� �븡�� �닽�옄濡� �씠猷⑥뼱吏� 6�옄由ъ닽�옄瑜� 留뚮뱾�뼱�궡�뒗 �봽濡쒓렇�옩
 * (濡쒕삉 踰덊샇 異붿쿇湲�)
 * Math.random
 */
public class Q03 {
	public static void main(String[] args) {
		int[] lotto = new int[45];
		int num;
		
		for(int i=0; i<6; i++) { 
			num= (int)(Math.random()*45);
			
			if(lotto[num]==0) {
				lotto[num]=1;
				System.out.println(num+1);
				continue;
			}
			else {
				i--;
			}
		}
		 
	}

}
