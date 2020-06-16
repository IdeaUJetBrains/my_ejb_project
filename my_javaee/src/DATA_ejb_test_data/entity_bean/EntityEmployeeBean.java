package DATA_ejb_test_data.entity_bean;

import javax.ejb.*;

public abstract class EntityEmployeeBean implements EntityBean {

    private EntityContext ctx;

    // container-managed persistent fields accessors
    public abstract Integer getEmpNo();
    public abstract void setEmpNo(Integer empNo);

    public abstract String getEmpName();
    public abstract void setEmpName(String empName);

    public abstract Float getSalary();
    public abstract void setSalary(Float salary);

    public void EmployeeBean() {
        // Empty constructor, don't initialize here but in the create().
        // passivate() may destroy these attributes in the case of pooling
    }

    public EntityEmployeePK ejbCreate(Integer empNo, String empName, Float salary)
            throws CreateException {
        setEmpNo(empNo);
        setEmpName(empName);
        setSalary(salary);
        return new EntityEmployeePK(empNo);
    }

    public void ejbPostCreate(Integer empNo, String empName, Float salary)
            throws CreateException {
        // when just after bean created
    }

    public void ejbStore() {
        // when bean persisted
    }

    public void ejbLoad() {
        // when bean loaded
    }

    public void ejbRemove() {
        // when bean removed
    }

    public void ejbActivate() {
        // when bean activated
    }

    public void ejbPassivate() {
        // when bean deactivated
    }

    public void setEntityContext(EntityContext ctx) {
        this.ctx = ctx;
    }

    public void unsetEntityContext() {
        this.ctx = null;
    }

}
