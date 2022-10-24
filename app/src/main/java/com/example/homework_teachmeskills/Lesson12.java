package com.example.homework_teachmeskills;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@RequiresApi(api = Build.VERSION_CODES.N)
public class Lesson12 {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {


        Stream<String> streamGen = Stream.generate(() -> "hello").limit(10); // лямбда на этот метод
        System.out.println(streamGen.collect(Collectors.toList()));

        IntStream primitiveStream = IntStream.range(1, 10);
        System.out.println(Arrays.toString(primitiveStream.toArray()));

        Stream<String> filterStream = Stream.of("a", "b", "c", "o").filter(element -> element.contains("o")); // в filter пишется сначало имя и потом после стрелки значение. возвращает тру\фолс
        System.out.println(filterStream.findFirst()); // возвращает optional и результат условия


        Stream<String> skipStream = Stream.of("a", "b", "c", "o", "a", "a")
                .skip(4);
        System.out.println(skipStream.collect(Collectors.toList()));// пропускает n объектов


        Stream<String> distinctStream = Stream.of("a", "b", "c", "o", "a", "a")
                .distinct();
        System.out.println(distinctStream.collect(Collectors.toList()));

        Stream<String> mapStream = Stream.of("a", "b", "c", "o", "a", "a");
        String mappedString = mapStream.map(Object::toString).collect( // преобразование Object в String
                Collectors.joining(", ") // разделитель
        );
        System.out.println(mappedString);

        Stream<String> mapStream2 = Stream.of("a", "b", "c", "o", "a", "a");
        String mappedString2 = mapStream2.map(element -> element + " mapped")// преобразование element в него же с добавлением строки
                .collect(Collectors.joining("[] ")); // collect - собирает значение
        System.out.println(mappedString2);

        Stream<String> mapStream3 = Stream.of("a", "b", "c", "o", "a", "a");
        String mappedString3 = mapStream3.map(String::toUpperCase)// map работает с каждым элементом по очереди
                .collect(Collectors.joining(" "));
        System.out.println(mappedString3);


    }


}





