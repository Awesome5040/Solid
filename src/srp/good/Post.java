package srp.good;

import java.util.Date;

public class Post {

    private String author;
    private Date date;
    private String title;
    private String body;

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Post(final String author, final Date date, final String title, final String body) {
        this.author = author;
        this.date = date;
        this.title = title;
        this.body = body;
    }

}
