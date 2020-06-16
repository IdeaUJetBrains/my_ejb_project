package DATA_ejb_test_data.entity_bean;

import java.rmi.*;
import java.util.*;
import javax.ejb.*;

public interface EntityEmployeeHome extends EJBHome {
    public EntityEmployee create(Integer empNo, String empName, Float salary)
            throws CreateException, RemoteException;

    public EntityEmployee findByPrimaryKey(EntityEmployeePK pk)
            throws FinderException, RemoteException;

    public Collection findByName(String empName)
            throws FinderException, RemoteException;

    public Collection findAll()
            throws FinderException, RemoteException;
}