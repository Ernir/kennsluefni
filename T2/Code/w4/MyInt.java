public class MyInt {
    /* Our own class for packaging integers! */
    private int data = 0;
    public MyInt(int data) {
        this.data = data;
    }
    public void increment() {
        this.data++;
    }
    public int getData() {
        return this.data;
    }
}
