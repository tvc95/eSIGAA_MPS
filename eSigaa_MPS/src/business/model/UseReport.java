/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.util.Calendar;

/**
 *
 * @author thiago
 */
public class UseReport implements Report{
    
    private User user;
    private Calendar reportDate;
    private String log;
    private int timesAccessed;
    private Calendar loginTime, logoutTime;

    /**
     * @return the timesAccessed
     */
    public int getTimesAccessed() {
        return timesAccessed;
    }

    /**
     * @return the loginTime
     */
    public Calendar getLoginTime() {
        return loginTime;
    }

    /**
     * @param loginTime the loginTime to set
     */
    public void setLoginTime(Calendar loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * @return the logoutTime
     */
    public Calendar getLogoutTime() {
        return logoutTime;
    }

    /**
     * @param logoutTime the logoutTime to set
     */
    public void setLogoutTime(Calendar logoutTime) {
        this.logoutTime = logoutTime;
    }
    
    @Override
    public String toString(){
        return "Report from: " + user.getLogin() + "\nGenerated at " + reportDate.getInstance().toString() + "\nLogin time: " + loginTime.toString() + "\t Logout time: " + logoutTime.toString() + "\nTimes accessed: "  + timesAccessed + "\nLog: " + log;
    }
    
    
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
    
}
