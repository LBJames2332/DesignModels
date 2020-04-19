package Strategy.Comparator;

interface MyComparator<T> {

    /**
     * 对一件事可能有很多策略
     * 因此定义一个“策略者”的抽象类或者接口‘
     * 我们只需要继承or实现它
     * 重写它的采取策略的方法
     * 则可以扩展多种策略
     */

    int compare(T o1,T o2);
}
