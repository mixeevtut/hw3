package SimpleNum;

public class Main {
    public static void main(String[] args) {
        SimpleNum easy = new SimpleNum();
        int [] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        easy.checkEasy(array);
    }
}
