.class public Lcom/daaw/lz1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/daaw/x10;->a()Lcom/daaw/x10;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/x10;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/daaw/x10;->a()Lcom/daaw/x10;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/x10;->c(Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/daaw/x10;->a()Lcom/daaw/x10;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/x10;->d(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/daaw/x10;->a()Lcom/daaw/x10;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/x10;->c(Ljava/lang/String;)V

    return-void
.end method
