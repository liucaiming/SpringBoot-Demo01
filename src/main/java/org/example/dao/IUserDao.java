package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.vo.User;
import java.util.List;

@Mapper
public interface IUserDao {

    List<User> findUserInfo();
}
