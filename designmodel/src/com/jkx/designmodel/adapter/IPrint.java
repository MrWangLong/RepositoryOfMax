package com.jkx.designmodel.adapter;

/**
 * 需求:打印接口
 * @author jkx
 *
 */
public interface IPrint {
   //弱化打印 	
   public  abstract void printWeak();
   //强化打印
   public  abstract void printStrong();
}
