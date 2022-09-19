package spring.annotation.bean.example;

public class JavaClass {
    private String name;
    public JavaClass(String name){
        this.name = name;
    }
    public String getObjectName() {
        return this.name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}