
class Notes {
	public static void main(String[] args) {
		System.out.println(fib(46));
	}

  	public static int fib(int num) {

	    // base case
	    if (num == 0) {
	      return 0;
	    }
	

	    if (num == 1) {
	      return 1;
	    }
	
	    //if a base case runs, the recursive call is unreachable
		
	    //recursive call
		  return fib(num - 1) + fib(num - 2); //recursive call that calls itself
	}
}
