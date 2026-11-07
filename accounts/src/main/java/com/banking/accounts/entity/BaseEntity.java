package com.banking.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    @CreatedDate
    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false,updatable = false)
    private LocalDateTime createdAt;

    //@CreatedBy
    @Column(name = "CREATED_BY", nullable = false, length = 20, updatable = false)
    private String createdBy;

    @LastModifiedDate
    @UpdateTimestamp
    @Column(name = "UPDATED_AT",insertable = false)
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(name = "UPDATED_BY", length = 20,insertable = false)
    private String updatedBy;

}
