
package view;

/**
 * Target interface for the Adapter design pattern
 * @author thiag
 */
public interface SocialNetworkTarget {
    void vinculateAccount(String sigaalogin, String sigaapw);
    void notifyUpdate(String usrlogin, String post);
}
