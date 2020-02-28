package dao;

import entity.user;

import java.util.List;

public interface UserDao {
    public List<user> showall();
    public void add(user user);
    public void delete();
    public void update();
    public void show();
    public user queryone();
}
