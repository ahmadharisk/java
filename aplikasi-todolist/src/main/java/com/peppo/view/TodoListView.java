package com.peppo.view;

import com.peppo.service.TodoListService;
import com.peppo.util.InputUtil;

public class TodoListView {

    private final TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodoList() {
        while (true) {
            System.out.flush();
            todoListService.showTodoList();

            System.out.println("Menu: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = InputUtil.input("Pilih");
            switch (input) {
                case "1":
                    addTodoList();
                    break;
                case "2":
                    removeTodoList();
                    break;
                case "x":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ditemukan");
                    break;
            }
        }
    }

    public void addTodoList() {
        System.out.println("Menambah todolist");

        var input = InputUtil.input("todo (x jika batal)");
        if (!input.equals("x")) {
            todoListService.addTodoList(input);
        }
    }

    public void removeTodoList() {
        System.out.println("Menghapus todolist");
        todoListService.showTodoList();

        var input = InputUtil.input("todo (x jika batal");
        if (!input.equals("x")) {
            try {
                todoListService.removeTodoList(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                System.out.println("pilihan tidak ditemukan");
            }
        }
    }

}
