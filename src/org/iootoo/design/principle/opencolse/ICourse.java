package org.iootoo.design.principle.opencolse;

/**
 * 课程接口
 */
public interface ICourse {
    /**
     * 获取课程ID
     * @return
     */
    Integer getID();

    /**
     * 获取课程名称
     *
     * @return
     */
    String getName();

    /**
     * 获取课程价格
     * @return
     */
    Double getPrice();
}
