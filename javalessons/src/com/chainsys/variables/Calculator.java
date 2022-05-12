package com.chainsys.variables;
/**
 * author Chainsys-Venkat
 *created on : 25 March 2022
 *
 */
public class Calculator {
/**
 * Add method : will take 2integer values using the following parameters,
 * and will add the values. The result of total will be returned back to the caller
 * This is a static method, object reference is not required. 
 * @param param1 of type int 
 * @param param2 of type int
 * @return type int
 */
	public static int add(int param1,int param2) {
		int result=param1+param2;
		return result;
		
	}
	/**
	 * Multiply method : will take 2integer values using the following parameters,
	 * and will multiply the values. The result of total will be returned back to the caller
	 * This is a static method, object reference is not required. 
	 * @param param1 of type int 
	 * @param param2 of type int
	 * @return type int
	 */
		public static int multiply(int param1,int param2) {
			int result=param1*param2;
			return result;
		}
		/**
		 * Divide method : will take 2integer values using the following parameters,
		 * and will Divide the values. The result of total will be returned back to the caller
		 * This is a static method, object reference is not required. 
		 * @param param1 of type int 
		 * @param param2 of type int
		 * @return type int
		 */
			public static int divide(int param1,int param2) { 
			if(param2==0)
			{
			System.out.println("Value of parameter 2 is not valid.");
			}
				int result=param1/param2;
				return result;

			}
			/**
			 * Subtract method : will take 2integer values using the following parameters,
			 * and will Subtract the values. The result of total will be returned back to the caller
			 * This is a static method, object reference is not required. 
			 * @param param1 of type int 
			 * @param param2 of type int
			 * @return type int
			 */
				public static int subtract(int param1,int param2) {
					int result=param1-param2;
					return result;
				}


}
