/*  Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение) */


public class lesson2 {
    public static void main(String[] args) 
    {
        if(args.length == 0) System.out.println("no data");
        else System.out.println(Palindrome(args[0]));
    }
 
    private static boolean Palindrome(String data) 
    {
        data = data.toLowerCase();
        data = data.replace(" ", "");
        int dataLen = data.length();
        for(int i = 0; i < dataLen / 2; i++)
            if(data.charAt(i) != data.charAt(dataLen - i - 1))
                return false;
        return true;
    }
}