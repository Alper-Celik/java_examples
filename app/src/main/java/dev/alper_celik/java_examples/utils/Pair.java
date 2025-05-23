package dev.alper_celik.java_examples.utils;

public class Pair<K, V> {
  K key;
  V value;

  public K getKey() {
    return key;
  }

  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  public Pair(K key, V value) {
    setKey(key);
    setValue(value);
  }
}
