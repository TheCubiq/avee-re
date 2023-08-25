.class public final Lcom/daaw/ov6;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/daaw/rj1;)Lcom/daaw/f77;
    .locals 3

    new-instance v0, Lcom/daaw/nv6;

    invoke-direct {v0, p0}, Lcom/daaw/nv6;-><init>(Ljava/lang/Object;)V

    invoke-static {}, Lcom/daaw/m77;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/daaw/mv6;

    invoke-direct {v2, v0}, Lcom/daaw/mv6;-><init>(Lcom/daaw/nv6;)V

    invoke-virtual {p0, v1, v2}, Lcom/daaw/rj1;->c(Ljava/util/concurrent/Executor;Lcom/daaw/cu0;)Lcom/daaw/rj1;

    return-object v0
.end method
