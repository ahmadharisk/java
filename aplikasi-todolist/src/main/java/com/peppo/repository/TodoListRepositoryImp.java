package com.peppo.repository;

import com.peppo.entity.TodoList;

public class TodoListRepositoryImp implements TodoListRepository{

    public TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    @Override
    public boolean remove(Integer no) {
        if ((no - 1) < 0) return false;
        if ((no - 1) > data.length) return false;
        if (data[no - 1] == null) return false;

        if (no - 1 == data.length) {
            data[no - 1] = null;
            return true;
        }

        data[no - 1] = null;
        for (int i = (no - 1); i < data.length; i++) {
            if (i + 1 >= data.length) {
                data[i] = null;
                break;
            }
            data[i] = data[i + 1];
        }
        return true;
    }

    @Override
    public void add(TodoList todo) {
        resizeIsFull();

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todo;
                break;
            }
        }
    }

    public void resizeIsFull() {
        if (isFull()) {
            var temp = data;
            data = new TodoList[temp.length * 2];

            System.arraycopy(temp, 0, data, 0, temp.length);
        }
    }

    public boolean isFull() {
        var isFull = true;
        for (TodoList s : data) {
            if (s == null) {
                isFull = false;
                break;
            }
        }

        return isFull;
    }
}
