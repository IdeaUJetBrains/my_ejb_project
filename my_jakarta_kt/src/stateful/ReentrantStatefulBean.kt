package stateful

import jakarta.annotation.Resource
import jakarta.ejb.SessionContext
import jakarta.ejb.Stateful

/**
 *
 * @author Arjan Tijms
 */
@Stateful
class ReentrantStatefulBean {
    @Resource
    private val sessionConext: SessionContext? = null
    fun initialMethod() {
        sessionConext!!.getBusinessObject(ReentrantStatefulBean::class.java).reentrantMehthod()
    }

    fun reentrantMehthod() {}
}