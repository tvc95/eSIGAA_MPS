/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.util.Calendar;

/**
 *
 * @author Gute
 */
public class DefaultReport implements Report {
    private User user;
    private Calendar reportDate;
    private String log;

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @return the reportDate
     */
    public Calendar getReportDate() {
        return reportDate;
    }

    /**
     * @param reportDate the reportDate to set
     */
    public void setReportDate(Calendar reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * @return the log
     */
    public String getLog() {
        return log;
    }

    /**
     * @param log the log to set
     */
    public void setLog(String log) {
        this.log = log;
    }
    
//    @Override
//    public String toString(){
//        return "Report from: " + user.getLogin() + "\nGenerated at " + reportDate.getInstance().toString() + "\nLog: " + log;
//    }
    


}
