package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class GetIdListener implements StateListener {
    final TaskCompletionSource<String> taskCompletionSource;

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(PersistedInstallationEntry persistedInstallationEntry, Exception exc) {
        return false;
    }

    public GetIdListener(TaskCompletionSource<String> taskCompletionSource) {
        this.taskCompletionSource = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (persistedInstallationEntry.isUnregistered() || persistedInstallationEntry.isRegistered() || persistedInstallationEntry.isErrored()) {
            this.taskCompletionSource.trySetResult(persistedInstallationEntry.getFirebaseInstallationId());
            return true;
        }
        return false;
    }
}
