package decorator;

public class FullBorder extends Border {
    public FullBorder(Widget widget) {
        super(widget);
    }

    @Override
    public int getColums() {
        return widget.getColums() + 2;
    }

    @Override
    public int getRows() {
        return widget.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == widget.getRows() + 1) {
            return "+" + makeLine('-',widget.getColums()) + "+";
        }
        return "|" + widget.getRowText(row - 1) + "|";
    }

    private String makeLine(char ch, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<count; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
