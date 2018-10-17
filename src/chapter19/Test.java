package chapter19;

public class Test {
    public static void main(String[] args) {
        GrandParent grandParent = new GrandParent();
        Parent parent = new Parent();
        Child child = new Child();

        wildcard(new Holder<>(parent));
//        wildcardExtendsParent(new Holder<>(grandParent));  - does not compile
        wildcardExtendsParent(new Holder<>(parent));
        wildcardSuperParent(new Holder<>(child));  //compiles for some reason!
//        extendsParentGeneric(grandParent);  - yey! doesn't compile
        extendsParentGeneric(parent);
        extendsParentGeneric(child);

        wildcardSuperParent(new ExtendParentHolder<>(parent));
        wildcardSuperParent(new ExtendParentHolder<>(child));
//        wildcardSuperParent(new ExtendParentHolder<>(grandParent));

    }



    private static void wildcard(Holder<?> some) {
        System.out.print("wildcard: ");
        System.out.println(some);
    }

    private static void wildcardSuperParent(Holder<? super Parent> some) {
        System.out.print("wildcardSuperParent: ");
        System.out.println(some);
    }

    private static void wildcardExtendsParent(Holder<? extends Parent> some) {
        System.out.print("wildcardExtendsParent: ");
        System.out.println(some);
    }

    private static <T extends Parent> void extendsParentGeneric(T parent) {
        System.out.print("extendsParentGeneric: ");
        System.out.println(parent);
    }
}
