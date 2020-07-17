package Task_4;

public class Reader {
    private String fullName;
    private int id;
    private String faculty;
    private String birthday;
    private int phone;

    public void takeBook(){
        System.out.println(fullName + " took a book.");
    }

    public void returnBook(){
        System.out.println(fullName + " returned a book.");
    }

    public void takeBook(int amount){
        System.out.println(fullName + " took " + amount + " books.");
    }

    public void returnBook(int amount){
        System.out.println(fullName + " returned " + amount + " books.");
    }

    public void takeBook(String...book){
        System.out.print(fullName + " took books: ");
        for(int i = 0; i < book.length; i++){
            System.out.print(book[i] + ", ");
        }
        System.out.println();
    }

    public void returnBook(String...book){
        System.out.print(fullName + " returned books: ");
        for(int i = 0; i < book.length; i++){
            System.out.print(book[i] + ", ");
        }
        System.out.println();
    }

    public Reader(){
        super();
    }

    public Reader(String fullName, int id, String faculty, String birthday, int phone){
        this.birthday = birthday;
        this.faculty = faculty;
        this.fullName = fullName;
        this.id = id;
        this.phone = phone;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public int getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}