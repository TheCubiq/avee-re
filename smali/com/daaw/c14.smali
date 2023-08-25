.class public final Lcom/daaw/c14;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/daaw/f77;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/daaw/a14;

    invoke-direct {v0, p1}, Lcom/daaw/a14;-><init>(Ljava/lang/String;)V

    sget-object p1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {p0, v0, p1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static b(Lcom/daaw/f77;Ljava/lang/String;)V
    .locals 1

    new-instance p1, Lcom/daaw/b14;

    const-string v0, "ActiveViewListener.callActiveViewJs"

    invoke-direct {p1, v0}, Lcom/daaw/b14;-><init>(Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {p0, p1, v0}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method
