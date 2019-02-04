import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    public static void main(String[] args) {
	
	List<String> names= Arrays.asList("pedram","ali","ee","pari");
	
	//lomda
	names.stream().filter(name -> !name.equals("pedram")).forEach(e -> System.out.println(e));
	System.out.println();
	
	//method referance 
	names.stream().filter(name -> name.equals("pedram")).forEach(System.out::println);
	System.out.println();
	
	//No of item starts with P
	long l=names.stream().filter(name -> name.startsWith("p")).collect(Collectors.counting());
	System.out.println("Number of Matching Element:"+l);
	System.out.println();
	
	//Sorting by Name
	names.stream().sorted().forEach(System.out::println);
	System.out.println();

	//Skip the second one 
	names.stream().skip(2).forEach(System.out::println);
	System.out.println();
	
	
	//print firstelement
	names.stream().sorted().findFirst().ifPresent(System.out::println);
	System.out.println();
	
	//Map to uppercase
	names.stream().map(String::toUpperCase).filter(x -> x.startsWith("P")).forEach(System.out::println);
	
	
	
	
	
	
    }

}
