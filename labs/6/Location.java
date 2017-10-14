
public class Location {
	//declare data fields row, column and maxValue
	int row;         	
	int column;			
	double maxValue;

	// declare i and j 
	int i = 0;
	int j = 0;
	//create constructor 
	Location(double[][] a) {

		row = 0;
		column = 0;
		maxValue = a[0][0];

		for (i = 0; i < a.length; i++) {
			for ( j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxValue) {
					row = i;
					column = j;
					maxValue = a[i][j];

				}
			}
		}
	}
}
