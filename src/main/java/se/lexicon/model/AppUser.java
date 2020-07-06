package se.lexicon.model;

import java.util.Objects;

public class AppUser {
    private Integer id;
    private String email;
    private String password;
    private String name;
    private String address;

    public AppUser(Integer id, String email, String password, String name, String address) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
    }

    public AppUser(String email, String password, String name, String address) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(getId(), appUser.getId()) &&
                Objects.equals(getEmail(), appUser.getEmail()) &&
                Objects.equals(getName(), appUser.getName()) &&
                Objects.equals(getAddress(), appUser.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEmail(), getName(), getAddress());
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
