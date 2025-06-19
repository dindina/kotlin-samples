public class InvokeKotlinFromJava {

    public static void main(String[] args) {
        var course = new Course(1,"name","tech");

        System.out.println(course);

        CourseUtils.printName1();
        CourseUtils.printNameNew("dinesh");
        CourseUtils.Companion.printName2("dinesh");
        //CourseUtils.printName2("dinesh");

    }
}
