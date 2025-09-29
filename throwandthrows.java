public class throwandthrows{
	public static int divide(int a, int b) throws ArithmeticException{
		int res = a/b;
		return res;
	}
	public static void main(String[] args){
		try{
			int c = divide(6,0);
		}
	}
}
