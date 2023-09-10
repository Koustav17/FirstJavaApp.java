public class FirstJavaApp {
    public static void main(String[] args) {
        System.out.println("Koustav Singha Roy");
        int NumberOfSeats = 654;
        float TotalManPower = 34.56F;
        Integer ConvertTotalManPower;
        ConvertTotalManPower = Math.round(TotalManPower);
        byte ConvertNumberoOfSeats = (byte) NumberOfSeats;
        System.out.println("Converted Data Types:" +ConvertNumberoOfSeats);
        System.out.println("Converted type into Float: " +ConvertTotalManPower);

        int PriceOfCar = 2999;
        int IncreasedPrice = ++PriceOfCar;
        int ReducedCarPrice = --PriceOfCar;
        System.out.println("Increased Price Of A Car:" +IncreasedPrice);
        System.out.println("Decreased Price Of A Car:" +ReducedCarPrice);

        String name = "Pritha";
        boolean decideName = (name == "Koustav") ? true : false;
        System.out.println("True name determined:" +decideName);
        System.out.println("True name determined:" +name instanceof String);
        System.out.println("========================================================");
        IMDBPractice movieRating = new IMDBPractice("Manuel");
        System.out.println(movieRating.MovieRating("Avengers"));
        movieRating.StartEngine();
    }
}
