package srp.good.impl;

import srp.good.Post;
import srp.good.interfaces.IPostPrinter;

public class PostPrinter implements IPostPrinter {


    @Override
    public void printPost(final Post post) {
        System.out.println("author='" + post.getAuthor() + '\'' +
                ", date=" + post.getDate() +
                ", title='" + post.getTitle() + '\'' +
                ", body='" + post.getBody() + '\'');
    }
}
