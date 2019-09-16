package c.c.k.biz;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "user")
public class User {
    public User(String name){
        this.name = name;
    }

    public User(){

    }

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}