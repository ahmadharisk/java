package view;

import com.peppo.repository.TodoListRepository;
import com.peppo.repository.TodoListRepositoryImp;
import com.peppo.service.TodoListService;
import com.peppo.service.TodoListServiceImp;
import com.peppo.view.TodoListView;

public class TodoListViewTest {

    public static void main(String[] args) {
        testShowTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImp();
        TodoListService todoListService = new TodoListServiceImp(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("makan");
        todoListService.addTodoList("minum");
        todoListService.addTodoList("olahraga");

        todoListView.showTodoList();
    }

}
