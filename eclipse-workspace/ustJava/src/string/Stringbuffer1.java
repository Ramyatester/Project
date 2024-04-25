package string;

public class Stringbuffer1 {

	public static void main(String args[]) {
	StringBuilder builder = new StringBuilder("Testsentence");
	builder.append("Continue");
	System.out.println(builder);
	builder.deleteCharAt(1);
	System.out.println(builder);
	builder.reverse();
	System.out.println(builder);
	
	
	}
}
