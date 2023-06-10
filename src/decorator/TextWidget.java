package decorator;

public class TextWidget extends Widget {
    private String text;

    public TextWidget(String text) {
        this.text = text;
    }

    @Override
    public int getColums() {
        return text.length();
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        return row == 0 ? text : null;
    }
}
