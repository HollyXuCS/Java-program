package interview;
public class PrintParenthese {

	public static void printPair() {
		int pairs = 3;
		char[] result = new char[pairs * 2];
		
		//doPrint(result, 3, 3, 0);
		printPar(3, 3, result, 0);
	}

	public static void doPrint(char[] sb, int left, int right, int count) {
		System.out.println("l="+left+",r="+right+":");
		System.out.println(sb);
		if (left < 0 || right < 1)
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
	
	private static void printPar(int count)
	{
	    char[] str = new char[count*2];
	    //printPar(count,count,str, 0);
	    doPrint(str, 3, 3, 0);
	}

	private static void printPar(int l, int r, char[] str, int count)
	{
	    if(l < 0 || r < l)
	        return;

	    if (l ==0 && r == 0)
	    {
	        System.out.println(str);
	    }
	    else
	    {
	        if (l > 0 )
	        {
	            str[count] = '(';
	            printPar(l-1, r, str, count + 1);
	        }

	        if (r > 0)
	        {
	            str[count] = ')';
	            printPar(l, r-1, str, count + 1);
	        }
	    }
	}

	public static void main(String[] args) {
		PrintParenthese pp = new PrintParenthese();
		pp.printPair();
		
		//printPar(3);

		// System.out.println("hello");
	}

}
