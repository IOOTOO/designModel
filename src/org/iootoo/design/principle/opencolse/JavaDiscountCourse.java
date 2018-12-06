package org.iootoo.design.principle.opencolse;

import org.iootoo.utils.Arith;

public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer ID, String name, Double price) {
        super(ID, name, price);
    }

    /**
     * 获取课程原价
     * @return
     */
    public Double getOriginPrice(){
        return super.getPrice();
    }

    /**
     * 获取打折后价格(实际价格)
     * @return
     */
    @Override
    public Double getPrice() {

       return  Arith.mul(super.getPrice(),0.8);
    }
}
