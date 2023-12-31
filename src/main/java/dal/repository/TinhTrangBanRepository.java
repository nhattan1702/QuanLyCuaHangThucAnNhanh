package dal.repository;

import dal.HibernateUtils;
import dal.entity.TinhTrangBan;
import java.util.ArrayList;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;




public class TinhTrangBanRepository {
    public ArrayList<TinhTrangBan> getAll(){
        Session session = HibernateUtils.getFACTORY().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<TinhTrangBan> query = builder.createQuery(TinhTrangBan.class);
        Root<TinhTrangBan> tinhTrangBanEntry = query.from(TinhTrangBan.class);
        query = query.select(tinhTrangBanEntry);
        
        Query queryResult = session.createQuery(query);
        ArrayList<TinhTrangBan> result = (ArrayList<TinhTrangBan>) queryResult.getResultList();
        result.forEach(item -> Hibernate.initialize(item.getListBan()));
        session.close();
        
        return result;
    }
    
    public TinhTrangBan getById(int id){
        Session session = HibernateUtils.getFACTORY().openSession();
        
        TinhTrangBan tinhTrangBan = session.get(TinhTrangBan.class, id);        
        Hibernate.initialize(tinhTrangBan.getListBan());
        
        session.close();
        return tinhTrangBan;
    }
}
