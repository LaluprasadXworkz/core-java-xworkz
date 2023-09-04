 class UdynavanaExecutor {
    public static void main(String[] args) {
		
		
        String[] flowerCollection1 = {"Rose", "Tulip", "Daisy"};
        Udynavana udynavana1 = new Udynavana(1, "Lalbagh Botanical Garden", "Bangalore", flowerCollection1, "08:00 AM", "06:00 PM");
        udynavana1.displayDetails();

        String[] flowerCollection2 = {"Orchid", "Bamboo", "Ferns"};
        Udynavana udynavana2 = new Udynavana(2, " Raja's Seat", "Coorg", flowerCollection2, "09:00 AM", "05:30 PM");
        udynavana2.displayDetails();

        String[] flowerCollection3 = {"Marigold", "Lotus", "Hibiscus"};
        Udynavana udynavana3 = new Udynavana(3, "Kishkindha Moolika Bonsai Garden", "Mysore", flowerCollection3, "07:00 AM", "07:00 PM");
        udynavana3.displayDetails();

        String[] flowerCollection4 = {"Bougainvillea", "Chrysanthemum", "Dahlia"};
        Udynavana udynavana4 = new Udynavana(4, "Daria Daulat Bagh", "Srirangapatna", flowerCollection4, "08:30 AM", "06:30 PM");
        udynavana4.displayDetails();
		
		String[] flowerCollection5 = {"Sunflower", "Lily", "Jasmine"};
	
        Udynavana udynavana5 = new Udynavana(5, "Brindavan Gardens", "Mysore", flowerCollection5, "07:00 AM", "08:00 PM");
        udynavana5.displayDetails();
    }
}
