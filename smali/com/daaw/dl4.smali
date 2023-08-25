.class public final Lcom/daaw/dl4;
.super Lcom/daaw/x42;
.source ""


# instance fields
.field public p:Lcom/daaw/pa;

.field public final q:I


# direct methods
.method public constructor <init>(Lcom/daaw/pa;I)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/x42;-><init>()V

    iput-object p1, p0, Lcom/daaw/dl4;->p:Lcom/daaw/pa;

    iput p2, p0, Lcom/daaw/dl4;->q:I

    return-void
.end method


# virtual methods
.method public final O0(ILandroid/os/Bundle;)V
    .locals 1

    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GmsClient"

    const-string v0, "received deprecated onAccountValidationComplete callback, ignoring"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final p1(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dl4;->p:Lcom/daaw/pa;

    const-string v1, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v0, v1}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/dl4;->p:Lcom/daaw/pa;

    iget v1, p0, Lcom/daaw/dl4;->q:I

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/daaw/pa;->r(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/dl4;->p:Lcom/daaw/pa;

    return-void
.end method

.method public final w1(ILandroid/os/IBinder;Lcom/google/android/gms/common/internal/zzj;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dl4;->p:Lcom/daaw/pa;

    const-string v1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"

    invoke-static {v0, v1}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, p3}, Lcom/daaw/pa;->C(Lcom/daaw/pa;Lcom/google/android/gms/common/internal/zzj;)V

    iget-object p3, p3, Lcom/google/android/gms/common/internal/zzj;->p:Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/dl4;->p1(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method
