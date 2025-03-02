package com.wtc.api.clone;

import java.util.Arrays;

// Cloneable 是标记性接口，表示当前对象可被克隆
public class User implements Cloneable {
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", path=" + path + ", data="
                + Arrays.toString(data) + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int[] data = this.data;

        int[] newData = new int[data.length];
        // 拷贝数据
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        User u = (User) super.clone();
        u.setData(newData);

        return u;
    }

}
