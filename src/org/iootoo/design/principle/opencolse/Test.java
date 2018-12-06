package org.iootoo.design.principle.opencolse;

/**
 *  开闭原则测试类
 */
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(98, "java设计模式", 98.5);
        System.out.println(javaCourse.getPrice());
    }
}
