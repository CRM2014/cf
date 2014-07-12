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
 * Home object for domain model class Datadictionary.
 * @see cf.crm.Datadictionary
 * @author Hibernate Tools
 */
public class DatadictionaryHome {

	private static final Log log = LogFactory.getLog(DatadictionaryHome.class);

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

	public void persist(Datadictionary transientInstance) {
		log.debug("persisting Datadictionary instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Datadictionary instance) {
		log.debug("attaching dirty Datadictionary instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Datadictionary instance) {
		log.debug("attaching clean Datadictionary instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Datadictionary persistentInstance) {
		log.debug("deleting Datadictionary instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Datadictionary merge(Datadictionary detachedInstance) {
		log.debug("merging Datadictionary instance");
		try {
			Datadictionary result = (Datadictionary) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Datadictionary findById(java.lang.String id) {
		log.debug("getting Datadictionary instance with id: " + id);
		try {
			Datadictionary instance = (Datadictionary) sessionFactory
					.getCurrentSession().get("cf.crm.Datadictionary", id);
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

	public List findByExample(Datadictionary instance) {
		log.debug("finding Datadictionary instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("cf.crm.Datadictionary")
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
