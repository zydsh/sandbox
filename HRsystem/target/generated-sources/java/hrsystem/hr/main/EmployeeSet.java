package hrsystem.hr.main;


import io.ciera.runtime.summit.classes.IInstanceSet;
import io.ciera.runtime.summit.exceptions.XtumlException;
import io.ciera.runtime.summit.types.Date;


public interface EmployeeSet extends IInstanceSet<EmployeeSet,Employee> {

    // attributes
    public void setFName( String m_FName ) throws XtumlException;
    public void setStart_Date( Date m_Start_Date ) throws XtumlException;
    public void setNational_ID( int m_National_ID ) throws XtumlException;
    public void setLName( String m_LName ) throws XtumlException;


    // selections


}
