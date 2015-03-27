package nyc.c4q.lighterletter;

/**
 * Created by c4q-john on 3/26/15.
 */


import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Subway {

    public static void drawBar(Graphics2D g, Color color, int y, int count, String letter) {
        // Step 4.
        // Implement this method. It takes the Graphics2D instance and some
        // data we need to create a single bar on the bar chart.
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static int countEntrances(ArrayList<ArrayList<String>> lines, String subwayLine) {
        // Step 3.
        int count = 0;

        for (int i = 0; i < lines.size(); i++) {

            if (lines.get(i).get(2).contains(subwayLine)) {
                count += 1;
            }else{
                continue;
            }


            // Implement this method. It takes an ArrayList of an ArrayList of
            // Strings and the subway line we're interested in and returns the
            // number of entrances for that line.
            //throw new UnsupportedOperationException("Not implemented yet");
        }
        return count;
    }
    public static void print(int text){
        System.out.println("Entrances to line: " + text);
    }


    public static void main(String[] args) {
        // This creates a 500x250 pixel drawing.
        DrawingPanel panel = new DrawingPanel(500, 250);
        // This gets a Graphics2D object that we can use to draw on the panel.
        Graphics2D g = panel.getGraphics();

        // Step 1:
        // Modify this String to indicate the full path to the subway
        // data on your computer. Run your program. If it does not throw an
        // error, you are referencing the file correctly.
        File f = new File("/Users/c4q-john/Desktop/accesscode/AC_03-26/src/subway-data.txt");

        // Step 2.
        // Get the lines as a nested ArrayList of Strings from the File
        // instance. Make sure everything is working correctly by
        // printing the data.
        ArrayList<ArrayList<String>> lines = f.getLines();




        int A = countEntrances(lines, "A");
        int C = countEntrances(lines, "C");
        int E = countEntrances(lines, "E");
        int B = countEntrances(lines, "B");
        int D = countEntrances(lines, "D");
        int F = countEntrances(lines, "F");
        int M = countEntrances(lines, "M");
        int G = countEntrances(lines, "G");
        int L = countEntrances(lines, "L");
        int J = countEntrances(lines, "J");
        int Z = countEntrances(lines, "Z");
        int N = countEntrances(lines, "N");
        int Q = countEntrances(lines, "Q");
        int R = countEntrances(lines, "R");

        int one = countEntrances(lines, "1");
        int two = countEntrances(lines, "2");
        int three = countEntrances(lines, "3");
        int four = countEntrances(lines, "4");
        int five = countEntrances(lines, "5");
        int six = countEntrances(lines, "6");
        int seven = countEntrances(lines, "7");
        int s = countEntrances(lines, "S");

        print(A);
        print(C);
        print(E);
        print(B);
        print(D);
        print(F);
        print(M);
        print(G);
        print(L);
        print(J);
        print(Z);
        print(N);
        print(Q);
        print(R);

        print(one);
        print(two);
        print(three);
        print(four);
        print(five);
        print(six);
        print(seven);
        print(s);

        g.drawString("A: 357",A,10);
        g.drawString("B",B,20);






        // Step 3.
        // Implement countEntrances().

        // Step 3b.
        // Ensure countEntrances is correct by printing out the counts for a
        // few subway lines!

        // Step 4.
        // Implement drawBar().
    }

}

