    package Constructor;

    public class Cup {

        //Create a Cup class
        //with the instance fiedls of :
        //size, isClean, liquidAmount
        //
        //Create a constructor to initiazlize all of these instance  fields
        //create a test class and create few objects to test your code
        boolean isClean;
        int size;
        double liquidAmount;

        public Cup(int inputSize, boolean inputClean, double inputLiquidAmout) {
            this();
            this.size = inputSize;
            this.isClean = inputClean;
            this.liquidAmount = inputLiquidAmout;
        }

        public Cup(int newSize, boolean newClean) {
            this.size = newSize;
            this.isClean = newClean;
            System.out.println("This is two argument constructor");
        }

        public Cup() {
            this(33, true);
            System.out.println("This is no argument constructor");

        }

        public void info() {
            System.out.println("Size: " + size + "isClean" + isClean + "Luquid Amount:" + liquidAmount);
        }
        @Override
        public String toString() {
            return "Size: " + size + "isClean" + isClean + "Luquid Amount:" + liquidAmount;
        }
        @Override
        protected void finalize(){
            System.out.println("Now one object went to the garbage");



                }
        }