public class App {
    public static void main(String[] args) {

    StaticExample.staticMethod();

    StaticExample staticExample = new StaticExample();
    staticExample.nonStaticMethod();
    }
}