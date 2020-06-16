package DATA_ejb_test_data.entity_bean;

import javax.ejb.*;
import java.rmi.*;

public interface EntityEmployee extends EJBObject {
    // container-managed persistent fields accessors
    public Integer getEmpNo() throws RemoteException;
    public void setEmpNo(Integer empNo) throws RemoteException;

    public String getEmpName() throws RemoteException;
    public void setEmpName(String empName) throws RemoteException;

    public Float getSalary() throws RemoteException;
    public void setSalary(Float salary) throws RemoteException;
}
