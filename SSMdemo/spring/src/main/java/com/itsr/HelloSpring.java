package com.itsr;

/**
 * @author liusr
 * @create 2022-03-22
 * @package com.itsr
 */
public class HelloSpring {
    private String message;

    public void getMessage() {
        System.out.println("your message"+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
