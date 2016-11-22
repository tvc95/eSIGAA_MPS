/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Report Entity class
 * @author thiago
 */
public interface Report {
        
    /**
     * @return the user
     */
    public User getUser();

    /**
     * @return the reportDate
     */
    public Calendar getReportDate();

    /**
     * @param reportDate the reportDate to set
     */
    public void setReportDate(Calendar reportDate);
    /**
     * @return the log
     */
    public String getLog();
    /**
     * @param log the log to set
     */
    public void setLog(String log);
    
//    @Override
//    public String toString(){
//        return "Report from: " + user.getLogin() + "\nGenerated at " + reportDate.getInstance().toString() + "\nLog: " + log;
//    }
    
}
