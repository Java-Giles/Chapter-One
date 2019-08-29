import javax.swing.*;

public class RandomGuess {
    public static void main(String[] args){
        JOptionPane.showMessageDialog( null,"This number is" +
                (1+ (int) (Math.random()*10)));
    }
}
