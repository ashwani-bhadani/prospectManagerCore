package com.prospectManager.prospectManagerCore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Acts as a log of quaterly performance
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PERFORMANCE_TAB")
public class Performance {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long slNo;

    private Long invstId;

    private String totalInvestedAmt;

    private Double cummulativePerf; //cummulative performance

    private Double lastQuaterPerf;

    private LocalDateTime lastUpdateDate; //most recent update timeStamp

    private LocalDateTime nextMeetingDate;

    private String invstmntCurrency;
}
