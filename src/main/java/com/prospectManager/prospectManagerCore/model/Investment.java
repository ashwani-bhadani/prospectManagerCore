package com.prospectManager.prospectManagerCore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

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
    @Column(name = "investment_id")
    private Long investmentId;

    @ManyToOne
    @JoinColumn(name = "prospect", referencedColumnName = "prospectId")
    private Prospect prospect;

    private String invstCategory; //share,bonds,real estate,busniess ventures

    private String investedEntityName;

    private String invstDesc;

    private BigInteger initialInvstAmt;

    private LocalDateTime initialInvstDate;

    private BigInteger lastDepositAmt;

    private Date lastDepositDate; //ISO 8601 date time

    private BigInteger currentHoldingAmt;

    private Double performance;

    private String riskCategory;

    private String invstmntStatus; //can be Active, Cold(no invst in 2 quaters), Inactive, Dropped

}
