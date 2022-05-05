package ru.netology.domain;

public class Manager {

    private int managerLimit = 10;

    public Manager() {

    }

    public Manager(int managerLimit) {
        this.managerLimit = managerLimit;
    }

    private String[] items = new String[0];

    public void addMovie (String title) {
        String[] tmp = new String[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = title;
        items = tmp;
    }

    public String[] findAll() {
        return items;
    }

    public String[] findLast() {
        int resultLength;
        if (managerLimit > items.length) {
            resultLength = items.length;
        } else {
            resultLength = managerLimit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public void setTitles(String[] items) {
        this.items = items;
    }

}
