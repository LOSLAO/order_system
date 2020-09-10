package test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//演示gson的用法
public class TestGson {
    static class Student {
        private String name;
        private int id;
        private double score;

        public Student(String name, int id, double score) {
            this.name = name;
            this.id = id;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        //1.实例化Gson对象（工厂模式)
        Gson gson = new GsonBuilder().create();
        //2.把一个对象转成JSON字符串
//        Student student = new Student("LA", 1, 99);
//        String jsonString = gson.toJson(student);
//        System.out.println(jsonString);
        //3.把一个JSON字符串转回成一个对象
        String str = "{\"name\":\"LA\",\"id\":1,\"score\":99.0}";
        Student s = gson.fromJson(str, Student.class);
        System.out.println(s.id + ", " + s.name + ", " + s.score);
    }
}
