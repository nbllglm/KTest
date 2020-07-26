package gz.example.ktest;

import java.util.List;

public class SeqList_gz<T> {
    protected Object[] element;
    protected int size;

    public SeqList_gz(int size) {
        if (size > 0) {
            this.size = size;
            this.element = new Object[size];
        } else {
            this.size = 64;
            this.element = new Object[size];
        }
    }

    public SeqList_gz(T[] data) {
        this(data.length);
        for (int i = 0; i < data.length; i++) {
            this.element[i] = data[i];
        }
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public int size() {
        return this.size > 0 ? size : -1;
    }

    public T get(int index) {
        if (index >= 0) {
            return element[index] != null ? (T) element[index] : null;
        }
        return null;
    }

    public void set(int index, T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        if (!(index >= 0)) {
            index = 0;
        }
        element[index] = t;
    }

    @Override
    public String toString() {
        String str = "";
        if (element != null && size > 0) {
            for (int i = 0; i < size; i++) {
                str += (String) element[i];
                if (i != size - 1) {
                    str += "\n";
                }
            }
        }
        System.out.println(str);
        System.out.println("-----------");
        return str;
    }

    public void insert(int index, T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        if (index < 0) {
            index = 0;
        } else if (index > size) {
            index = size;
        }
        Object[] new_elements = new Object[2 * size];
        for (int i = 0; i < index; i++) {
            new_elements[i] = element[i];
        }
        new_elements[index] = t;
        for (int i = index; i < size; i++) {
            new_elements[i + 1] = element[i];
        }
        this.element = new_elements;
        this.size = element.length;
    }

    public void add(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        Object[] new_elements = new Object[2 * size];
        for (int i = 0; i < size; i++) {
            new_elements[i] = element[i];
        }
        new_elements[size] = t;
    }

    public void remove(int index) {
        if (index < 0) {
            index = 0;
        } else if (index > size - 1) {
            index = size - 1;
        }
        Object[] new_elements = new Object[2 * size];
        for (int i = 0; i < index; i++) {
            new_elements[i] = element[i];
        }
        new_elements[index] = null;
        for (int i = index; i < size; i++) {
            new_elements[i + 1] = element[i];
        }
        this.element = new_elements;
        this.size = element.length;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            element[i] = 0;
        }
    }

    public int indexOf(T key) {
        if (key == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < size; i++) {
            if (key.equals(element[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T key) {
        if (key == null) {
            throw new NullPointerException();
        }
        return indexOf(key) >= 0 ? true : false;
    }

    public void addAll(List<T> list) {
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                add(list.get(i));
            }
        }
    }

}