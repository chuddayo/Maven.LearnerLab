package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class People<E extends Person> implements Iterable<E> {
    private final List<E> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E individual : personList) {
            if (individual.getId() == id) return individual;
        }
        return null;
    }

    public boolean contains(E person) {
        return personList.contains(person);
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public void remove(long id) {
        for (E individual : personList) {
            if (individual.getId() == id) {
                personList.remove(individual);
                break;
            }
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public abstract E toArray();

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
        return Iterable.super.spliterator();
    }
}
