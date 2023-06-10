package decorator;

public abstract class Widget {
    public abstract int getColums(); // 열의 길이

    public abstract int getRows(); // 행의 길이

    public abstract String getRowText(int row); // 특정 행의 글자가 무엇인지

    public void show() {
        for (int i=0; i<getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}

