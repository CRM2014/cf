package cf.crm.entity;

// Generated 2014-7-12 16:42:52 by Hibernate Tools 3.6.0

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Servicecustomer.
 * @see src.cf.crm.entity.Servicecustomer
 * @author Hibernate Tools
 */
public class ServicecustomerHome {

	private static final Log log = LogFactory.getLog(ServicecustomerHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Servicecustomer transientInstance) {
		log.debug("persisting Servicecustomer instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Servicecustomer instance) {
		log.debug("attaching dirty Servicecustomer instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Servicecustomer instance) {
		log.debug("attaching clean Servicecustomer instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Servicecustomer persistentInstance) {
		log.debug("deleting Servicecustomer instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Servicecustomer merge(Servicecustomer detachedInstance) {
		log.debug("merging Servicecustomer instance");
		try {
			Servicecustomer result = (Servicecustomer) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Servicecustomer findById(cf.crm.entity.ServicecustomerId id) {
		log.debug("getting Servicecustomer instance with id: " + id);
		try {
			Servicecustomer instance = (Servicecustomer) sessionFactory
					.getCurrentSession().get(
							"src.cf.crm.entity.Servicecustomer", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Servicecustomer instance) {
		log.debug("finding Servicecustomer instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("src.cf.crm.entity.Servicecustomer")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
