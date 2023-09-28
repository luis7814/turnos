package com.asw.shifts.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "comercios")
public class Trade {

    @Id
    @Column(name = "ID_COMERCIO")
    private Long idTrade;

    @Column(name = "NOM_COMERCIO")
    private String nameTrade;

}
