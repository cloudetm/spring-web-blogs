package pl.dmichalski.rss.service;

import pl.dmichalski.rss.entity.UserEntity;

import java.util.List;

/**
 * Author: Daniel
 */
public interface IUserService {

    List<UserEntity> findAll();

    UserEntity findOne(Long id);

    UserEntity findOne(String username);

    UserEntity findOneWithAllBlogs(Long id);

    UserEntity findOneWithAllBlogs(String name);

    void saveUser(UserEntity userEntity);

    void removeUser(Long id);

}
