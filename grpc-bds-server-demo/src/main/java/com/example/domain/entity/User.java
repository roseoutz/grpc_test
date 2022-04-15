package com.example.domain.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@RequiredArgsConstructor
@Data
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
    private boolean isNew = false;

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
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
