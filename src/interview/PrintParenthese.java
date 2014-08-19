package interview;
public class PrintParenthese {

	public void printPair() {
		int pairs = 3;
		char[] result = new char[pairs * 2];
		
		doPrint(result, 3, 3, 0);
	}

	public void doPrint(char[] sb, int left, int right, int count) {
		//System.out.println("l="+left+",r="+right+":");
		//System.out.println(sb);
		if (left < 0 || right < left)
			return;
		
		if (left == 0 && right == 0) {
			System.out.println(sb);
		} else {
			if (left > 0) {
				sb[count] = '(';
				doPrint(sb, left - 1, right, count + 1);
			}
			if (right > 0) {
				sb[count] = ')';
				doPrint(sb, left, right - 1, count + 1);
			}

		}

	}
	
	
	public static void main(String[] args) {
		PrintParenthese pp = new PrintParenthese();
		pp.printPair();
		
	}

}
