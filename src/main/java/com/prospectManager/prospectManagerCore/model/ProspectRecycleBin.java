package com.prospectManager.prospectManagerCore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PROSPECT_BIN_TAB")
public class ProspectRecycleBin {

    @Id
    private Long prospectId;

    private String titleName;

    private String description;

    private String estimatedCurrentValue;

    private Date currentDateTime; //ISO 8601 date time

    private String onboardMode;

}
