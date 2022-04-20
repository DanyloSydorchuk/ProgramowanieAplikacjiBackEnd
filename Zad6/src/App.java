public class App {
    public static void main(String[] args){
        String text = "What is Lorem Ipsum?\nLorem Ipsum is simply dummy text\nof the printing and typesetting industry. \nLorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an \nunknown printer took a galley of type and scrambled it to make a type specimen book.";
        String[] splitText = splitString(text);
        for(int i = 0; i< splitText.length;i++){
            System.out.println(i+1+": "+splitText[i]);
        } 
    }

    private static String[] splitString(String text) {
        return text.split("\n");
    }
}
