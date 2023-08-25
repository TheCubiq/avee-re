.class public Lcom/daaw/wc1;
.super Lcom/daaw/t70;
.source ""

# interfaces
.implements Lcom/daaw/o12;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/t70<",
        "Lcom/daaw/s12;",
        ">;",
        "Lcom/daaw/o12;"
    }
.end annotation


# static fields
.field public static final synthetic L:I


# instance fields
.field public final H:Z

.field public final I:Lcom/daaw/xf;

.field public final J:Landroid/os/Bundle;

.field public final K:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ZLcom/daaw/xf;Landroid/os/Bundle;Lcom/daaw/y70$a;Lcom/daaw/y70$b;)V
    .locals 7

    const/16 v3, 0x2c

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/t70;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/daaw/xf;Lcom/daaw/y70$a;Lcom/daaw/y70$b;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/wc1;->H:Z

    iput-object p4, p0, Lcom/daaw/wc1;->I:Lcom/daaw/xf;

    iput-object p5, p0, Lcom/daaw/wc1;->J:Landroid/os/Bundle;

    invoke-virtual {p4}, Lcom/daaw/xf;->g()Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/wc1;->K:Ljava/lang/Integer;

    return-void
.end method

.method public static L(Lcom/daaw/xf;)Landroid/os/Bundle;
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/xf;->f()Lcom/daaw/xc1;

    invoke-virtual {p0}, Lcom/daaw/xf;->g()Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/xf;->a()Landroid/accounts/Account;

    move-result-object p0

    const-string v2, "com.google.android.gms.signin.internal.clientRequestedAccount"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const-string v0, "com.google.android.gms.common.internal.ClientSettings.sessionId"

    invoke-virtual {v1, v0, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    const-string p0, "com.google.android.gms.signin.internal.offlineAccessRequested"

    const/4 v0, 0x0

    invoke-virtual {v1, p0, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "com.google.android.gms.signin.internal.idTokenRequested"

    invoke-virtual {v1, p0, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "com.google.android.gms.signin.internal.serverClientId"

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x1

    const-string v3, "com.google.android.gms.signin.internal.usePromptModeForAuthCode"

    invoke-virtual {v1, v3, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "com.google.android.gms.signin.internal.forceCodeForRefreshToken"

    invoke-virtual {v1, p0, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "com.google.android.gms.signin.internal.hostedDomain"

    invoke-virtual {v1, p0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "com.google.android.gms.signin.internal.logSessionId"

    invoke-virtual {v1, p0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"

    invoke-virtual {v1, p0, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v1
.end method


# virtual methods
.method public final b(Lcom/daaw/p12;)V
    .locals 6

    const-string v0, "Expecting a valid ISignInCallbacks"

    invoke-static {p1, v0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/daaw/wc1;->I:Lcom/daaw/xf;

    invoke-virtual {v2}, Lcom/daaw/xf;->b()Landroid/accounts/Account;

    move-result-object v2

    const-string v3, "<<default account>>"

    iget-object v4, v2, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lcom/daaw/pa;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/daaw/yf1;->a(Landroid/content/Context;)Lcom/daaw/yf1;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/yf1;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    new-instance v4, Lcom/google/android/gms/common/internal/zat;

    iget-object v5, p0, Lcom/daaw/wc1;->K:Ljava/lang/Integer;

    invoke-static {v5}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-direct {v4, v2, v5, v3}, Lcom/google/android/gms/common/internal/zat;-><init>(Landroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    invoke-virtual {p0}, Lcom/daaw/pa;->getService()Landroid/os/IInterface;

    move-result-object v2

    check-cast v2, Lcom/daaw/s12;

    new-instance v3, Lcom/google/android/gms/signin/internal/zai;

    invoke-direct {v3, v0, v4}, Lcom/google/android/gms/signin/internal/zai;-><init>(ILcom/google/android/gms/common/internal/zat;)V

    invoke-virtual {v2, v3, p1}, Lcom/daaw/s12;->g3(Lcom/google/android/gms/signin/internal/zai;Lcom/daaw/p12;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v2

    :try_start_1
    new-instance v3, Lcom/google/android/gms/signin/internal/zak;

    new-instance v4, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v5, 0x8

    invoke-direct {v4, v5, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-direct {v3, v0, v4, v1}, Lcom/google/android/gms/signin/internal/zak;-><init>(ILcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/internal/zav;)V

    invoke-interface {p1, v3}, Lcom/daaw/p12;->z0(Lcom/google/android/gms/signin/internal/zak;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    const-string p1, "SignInClientImpl"

    const-string v0, "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException."

    invoke-static {p1, v0, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final c()V
    .locals 1

    new-instance v0, Lcom/daaw/pa$d;

    invoke-direct {v0, p0}, Lcom/daaw/pa$d;-><init>(Lcom/daaw/pa;)V

    invoke-virtual {p0, v0}, Lcom/daaw/pa;->connect(Lcom/daaw/pa$c;)V

    return-void
.end method

.method public final synthetic e(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/s12;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Lcom/daaw/s12;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/s12;

    invoke-direct {v0, p1}, Lcom/daaw/s12;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final getMinApkVersion()I
    .locals 1

    const v0, 0xbdfcb8

    return v0
.end method

.method public final h()Landroid/os/Bundle;
    .locals 3

    iget-object v0, p0, Lcom/daaw/wc1;->I:Lcom/daaw/xf;

    invoke-virtual {v0}, Lcom/daaw/xf;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/pa;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/wc1;->J:Landroid/os/Bundle;

    iget-object v1, p0, Lcom/daaw/wc1;->I:Lcom/daaw/xf;

    invoke-virtual {v1}, Lcom/daaw/xf;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.android.gms.signin.internal.realClientPackageName"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/wc1;->J:Landroid/os/Bundle;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.signin.service.START"

    return-object v0
.end method

.method public final requiresSignIn()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/wc1;->H:Z

    return v0
.end method
