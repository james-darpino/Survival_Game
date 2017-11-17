import java.util.*;

public class Q_13_3_Darpino {
	// write the following method that sorts an ArrayList of numbers 
	//public static void sort(ArrayList<Number> list)

	public static void main(String[] args) {
				ArrayList<Integer> list = new ArrayList<Integer>();

				//add to the array list 
				list.add(1);
				list.add(4);
				list.add(6);
				list.add(2);
				list.add(5);
				list.add(8);
				


			//display the array list before it's sorted 
				   System.out.println("Before Sorting:");
						System.out.println(list);

				   System.out.println("");
				  
				  //sort using collections because it's a lot more simple :) 
				
				   Collections.sort(list);
				  

				   //display the array list after it's sorted 
				   System.out.println("After Sorting:");
						System.out.println(list);
					}
				}
	


