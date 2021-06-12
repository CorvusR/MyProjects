package beans;

import java.util.Date;
import java.util.Objects;

public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;

    public Blog() {
    }

    public Blog(String id, String title, String author, Date create_time, int views) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.createTime = create_time;
        this.views = views;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreate_time() {
        return createTime;
    }

    public void setCreate_time(Date create_time) {
        this.createTime = create_time;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return views == blog.views && Objects.equals(id, blog.id) && Objects.equals(title, blog.title) && Objects.equals(author, blog.author) && Objects.equals(createTime, blog.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, createTime, views);
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", create_time=" + createTime +
                ", views=" + views +
                '}';
    }
}
