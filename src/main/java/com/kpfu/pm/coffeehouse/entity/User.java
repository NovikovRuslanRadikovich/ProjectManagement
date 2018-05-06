package com.kpfu.pm.coffeehouse.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name="users")
public class User extends AbstractEntity {

     @Column(name = "username",nullable = false)
     private String username;

     @Column(name = "password",nullable = false)
     private String password;

     @Column(name = "phonenumber", nullable = false)
     private String phoneNumber;

     @OneToMany(fetch = FetchType.LAZY,mappedBy = "ordersowner")
     Set<Order> orders;

}
