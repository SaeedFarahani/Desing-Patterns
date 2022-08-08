package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory  {

    private String[] urls = new String[10];
    private int count;

    public void push(String url){
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public int size() {
        return urls.length;
    }

    public String get(int index) {
        return urls[index];
    }

    public Iterator createIterator(){
         return new ArrayIterator(this);
    }

    public class ListIterator implements Iterator{

        private BrowserHistory history;
        private int index;
        public ListIterator(BrowserHistory history){

            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.size());
        }

        @Override
        public String current() {
            return history.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }


    public class ArrayIterator implements Iterator{

        private BrowserHistory history;
        private int index;
        public ArrayIterator(BrowserHistory history){

            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index<history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
