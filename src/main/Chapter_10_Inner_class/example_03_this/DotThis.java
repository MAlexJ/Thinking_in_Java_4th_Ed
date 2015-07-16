package example_03_this;

/**
 * Если вам понадобится получить ссылку на объект внешнего класса,
 * запишите имя внешнего класса, за которым следует точка,
 * а затем ключевое слово this.
 */
public class DotThis {

    private class Inner {

        public DotThis outer() {
            return DotThis.this;
        }
    }

    private Inner inner() {
        return new Inner();
    }


    public void f() {
        System.out.println("DotThis.f()");
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        Inner inner = dotThis.inner();
        inner.outer().f();
    }
}
