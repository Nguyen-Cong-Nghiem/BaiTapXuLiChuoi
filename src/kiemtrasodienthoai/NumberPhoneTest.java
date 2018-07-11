package kiemtrasodienthoai;

public class NumberPhoneTest {
    public static void main(String[] args) {
        NumberPhone numberPhone = new NumberPhone();
        for (String numberphone : validnumber) {
            boolean test = numberPhone.check(numberphone);
            System.out.println("So phone " + numberphone + " la so phone:" + test);
        }
        System.out.println("----------------------------------");
        for (String numberphone : invalidnumber) {
            boolean test = numberPhone.check(numberphone);
            System.out.println("So phone " + numberphone + " la so phone:" + test);
        }

    }

    private static String[] validnumber = new String[]{"09-0943666309", "19-0876890088"};
    private static String[] invalidnumber=new String[]{"090943666309","n0-091jji2343","09-1234409832844"};

}
