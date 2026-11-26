class Book {
 private String title,author,isbn; private boolean available=true;
 Book(String title,String author,String isbn){this.title=title;this.author=author;this.isbn=isbn;}
 public String getIsbn(){return isbn;} public boolean isAvailable(){return available;}
 public boolean borrow(){if(!available)return false;available=false;return true;}
 public boolean giveBack(){if(available)return false;available=true;return true;}
 public String toString(){return title+" by "+author+" ["+isbn+"] - "+(available?"Available":"Borrowed");}
}
class Library {
 private Book[] books;
 Library(Book[] books){this.books=books;}
 public boolean borrow(String isbn){Book b=find(isbn);return b!=null&&b.borrow();}
 public boolean giveBack(String isbn){Book b=find(isbn);return b!=null&&b.giveBack();}
 private Book find(String isbn){for(Book b:books)if(b.getIsbn().equals(isbn))return b;return null;}
 public void listBooks(){for(Book b:books)System.out.println(b);}
}
public class LibraryDemo {
 public static void main(String[] args){Book[] books={new Book("Things Fall Apart","Chinua Achebe","ISBN001"),new Book("Purple Hibiscus","Chimamanda Adichie","ISBN002")};Library library=new Library(books);library.listBooks();System.out.println("Borrow ISBN001: "+library.borrow("ISBN001"));System.out.println("Borrow ISBN001 again: "+library.borrow("ISBN001"));library.listBooks();System.out.println("Return ISBN001: "+library.giveBack("ISBN001"));library.listBooks();}
}
