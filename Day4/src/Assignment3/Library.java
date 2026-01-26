package Assignment3;

public class Library {
    static Book books[];
    static int id;
    public Library(int number){
        books = new Book[number];
    }
    public void addBook(Book book){
        if(id >= books.length){
            System.out.println("Book cannot be added");
            return;
        }
        books[id] = book;
        System.out.println("Book added");
    }
    public void removeBook(int id){
        if(id >= books.length || id < 0){
            System.out.println("Book cannot be removed");
            return;
        }
        if(books[id].isAvailable() == true){
            books[id].setAvailable(false);
        }
        id--;
    }
    public void replaceBook(int id,Book book){
        if(id >= books.length || id < 0){
            System.out.println("Book cannot be replaced");
            return;
        }
        if(books[id].isAvailable() == true){
            books[id] = book;
        }
    }
    public void searchBook(int id){
        if(id >= books.length || id < 0){
            System.out.println("Book is unavailable");
            return;
        }
        if(books[id].isAvailable() == true){
            System.out.println(books[id].getTitle() + " is Available ");
        }else{
            System.out.println(" Book is not Available ");
        }
    }
    public void displayBooks(){
        if(id <= 0){
            System.out.println("Books are unavailable");
            return;
        }
        System.out.println("Books are ");
        for(int i = 0; i < books.length; i++){
            if(books[i] != null && books[i].isAvailable() == true)
               System.out.println(books[i].getTitle()+ " ");
        }
    }

    public static void main(String[] args) {
        id = 0;
        Library library = new Library(5);
        library.displayBooks();
        library.addBook(new Book(id," Man's search for meaning "," Viktore. Frankl ",true));
        library.addBook(new Book(++id," Eating Ashes "," Brenda Navarro ",true));
        library.addBook(new Book(++id," Strangerland "," Monika Radojevic ",true));
        library.addBook(new Book(++id," Emotional Intelligence "," Daniel Goleman ",true));
        library.addBook(new Book(++id," The Odyssey "," Homer ",true));
        library.displayBooks();
        library.replaceBook(3,new  Book(3," The Night We Met "," Abby Jimenez ",true));
        library.displayBooks();
        library.removeBook(0);
        library.displayBooks();
    }
}
