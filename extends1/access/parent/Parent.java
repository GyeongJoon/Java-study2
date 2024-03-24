package extends1.access.parent;

import access.b.AccessOuterMain;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicValue");
    }
    protected void protectedMethod() {
        System.out.println("Parent.ProtectedValue");
    }
    void defaultValue() {
        System.out.println("Parent.defaultValue");
    }
    private void privateValue() {
        System.out.println("Parent.privateValue");
    }

    public void printParent() {
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        //부모 메서드 안에서 모두 접근 가능ㅇ
        defaultValue();
        privateValue();
    }
}
