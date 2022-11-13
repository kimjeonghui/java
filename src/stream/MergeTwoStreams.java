package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoStreams {
    public List<String> mergeTwoStream(List<String> list1, List<String> list2) {
        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

        Stream<String> stream3 = Stream.concat(stream1, stream2); // 두 개의 스트림을 합칩니다.
        return stream3.collect(Collectors.toList()); // 합쳐진 스트림을 List형태로 리턴합니다.
        //return Stream().concat(stream1, stream2).collect.(Collectors.toList());
    }
}
