package to.idemo.james.artifactverifier.notification;

/**
 * Interface for Verification failure event handlers to implement.  All active implementations of this class on the
 * Spring graph will be invoked when a verification check is failed.
 */
public interface Notifier {
    /**
     * Triggered when an event of note occurs (e.g. changes to an external dependency out of our control fails validation)
     * @param artifactName The name of the artifact
     * @param artifactType The artifact type
     * @param artifactLocation The location
     * @param attributedUser The user that triggered the repo change
     * @param reason Validation failure reason
     */
    void warn(String artifactName, String artifactType, String artifactLocation, String attributedUser, String reason);

    /**
     * Triggered when a validation failure occurs (e.g. unsigned artifact detected)
     * @param artifactName The name of the artifact
     * @param artifactType the artifact type
     * @param artifactLocation the location
     * @param attributedUser The user that triggered the repo change
     * @param reason Validation failure reason
     */
    void alert(String artifactName, String artifactType, String artifactLocation, String attributedUser, String reason);
}
