.class public final Lcom/daaw/l02;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/google/android/gms/common/ConnectionResult;

.field public final synthetic q:Lcom/daaw/m02;


# direct methods
.method public constructor <init>(Lcom/daaw/m02;Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/l02;->q:Lcom/daaw/m02;

    iput-object p2, p0, Lcom/daaw/l02;->p:Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/l02;->q:Lcom/daaw/m02;

    iget-object v1, v0, Lcom/daaw/m02;->f:Lcom/daaw/z70;

    invoke-static {v1}, Lcom/daaw/z70;->A(Lcom/daaw/z70;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/m02;->e(Lcom/daaw/m02;)Lcom/daaw/o3;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i02;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/l02;->p:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->u()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/l02;->q:Lcom/daaw/m02;

    const/4 v3, 0x1

    invoke-static {v1, v3}, Lcom/daaw/m02;->f(Lcom/daaw/m02;Z)V

    iget-object v1, p0, Lcom/daaw/l02;->q:Lcom/daaw/m02;

    invoke-static {v1}, Lcom/daaw/m02;->d(Lcom/daaw/m02;)Lcom/daaw/k3$f;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/k3$f;->requiresSignIn()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/daaw/l02;->q:Lcom/daaw/m02;

    invoke-static {v0}, Lcom/daaw/m02;->g(Lcom/daaw/m02;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/daaw/l02;->q:Lcom/daaw/m02;

    invoke-static {v1}, Lcom/daaw/m02;->d(Lcom/daaw/m02;)Lcom/daaw/k3$f;

    move-result-object v3

    invoke-static {v1}, Lcom/daaw/m02;->d(Lcom/daaw/m02;)Lcom/daaw/k3$f;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/k3$f;->a()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v3, v2, v1}, Lcom/daaw/k3$f;->getRemoteService(Lcom/google/android/gms/common/internal/b;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object v1, p0, Lcom/daaw/l02;->q:Lcom/daaw/m02;

    invoke-static {v1}, Lcom/daaw/m02;->d(Lcom/daaw/m02;)Lcom/daaw/k3$f;

    move-result-object v1

    const-string v3, "Failed to get service from broker."

    invoke-interface {v1, v3}, Lcom/daaw/k3$f;->disconnect(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v3, 0xa

    invoke-direct {v1, v3}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lcom/daaw/i02;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/daaw/l02;->p:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/i02;->F(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/Exception;)V

    return-void
.end method
