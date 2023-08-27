package com.google.firebase.installations;

import com.google.firebase.installations.AutoValue_InstallationTokenResult;
/* compiled from: com.google.firebase:firebase-installations-interop@@16.0.0 */
/* loaded from: classes2.dex */
public abstract class InstallationTokenResult {

    /* compiled from: com.google.firebase:firebase-installations-interop@@16.0.0 */
    /* loaded from: classes2.dex */
    public static abstract class Builder {
        public abstract InstallationTokenResult build();

        public abstract Builder setToken(String str);

        public abstract Builder setTokenCreationTimestamp(long j);

        public abstract Builder setTokenExpirationTimestamp(long j);
    }

    public abstract String getToken();

    public abstract long getTokenCreationTimestamp();

    public abstract long getTokenExpirationTimestamp();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new AutoValue_InstallationTokenResult.Builder();
    }
}
