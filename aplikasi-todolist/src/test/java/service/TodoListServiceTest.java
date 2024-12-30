package service;

import com.peppo.entity.TodoList;
import com.peppo.repository.TodoListRepository;
import com.peppo.repository.TodoListRepositoryImp;
import com.peppo.service.TodoListService;
import com.peppo.service.TodoListServiceImp;

public class TodoListServiceTest {

    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepositoryImp todoListRepository = new TodoListRepositoryImp();
        todoListRepository.data[0] = new TodoList("Belajar");
        todoListRepository.data[1] = new TodoList("Makan");
        todoListRepository.data[2] = new TodoList("Minum");

        TodoListService todoListService = new TodoListServiceImp(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImp();
        TodoListService todoListService = new TodoListServiceImp(todoListRepository);

        todoListService.addTodoList("Belajar");
        todoListService.addTodoList("Makan");
        todoListService.addTodoList("Minum");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImp();
        TodoListService todoListService = new TodoListServiceImp(todoListRepository);

        todoListService.addTodoList("Belajar");
        todoListService.addTodoList("Makan");
        todoListService.addTodoList("Minum");

        todoListService.showTodoList();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
    }

}
