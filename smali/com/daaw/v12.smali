.class public final Lcom/daaw/v12;
.super Lcom/daaw/q02;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/q02;"
    }
.end annotation


# instance fields
.field public final b:Lcom/daaw/sj1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sj1<",
            "Lcom/daaw/k3$b;",
            "TResultT;>;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/tj1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tj1<",
            "TResultT;>;"
        }
    .end annotation
.end field

.field public final d:Lcom/daaw/vf1;


# direct methods
.method public constructor <init>(ILcom/daaw/sj1;Lcom/daaw/tj1;Lcom/daaw/vf1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/sj1<",
            "Lcom/daaw/k3$b;",
            "TResultT;>;",
            "Lcom/daaw/tj1<",
            "TResultT;>;",
            "Lcom/daaw/vf1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/daaw/q02;-><init>(I)V

    iput-object p3, p0, Lcom/daaw/v12;->c:Lcom/daaw/tj1;

    iput-object p2, p0, Lcom/daaw/v12;->b:Lcom/daaw/sj1;

    iput-object p4, p0, Lcom/daaw/v12;->d:Lcom/daaw/vf1;

    const/4 p3, 0x2

    if-ne p1, p3, :cond_1

    invoke-virtual {p2}, Lcom/daaw/sj1;->c()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Best-effort write calls cannot pass methods that should auto-resolve missing features."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/v12;->c:Lcom/daaw/tj1;

    iget-object v1, p0, Lcom/daaw/v12;->d:Lcom/daaw/vf1;

    invoke-interface {v1, p1}, Lcom/daaw/vf1;->a(Lcom/google/android/gms/common/api/Status;)Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/v12;->c:Lcom/daaw/tj1;

    invoke-virtual {v0, p1}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final c(Lcom/daaw/i02;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i02<",
            "*>;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/daaw/v12;->b:Lcom/daaw/sj1;

    invoke-virtual {p1}, Lcom/daaw/i02;->s()Lcom/daaw/k3$f;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/v12;->c:Lcom/daaw/tj1;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/sj1;->b(Lcom/daaw/k3$b;Lcom/daaw/tj1;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/daaw/v12;->c:Lcom/daaw/tj1;

    invoke-virtual {v0, p1}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    return-void

    :catch_1
    move-exception p1

    invoke-static {p1}, Lcom/daaw/b22;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/v12;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :catch_2
    move-exception p1

    throw p1
.end method

.method public final d(Lcom/daaw/tz1;Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/v12;->c:Lcom/daaw/tj1;

    invoke-virtual {p1, v0, p2}, Lcom/daaw/tz1;->b(Lcom/daaw/tj1;Z)V

    return-void
.end method

.method public final f(Lcom/daaw/i02;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i02<",
            "*>;)Z"
        }
    .end annotation

    iget-object p1, p0, Lcom/daaw/v12;->b:Lcom/daaw/sj1;

    invoke-virtual {p1}, Lcom/daaw/sj1;->c()Z

    move-result p1

    return p1
.end method

.method public final g(Lcom/daaw/i02;)[Lcom/google/android/gms/common/Feature;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i02<",
            "*>;)[",
            "Lcom/google/android/gms/common/Feature;"
        }
    .end annotation

    iget-object p1, p0, Lcom/daaw/v12;->b:Lcom/daaw/sj1;

    invoke-virtual {p1}, Lcom/daaw/sj1;->e()[Lcom/google/android/gms/common/Feature;

    move-result-object p1

    return-object p1
.end method
