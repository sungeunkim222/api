// src\main\java\com\run\api\global\dao\UserMapper.java
// DAO 파일명은 mybtis-config.xml의 이름과 mapper.xml의 namespace와 맞춰주자.

package com.run.api.global.dao;

import java.util.List;
import com.run.api.global.dto.user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    List<user> getUserList();
}