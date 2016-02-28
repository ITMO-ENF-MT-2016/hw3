package ru.ifmo.mt.skiplist;

public class IntSkipListMap<T> {

    /**
     * Returns the number of key-value mappings in this map.
     * This operation is wait-free.
     *
     * @return the number of key-value mappings in this map.
     * TODO: please, implement me!!!
     */
    public int size() {
        return 0;
    }

    /**
     * Returns the value to which the specified key is mapped,
     * or {@code null} if this map contains no mapping for the key.
     * This operation is wait-free.
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or
     * <tt>null</tt> if this map contains no mapping for the key.
     * TODO: please, implement me!!!
     */
    public T get(int key) {
        return null;
    }

    /**
     * Associates the specified value with the specified key in this map.
     * If the map previously contained a mapping for
     * the key, the old value is replaced by the specified value.
     * This operation is lock-free.
     *
     * @param key   key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with <tt>key</tt>, or
     * <tt>null</tt> if there was no mapping for <tt>key</tt>.
     * TODO: please, implement me!!!
     */
    public T put(int key, T value) {
        return null;
    }

    /**
     * Removes the mapping for a key from this map if it is present,
     * This operation is lock-free.
     *
     * @param key key whose mapping is to be removed from the map
     * @return the previous value associated with <tt>key</tt>, or
     * <tt>null</tt> if there was no mapping for <tt>key</tt>.
     * TODO: please, implement me!!!
     */
    public T remove(int key) {
        return null;
    }
}
