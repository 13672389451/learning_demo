package com.kuang.util;

import com.kuang.mapper.BlogMapper;
import com.kuang.utils.IDutils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class util {

    @Test
    public void test(){
        System.out.println(IDutils.getId());

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        System.out.println(mapper);


    }

}
