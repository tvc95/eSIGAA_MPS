
package view;

/**
 *
 * @author thiag
 */
public interface TwitterTarget extends SocialNetworkTarget{
    String postOnTwitter(String login, String message);
}
