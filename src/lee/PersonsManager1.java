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
		// ���̰߳�ȫ��session����
		Session session = HibernateUtil.currentSession();
		// ������
		Transaction tx = session.beginTransaction();
		// ����Person����
		Person1 person = new Person1();
		String[] schools = new String[]{"Сѧ","��ѧ"};
//		schools[1]="Сѧ";
//		schools[2]="��ѧ";
		//ΪPerson������������
		person.setAge(20);
		person.setName("crazyit.org");
		// ��person��schools���������2��Ԫ��
		person.setSchools(schools);
		session.save(person);
		tx.commit();
		HibernateUtil.closeSession();
	}

}
