package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Hashtable;
import javax.naming.*;
import javax.naming.ldap.*;
import javax.naming.directory.*;

public class ConexionLDAP {

    private final String URL_LDAP="ldap://clarogt.americamovil.ca1:389";
   private final String DOMAIN="@CLAROGT";
    public boolean getAauthentication (String userName, String password) {
        
        Hashtable<String, String> environment = new Hashtable<String, String>();
        DirContext context;
        boolean connected=false;
        environment.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        environment.put(Context.PROVIDER_URL, URL_LDAP);
        environment.put(Context.SECURITY_AUTHENTICATION, "simple");
        environment.put(Context.SECURITY_PRINCIPAL, userName+DOMAIN);
        environment.put(Context.SECURITY_CREDENTIALS, password);

        try 
        {   if( userName.length()>1 &&  password.length()>1){
             context = new InitialDirContext(environment);
            System.out.println("Connected..");
            connected=true;}
            
        } 
        catch (Exception ex ) 
        {
            System.out.println(ex.getMessage());
        }

      return connected;
    }
    }
    
