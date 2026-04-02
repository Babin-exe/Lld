
public class First {

    static class Num {

        public int num;

        public Num(int num) {
            if (num < 0) {
                System.out.println("Negative number is not allowed");;
                return;
            }
            this.num = num;
            System.out.println("Number is : " + this.num);
        }
    }

    public static void main(String[] args) {
        Num n1 = new Num(10);
        Num n2 = new Num(-1);
    }
}


