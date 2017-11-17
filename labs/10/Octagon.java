
public  class Octagon extends GeometricObject implements Comparable<GeometricObject>, Cloneable {

	
		// ALL SIDES ARE EQUAL 
		private double side;

		public double getSide() {
			return side;
		}

		public void setSide(double side) {
			this.side = side;
		}
		
		public Octagon() {
			side = 0;
			
		}
		
		public Octagon(double side) {
			this.side = side;
	}
		
		@Override
		public double getArea() {
			double area = (2 + (4 / (Math.sqrt(2))) * side * side);
			return area;
		}

		@Override
		public double getPerimeter() {

			return side * 8 ;
		}
		
		@Override
		public Object clone() {
			try {
				return super.clone();
			}
			catch(CloneNotSupportedException ex){
				return null;
			}
		}
			 
			 @Override
			 public int compareTo(GeometricObject o) {
					if (side > ((Octagon)o).getSide() )
						return 1;
					else if (side == ((Octagon)o).getSide())
						return 0;
					else
						return -1;
				}

}


