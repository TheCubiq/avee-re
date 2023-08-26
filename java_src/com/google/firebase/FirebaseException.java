package com.google.firebase;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes2.dex */
public class FirebaseException extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public FirebaseException() {
    }

    public FirebaseException(String str) {
        super(Preconditions.checkNotEmpty(str, "Detail message must not be empty"));
    }

    public FirebaseException(String str, Throwable th) {
        super(Preconditions.checkNotEmpty(str, "Detail message must not be empty"), th);
    }
}
