import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupbyStream {

    public static void main(String[] args) {

	List<String> listOFFurit = Arrays.asList("Mango", "misc", "banana", "Apple", "Mango", "Apple");

	// Group by
	Map<String, Long> countResult = listOFFurit.stream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
	System.out.println(countResult);

	List<Person> personlist=populate();
	
	
	

	System.out.println( personlist.stream().collect(Collectors.partitioningBy(e -> e.getCountry().equals("iran"))));
	
	System.out.println( personlist.stream().collect(Collectors.groupingBy(e -> e.getCountry().equals("iran"))));
	
	
	System.out.println( personlist.stream().collect(Collectors.partitioningBy(e -> e.getCountry().equals("iran"),
		Collectors.counting())));
	
	System.out.println( personlist.stream().collect(Collectors.groupingBy(e -> e.getCountry())));
	
	
	System.out.println( personlist.stream().collect(Collectors.groupingBy(Person::getCountry
		,Collectors.counting())));
	
	
	
	
    }
    
    static List<Person> populate()
    {
	
	Person per1=new Person("pedram","iran");
	Person per2=new Person("pedi","iran");
	Person per3=new Person("ali","iran");
	Person per4=new Person("mohamd","india");
	Person per5=new Person("eli","iran");
	Person per6=new Person("mee","iran");
	
	
	List<Person> personlist =new ArrayList<Person>();
	personlist.add(per1);
	personlist.add(per2);
	personlist.add(per3);
	personlist.add(per4);
	personlist.add(per5);
	personlist.add(per6);
	
	
	
	return personlist;
    }

}
