interface A {
    void testa();
}
interface B {
    void testb();
}
/**接口可以多继承：接口C继承接口A和B*/
interface C extends A, B {
    void testc();
}
public class NewInterface implements C {
    public void testc() {
    }
    public void testa() {
    }
    public void testb() {
    }
}
