package others.demo;

import javax.swing.*;

public class Swing extends JFrame {
    public Swing() {
        this.setTitle("MyFirstFrame");
        this.setSize(200, 300);
        this.show();
    }

    public static void main(String[] args) {
        new Swing();
    }
}
