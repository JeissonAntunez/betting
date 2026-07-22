package com.beggin.betting.pruebas;


import java.util.Objects;

public class Team {

    private final Long externalId;
    private String name;

    public Team(Long externalId) {
        this.externalId = externalId;
    }


    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof  Team team)) return false;
        return externalId.equals(team.externalId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(externalId);
    }

}
