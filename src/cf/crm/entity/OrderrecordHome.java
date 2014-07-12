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
 * Home object for domain model class Orderrecord.
 * @see src.cf.crm.entity.Orderrecord
 * @author Hibernate Tools
 */
public class OrderrecordHome {

	private static final Log log = LogFactory.getLog(OrderrecordHome.class);

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

	public void persist(Orderrecord transientInstance) {
		log.debug("persisting Orderrecord instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Orderrecord instance) {
		log.debug("attaching dirty Orderrecord instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Orderrecord instance) {
		log.debug("attaching clean Orderrecord instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Orderrecord persistentInstance) {
		log.debug("deleting Orderrecord instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Orderrecord merge(Orderrecord detachedInstance) {
		log.debug("merging Orderrecord instance");
		try {
			Orderrecord result = (Orderrecord) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Orderrecord findById(java.lang.String id) {
		log.debug("getting Orderrecord instance with id: " + id);
		try {
			Orderrecord instance = (Orderrecord) sessionFactory
					.getCurrentSession().get("src.cf.crm.entity.Orderrecord",
							id);
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

	public List findByExample(Orderrecord instance) {
		log.debug("finding Orderrecord instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("src.cf.crm.entity.Orderrecord")
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
