package com.keeper.national.center_security.mapper;

import com.keeper.national.center_security.domain.UmsPermission;
import com.keeper.national.center_security.domain.UmsPermissionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName UmsPermissionMapper
 * @Descriptino TODO
 * @Author myzhen
 * @Date 2020/5/9 下午2:25
 * @Version 1.0
 **/
@Mapper
@Component
public interface UmsPermissionMapper {

    long countByExample(UmsPermissionExample example);

    int deleteByExample(UmsPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsPermission record);

    int insertSelective(UmsPermission record);

    List<UmsPermission> selectByExample(UmsPermissionExample example);

    UmsPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);

    int updateByExample(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);

    int updateByPrimaryKeySelective(UmsPermission record);

    int updateByPrimaryKey(UmsPermission record);
}
