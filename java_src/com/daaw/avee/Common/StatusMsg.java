package com.daaw.avee.Common;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class StatusMsg {
    HashMap<String, Integer> countedMessages;
    private int criticalErrorCount;
    private int errorCount;
    private String fullMessage;

    public StatusMsg() {
        this.errorCount = 0;
        this.criticalErrorCount = 0;
        this.fullMessage = "";
    }

    public StatusMsg(StatusMsg statusMsg) {
        this.errorCount = statusMsg.errorCount;
        this.criticalErrorCount = statusMsg.criticalErrorCount;
        this.fullMessage = statusMsg.fullMessage;
        if (statusMsg.countedMessages != null) {
            this.countedMessages = new HashMap<>(statusMsg.countedMessages);
        } else {
            this.countedMessages = null;
        }
    }

    public void addCriticalErrorException(String str, Exception exc) {
        addCriticalError(str + ": " + exc.getMessage());
    }

    public void addCriticalError(String str) {
        if (str == null) {
            str = "unk";
        }
        this.criticalErrorCount++;
        this.fullMessage += str;
        this.fullMessage += "\n";
    }

    public void reset() {
        this.errorCount = 0;
        this.criticalErrorCount = 0;
        this.fullMessage = "";
        HashMap<String, Integer> hashMap = this.countedMessages;
        if (hashMap != null) {
            hashMap.clear();
            this.countedMessages = null;
        }
    }

    public void addErrorMessage(String str) {
        if (str == null) {
            str = "unk";
        }
        this.errorCount++;
        this.fullMessage += str;
        this.fullMessage += "\n";
    }

    public void addErrorMessageCollapsed(String str) {
        if (str == null) {
            str = "unk";
        }
        this.errorCount++;
        if (this.countedMessages == null) {
            this.countedMessages = new HashMap<>();
        }
        Integer num = this.countedMessages.get(str);
        if (num == null) {
            this.countedMessages.put(str, 1);
        } else {
            this.countedMessages.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public boolean hasCriticalError() {
        return this.criticalErrorCount > 0;
    }

    public String getFullMessage() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.fullMessage);
        HashMap<String, Integer> hashMap = this.countedMessages;
        if (hashMap != null) {
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                sb.append(entry.getKey());
                sb.append(" (");
                sb.append(entry.getValue());
                sb.append(")");
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
