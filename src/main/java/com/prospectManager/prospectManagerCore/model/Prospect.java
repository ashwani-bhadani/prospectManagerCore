package com.prospectManager.prospectManagerCore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Prospective is any investment category to make profits
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PROSPECTS_TAB")
public class Prospect {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "prospect_id")
    private Long prospectId;

    private String titleName;

    private String description;

    private String estimatedCurrentValue;

    private Date currentDateTime; //ISO 8601 date time : becomes lastMeetingDate

    private String onboardMode;

    private LocalDateTime nextMeetingDate;

    @OneToMany(mappedBy = "prospect", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Investment> investments = new HashSet<>();       //primary key of the Prospect should be inserted into Investment
}
