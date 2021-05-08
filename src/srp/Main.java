package srp;


import srp.good.interfaces.IPostPrinter;
import srp.good.interfaces.IPostValidator;
import srp.good.Post;
import srp.good.impl.PostPrinter;
import srp.good.impl.PostValidator;

import java.time.Instant;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Post post = new Post("PostAuthor", Date.from(Instant.now()), "PostTitle", "PostBody");
        IPostValidator postValidator = new PostValidator();
        IPostPrinter postPrinter = new PostPrinter();
        if (postValidator.isPostValide(post))
            postPrinter.printPost(post);
    }
}
