import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new LinkedHashMap<>();
        
        
        for(int i =0; i<players.length; i++){
            map.put(players[i],i);
        }
        
        for(String name : callings){
            int idx = map.get(name);
            if(idx ==0) continue;
            
            String front = players[idx-1];
             players[idx - 1] = name;
             players[idx] = front;
            
            map.put(name, idx - 1);
            map.put(front, idx);
        }
        return players;
    }
}