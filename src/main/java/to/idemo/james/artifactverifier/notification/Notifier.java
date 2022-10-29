package to.idemo.james.artifactverifier.notification;

/**
 * Interface for Verification failure event handlers to implement.  All active implementations of this class on the
 * Spring graph will be invoked when a verification check is failed.
 */
public interface Notifier {
    void warn(String artifactName, String artifactType, String artifactLocation, String attributedUser, String reason);
    void alert(String artifactName, String artifactType, String artifactLocation, String attributedUser, String reason);
}
