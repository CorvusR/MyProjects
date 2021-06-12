import beans.Blog;
import mapper.BlogMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.IdUtils;
import utils.MybatisUtils;

import java.util.*;

public class Test1 {
    @Test
    public void test1() {
        String id = IdUtils.getId();
        System.out.println(id);
    }

    @Test
    public void addBlog() {
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog firstBlog = new Blog(IdUtils.getId(), "法外狂徒", "张三", new Date(), 111);
        Blog secondBlog = new Blog(IdUtils.getId(), "村头恶霸", "李四", new Date(), 222);
        Blog thirdBlog = new Blog(IdUtils.getId(), "地痞流氓", "王五", new Date(), 333);
        System.out.println(mapper.addBlog(firstBlog));
        System.out.println(mapper.addBlog(secondBlog));
        System.out.println(mapper.addBlog(thirdBlog));
        session.commit();
        session.close();
    }

    @Test
    public void retrieveBlogIf() {
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        /*hashMap.put("title","%法%");*/
        hashMap.put("author", "李四");
        List<Blog> blogs = mapper.retrieveBlogIf(hashMap);
        System.out.println(blogs);
    }

    @Test
    public void retrieveBlogChoose() {
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title", "村头恶霸");
        List<Blog> blogs = mapper.retrieveBlogChoose(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    @Test
    public void updateBlog() {
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("views", 111);
        hashMap.put("title", "法外狂徒");
        int i = mapper.updateBlog(hashMap);
        System.out.println(i);
    }

    @Test
    public void retrieveBlogForeach() {
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        List<Integer> views = new ArrayList<Integer>();
        views.add(1);
        views.add(222);
        views.add(333);
        hashMap.put("views",views);
        List<Blog> blogs = mapper.retrieveBlogForeach(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }
}
