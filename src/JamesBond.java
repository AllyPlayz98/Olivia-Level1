
public class JamesBond {

	public JamesBond(){
		
	}
	public int findCode (Vault v) {
		for (int i = 0; i < 1000000; i+=1) {
			if (v.checkCode(i)) {
				return i;
			}
		}
		return -1;
	}
}
