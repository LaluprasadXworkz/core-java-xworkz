class BusStandExecutor {
    public static void main(String[] args) {
        BusStand busStand = new BusStand();
        busStand.setBusStandId(1);
        busStand.setBusStandName("BMTC");
        busStand.setBusStandAddress("Mejestic ");
        busStand.setLocationCode("Q1452");
        busStand.setManagerName("Manager Name");
        busStand.setNumberOfEmployees(20000);

        System.out.println("Bus Stand ID: " + busStand.getBusStandId());
        System.out.println("Bus Stand Name: " + busStand.getBusStandName());
        System.out.println("Bus Stand Address: " + busStand.getBusStandAddress());
        System.out.println("Location Code: " + busStand.getLocationCode());
        System.out.println("Manager Name: " + busStand.getManagerName());
        System.out.println("Number of Employees: " + busStand.getNumberOfEmployees());
    }
}