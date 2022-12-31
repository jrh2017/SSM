package com.jiang.spring.pojo;

/**
 * @author jiangronghua
 */
public class User {

    private Integer id;
    private Integer age;
    private String username;
    private String password;

    public User() {
        System.out.println("生命周期1： 实例化");
    }

    public User(Integer id, Integer age, String username, String password) {
        this.id = id;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("生命周期2： 依赖注入");
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void initMethod() {
        System.out.println("生命周期3：初始化");
    }

    public void destroyMethod() {
        System.out.println("生命周期4：销毁");
    }
}
