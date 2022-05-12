package com.chainsys.finals;

public class ShapeAPrivateConstructor {

	public int height;
    public int width;
    private ShapeAPrivateConstructor()
    {
        System.out.println("ShapeA CreatedA"+hashCode());
    }
    private ShapeAPrivateConstructor(int x)
    {
        height=x;width=x;
        System.out.println(x+"Shape CreatedB"+hashCode());
    }
    public static ShapeAPrivateConstructor getObject()//factory method
    {
        return new ShapeAPrivateConstructor();//call to private constructor
    }
public void echo()
    {
        System.out.println("Echo....");
    }
}
