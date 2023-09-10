import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
public class IMDBPractice {
    String ManPower;
    public static void main(String[] args) {
        String ActorName = "Chris Hemsworth";
        LocalDate YearOfBorn = LocalDate.of(1983 ,  8, 11);
        LocalDate CurrentYear = LocalDate.now();
        int Age =  Period.between(YearOfBorn, CurrentYear).getYears();
        System.out.println("Actor Name:" +ActorName);
        System.out.println("Actor AGE:" +Age);
        System.out.println(MovieRating("Ragnarok"));
    }

    static String MovieRating(String movieName) {
        Random RandomNumberGenaretor = new Random();
        switch(movieName){
            case "Ragnarok" :
                int rating =  RandomNumberGenaretor.nextInt(10) + 1;
                return "Movie is amazing" + " " + "Movie Name: "  +movieName + " " + "Rating is: " + rating;
            case "Star Trek" :
                float rating1 = 7.9F;
                return "Movie is HIT"+ " " + "Movie Name: "  +movieName + " " + "Rating is: " + rating1;
            case "Avengers" :
                int rating2 = 6;
                return "Movie is average"+ " " + "Movie Name: "  +movieName + " " + "Rating is: " + rating2;
            default:
                return "No movie name given";
        }
    }

    static void StartEngine() {
        System.out.println("Engine has started");
    }

    IMDBPractice(String ManPower) {
        this.ManPower = ManPower;
        System.out.println("Man Power Printed Here:" +this.ManPower);
    }

    public static class Audi extends car {
        public Audi(String CarName, int NoOfGear, int Price) {
            super(CarName, NoOfGear, Price);
        }

        @Override
        public void EngineStart() {
            super.EngineStart();
        }
    }

    public static class car {
        public String CarName;
        public int NoOfGear;
        public int Price;
        public car (String CarName, int NoOfGear, int Price) {
            this.CarName = CarName;
            this.NoOfGear = NoOfGear;
            this.Price = Price;
        }
        public void EngineStart() {
            System.out.println("The Car Engine Just Got Started");
        }

    }
}
