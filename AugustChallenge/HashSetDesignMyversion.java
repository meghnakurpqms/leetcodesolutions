class MyHashSet {
    HashMap map;int idx;
    /** Initialize your data structure here. */
    public MyHashSet() {
        map = new HashMap<>();
        idx = 0;
    }
    
    public void add(int key) {
        if(!map.containsKey(key))
            map.put(key,idx++);
    }
    
    public void remove(int key) {
        map.remove(key,map.get(key));
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(map.containsKey(key))
            return true;
        else return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */