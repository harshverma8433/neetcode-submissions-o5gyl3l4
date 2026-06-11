class TimeMap {

    Map<String , Map<Integer , List<String>>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
           if(!map.containsKey(key)){
            Map<Integer , List<String>> m = new HashMap<>();
            List<String> list = new ArrayList<>();
            list.add(value);
            m.put(timestamp,list);
            map.put(key , m);
            return;
        }
        Map<Integer,List<String>> val = map.get(key);
        if(val.containsKey(timestamp)){
            List<String> l = val.get(timestamp);
            l.add(value);
            val.put(timestamp , l);
            map.put(key , val);
        }else{
            List<String> list = new ArrayList<>();
            list.add(value);
            val.put(timestamp,list);
            map.put(key , val);
            return;
        }

    }
    
    public String get(String key, int timestamp) {
       Map<Integer, List<String>> v = map.get(key);
        if (v == null) return "";  

        int time = timestamp;
        while (time >= 0) {
            List<String> l = v.get(time);
            if (l != null && !l.isEmpty()) {
                return l.get(l.size() - 1);
            }
            time--; 
        }
        return ""; 

        
    }

        
    
}
