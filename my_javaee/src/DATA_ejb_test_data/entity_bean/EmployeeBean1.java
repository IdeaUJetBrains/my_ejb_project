package DATA_ejb_test_data.entity_bean;

import javax.ejb.*;
import java.rmi.*;

public abstract class EmployeeBean1 implements EntityBean {

    private EntityContext ctx;

    // container-managed persistent fields accessors
    public abstract Integer getEmpNo();
    public abstract void setEmpNo(Integer empNo);

    public abstract String getEmpName();
    public abstract void setEmpName(String empName);

    public abstract Float getSalary();
    public abstract void setSalary(Float salary);

}
