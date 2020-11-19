package Prac;

import java.util.EventObject;

/**
 * @Title: ValueChangeEvent.java
 * @Package
 * @Description:
 * @author Mr.Simple bboyfeiyu@gmail.com
 * @date Apr 5, 2013 2:10:39 PM
 * @version V1.0
 */


/**
 * 事件类,包含了事件源
 * @ClassName: ValueChangeEvent
 * @Description:
 * @author Mr.Simple
 * @date Apr 5, 2013 2:12:37 PM
 *
 */
public class ButtonClickEvent extends EventObject {

    /**
     * 字段：
     */
    private static final long serialVersionUID = 1L;
    // 事件源
    private Object mSourceObject = null;
    private String mTag = "";

    /**
     * 构造函数
     * @param sObject
     */
    public ButtonClickEvent(Object sObject){
        super(sObject);
        mSourceObject = sObject;
    }

    /**
     * 构造函数
     * @param sObject
     * @param tag
     */
    public ButtonClickEvent(Object sObject, String  tag){
        super(sObject);
        mSourceObject = sObject;
        mTag = tag;
    }

    /**
     * 获取事件源
     * (non-Javadoc)
     * @see java.util.EventObject#getSource()
     */
    public Object getSource() {
        return mSourceObject;
    }

    /**
     *
     * @Title: setSource
     * @Description: 设置事件源
     * @param obj
     * @return void
     * @throws
     */
    public void setSource(Object obj) {
        mSourceObject = obj;
    }

    /**
     *
     * @Title: getTag
     * @Description: 获得tag
     * @return
     * @return String
     * @throws
     */
    public String getTag(){
        return mTag;
    }

    /**
     *
     * @Title: setTag
     * @Description: 设置tag
     * @param tag
     * @return void
     * @throws
     */
    public void setTag(String tag) {
        mTag = tag;
    }

}
