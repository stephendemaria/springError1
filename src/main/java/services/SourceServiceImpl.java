package services;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.springframework.stereotype.Service;
import models.SourceModel;

@Service
@ToString
public class SourceServiceImpl implements SourceService
{

    private SourceModel sm;

    public SourceServiceImpl()
    {

        addSource();

    }

    @Override
    public SourceModel getSourceModel()
    {

        return sm;

    }

    public void addSource()
    {

        sm = new SourceModel();
        sm.setAuthorFirstName( "testFirstName" );
        sm.setAuthorLastName( "testLastName" );
        sm.setSourceTitle( "testNewBook" );
        sm.setEdition( 1 );



        // use this service to add a source to the database
        //Configuration con = new Configuration().configure().addAnnotatedClass( SourceModel.class );
        //SessionFactory sf = con.buildSessionFactory();
        //Session session = sf.openSession();
        //Transaction tx = session.beginTransaction();
        //session.save( sm );
        //tx.commit();

    }

}
