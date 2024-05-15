public class ArturClass {
    public static void main(String[] args) {
        Student[] studentArray = new Student[35];// пустые 35 коробок

        for (int i = 0; i < studentArray.length; i++) {
            Student student = new Student();
            int[] generatedPointArray = new int[8];
            for (int x = 0; x < generatedPointArray.length; x++) {
                generatedPointArray[x] = (int) (Math.random() * 5) + 1;
            }
            student.pointArray = generatedPointArray;
            studentArray[i] = student;
        }


        for (int i = 0; i < studentArray.length; i++) {
            int[] studentPoints = studentArray[i].pointArray;
            int sum = 0;
            for (int x = 0; x < studentPoints.length; x++) {
                sum = sum + studentPoints[x];
            }
            studentArray[i].averagePoint = (double) sum / studentPoints.length;

        }
//        int sum = 0;
//        for (int num : generatedPointArray) {
//            sum = num + sum;
//        }
//        return ((double) sum / generatedPointArray.length);

        for (Student student : studentArray) {
            System.out.println(student);

        }
    }
}




