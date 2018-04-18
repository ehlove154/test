
public class Ex01 {
	public static void main(String[] args) {
        int[] lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            int ranNum = -1;
            boolean isDuplicate;
            do {
                isDuplicate = false;
                ranNum = (int) (Math.random() * 45 + 1);
                for (int j = 0; j < i; j++) {
                    if (ranNum == lotto[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);
            lotto[i] = ranNum;
        }
        for (int n : lotto) {
            System.out.print(n + "\t");
        }

}
}