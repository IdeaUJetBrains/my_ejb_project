package DATA_ejb_test_data.entity_bean.generated_via_EJB_view;

import javax.ejb.EJBHome;
import javax.ejb.FinderException;
import java.rmi.RemoteException;

public interface EntityCMP_TestHome extends EJBHome {
    EntityCMP_Test findByPrimaryKey(String key) throws RemoteException, FinderException;
}
