    package Object;

    public class Child {

        String name;
        int age;
        String eyeColor;
        String mothersName, fathersName;
        double weight;
        double energy=100;
        double mood;

        public void feed(String food){
            energy+=10;
            mood+=5;
            System.out.println(name+" is eating "+" Energy level is "+ energy+" Mood energy is "+ mood);
        }
            public void takeANap (){
            energy +=10;
            mood+=5;
                System.out.println(name+"is taking a nap "+" Energy level is "+ energy+" Mood energy is "+ mood);
        }
        public void play (String game){
            energy-=10;
            mood+=5;
            System.out.println(name+" is playing."+" Energy level is "+ energy+" Mood energy is "+ mood);
        }
        public void walk(String location){
            energy-=10;
            System.out.println(name+ " is walking." +" Energy level is " + energy+" Mood level is "+mood);
            mood+=5;
        }
        public void bath(){
            energy-=10;
            System.out.println(name +"is bathing."+"Energy level is "+energy+" Mood level is "+ mood);
            mood+=5;
        }
        public void hug(){
            energy+=5;
            System.out.println(name + " is hugging."+"Energy level is " +energy+" Mood level is "+ mood);
            mood+=5;
        } public void kiss(){
            mood+=5;
            System.out.println(name+ " is kissing."+"Energy level is "+energy+" Mood level is "+ mood);

        }
    }


