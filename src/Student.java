import java.util.Arrays;

public class Student {
    int [] pointArray = new int[8]; //8 оценок за год
    double averagePoint; // средняя годовая оценка

    @Override
    public String toString() {
        return "Student{" +
                "pointArray=" + Arrays.toString(pointArray) +
                ", averagePoint=" + averagePoint +
                '}';
    }
}
