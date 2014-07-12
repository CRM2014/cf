package cf.crm;

// Generated 2014-7-12 15:41:19 by Hibernate Tools 3.6.0

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Orderrecordproduct.
 * @see cf.crm.Orderrecordproduct
 * @author Hibernate Tools
 */
public class OrderrecordproductHome {

	private static final Log log = LogFactory
			.getLog(OrderrecordproductHome.class);

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

	public void persist(Orderrecordproduct transientInstance) {
		log.debug("persisting Orderrecordproduct instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Orderrecordproduct instance) {
		log.debug("attaching dirty Orderrecordproduct instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Orderrecordproduct instance) {
		log.debug("attaching clean Orderrecordproduct instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Orderrecordproduct persistentInstance) {
		log.debug("deleting Orderrecordproduct instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Orderrecordproduct merge(Orderrecordproduct detachedInstance) {
		log.debug("merging Orderrecordproduct instance");
		try {
			Orderrecordproduct result = (Orderrecordproduct) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Orderrecordproduct findById(cf.crm.OrderrecordproductId id) {
		log.debug("getting Orderrecordproduct instance with id: " + id);
		try {
			Orderrecordproduct instance = (Orderrecordproduct) sessionFactory
					.getCurrentSession().get("cf.crm.Orderrecordproduct", id);
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

	public List findByExample(Orderrecordproduct instance) {
		log.debug("finding Orderrecordproduct instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("cf.crm.Orderrecordproduct")
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
