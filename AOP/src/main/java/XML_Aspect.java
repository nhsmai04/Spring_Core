public class XML_Aspect {
    public void logBeforeStudy() {
        System.out.println("[AOP-XML] Before study");
    }

    public void logAfterStudy() {
        System.out.println("[AOP-XML] After study");
    }

    public void logAfterReturning(Object A) {
        System.out.println("[AOP_XML] Study method executed successfully");
    }
}
