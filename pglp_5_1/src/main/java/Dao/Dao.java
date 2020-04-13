package Dao;

public interface Dao<T> {

	 	T create(T obj);
	    
	    T find(String id);
	   
	    T update(T obj);
	  
	    void delete(T obj);
	
}
