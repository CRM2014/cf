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
 * Home object for domain model class Contactperson.
 * @see src.cf.crm.entity.Contactperson
 * @author Hibernate Tools
 */
public class ContactpersonHome {

	private static final Log log = LogFactory.getLog(ContactpersonHome.class);

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

	public void persist(Contactperson transientInstance) {
		log.debug("persisting Contactperson instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Contactperson instance) {
		log.debug("attaching dirty Contactperson instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Contactperson instance) {
		log.debug("attaching clean Contactperson instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Contactperson persistentInstance) {
		log.debug("deleting Contactperson instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Contactperson merge(Contactperson detachedInstance) {
		log.debug("merging Contactperson instance");
		try {
			Contactperson result = (Contactperson) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Contactperson findById(java.lang.String id) {
		log.debug("getting Contactperson instance with id: " + id);
		try {
			Contactperson instance = (Contactperson) sessionFactory
					.getCurrentSession().get("src.cf.crm.entity.Contactperson",
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

	public List findByExample(Contactperson instance) {
		log.debug("finding Contactperson instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("src.cf.crm.entity.Contactperson")
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
