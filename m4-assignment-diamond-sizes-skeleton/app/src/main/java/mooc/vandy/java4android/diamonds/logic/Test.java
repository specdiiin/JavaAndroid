package mooc.vandy.java4android.diamonds.logic;

/**
 * Created by kostmako on 27.04.2016.
 */
public class Test {
    public static void main(String[] args) {
        int size = 1;
        printHeaderAndFooter(size);
        ptrintBody(size);
        printHeaderAndFooter(size);
    }

    public static void ptrintBody(int size) {
        if (size == 1) {
            System.out.println("|<>|");
        } else if (size > 1) {
            int temp = size;
            for (int j = 0; j < size * 2 - 1; j++) {
                String row = "|";
                if (j < size) {
                    for (int i = 0; i < size * 2; i++) {
                        if (j == size - 1 && (i == 0 || i == size * 2 - 1)) {
                            if (i == 0) {
                                row += "<";
                            } else {
                                row += ">";
                            }
                        } else if (i == temp - 1 && !(i == 0)) {
                            row += "/";
                        } else if (i == 2 * size - temp && !(i == size - 1)) {
                            row += "\\";
                        } else if (2 * size - temp > i && i > temp - 1) {
                            if (j % 2 == 0) {
                                row += "=";
                            } else {
                                row += "-";
                            }
                        } else {
                            row += " ";
                        }
                    }
                    temp--;
                } else {

                    for (int i = size * 2; i > 0; i--) {
                        if (i == temp + 2 && !(i == 0)) {
                            row += "/";
                        } else if (i == size * 2 - (temp + 1)) {
                            row += "\\";
                        } else if (size * 2 - (temp + 1) > i && i > temp + 2) {
                            if (j % 2 == 0) {
                                row += "=";
                            } else {
                                row += "-";
                            }
                        } else {
                            row += " ";
                        }
                    }
                    temp++;
                }
                row += "|";
                System.out.println(row);
            }
        } else {
            System.out.println("You are using negative size!!! Please use only positive one");
        }
    }

    // TODO -- add your code here
    private static void printHeaderAndFooter(int size) {
        String row = "+";
        for (int i = 0; i < size; i++) {
            row += "--";
        }
        row += "+";
        System.out.println(row);
    }
}
