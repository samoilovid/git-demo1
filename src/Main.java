public class Main {
    public static void main(String[] args) {
        int fullTank = 100;
        int way = 1000;
        double distance = 100.00;
        double consumption = fullTank*distance/way;
        System.out.println(consumption);

        double passedWay = 500.00;
        double tank = fullTank - consumption*passedWay/distance;
        System.out.println(tank);
        double estimatedBalanceWay = tank*consumption;
        System.out.println(estimatedBalanceWay);

    }
}
