package com.peppo.service;

import com.peppo.entity.TodoList;
import com.peppo.repository.TodoListRepository;

public class TodoListServiceImp implements TodoListService{

    private final TodoListRepository todoListRepository;

    public TodoListServiceImp(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        TodoList[] model = todoListRepository.getAll();

        System.out.println("TodoList");
        if (model.length == 0) return;

        for (int i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        TodoList todoList = new TodoList(todo);
        todoListRepository.add(todoList);
        System.out.println("sukses menambahkan todo: " + todo);
    }

    @Override
    public void removeTodoList(Integer no) {
        boolean success = todoListRepository.remove(no);
        if (success) {
            System.out.println("berhasil menghapus todo: " + no);
        }
        if (!success) {
            System.out.println("gagal memnghapus todo: " + no);
        }
    }
}
