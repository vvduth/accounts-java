package com.ducthai.accounts.entity;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

// tell sprin that this class is a base class for other entities
@MappedSuperclass
// generate getter and setters
@Getter
@Setter
@ToString
public class BaseEntity {

    // this field will be automatically set when the entity is created and will not be updated
    @Column(updatable = false)
    private LocalDateTime createAt;

    @Column(updatable = false)
    private String createBy;

    @Column(insertable = false)
    private LocalDateTime updateAt;

    @Column(insertable = false)
    private String updateBy;

}
