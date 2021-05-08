package srp.bad;

import java.util.Date;
import java.util.Objects;

public class Post {
    private String author;
    private Date date;
    private String title;
    private String body;

    public Post(final String author, final Date date, final String title, final String body) {
        this.author = author;
        this.date = date;
        this.title = title;
        this.body = body;
    }

    public boolean isPostValid() {
        return !author.isEmpty() && !Objects.isNull(date) && !title.isEmpty() && !body.isEmpty();
    }

    public void printPost() {
        System.out.println("author='" + author + '\'' +
                ", date=" + date +
                ", title='" + title + '\'' +
                ", body='" + body + '\'');
    }
}
