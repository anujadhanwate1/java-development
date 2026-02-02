import java.util.Scanner;

public class InchMeasurement {
    public static class Inch { // inner class
        private final double inchValue;

        public Inch(double inchValue){ //constructor
            this.inchValue = inchValue;
        }
        @Override
        public boolean equals(Object obj){
            if(this == obj) return true;
            if(obj == null || !(obj instanceof Inch)) return false;
            
            Inch num = (Inch) obj;
            return Double.compare(this.inchValue, num.inchValue) == 0;
        }
    }

    public static void main(String argsString[]){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number 1 in inchs : " );
            double in1 = sc.nextDouble();
            System.out.println("Enter number 2 in inchs : " );
            double in2 = sc.nextDouble(); 
            Inch inch1 = new Inch(in1);
            Inch inch2 = new Inch(in2);
            System.out.println("Two numbers are equal : "+inch1.equals(inch2));
        }
    }
}
