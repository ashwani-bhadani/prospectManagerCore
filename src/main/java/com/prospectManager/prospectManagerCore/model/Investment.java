package com.prospectManager.prospectManagerCore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * Any prospect when initialAmt invested turns to an investment
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "INVESTMENTS_TAB")
public class Investment {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long investmentId;

    private String prospectId;

    private String invstCategory; //share,bonds,real estate,busniess ventures

    private String investedEntityName;

    private String invstDesc;

    private BigInteger initialInvstAmt;

    private LocalDateTime initialInvstDate;

    private BigInteger lastDepositAmt;

    private LocalDateTime lastDepositDate; //ISO 8601 date time

    private BigInteger currentHoldingAmt;

    private Performance performance;

    private String riskCategory;

    private String invstmntStatus; //can be Active, Cold(no invst in 2 quaters), Inactive, Dropped

}
