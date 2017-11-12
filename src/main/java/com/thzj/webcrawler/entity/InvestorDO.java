package com.thzj.webcrawler.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "T_INVESTOR")
public class InvestorDO {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    

}
