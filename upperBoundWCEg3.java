import java.util.Set;
import java.util.TreeSet;

interface D{
	
}

class wildcard<T extends Set<? extends TreeSet<D>> >{
	
	 public void add(int a, int b) {
	        System.out.println(a + b);
	    }

	    public static void main(String[] args) {

	    	wildcard<TreeSet<TreeSet<D>>> obj = new wildcard<>();
	        obj.add(10, 20);

	    }
	
	
}
