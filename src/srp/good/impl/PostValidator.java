package srp.good.impl;

import srp.good.Post;
import srp.good.interfaces.IPostValidator;

import java.util.Objects;

public class PostValidator implements IPostValidator {

    @Override
    public boolean isPostValide(final Post post) {
        return !post.getAuthor().isEmpty() && !Objects.isNull(post.getDate()) && !post.getBody()
                .isEmpty() && !post.getTitle().isEmpty();
    }
}
