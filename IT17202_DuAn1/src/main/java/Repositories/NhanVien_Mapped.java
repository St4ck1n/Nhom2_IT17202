/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;
import DomainModels.NhanVien;
import Utilities.HibernateUtili;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
/**
 *
 * @author s2ngo
 */
public class NhanVien_Mapped {
    public List<NhanVien> getList(){
        List<NhanVien> nhanViens;
        try(Session session = HibernateUtili.getSessionFactory().openSession()){
            TypedQuery<NhanVien> query = session.createQuery("select c from NHANVIEN c");
            nhanViens = query.getResultList();
        }
        return nhanViens;
    }
    public String add(NhanVien nv){
        try(Session session = HibernateUtili.getSessionFactory().openSession()){
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.save(nv);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return "Them Khong Thanh Cong";
            }
        }
        return "Them Khong Thanh Cong";
    }
    public String edit(NhanVien nv){
        try(Session session = HibernateUtili.getSessionFactory().openSession()){
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.update(nv);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return "Sua Khong Thanh Cong";
            }
        }
        return "Sua Khong Thanh Cong";
    }
    public List<NhanVien> findByTen(String ten){
        try(Session session = HibernateUtili.getSessionFactory().openSession()){
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                if (ten == null) {
                    ten = "&";
                }else{
                    ten = "&" + ten + "&";
                }
                Query query = session.createQuery("from NHANVIEN where TenNV like: ten");
                query.setParameter("ten", ten);
                List<NhanVien> lst = query.list();
                session.getTransaction().commit();
                session.close();
                return lst;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
