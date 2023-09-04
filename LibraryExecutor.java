class LibraryExecutor{
	public static void main(String[] args) {
	
		String typeOfBooks1[]={"Fiction", "Non-Fiction", "Mystery"};
        Library library1 = new Library(1, "City Central Library", "Bangalore", 10000,typeOfBooks1);
		library1.displayDetails();
		
		String typeOfBooks2[]={"History", "Science", "Biography"};
        Library library2 = new Library(2, "State Library", "Mysore", 8000,typeOfBooks2);
		library2.displayDetails();
		
		String typeOfBooks3[]={"Romance", "Fantasy", "Self-Help"};
        Library library3 = new Library(3, "District Library", "Hubli", 6000,typeOfBooks3);
		library3.displayDetails();
		
		String typeOfBooks4[]={"Academic", "Research", "Journals"};
        Library library4 = new Library(4, "University Library", "Manipal", 12000,typeOfBooks4);
		library4.displayDetails();
		
		String typeOfBooks5[]={"Children's", "Educational", "Magazines"};
        Library library5 = new Library(5, "Public Library", "Mangalore", 7500,typeOfBooks5);
		library5.displayDetails();
		
		String typeOfBooks6[]={"E-Books", "Online Resources"};
        Library library6 = new Library(6, "Digital Library", "Shimoga", 5000,typeOfBooks6);
        library6.displayDetails();
    }
}
