package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class GetAuthTokenListener implements StateListener {
    private final TaskCompletionSource<InstallationTokenResult> resultTaskCompletionSource;
    private final Utils utils;

    public GetAuthTokenListener(Utils utils, TaskCompletionSource<InstallationTokenResult> taskCompletionSource) {
        this.utils = utils;
        this.resultTaskCompletionSource = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isRegistered() || this.utils.isAuthTokenExpired(persistedInstallationEntry)) {
            return false;
        }
        this.resultTaskCompletionSource.setResult(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(PersistedInstallationEntry persistedInstallationEntry, Exception exc) {
        if (persistedInstallationEntry.isErrored() || persistedInstallationEntry.isNotGenerated() || persistedInstallationEntry.isUnregistered()) {
            this.resultTaskCompletionSource.trySetException(exc);
            return true;
        }
        return false;
    }
}
