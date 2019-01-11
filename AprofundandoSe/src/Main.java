public class Main {

    public static void main(String[] args) {

        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3) {
            System.out.println("Do");
        }

        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
        }
        System.out.println("No more bottles of beer on the wall");

        String [] list1 = {"a good", "a colored", "a comprehensive", "a big", "a confused", "a peaceful ", "a huge", "a small", "a great"};
        String [] list2 = {"life", "animal", "house", "child", "car", "love", "family"};
        String [] list3 = {"so badly", "never more", "forever"};
        int length1 = list1.length;
        int length2 = list2.length;
        int length3 = list3.length;
        int random1 = (int) (Math.random() * length1);
        int random2 = (int) (Math.random() * length2);
        int random3 = (int) (Math.random() * length3);
        String phrase = list1[random1] + " " + list2[random2] + " " + list3[random3] + ".";
        System.out.println("We need " + phrase);

        int y = 3;
        while (y > 0) {
            if (y > 2) {
                System.out.print("A");
            }
            y = y - 1;
            System.out.print("-");
            if (y == 2) {
                System.out.print("B C");
            }
            if (y == 1) {
                System.out.println("D");
                y = y - 1;
            }
        }

        int a = 0;
        int b = 0;
        while (a < 5) {
            if (b < 5) {
                a = a + 1;
                if (b < 3) {
                    a = a - 1;
                }
            }
            b = b + 2;
            System.out.print(a + "" + b + " ");
            a = a + 1;
        }

    }

}