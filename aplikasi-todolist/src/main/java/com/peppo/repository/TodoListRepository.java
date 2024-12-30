package com.peppo.repository;

import com.peppo.entity.TodoList;

public interface TodoListRepository {

    TodoList[] getAll();

    boolean remove(Integer no);

    void add(TodoList todoList);

}
