package com.example.ancestrytest;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    private String name;
    private String sex;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name="ancestry",
        joinColumns={@JoinColumn(name="user_id")},
        inverseJoinColumns={@JoinColumn(name="parent_id")}
    )
    private Set<User> parents;

    @ManyToMany(mappedBy = "parents")
    @JsonIgnore
    private Set<User> children;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Set<User> getParents() {
        return parents;
    }

    public void setParents(Set<User> parents) {
        this.parents = parents;
    }

    public Set<User> getChildren() {
        return children;
    }

    public void setChildren(Set<User> children) {
        this.children = children;
    }
}
