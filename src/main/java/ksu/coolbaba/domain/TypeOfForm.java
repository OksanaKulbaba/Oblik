package ksu.coolbaba.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public enum TypeOfForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    CORP,
    SOLEPROP,
    PRIVATE
}
