import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    String strs[]=new String[n];
	    for(int i=0;i<n;i++){
	        strs[i]=scan.next();
	    }
	    HashMap<HashMap<Character,Integer>,HashSet<String>> bmap=new HashMap<>();
        for(String s:strs){
            HashMap<Character,Integer>f=new HashMap<>();
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                f.put(c,f.getOrDefault(c,0)+1);
            }
            if(bmap.containsKey(f)==false){
                HashSet<String>L=new HashSet<>();
                L.add(s);
                bmap.put(f,L);
            }
            else{
                HashSet<String>L=bmap.get(f);
                L.add(s);
                bmap.put(f,L);
            }
        }
        List<List<String>>ans=new ArrayList<>();
        for(HashSet<String> k:bmap.values()){
            ArrayList<String> k1 = new ArrayList<>(k);
            ans.add(k1);
        }
       System.out.println(ans);
	}
}
