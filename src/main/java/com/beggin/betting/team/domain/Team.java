package com.beggin.betting.team.domain;


import jakarta.persistence.*;


@Entity
public class Team {

    @Id @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private Long externalId;

    private String name;
    private String shortName;
    private String crestUrl;

    protected Team(){}

    public Team(Long externalId, String name, String shortName, String crestUrl) {
        this.externalId = externalId;
        this.name = name;
        this.shortName = shortName;
        this.crestUrl = crestUrl;
    }

    public Long getId() {
        return id;
    }

    public Long getExternalId() {
        return externalId;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public String getCrestUrl() {
        return crestUrl;
    }

//    Para actualizar
//            f2wfw

    public void updateFrom(String name, String shortName, String crestUrl){
        this.name = name;
        this.shortName = shortName;
        this.crestUrl = crestUrl;
    }
}
