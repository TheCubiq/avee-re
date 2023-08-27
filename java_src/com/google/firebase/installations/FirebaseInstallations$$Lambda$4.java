package com.google.firebase.installations;
/* loaded from: classes2.dex */
public final /* synthetic */ class FirebaseInstallations$$Lambda$4 implements Runnable {
    private final FirebaseInstallations arg$1;
    private final boolean arg$2;

    private FirebaseInstallations$$Lambda$4(FirebaseInstallations firebaseInstallations, boolean z) {
        this.arg$1 = firebaseInstallations;
        this.arg$2 = z;
    }

    public static Runnable lambdaFactory$(FirebaseInstallations firebaseInstallations, boolean z) {
        return new FirebaseInstallations$$Lambda$4(firebaseInstallations, z);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.arg$1.doNetworkCallIfNecessary(this.arg$2);
    }
}
