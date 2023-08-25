.class public final Lcom/daaw/gy;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a()Lcom/daaw/dy;
    .locals 2

    new-instance v0, Lcom/daaw/ic;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/ic;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method
