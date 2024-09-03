package model;

public class Counter {
    private int value;

    public Counter()
    {
        this.value = 0;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void tang(){
        this.value++;
    }
    public void giam(){
        this.value--;
    }
    public void reset(){
        this.value = 0;
    }

    public int getValue() {
        return value;
    }
}
