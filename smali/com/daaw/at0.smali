.class public final Lcom/daaw/at0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/k3$f;
.implements Landroid/content/ServiceConnection;


# static fields
.field public static final l:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Landroid/content/ComponentName;

.field public final d:Landroid/content/Context;

.field public final e:Lcom/daaw/ej;

.field public final f:Landroid/os/Handler;

.field public final g:Lcom/daaw/du0;

.field public h:Landroid/os/IBinder;

.field public i:Z

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/daaw/at0;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/at0;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/at0;->i:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/at0;->h:Landroid/os/IBinder;

    const-string v0, "Disconnected."

    invoke-virtual {p0, v0}, Lcom/daaw/at0;->g(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/at0;->e:Lcom/daaw/ej;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/ej;->D(I)V

    return-void
.end method

.method public final connect(Lcom/daaw/pa$c;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/at0;->f()V

    const-string p1, "Connect started."

    invoke-virtual {p0, p1}, Lcom/daaw/at0;->g(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/at0;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_0

    :try_start_0
    const-string p1, "connect() called when already connected"

    invoke-virtual {p0, p1}, Lcom/daaw/at0;->disconnect(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    const/4 p1, 0x0

    :try_start_1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iget-object v1, p0, Lcom/daaw/at0;->c:Landroid/content/ComponentName;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/at0;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/at0;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    :goto_0
    iget-object v1, p0, Lcom/daaw/at0;->d:Landroid/content/Context;

    invoke-static {}, Lcom/daaw/u70;->a()I

    move-result v2

    invoke-virtual {v1, v0, p0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/at0;->i:Z
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    if-nez v0, :cond_2

    iput-object p1, p0, Lcom/daaw/at0;->h:Landroid/os/IBinder;

    iget-object p1, p0, Lcom/daaw/at0;->g:Lcom/daaw/du0;

    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-interface {p1, v0}, Lcom/daaw/du0;->I(Lcom/google/android/gms/common/ConnectionResult;)V

    :cond_2
    const-string p1, "Finished connect."

    invoke-virtual {p0, p1}, Lcom/daaw/at0;->g(Ljava/lang/String;)V

    return-void

    :catch_1
    move-exception v0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/at0;->i:Z

    iput-object p1, p0, Lcom/daaw/at0;->h:Landroid/os/IBinder;

    throw v0
.end method

.method public final synthetic d(Landroid/os/IBinder;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/at0;->i:Z

    iput-object p1, p0, Lcom/daaw/at0;->h:Landroid/os/IBinder;

    const-string p1, "Connected."

    invoke-virtual {p0, p1}, Lcom/daaw/at0;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/at0;->e:Lcom/daaw/ej;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p1, v0}, Lcom/daaw/ej;->M(Landroid/os/Bundle;)V

    return-void
.end method

.method public final disconnect()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/at0;->f()V

    const-string v0, "Disconnect called."

    invoke-virtual {p0, v0}, Lcom/daaw/at0;->g(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/daaw/at0;->d:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/at0;->i:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/at0;->h:Landroid/os/IBinder;

    return-void
.end method

.method public final disconnect(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/at0;->f()V

    iput-object p1, p0, Lcom/daaw/at0;->j:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/at0;->disconnect()V

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/at0;->k:Ljava/lang/String;

    return-void
.end method

.method public final f()V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/at0;->f:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This method should only run on the NonGmsServiceBrokerClient\'s handler thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/at0;->h:Landroid/os/IBinder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    return-void
.end method

.method public final getAvailableFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/google/android/gms/common/Feature;

    return-object v0
.end method

.method public final getEndpointPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/at0;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/at0;->c:Landroid/content/ComponentName;

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/at0;->c:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLastDisconnectMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/at0;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final getMinApkVersion()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getRemoteService(Lcom/google/android/gms/common/internal/b;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/internal/b;",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final isConnected()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/at0;->f()V

    iget-object v0, p0, Lcom/daaw/at0;->h:Landroid/os/IBinder;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isConnecting()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/at0;->f()V

    iget-boolean v0, p0, Lcom/daaw/at0;->i:Z

    return v0
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/at0;->f:Landroid/os/Handler;

    new-instance v0, Lcom/daaw/z02;

    invoke-direct {v0, p0, p2}, Lcom/daaw/z02;-><init>(Lcom/daaw/at0;Landroid/os/IBinder;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/at0;->f:Landroid/os/Handler;

    new-instance v0, Lcom/daaw/y02;

    invoke-direct {v0, p0}, Lcom/daaw/y02;-><init>(Lcom/daaw/at0;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onUserSignOut(Lcom/daaw/pa$e;)V
    .locals 0

    return-void
.end method

.method public final requiresGooglePlayServices()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final requiresSignIn()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
