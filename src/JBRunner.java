
public class JBRunner {
public static void main(String[] args) {
	Vault v = new Vault();
	JamesBond jb = new JamesBond(); 
	System.out.println(jb.findCode(v));
}
}
