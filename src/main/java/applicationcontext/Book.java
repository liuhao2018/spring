package applicationcontext;

public class Book {
    private String name;
    private String describe;
    private String content;

    public Book() {
        System.out.println("init book...");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
