package com.peppo;


import com.peppo.repository.TodoListRepository;
import com.peppo.repository.TodoListRepositoryImp;
import com.peppo.service.TodoListService;
import com.peppo.service.TodoListServiceImp;
import com.peppo.view.TodoListView;

import java.util.Scanner;

public class Main {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryImp();
        TodoListService todoListService = new TodoListServiceImp(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();
    }

    public static void showTodoList() {
        System.out.println("TodoList");
        if (model.length == 0) return;

        for (int i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "belajar";
        model[1] = "makan";
        showTodoList();
    }

    public static void addTodoList(String todo) {
        var isFull = true;
        for (String s : model) {
            if (s == null) {
                isFull = false;
                break;
            }
        }

        if (isFull) {
            var temp = model;
            model = new String[temp.length * 2];

            System.arraycopy(temp, 0, model, 0, temp.length);
        }

        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(Integer copy) {
        for (int i = 0; i < copy; i++) {
            addTodoList("todo ke " + i);
        }
    }

//    public static boolean removeTodoList(Integer no) {
//        if ((no - 1) < 0) return false;
//        if ((no - 1) > model.length) return false;
//        if (model[no - 1] == null) return false;
//
//        if (no - 1 == model.length) {
//            model[no - 1] = null;
//            return true;
//        }
//
//        model[no - 1] = null;
//        for (int i = (no - 1); i < model.length; i++) {
//            if (i + 1 >= model.length) {
//                model[i] = null;
//                break;
//            }
//            ;
//            model[i] = model[i + 1];
//        }
//        return true;
//    }

//    public static void testRemoveTodoList() {
//        testAddTodoList(10);
//
//        var result4 = removeTodoList(9);
//        System.out.println(result4);
//
//        showTodoList();
//    }

    public static String input(String info) {
        System.out.print(info + " : ");
        var input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void testInputTodoRequest() {
        var name = input("Nama");
        System.out.println("Hi " + name);
    }

//    public static void viewShowTodoList() {
//        while (true) {
//            showTodoList();
//
//            System.out.println("Menu: ");
//            System.out.println("1. Tambah");
//            System.out.println("2. Hapus");
//            System.out.println("x. Keluar");
//
//            var input = input("Pilih");
//            switch (input) {
//                case "1":
//                    viewAddTodoList();
//                    break;
//                case "2":
//                    viewRemoveTodoList();
//                    break;
//                case "x":
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Pilihan tidak ditemukan");
//                    break;
//            }
//        }
//    }

//    public static void testViewShowTodoList() {
//        testAddTodoList(5);
//        viewShowTodoList();
//    }

    public static void viewAddTodoList() {
        System.out.println("Menambah todolist");

        var input = input("todo (x jika batal)");
        if (!input.equals("x")) {
            addTodoList(input);
        }
    }

    public static void testViewAddTodoList() {
        viewAddTodoList();

        showTodoList();
    }

//    public static void viewRemoveTodoList() {
//        System.out.println("Menghapus todolist");
//        showTodoList();
//
//        var input = input("todo (x jika batal");
//        if (!input.equals("x")) {
//            try {
//                removeTodoList(Integer.parseInt(input));
//            } catch (NumberFormatException e) {
//                System.out.println("pilihan tidak ditemukan");
//            }
//        }
//    }

//    public static void testViewRemoveTodoList() {
//        testAddTodoList(5);
//        viewRemoveTodoList();
//
//        showTodoList();
//    }
}