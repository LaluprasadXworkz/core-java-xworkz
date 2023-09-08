class PostOfficeExecutor {
    public static void main(String postoffice[]) {
        PostOffice postOffice = new PostOffice();
         postOffice.setPostOfficeId(1);
         postOffice.setPostOfficeName("Central Post Office");
         postOffice.setPostOfficeAddress("Basam Circle");
         postOffice.setPostalCode("q123er");
         postOffice.setManagerName("Manager Name");
         postOffice.setNumberOfEmployees(25);
		 
        System.out.println("Post Office ID: " + postOffice.getPostOfficeId());
        System.out.println("Post Office Name: " + postOffice.getPostOfficeName());
        System.out.println("Post Office Address: " + postOffice.getPostOfficeAddress());
        System.out.println("Postal Code: " + postOffice.getPostalCode());
        System.out.println("Manager Name: " + postOffice.getManagerName());
        System.out.println("Number of Employees: " + postOffice.getNumberOfEmployees());
    }
}