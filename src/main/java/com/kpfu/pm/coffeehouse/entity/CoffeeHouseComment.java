package com.kpfu.pm.coffeehouse.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "coffeehousecomments")
public class CoffeeHouseComment extends AbstractEntity implements Comment {

    @ManyToOne
    @JoinColumn(name = "owner")
    private User owner;

    @ManyToOne
    @JoinColumn(name = "commentscoffeehouse")
    private CoffeeHouse commentscoffeeHouse;

    @Column(name = "comment_text")
    private String comment_text;

    @Override
    public String getComment_text() {
        return comment_text;
    }

    @Override
    public User getOwner() {
        return owner;
    }
}
