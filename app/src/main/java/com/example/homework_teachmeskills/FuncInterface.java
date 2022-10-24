package com.example.homework_teachmeskills;

public class FuncInterface {

    public static void main(String[] args) {

        // до лямбды// просто анонимный класс реал интерефейс
//        Operationable operationable = new Operationable() {
//            @Override
//            public int calculate(int a, int b) {
//                return a+b;
//            }
//        };
//
//        int result = operationable.calculate(10,10);
//        System.out.println(result);

        // с лямбдой
        Operationable operationable = (a, b) -> a + b;
        int result = operationable.calculate(10, 10);
        System.out.println(result);

        // Predicate нужен дженерик <T>
        NewInterfacePredicate<Integer> newInterfacePredicate = (a, b) -> a > b;
        boolean resultNewInterfacePredicate = newInterfacePredicate.calculate(10, 100);
        System.out.println(resultNewInterfacePredicate);

        // Function нужен дженерик <T> который отдает и <R> в который преобразует
        NewInterfaceFunction<Integer, String> newInterfaceFunction = (a, b) -> {
            return a + b + " asadqweqeqwe";
        };
        String resultNewInterfaceFunction = newInterfaceFunction.calculate(10, 100);
        System.out.println(resultNewInterfaceFunction);

        // Consumer ничего не возвращает// может также и не принимать ничего () ->
        InterfaceConsumer<Integer> interfaceConsumer = (a, b) -> System.out.println(a + b);
        interfaceConsumer.calculate(10, 100);





    }


}


@FunctionalInterface
interface Operationable {
    int calculate(int a, int b);
}

// Predicate принимает один тип и его же отдает
@FunctionalInterface
interface NewInterfacePredicate<T> { // дженерик говорит какой тип пожно использовать
    boolean calculate(T a, T b);
}

// Function - берет один тип одает другой
@FunctionalInterface
interface NewInterfaceFunction<T, R> { // дженерик говорит какой тип пожно использовать и в какой преобразовать
    R calculate(T a, T b);
}

// Consumer - ничего не возвращает
@FunctionalInterface
interface InterfaceConsumer<T> {
    void calculate(T a, T b);
}


