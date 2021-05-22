package lesson2.task1;

public class MessageInArray {
    public static void main(String[] args) {
        String[] words = new String[]{"Пятница", "это", "лучший", "день", "недели"};
        //должен выводить с помощью цикла for
        System.out.println("-for-");
        new MessageInArray().getArray1(words);
        //должен выводить с помощью цикла Foreach
        System.out.println("-Foreach-");
        new MessageInArray().getArray2(words);
        //должен выводить с помощью цикла While
        System.out.println("-While-");
        new MessageInArray().getArray2(words);

    }

    public void getArray1(String[] strings) {
        String result = "";
        for (int i = 0; i < strings.length; i++)
            result += strings[i] + " ";
        result = result.trim() + ".";
        System.out.println(result);
    }

    public void getArray2(String[] strings) {
        String result = "";
        for (String array : strings)
            result += array + " ";
        result = result.trim() + ".";
        System.out.println(result);
    }

    public void getArray3(String[] strings) {
        String result = "";
        int i = 0;
        while (i < strings.length)
            result += strings[i++] + " ";
        result = result.trim() + ".";
        System.out.println(result);
    }
}





