package com.prospectManager.prospectManagerCore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

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

    private Long investmentId;

    private BigDecimal totalInvestedAmt;

    private Double cummulativePerf; //cummulative performance

    private Double lastQuaterPerf;

    private Date lastUpdateDate; //most recent update timeStamp

    private Date nextMeetingDate;

    private String invstmntCurrency;
}
