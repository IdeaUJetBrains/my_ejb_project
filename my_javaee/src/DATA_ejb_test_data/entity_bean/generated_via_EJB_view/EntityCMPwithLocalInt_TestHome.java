package DATA_ejb_test_data.entity_bean.generated_via_EJB_view;

import javax.ejb.EJBHome;
import javax.ejb.FinderException;
import java.rmi.RemoteException;

public interface EntityCMPwithLocalInt_TestHome extends EJBHome {
    DATA_ejb_test_data.entity_bean.generated_via_EJB_view.EntityCMPwithLocalInt_Test findByPrimaryKey(String key) throws RemoteException, FinderException;
}
