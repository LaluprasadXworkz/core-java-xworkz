class Library {
    int libraryId;
    String libraryName;
    String libraryLocation;
    int noOfBooks;
    String typeOfBooks[];

    public Library(int libraryId, String libraryName, String libraryLocation, int noOfBooks, String typeOfBooks[]) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.libraryLocation = libraryLocation;
        this.noOfBooks = noOfBooks;
        this.typeOfBooks = typeOfBooks;
    }

    public void displayDetails() {
        System.out.println("Library ID: " + libraryId);
        System.out.println("Library Name: " + libraryName);
        System.out.println("Library Location: " + libraryLocation);
        System.out.println("Number of Books: " + noOfBooks);
        System.out.println("Types of Books:");

        for (int index = 0; index < typeOfBooks.length; index++) {
            System.out.println(typeOfBooks[index]);
        }

        System.out.println("--------------------------------");
    }

    
}
