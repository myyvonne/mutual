package com.thumb.service.impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thumb.pojo.OmsOrder;
import com.thumb.mapper.OmsOrderMapper;
import com.thumb.service.OmsOrderService;

import java.util.Date;

@Service
public class OmsOrderServiceImpl implements OmsOrderService{

    @Resource
    private OmsOrderMapper omsOrderMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return omsOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OmsOrder record) {
        return omsOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(OmsOrder record) {
        return omsOrderMapper.insertSelective(record);
    }

    @Override
    public OmsOrder selectByPrimaryKey(Long id) {
        return omsOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrder record) {
        return omsOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OmsOrder record) {
        return omsOrderMapper.updateByPrimaryKey(record);
    }

    @Override
    public Long countByCreateTime(@Param("starTime") Date starTime, @Param("endTime") Date endTime){
        Long aLong = omsOrderMapper.countByCreateTime(starTime, endTime);
        return aLong;
    }

}
