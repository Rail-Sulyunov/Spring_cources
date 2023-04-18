package hibernate_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Cihld.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Dance");
//            Cihld cihld1 = new Cihld("Olya", 12);
//            Cihld cihld2 = new Cihld("Grisha", 8);
//            Cihld cihld3 = new Cihld("Pavlik", 9);
//            section1.addChildToSaction(cihld1);
//            section1.addChildToSaction(cihld2);
//            section1.addChildToSaction(cihld3);
//
//            session.beginTransaction();
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//****************************************************************

//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//
//            Cihld child1 = new Cihld("Igor", 10);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//****************************************************************

//            session = factory.getCurrentSession();
//
//
//
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//
//            System.out.println(section);
//            System.out.println(section.getCihldren());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//****************************************************************
//            session = factory.getCurrentSession();
//
//
//
//
//            session.beginTransaction();
//
//            Cihld cihld = session.get(Cihld.class,4);
//
//            System.out.println(cihld);
//            System.out.println(cihld.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//****************************************************************

//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class,1);
//            session.delete(section);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//
// ****************************************************************

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 7);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
// ****************************************************************

            session = factory.getCurrentSession();

            session.beginTransaction();

            Cihld cihld = session.get(Cihld.class, 5);
            session.delete(cihld);

            session.getTransaction().commit();
            System.out.println("Done!!!");

        } finally {
            session.close();
            factory.close();
        }

    }
}
