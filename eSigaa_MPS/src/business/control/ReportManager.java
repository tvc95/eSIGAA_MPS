/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import business.model.User;
import infra.InfraException;
import infra.ReportData;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

/**
 * This class manages Use and Error reports.
 * @author thiago
 */
public class ReportManager {
    
    private Map<User, String> reports = new HashMap<>();
    ReportData file;
    
    /**
     * Constructor
     */
    public ReportManager() {
        file = new ReportData();
        reports = file.loadData();
    }
    
    public boolean addReport(User user, String reportLog) {
        reports.put(user, reportLog);
        file.saveData(reports);
        return true;
        
    }
    
    public boolean removeReport(User user){
        reports.remove(user);
        file.saveData(reports);
        return true;
    }
    
}
