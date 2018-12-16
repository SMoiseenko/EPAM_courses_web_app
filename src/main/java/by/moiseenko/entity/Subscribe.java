package by.moiseenko.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import by.moiseenko.entity.periodical.Periodical;

public class Subscribe {
    private int id;
    private BigDecimal totalPrice;
    private int monthSubscribed;
    private List<Periodical> periodicals;
    private Date dateOfSubscribe;
    private String status;

}
