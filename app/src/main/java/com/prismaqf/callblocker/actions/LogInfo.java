package com.prismaqf.callblocker.actions;

/**
 * @author ConteDiMonteCristo
 */
public class LogInfo {
    private long runId;
    private int ruleId;
    private int numReceived;
    private int numTriggered;

    public void setAll(long runId, int ruleId, int numReceived, int numTriggered) {
        this.runId = runId;
        this.ruleId = ruleId;
        this.numReceived = numReceived;
        this.numTriggered = numTriggered;
    }

    public long getRunId() {
        return runId;
    }

    public void setRunId(long runId) {
        this.runId = runId;
    }

    public int getRuleId() {
        return ruleId;
    }

    public void setRuleId(int ruleId) {
        this.ruleId = ruleId;
    }

    public int getNumReceived() {
        return numReceived;
    }

    public void setNumReceived(int numReceived) {
        this.numReceived = numReceived;
    }

    public int getNumTriggered() {
        return numTriggered;
    }

    public void setNumTriggered(int numTriggered) {
        this.numTriggered = numTriggered;
    }
}