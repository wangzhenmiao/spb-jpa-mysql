package com.wangzhen.repository;

import com.wangzhen.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @ClassName UserRepository
 * @Description
 * @Author wangzhen
 * @Date 2018/10/28 下午4:31
 **/
public interface UserRepository extends CrudRepository<User,Long> {
}

