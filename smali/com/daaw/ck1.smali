.class public Lcom/daaw/ck1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/daaw/tj1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/common/api/Status;",
            "TTResult;",
            "Lcom/daaw/tj1<",
            "TTResult;>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/daaw/tj1;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Lcom/daaw/l3;

    invoke-direct {p1, p0}, Lcom/daaw/l3;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {p2, p1}, Lcom/daaw/tj1;->b(Ljava/lang/Exception;)V

    return-void
.end method
