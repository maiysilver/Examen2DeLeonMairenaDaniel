package com.example.examendeleonmairenadaniel;

public class calculos {

    Double result=0.0;

    public Double suma(Double y, Double x){
        try{
            result=y+x;
        }catch(Exception e){ }
        return result;
    }

    public Double resta(Double y, Double x){
        try{
            result=y-x;
        }catch(Exception e){ }
        return result;
    }

    public Double multiplica(Double y, Double x){
        try{
            result=y*x;
        }catch(Exception e){ }
        return result;
    }

    public Double divide(Double y, Double x){
        try{
            result=y/x;
        }catch(Exception e){ }
        return result;
    }
}
