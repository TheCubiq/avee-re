.class public final Lcom/daaw/x76;
.super Lcom/daaw/m32;
.source ""


# instance fields
.field public final g:Landroid/os/IBinder;

.field public final synthetic h:Lcom/daaw/pa;


# direct methods
.method public constructor <init>(Lcom/daaw/pa;ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/x76;->h:Lcom/daaw/pa;

    invoke-direct {p0, p1, p2, p4}, Lcom/daaw/m32;-><init>(Lcom/daaw/pa;ILandroid/os/Bundle;)V

    iput-object p3, p0, Lcom/daaw/x76;->g:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final f(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/x76;->h:Lcom/daaw/pa;

    invoke-static {v0}, Lcom/daaw/pa;->v(Lcom/daaw/pa;)Lcom/daaw/pa$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/x76;->h:Lcom/daaw/pa;

    invoke-static {v0}, Lcom/daaw/pa;->v(Lcom/daaw/pa;)Lcom/daaw/pa$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/pa$b;->I(Lcom/google/android/gms/common/ConnectionResult;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/x76;->h:Lcom/daaw/pa;

    invoke-virtual {v0, p1}, Lcom/daaw/pa;->p(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method public final g()Z
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/x76;->g:Landroid/os/IBinder;

    invoke-static {v1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Lcom/daaw/x76;->h:Lcom/daaw/pa;

    invoke-virtual {v2}, Lcom/daaw/pa;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/daaw/x76;->h:Lcom/daaw/pa;

    invoke-virtual {v2}, Lcom/daaw/pa;->k()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "service descriptor mismatch: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " vs. "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v0

    :cond_0
    iget-object v1, p0, Lcom/daaw/x76;->h:Lcom/daaw/pa;

    iget-object v2, p0, Lcom/daaw/x76;->g:Landroid/os/IBinder;

    invoke-virtual {v1, v2}, Lcom/daaw/pa;->e(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, p0, Lcom/daaw/x76;->h:Lcom/daaw/pa;

    const/4 v3, 0x2

    const/4 v4, 0x4

    invoke-static {v2, v3, v4, v1}, Lcom/daaw/pa;->G(Lcom/daaw/pa;IILandroid/os/IInterface;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/daaw/x76;->h:Lcom/daaw/pa;

    const/4 v3, 0x3

    invoke-static {v2, v3, v4, v1}, Lcom/daaw/pa;->G(Lcom/daaw/pa;IILandroid/os/IInterface;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_1
    iget-object v0, p0, Lcom/daaw/x76;->h:Lcom/daaw/pa;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/pa;->z(Lcom/daaw/pa;Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object v0, p0, Lcom/daaw/x76;->h:Lcom/daaw/pa;

    invoke-virtual {v0}, Lcom/daaw/pa;->getConnectionHint()Landroid/os/Bundle;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/x76;->h:Lcom/daaw/pa;

    invoke-static {v1}, Lcom/daaw/pa;->u(Lcom/daaw/pa;)Lcom/daaw/pa$a;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v1}, Lcom/daaw/pa;->u(Lcom/daaw/pa;)Lcom/daaw/pa$a;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/daaw/pa$a;->M(Landroid/os/Bundle;)V

    :cond_2
    const/4 v0, 0x1

    :catch_0
    :cond_3
    return v0
.end method
