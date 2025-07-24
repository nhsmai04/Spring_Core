public class StudentService {
    public void study(){
        System.out.println("Studying...");
    }

    public void fail() {
        System.out.println("Crash!");
        throw new RuntimeException("Failed the exam!");
    }
}
