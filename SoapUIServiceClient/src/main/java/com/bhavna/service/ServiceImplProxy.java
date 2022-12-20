package com.bhavna.service;

public class ServiceImplProxy implements com.bhavna.service.ServiceImpl {
  private String _endpoint = null;
  private com.bhavna.service.ServiceImpl serviceImpl = null;
  
  public ServiceImplProxy() {
    _initServiceImplProxy();
  }
  
  public ServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceImplProxy();
  }
  
  private void _initServiceImplProxy() {
    try {
      serviceImpl = (new com.bhavna.service.ServiceImplServiceLocator()).getServiceImpl();
      if (serviceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceImpl != null)
      ((javax.xml.rpc.Stub)serviceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bhavna.service.ServiceImpl getServiceImpl() {
    if (serviceImpl == null)
      _initServiceImplProxy();
    return serviceImpl;
  }
  
  public boolean addPerson(com.bhavna.bean.Person p) throws java.rmi.RemoteException{
    if (serviceImpl == null)
      _initServiceImplProxy();
    return serviceImpl.addPerson(p);
  }
  
  public boolean deletePerson(int id) throws java.rmi.RemoteException{
    if (serviceImpl == null)
      _initServiceImplProxy();
    return serviceImpl.deletePerson(id);
  }
  
  public com.bhavna.bean.Person[] getAllPersons() throws java.rmi.RemoteException{
    if (serviceImpl == null)
      _initServiceImplProxy();
    return serviceImpl.getAllPersons();
  }
  
  public com.bhavna.bean.Person getPerson(int id) throws java.rmi.RemoteException{
    if (serviceImpl == null)
      _initServiceImplProxy();
    return serviceImpl.getPerson(id);
  }
  
  
}