import java.util.HashMap;

public class LibraryCollection<T>{
    private HashMap<String, T> items;

    public LibraryCollection(HashMap<String, T> items){
        this.items = items;
    }

    public T getItems(String key){
        return this.items.get(key);
    }

    public void addItems(String key, T item){
        this.items.put(key, item);
    }

    public HashMap<String, T> getAllItems(){
        return items;
    }
}
