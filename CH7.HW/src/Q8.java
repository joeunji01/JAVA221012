import java.util.*;
public class Q8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        System.out.println("** 포인트 관리 프로그램입니다 **");
        while(true){
            System.out.print("이름과 포인트 입력>> ");
            String name = scanner.next();
            if(name.equals("그만")){
                break;
            }
            int point = scanner.nextInt();
            Integer in = hash.get(name);
            if(in == null){
                hash.put(name, point);
            }
            else{
                hash.put(name, in+point);
            }
            Set<String> keys = hash.keySet();
            Iterator<String> it = keys.iterator();
            while(it.hasNext()){
                String str = it.next();
                int num = hash.get(str);
                System.out.print("(" + str + "," + num + ")");
            }
            System.out.println();
        }
        scanner.close();
    }
}
