
public abstract class Algoritmos {
/**
 * 
 * Este metodo recibira un numero y le devoldera el numero fibonacci
 * @param n
 * @return el numero fibonacci
 */
	public static int fibonacci(int n) {
		if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
	}
	/**
	 * este metodo recibira un numero y devolvera el factorial
	 * @param n
	 * @return el factorial
	 */
	public static int factorial(int n) {
		int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
	}
	/**
	 * este metodo recibira un numero y devolvera true o false dependiendo de si es primo o no
	 * @param n
	 * @return true o false
	 */
	public static boolean esprimo(int n) {
		if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}
}
