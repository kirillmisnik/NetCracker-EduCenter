package edu.netcracker.tasks.task2.voice;

public class Cat implements Voice {
    /**
     * Подаёт голос (выводит сообщение в консоль)
     */
    @Override
    public void voice() {
        System.out.println("Meow");
    }
}
