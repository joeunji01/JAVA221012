import java.util.*;
class Location{
    private int latitude;
    private int longitude;
    public Location(int latitude, int longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public String toString(){
        return this.latitude + " " + this.longitude;
    }
}
public class Q6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Location> hash = new HashMap<String, Location>();
        System.out.println("도시, 경도, 위도를 입력하세요.");
        for(int i=0; i<4; i++){
            System.out.print(">> ");
            String str[] = scanner.nextLine().split(",");   // scanner.next로 하면 안된다. 빈칸에서 먹혀버림
            hash.put(str[0].trim(), new Location(Integer.parseInt(str[1].trim()), Integer.parseInt(str[2].trim())));
        }
        Set<String> keys = hash.keySet();
        Iterator<String> it = keys.iterator();
        System.out.println("---------------------------------");
        while(it.hasNext()){
            String name = it.next();
            Location location = hash.get(name);
            System.out.println(name + " " + location);
        }
        System.out.println("---------------------------------");
        while(true){
            System.out.print("도시 이름 >> ");
            String str = scanner.next();
            if(str.equals("그만")){
                break;
            }
            Location location = hash.get(str);
            if(location == null){
                System.out.println(str + "는 없습니다");
            }
            else{
                System.out.println(str + " " + location);
            }
        }
        scanner.close();
    }
}
