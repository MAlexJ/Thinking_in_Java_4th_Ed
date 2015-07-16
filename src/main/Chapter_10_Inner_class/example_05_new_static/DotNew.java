package example_05_new_static;

public class DotNew {

    //Если связь между объектом внутреннего класса и объектом внешнего класса не нужна,
    // можно сделать внутренний класс статическим (объявить его как static).
    // Часто такой класс называют вложенным (nested).
   static class Inner_1 {
        Inner_1() {
            System.out.println(" Inner_1()");
        }
    }

    class Inner_2 {
        Inner_2() {
            System.out.println(" Inner_2()");
        }
    }

    class Inner_3 {
        Inner_3() {
            System.out.println(" Inner_3()");
        }
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        Inner_1 inner1 = new Inner_1();

        // Error ->  Inner_2 inner2 = new Inner_2();

        DotNew.Inner_2 dni_2 = dn.new Inner_2();

        DotNew.Inner_3 dni_3 = dn.new Inner_3();

    }

}
