package com.example.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Builder
@Table("armeria_user")
public class User implements Persistable<String> {

    @Id
    private String oid;

    @Column("user_id")
    private String userId;

    @Column("username")
    private String username;

    @Column("password")
    private String password;

    @Column("cell_phone")
    private String cellPhone;

    @Transient
    private boolean isNew;

    public void setNew() {
        this.isNew = true;
    }

    @Override
    public String getId() {
        return oid;
    }

    @Override
    public boolean isNew() {
        return isNew;
    }
}
