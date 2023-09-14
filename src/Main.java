import Vector.Vector;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Vector<Integer> Intvec = new Vector<Integer>();
        Intvec.push_back(1);
        Intvec.push_back(2);
        Intvec.push_back(3);
        Intvec.push_back(4);
        Intvec.push_back(5);
        Intvec.push_back(6);
        Intvec.push_back(7);
        Intvec.push_back(8);
        Intvec.push_back(9);
        Intvec.push_back(10);
        Intvec.push_back(11);
        Intvec.push_back(12);
        Intvec.push_back(13);
        Intvec.push_back(14);
        Intvec.push_back(15);
        Intvec.push_back(16);
        Intvec.push_back(17);
        Intvec.push_back(18);
        Intvec.push_back(19);
        Intvec.push_back(20);
        Intvec.push_back(21);
        Intvec.push_back(22);
        Intvec.push_back(23);
        Intvec.push_back(24);
        Intvec.push_back(25);
        Intvec.pop_back();
        Intvec.pop_back();
        Intvec.pop_back();
        Intvec.pop_back();
        Intvec.pop_back();
        Intvec.pop_back();

        Intvec.resize(5);

        Intvec.push_back(1);
        Intvec.push_back(2);
        Intvec.push_back(3);
        Intvec.push_back(4);
        Intvec.push_back(5);

        Intvec.pop_back();
        Intvec.pop_back();
        Intvec.pop_back();
        Intvec.pop_back();
        Intvec.pop_back();
        Intvec.pop_back();

        int a = Intvec.at(1);
    }
}