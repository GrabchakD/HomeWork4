/*
        Unix Path
        Given Unix directory path, like /a/..///b/./c/. Your task is to simplified it to /b/c.

        Format
        Input
        { long path as String }

        Output
        { simplifyed path }

        Examples
        /home/ --> /home
        /.. --> / - there is no parrent directory for root directory.
        /.data --> /.data
        /.... --> /.... - it just name of file that contains only dots.
        /home/./a/../b --> /home/b
*/

public class Task2 {
    public static void main(String[] args) {
        String input = "/home/dgrabchak";
        simplifiedInput(input);
    }

    private static void simplifiedInput(String input) {
        char[] arr = input.toCharArray();
        StringBuilder simplArr = new StringBuilder();


        for (int i = 0; i < arr.length; i++) {
            simplArr.append(arr[i]);

            if (arr[i] == '/') {
                simplArr.append(arr[i]);
                if (simplArr.equals("/./" )) {
                    simplArr.delete(arr.length - 2, arr.length);
                } else if (simplArr.equals("//")) {
                    simplArr.delete(arr.length - 1, arr.length);
                } else if (simplArr.equals("/../")) {

                }
            }
        }

    }
}