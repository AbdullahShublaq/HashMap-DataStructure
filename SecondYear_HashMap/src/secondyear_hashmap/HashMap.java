/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondyear_hashmap;

/**
 *
 * @author Abdullah Shublaq
 * @param <E>
 * @param <T>
 */
public class HashMap<E, T> {

    int LIMIT = 11500;
    Object[] entries;
    Object[] keySet;
    Object[] values = new Object[LIMIT];

    public HashMap() {
        this.entries = new Object[LIMIT];
        this.keySet = new Object[LIMIT];
        this.values = new Object[LIMIT];
    }

    public boolean put(E key, T value) {
        Entry<E, T> entry = new Entry(key, value);
        int index = Math.abs(key.hashCode()) % LIMIT;

        for (int i = index; i < entries.length; i++) {
            if (entries[i] == null) {
                entries[i] = (Entry<E, T>) entry;
                keySet[i] = (E) key;
                values[i] = (T) value;
                return true;
            }
        }

        return false;
    }

    public T get(E key) {
        int index = Math.abs(key.hashCode()) % LIMIT;

        for (int i = index; i < entries.length; i++) {
            if (keySet[i].equals(key)) {
                return (T) values[i];
            }
        }
        return null;
    }
}
