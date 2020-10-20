package io.jenkins.plugins.SignPath;

import org.jenkinsci.plugins.workflow.steps.Step;
import org.kohsuke.stapler.DataBoundSetter;

/**
 * A common base class for all SignPath Api / Facade related Jenkins Steps
 * It encapsulates all required configuration related parameters
 * and helps share and re-use them across multiple steps
 *
 * @see io.jenkins.plugins.SignPath.StepShared.SigningRequestStepInputParser
 * how the common configuration is translated into a
 * @see io.jenkins.plugins.SignPath.ApiIntegration.ApiConfiguration
 */
public abstract class SignPathStepBase extends Step {
    private String apiUrl = "https://app.signpath.io/api/";
    private int serviceUnavailableTimeoutInSeconds = 600;
    private int uploadAndDownloadRequestTimeoutInSeconds = 300;
    private int waitForCompletionTimeoutInSeconds = 600;
    private String ciUserToken;

    public String getApiUrl() {
        return apiUrl;
    }

    public String getCiUserToken() {
        return ciUserToken;
    }

    public int getServiceUnavailableTimeoutInSeconds() {
        return serviceUnavailableTimeoutInSeconds;
    }

    public int getUploadAndDownloadRequestTimeoutInSeconds() {
        return uploadAndDownloadRequestTimeoutInSeconds;
    }

    public int getWaitForCompletionTimeoutInSeconds() {
        return waitForCompletionTimeoutInSeconds;
    }

    @DataBoundSetter
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    @DataBoundSetter
    public void setCiUserToken(String ciUserToken) {
        this.ciUserToken = ciUserToken;
    }

    @DataBoundSetter
    public void setServiceUnavailableTimeoutInSeconds(int serviceUnavailableTimeoutInSeconds) {
        this.serviceUnavailableTimeoutInSeconds = serviceUnavailableTimeoutInSeconds;
    }

    @DataBoundSetter
    public void setUploadAndDownloadRequestTimeoutInSeconds(int uploadAndDownloadRequestTimeoutInSeconds) {
        this.uploadAndDownloadRequestTimeoutInSeconds = uploadAndDownloadRequestTimeoutInSeconds;
    }

    @DataBoundSetter
    public void setWaitForCompletionTimeoutInSeconds(int waitForCompletionTimeoutInSeconds) {
        this.waitForCompletionTimeoutInSeconds = waitForCompletionTimeoutInSeconds;
    }

}