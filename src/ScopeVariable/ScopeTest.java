package ScopeVariable;

public class ScopeTest {

    String name = "John Doe";

    public static void main(String[] args) {
        ScopeTest st = new ScopeTest();
        st.takePhoto();
    }
    void takePhoto(){
        System.out.println(name);
    }

}
