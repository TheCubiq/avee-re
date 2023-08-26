package com.google.firebase.installations;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
final /* synthetic */ class FirebaseInstallations$$Lambda$3 implements Callable {
    private final FirebaseInstallations arg$1;

    private FirebaseInstallations$$Lambda$3(FirebaseInstallations firebaseInstallations) {
        this.arg$1 = firebaseInstallations;
    }

    public static Callable lambdaFactory$(FirebaseInstallations firebaseInstallations) {
        return new FirebaseInstallations$$Lambda$3(firebaseInstallations);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        Void deleteFirebaseInstallationId;
        deleteFirebaseInstallationId = this.arg$1.deleteFirebaseInstallationId();
        return deleteFirebaseInstallationId;
    }
}
