package co.istad.dao;

import co.istad.model.Book;
import co.istad.model.Borrow;
import co.istad.model.Return;
import co.istad.model.User;

import java.util.List;
import java.util.Optional;

public interface AdminDao extends UserFeatureDao{

    public void backUp();
    public void restore();
    public Long getUserCount();
    public Long getAdminCount();
    public Long getLibrariansCount();
    public Long getBooksCount();
    public List<User> getAllUser ();
    public List<User> getAllAdmin ();
    public List<User> getAllLibrarians ();
    public void getReport();
    public void resetPassword();
    public void disableAccount();
    public User removeAccount();
    public void saveReportAsExcel();
}
