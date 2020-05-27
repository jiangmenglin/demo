package com.example.demo.jdbc.dao;

import com.example.demo.jdbc.entity.Countrylanguage;
import com.example.demo.jdbc.entity.CountrylanguageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountrylanguageMapper {
    int countByExample(CountrylanguageExample example);

    int deleteByExample(CountrylanguageExample example);

    int deleteByPrimaryKey(@Param("countrycode") String countrycode, @Param("language") String language);

    int insert(Countrylanguage record);

    int insertSelective(Countrylanguage record);

    List<Countrylanguage> selectByExample(CountrylanguageExample example);

    Countrylanguage selectByPrimaryKey(@Param("countrycode") String countrycode, @Param("language") String language);

    int updateByExampleSelective(@Param("record") Countrylanguage record, @Param("example") CountrylanguageExample example);

    int updateByExample(@Param("record") Countrylanguage record, @Param("example") CountrylanguageExample example);

    int updateByPrimaryKeySelective(Countrylanguage record);

    int updateByPrimaryKey(Countrylanguage record);
}