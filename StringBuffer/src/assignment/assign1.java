package assignment;

public class assign1 {

	public static void main(String[] args) {
		String s="good morning my name is gael a software develeoper from atlanta";
		StringBuilder sb=new StringBuilder();
		String ar[]=s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
		}
		System.out.println(sb.toString().trim());

	}

}
