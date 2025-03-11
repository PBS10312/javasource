package inter;

class A {
    public void methodA(B b) {
        b.methodB(null);

    }
}

class B {
    public void methodB(A a) {
        System.out.println("methodB()");
    }
}

class InterfaceTest {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.methodA(new B());

    }
}
