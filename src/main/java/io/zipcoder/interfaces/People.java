package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class People implements Iterable<Person> {
    private final List<Person> personList;

    public People() {
        personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person individual : personList) {
            if (individual.getId() == id) return individual;
        }
        return null;
    }

    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long id) {
        for (Person individual : personList) {
            if (individual.getId() == id) {
                personList.remove(individual);
            }
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }

    @Override
    public void forEach(Consumer<? super Person> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Person> spliterator() {
        return Iterable.super.spliterator();
    }
}
