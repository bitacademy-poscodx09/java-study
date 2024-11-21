package prob04;

public class StringUtilTest {
	public static void main(String[] args) {
        String[] strArr = {"SuperMan", "BatMan", "SpiderMan"}; 
        String resultStr = StringUtil.concatenate(strArr);

        System.out.println("Result: " + resultStr); 
	}
}