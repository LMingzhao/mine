package com.common.dao.dbmain;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.common.dao.dbmain.mybatis.DefDataSourcePO;
import com.common.dao.dbmain.mybatis.DefDataSourcePOCriteria;

public interface DefDataSourcePOMapper {
    long countByExample(DefDataSourcePOCriteria example);

    int deleteByExample(DefDataSourcePOCriteria example);

    int deleteByPrimaryKey(String dataSoureceKey);

    int insert(DefDataSourcePO record);

    int insertSelective(DefDataSourcePO record);

    List<DefDataSourcePO> selectByExample(DefDataSourcePOCriteria example);

    DefDataSourcePO selectByPrimaryKey(String dataSoureceKey);

    int updateByExampleSelective(@Param("record") DefDataSourcePO record, @Param("example") DefDataSourcePOCriteria example);

    int updateByExample(@Param("record") DefDataSourcePO record, @Param("example") DefDataSourcePOCriteria example);

    int updateByPrimaryKeySelective(DefDataSourcePO record);

    int updateByPrimaryKey(DefDataSourcePO record);
}