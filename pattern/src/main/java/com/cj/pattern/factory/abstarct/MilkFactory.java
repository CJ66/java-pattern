/*******************************************************************************
 * @(#)MilkFactory.java 2018年4月18日
 *
 * Copyright 2018 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.cj.pattern.factory.abstarct;

import com.cj.pattern.factory.Milk;
import com.cj.pattern.factory.MnMilk;
import com.cj.pattern.factory.YlMilk;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2018年4月18日 上午9:54:40
 */
public class MilkFactory extends AbstarctFactory{

    /** 
     * getMnMilk TODO 这里请补充overriding方法的简要说明
     * @return TODO 请在每个@param,@return,@throws行尾补充对应的简要说明
     * @see AbstarctFactory#getMnMilk()
     */
    @Override
    public Milk getMnMilk() {
        return new MnMilk();
    }

    /** 
     * getYlMilk TODO 这里请补充overriding方法的简要说明
     * @return TODO 请在每个@param,@return,@throws行尾补充对应的简要说明
     * @see AbstarctFactory#getYlMilk()
     */
    @Override
    public Milk getYlMilk() {
        return new YlMilk();
    }

}
