package DATA_ejb_test_data.entity_bean;

import java.io.*;
import java.io.Serializable;
public class EntityEmployeePK implements java.io.Serializable {
    public Integer empNo;
    public Float salary;
    public String empName;

    public EntityEmployeePK() {
            this.empNo = null;
            this.salary = null;
            this.empName = null;
        }

        public EntityEmployeePK(Integer empNo) {
            this.empNo = empNo;
        }

    public EntityEmployeePK(Float salary) {
        this.salary = salary;
    }

    public EntityEmployeePK(String empName) {
        this.empName = empName;
    }

    public EntityEmployeePK(Integer empNo, String empName, Float salary) {

    }
}

