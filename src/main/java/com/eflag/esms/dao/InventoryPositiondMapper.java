package com.eflag.esms.dao;

import com.eflag.esms.model.InventoryPositiond;
import com.eflag.esms.model.InventoryPositiondExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InventoryPositiondMapper extends BaseMapper {
    int countByExample(InventoryPositiondExample example);

    int deleteByExample(InventoryPositiondExample example);

    int deleteByPrimaryKey(String id);

    int insert(InventoryPositiond record);

    int insertSelective(InventoryPositiond record);

    List<InventoryPositiond> selectByExample(InventoryPositiondExample example);

    InventoryPositiond selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InventoryPositiond record, @Param("example") InventoryPositiondExample example);

    int updateByExample(@Param("record") InventoryPositiond record, @Param("example") InventoryPositiondExample example);

    int updateByPrimaryKeySelective(InventoryPositiond record);

    int updateByPrimaryKey(InventoryPositiond record);
}