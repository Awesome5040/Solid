package lsp.bad;


public class Square extends Rectangle {

    public void setWidth(final double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    public void setHeight(final double height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
