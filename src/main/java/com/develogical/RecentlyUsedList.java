package com.develogical;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {
    private List<String> items = new ArrayList<>();

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void add(String item) {
        items.remove(item);
        this.items.add(0, item);
    }

    public String get(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }
}