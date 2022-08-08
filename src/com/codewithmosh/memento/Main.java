package com.codewithmosh.memento;

public class Main {

    public static void main(String[] args) {
        // memento
        Editor editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.CreateState());

        editor.setContent("b");
        history.push(editor.CreateState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }


}
