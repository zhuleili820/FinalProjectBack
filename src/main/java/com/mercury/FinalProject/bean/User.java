package com.mercury.FinalProject.bean;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "FINAL_USER")
public class User implements UserDetails {

    @Id
    @SequenceGenerator(name = "final_user_seq_gen", sequenceName = "FINAL_USER_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "final_user_seq_gen", strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String username;
    @Column
    private String password;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    private UserProfile userProfiles;

    public User() {
    }

    public User(int id, String username, String password, UserProfile userProfiles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userProfiles = userProfiles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }


    @Override//过期账户没了
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override//是不是会被锁
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override//是不是会过期
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override//要不要当成登录页面
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List profiles = new ArrayList();
        profiles.add(userProfiles);
        return profiles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserProfile getUserProfiles() {
        return userProfiles;
    }

    public void setUserProfiles(UserProfile userProfiles) {
        this.userProfiles = userProfiles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userProfiles=" + userProfiles +
                '}';
    }
}
