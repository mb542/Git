package dao;

import entity.user;

import java.util.List;

public interface UserDao {
    public List<user> showall();
    public void add(user user);
    public void delete();
}
