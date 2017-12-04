package com.company;

public class Main {

    public static void main(String[] args) {
	/*User user1 = new User();
	User user2 = new User("Alma", "Béla", '1234', 32);
	User user3 = new User(user2); */
	UserOperation userOperation = new UserOperation();
userOperation.printUserArray(userOperation.generateUserArray(10));
	/*User testUser = userOperation.createRandomUser();
		 System.out.println(testUser.getFirstname());
          System.out.println(testUser.getLastname());
          System.out.println(testUser.getPassword());
          System.out.println(testUser.getAge());
	 */



    	/*int[] temperatures = new int[5];
	temperatures[0] = 20; 	értékadás kézzel
	temperatures[1] = -5;
	temperatures[2] = 11;
	temperatures[3] = 12;
	temperatures[4] = 20; */

	/*for (int i=0; i < 5; ++i){
		temperatures[i]= i; /* értékadás for ciklussal} */

/* populateArray(temperatures);
printArrayElements(temperatures);
printMaxValue(temperatures);
System.out.println(temperatures[2]); */
    }
   /* private static void countAVG(int [] array){
    	float avg =0;
    	for (int i=0; i<array.length; i++){
    		

		}
		System.out.println("AVG: ");
	} */


    private static void printArrayElements(int[] array) {
		for (int i=0; i < array.length; ++i){
			System.out.println(array[i]);
		}
	}
	private static void populateArray (int[] array){
		for (int i=0; i < array.length; ++i){
			array[i]= i; /* értékadás for ciklussal*/
		}

	}
	private static void printMaxValue (int[] arr){
		int max = arr[0];
		for (int i=0; i<arr.length; i++){
			if (arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("maximum érték: "+max);

	}

}
