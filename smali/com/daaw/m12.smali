.class public abstract Lcom/daaw/m12;
.super Lcom/daaw/q02;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/q02;"
    }
.end annotation


# instance fields
.field public final b:Lcom/daaw/tj1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tj1<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILcom/daaw/tj1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/tj1<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/daaw/q02;-><init>(I)V

    iput-object p2, p0, Lcom/daaw/m12;->b:Lcom/daaw/tj1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/m12;->b:Lcom/daaw/tj1;

    new-instance v1, Lcom/daaw/l3;

    invoke-direct {v1, p1}, Lcom/daaw/l3;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m12;->b:Lcom/daaw/tj1;

    invoke-virtual {v0, p1}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final c(Lcom/daaw/i02;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i02<",
            "*>;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/daaw/m12;->h(Lcom/daaw/i02;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/daaw/m12;->b:Lcom/daaw/tj1;

    invoke-virtual {v0, p1}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    return-void

    :catch_1
    move-exception p1

    invoke-static {p1}, Lcom/daaw/b22;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/m12;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :catch_2
    move-exception p1

    invoke-static {p1}, Lcom/daaw/b22;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/m12;->a(Lcom/google/android/gms/common/api/Status;)V

    throw p1
.end method

.method public abstract h(Lcom/daaw/i02;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i02<",
            "*>;)V"
        }
    .end annotation
.end method
