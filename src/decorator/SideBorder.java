package decorator;

public class SideBorder extends Border {
    public SideBorder(Widget widget) {
        super(widget);
    }

    @Override
    public int getColums() {
        return widget.getColums() + 2;
    }

    @Override
    public int getRows() {
        return widget.getRows();
    }

    @Override
    public String getRowText(int row) {
        return "*" + widget.getRowText(row) + "*";
    }
}
