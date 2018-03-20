public class MyFirstClass {

    public static void main (String[] args){
        //sout atspausdinimui
        System.out.println("Hello world");

        int a= 10;

        //sukurtas objektas(konstruktorius)
        MyFirstClass myFirstClass = new MyFirstClass();

        //ne statinis kvieciamas statiniame per klases objekta
        myFirstClass.myNotStaticMethod(a);

        //tiesiog per varda toje pacioje klaseje
        myStaticMethod();

        float b = 4.6f;
        double c = 2.4;

        boolean d = true;//false

        char e = 'A';

        String f = "This is String!!!";
    }

    private void myNotStaticMethod(int numb){
        System.out.println("Jusu skaicius " + numb);
    }

    private static void myStaticMethod(){
        System.out.println("Cia yra statinis metodas");
    }
}
