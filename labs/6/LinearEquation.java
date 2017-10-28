
public class LinearEquation {
	// Data fields
		private double a;
		private double b;
		private double c;
		private double d;
		private double e;
		private double f;
		

		//constructor with a,b,c,d,e,f
		LinearEquation(double a, double b, double c, double d, double e, double f) {
			this.a = a; // JA
			this.b = b; // JA
			this.c = c; // JA
			this.d = d; // JA
			this.e = e; // JA
			this.f = f; // JA
		}
		

		//mutator for a
		public double getA() {
			return a;
		}


		public void setA(double a) {
			this.a = a;
		}

		//mutator for b
		public double getB() {
			return b;
		}


		public void setB(double b) {
			this.b = b;
		}

		//mutator for c
		public double getC() {
			return c;
		}


		public void setC(double c) {
			this.c = c;
		}

		//mutator for d
		public double getD() {
			return d;
		}


		public void setD(double d) {
			this.d = d;
		}

		//mutator for e
		public double getE() {
			return e;
		}


		public void setE(double e) {
			this.e = e;
		}

		//mutator for f
		public double getF() {
			return f;
		}


		public void setF(double f) {
			this.f = f;
		}
		
		// create method isSolvable that returns true
		public boolean isSolvable() {
			boolean solvable =  ((a * d) - (b * c)) != 0;
			
			return solvable;
		}
		
		//create method getX
		public double getX() {
			double xValue = (e * d - b * f) / (a * d - b * c);
			
			return xValue;
		}
		
		//method getY
		public double getY() {
			double yValue = (a * f - e * c) / (a * d - b * c);
			
			return yValue;
		}
			
}
