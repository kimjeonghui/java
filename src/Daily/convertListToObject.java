package Daily;

import java.util.HashMap;

public class convertListToObject {
    public HashMap<String, String> convertListToHashMap(String[][] arr) {
        //해시맵 선언
        //for(arr.length)
        //if(arr[i].length ==0 )
        //if(해시맵에 key가 이미 존재하는 경우 ) continue;
        HashMap<String, String> map = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            if(arr[i].length == 0 ) continue;
            if(map.containsKey(arr[i][0]))continue;
            else{
                map.put(arr[i][0], arr[i][1]);
            }
        }

        return map;

    }
}
