package io.ochentaytres.core.persistence.entity;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name="PARAMETER")
public class Parameter extends Entity {
    private static final long serialVersionUID = 2l;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "KEY")
    private String key;

    @Column(name = "VALUE")
    private String value;

    public Parameter(){
    }

    public Parameter(String key, String value){
        this.key = key;
        this.value = value;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
