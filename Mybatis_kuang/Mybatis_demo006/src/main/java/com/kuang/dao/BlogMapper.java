package com.kuang.dao;

import com.kuang.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    //��������
    int addBlog(Blog blog);

    //��ѯ����
    List<Blog> queryBlogIF(Map map);

    //��ѯ����
    List<Blog> queryBlogChoose(Map map);

    //���²���
    int updateBlog(Map map);

    //��ѯ 1-3 �ż�¼�Ĳ���
    List<Blog>queryBlogForeach(Map map);


}
