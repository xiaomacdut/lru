public class LRUCache{
    
    private int capacity;
    private LinkedHashMap<Integer, Integer> map;
    
    public LRUCache(int capacity){
        this.capacity = capacity;
        this.map = new LinkedHashMap<>();
    }
    
    public int get(int key){
        Integer value = this.map.get(key);
        if(value == null){
            value = -1;
        }else{
            this.set(key, value);
        }
        return value;
    }
    
    public void set(int key, int value){
        if(this.map.containsKey(key)){
            this.map.remove(key);
        }else if(this.map.size() == this.capacity){
            Iterator<Integer> it = this.map.keySet().iterator();
            it.next();
            it.remove();
        }
        map.put(key, value);
    }
    
    
    /**
     * @return the capacity
     */
    public int getCapacity(){
        return capacity;
    }
    
    
    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    
    /**
     * @return the map
     */
    public LinkedHashMap<Integer, Integer> getMap(){
        return map;
    }
    
    
    /**
     * @param map the map to set
     */
    public void setMap(LinkedHashMap<Integer, Integer> map){
        this.map = map;
    }
