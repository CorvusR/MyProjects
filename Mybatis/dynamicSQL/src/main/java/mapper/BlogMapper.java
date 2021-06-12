package mapper;

import beans.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);

    List<Blog> retrieveBlogIf(Map map);

    List<Blog> retrieveBlogChoose(Map map);

    int updateBlog(Map map);

    List<Blog> retrieveBlogForeach(Map map);
}
