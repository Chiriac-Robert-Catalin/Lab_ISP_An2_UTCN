package isp.lab3.exercise1;

public class Tree {
        public int height;

        public Tree() {
            this.height = 15;
        }

        public int grow(int meters) {
            if (meters >= 1)
                this.height += meters;
            return height;
        }

        @Override
        public String toString() {
            return "Height is " + this.height;
        }


        public static void main(String[] args)
        {
            Tree Copac = new Tree();
            System.out.println(Copac.toString());
            Copac.grow(5);
            System.out.println(Copac.toString());
            System.out.println(Copac.height);
        }

}