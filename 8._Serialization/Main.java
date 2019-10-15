public class Main {
    public static void main(String[] args) {

        FileController.saveToFile(new Chair(342.03, false));

        FileController.readFromFile();


    }
}