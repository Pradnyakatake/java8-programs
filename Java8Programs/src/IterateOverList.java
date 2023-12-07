import java.util.Arrays;
import java.util.List;

public class IterateOverList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		list.stream().forEach(System.out::println);

	}

}
