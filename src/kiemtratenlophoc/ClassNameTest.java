package kiemtratenlophoc;

public class ClassNameTest {
    private static String[] classname = new String[]{"C0618G", "A7890L"};
    private static String[] unclassname=new String[]{"h00099g","ahdjkahajd","-jsdkhkh"};

    public static void main(String[] args) {
        ClassName className = new ClassName();
        for (String classname : classname) {
            boolean check = className.getName(classname);
            System.out.println("Class name " + classname + " la ten lop:" + check);
        }

        System.out.println("-----------------------------------");

        for (String classname : unclassname) {
            boolean check = className.getName(classname);
            System.out.println("Class name " + classname + " la ten lop:" + check);        }
    }
}
