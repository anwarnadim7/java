//25. A cow gives 15 liters of milk and eats 6 kg of fodder in a day.
// A farm produces 200 kg of fodder in a year.
// Write a Program to print the number of farms required, to feed the cows,
// required to produce milk for 10 Lakh people in a year, if each person drinks half liter of milk in a day.
// (Hint: Establish a link. Milk comes from cows, cows eat fodder and fodder comes from farms.
// So, first find total milk required, then number of cows required to give that amount of milk,
// from this you can get total fodder required every day and by multiplying by 365
// you get the amount required in a year.
// And that will enable you to get farms required.)
public class Q25 {
    public static void main(String[] args) {

        // Total milk required = 0.5 liters of milk per day * 10 Lakh people
        double totalMilkInDay = 1000000 * 0.5;

        // Number of cows required to produce the total milk required per day
        double cowsRequired = totalMilkInDay / 15;

        // Fodder required for all cows per day
        double fodderRequiredPerDay = cowsRequired * 6;

        // Total fodder required in a year (multiply by 365)
        double fodderRequiredPerYear = fodderRequiredPerDay * 365;

        // Farms required to produce the total fodder (1 farm produces 200 kg of fodder per year)
        double farmsRequired = fodderRequiredPerYear / 200;

        // Output the result
        System.out.println("Number of farms required: " + Math.ceil(farmsRequired));

    }
}
