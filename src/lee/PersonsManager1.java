package lee;

import java.io.File;
import java.io.FileInputStream;

import org.crazyit.app.domain.Person;
import org.crazyit.app.domain.Person1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class PersonsManager1 {

	public static void main(String[] args) 
	throws Exception
	{
//		// TODO Auto-generated method stub
//		Configuration conf = new Configuration().configure();
//		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
//		SessionFactory sf = conf.buildSessionFactory(serviceRegistry);
//		Session sess = sf.openSession();
//		Transaction tx = sess.beginTransaction();
//		Person person = new Person();
//		person.setName("crazyit.org");
//		File file = new File("C:\\Users\\cs\\workspace\\HibernateDemo\\logo.jpg");
//		byte[] content = new byte[(int)file.length()];
//		new FileInputStream(file).read(content);
//		person.setPic(content);
//		sess.save(person);
//		tx.commit();
//		sess.close();
//		sf.close();
		PersonsManager1 mgr = new PersonsManager1();
		mgr.createAndStorePerson1();
		HibernateUtil.sessionFactory.close();
	}
	private void createAndStorePerson1(){
		// 打开线程安全的session对象
		Session session = HibernateUtil.currentSession();
		// 打开事务
		Transaction tx = session.beginTransaction();
		// 创建Person对象
		Person1 person = new Person1();
		String[] schools = new String[]{"小学","中学"};
//		schools[1]="小学";
//		schools[2]="中学";
		//为Person对象设置属性
		person.setAge(20);
		person.setName("crazyit.org");
		// 向person的schools属性中添加2个元素
		person.setSchools(schools);
		session.save(person);
		tx.commit();
		HibernateUtil.closeSession();
	}

}
