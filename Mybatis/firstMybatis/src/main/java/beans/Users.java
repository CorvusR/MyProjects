package beans;

import org.apache.ibatis.type.Alias;

import java.util.Objects;
@Alias("奥里给")
public class Users {
    private int u_id;
    private String u_name;
    private String u_gender;

    public Users() {
    }

    public Users(int u_id, String u_name, String u_gender) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_gender = u_gender;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_gender() {
        return u_gender;
    }

    public void setU_gender(String u_gender) {
        this.u_gender = u_gender;
    }

    @Override
    public String toString() {
        return "Users{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_gender='" + u_gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return u_id == users.u_id && Objects.equals(u_name, users.u_name) && Objects.equals(u_gender, users.u_gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(u_id, u_name, u_gender);
    }
}
