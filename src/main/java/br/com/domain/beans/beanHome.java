package br.com.domain.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.inject.Named;

@Named("beanHome")
@RequestScoped
public class beanHome {


    public void register(AjaxBehaviorEvent e){
        System.out.println("\n\nTEste cerrtinhooo\n\n");
    }
}
