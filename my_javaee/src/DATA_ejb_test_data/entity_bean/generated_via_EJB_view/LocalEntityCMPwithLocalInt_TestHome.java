package DATA_ejb_test_data.entity_bean.generated_via_EJB_view;

import javax.ejb.EJBLocalHome;
import javax.ejb.FinderException;

public interface LocalEntityCMPwithLocalInt_TestHome extends EJBLocalHome {
    DATA_ejb_test_data.entity_bean.generated_via_EJB_view.LocalEntityCMPwithLocalInt_Test findByPrimaryKey(String key) throws FinderException;
}
