public class ReturnDemo {

    int sampleVal = 7;

    int incrVal() // called function
    {
        return ++sampleVal;
    }

    void dispVal() {
        int receivedVal = incrVal(); // calling function
        System.out.println(receivedVal);
    }

    public static void main(String[] args) {
        ReturnDemo returnDemo = new ReturnDemo();
        returnDemo.dispVal();
    }
}
