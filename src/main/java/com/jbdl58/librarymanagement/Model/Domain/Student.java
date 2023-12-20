package com.jbdl58.librarymanagement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {
    @Id
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    @Column(unique = true)
    private String email;

    @Min(18)
    @Max(40)
    private Integer age;

    @NotBlank
    
    private Date validTill;


}
