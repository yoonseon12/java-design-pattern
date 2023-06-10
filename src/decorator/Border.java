package decorator;

public class Border extends Widget {
    protected Widget widget;

    public Border(Widget widget) {
        this.widget = widget;
    }

    @Override
    public int getColums() {
        return 0;
    }

    @Override
    public int getRows() {
        return 0;
    }

    @Override
    public String getRowText(int row) {
        return null;
    }
}
