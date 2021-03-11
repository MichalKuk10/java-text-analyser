public interface ToDoItemInterface{

    List<ToDoItem> getToDoItems();

    ToDoItem getToDoItem(int id);

    void update(ToDoItem item);

    void delete(int d);

    void create(ToDoItem item);
    



    
}