/*
 * Generated by XDoclet - Do not edit!
 */
package foo.bar.services;

/**
 * Home interface for HelloService.
 * @generated 
 * @wtp generated
 */
public interface HelloServiceHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/HelloService";
   public static final String JNDI_NAME="ejb/HelloService";

   public foo.bar.services.HelloService create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
