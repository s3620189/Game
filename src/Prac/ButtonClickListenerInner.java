package Prac;

import java.util.EventListener;

/**
 *
 * @ClassName: ButtonClickListenerInner
 * @Description: 内部类的写法
 * @author Mr.Simple
 * @date Apr 5, 2013 2:41:02 PM
 *
 */
public class ButtonClickListenerInner implements EventListener {
    /**
     *
     * @Title: ItemClicked
     * @Description: 点击事件
     * @param event
     * @return void
     * @throws
     */
    public void ButtonClicked(ButtonClickEvent event ) {
        // 获取事件源
        ButtonDemo source = (ButtonDemo)event.getSource();
        System.out.println("内部静态监听类@_@ 你点击的是 : " + source.getItemString()) ;
    }
}