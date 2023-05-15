package oo;

import java.util.Arrays;
import java.util.Collection;

public class TimeSeriesMain {
    public static void main(String[] args) {

        // JavaTimeSeries used in Java
        JavaTimeSeries<Person> peopleData = new JavaTimeSeries<>();
        peopleData.add(new Person());
        peopleData.add(new Student());

        Collection<Student> students = Arrays.asList(new Student(), new Student());
        // peopleData.addAll(students); // No covariance (when used from Java!)
        peopleData.addAllCovariant(students); // Covariance via <? extends E>

        // TimeSeries from Kotlin used in Java
        TimeSeries<Person> peopleDataKt = new TimeSeries<>();
        peopleDataKt.add(new Person());
        peopleDataKt.add(new Student());

        peopleDataKt.addAll(students); // Covariance
    }

}
