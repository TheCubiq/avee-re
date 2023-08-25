.class public final Lcom/daaw/so6;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/daaw/so6;->g(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;Z)V

    return-void
.end method

.method public static b(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lcom/daaw/so6;->g(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;Z)V

    return-void
.end method

.method public static c(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;)V
    .locals 1

    sget-object v0, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object p0

    new-instance v0, Lcom/daaw/ro6;

    invoke-direct {v0, p1, p2}, Lcom/daaw/ro6;-><init>(Lcom/daaw/to6;Lcom/daaw/io6;)V

    sget-object p1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {p0, v0, p1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static d(Lcom/daaw/f77;Lcom/daaw/io6;)V
    .locals 1

    sget-object v0, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object p0

    new-instance v0, Lcom/daaw/po6;

    invoke-direct {v0, p1}, Lcom/daaw/po6;-><init>(Lcom/daaw/io6;)V

    sget-object p1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {p0, v0, p1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 2

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget-object v0, Lcom/daaw/g93;->S7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p0}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method

.method public static f(Lcom/daaw/ri6;)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzf;->zze(Lcom/daaw/ri6;)I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/16 p0, 0x17

    return p0

    :cond_0
    const/4 p0, 0x7

    return p0
.end method

.method public static g(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;Z)V
    .locals 1

    sget-object v0, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object p0

    new-instance v0, Lcom/daaw/qo6;

    invoke-direct {v0, p1, p2, p3}, Lcom/daaw/qo6;-><init>(Lcom/daaw/to6;Lcom/daaw/io6;Z)V

    sget-object p1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {p0, v0, p1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method
