import java.util.regex.Pattern;

public class C3 {
    private String fileName;
    C3(String fileName)
    {
        this.fileName = fileName;
    }

    public String m1()
    {
        String name = fileName.split(Pattern.quote("."))[0];
        return name;
    }
    public String m2()
    {
        String ext = "." + fileName.split(Pattern.quote("."))[1];
        return ext;
    }
    public static void main(String[] args) {
        System.out.println(new C3("myprogram.cxs").m1());
        System.out.println(new C3("myprogram.cxs").m2());
        }
}
