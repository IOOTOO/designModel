package org.iootoo.design.principle.opencolse;

public class JavaCourse implements  ICourse {
    private Integer ID;
    private String Name;
    private Double price;

    public JavaCourse(Integer ID, String name, Double price) {
        this.ID = ID;
        this.Name = name;
        this.price = price;
    }

    @Override
    public Integer getID() {
        return this.ID;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return
                "课程ID:" + ID +
                ", 课程名称:" + Name + '\'' +
                ", 课程价格:" + price ;
    }
}
