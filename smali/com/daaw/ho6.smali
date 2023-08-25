.class public final synthetic Lcom/daaw/ho6;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;I)Lcom/daaw/io6;
    .locals 2

    invoke-static {}, Lcom/daaw/vo6;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    add-int/lit8 v0, p1, -0x2

    const/16 v1, 0x14

    if-eq v0, v1, :cond_0

    const/16 v1, 0x15

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    sget-object v0, Lcom/daaw/ta3;->b:Lcom/daaw/ma3;

    goto :goto_0

    :pswitch_1
    sget-object v0, Lcom/daaw/ta3;->d:Lcom/daaw/ma3;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    :goto_0
    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/daaw/ta3;->e:Lcom/daaw/ma3;

    goto :goto_0

    :goto_1
    if-eqz v0, :cond_1

    new-instance v0, Lcom/daaw/ko6;

    invoke-direct {v0, p0, p1}, Lcom/daaw/ko6;-><init>(Landroid/content/Context;I)V

    return-object v0

    :cond_1
    :goto_2
    new-instance p0, Lcom/daaw/hp6;

    invoke-direct {p0}, Lcom/daaw/hp6;-><init>()V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static b(Landroid/content/Context;IILcom/google/android/gms/ads/internal/client/zzl;)Lcom/daaw/io6;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object p0

    instance-of p1, p0, Lcom/daaw/ko6;

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lcom/daaw/io6;->zzh()Lcom/daaw/io6;

    invoke-interface {p0, p2}, Lcom/daaw/io6;->c(I)Lcom/daaw/io6;

    iget-object p1, p3, Lcom/google/android/gms/ads/internal/client/zzl;->zzp:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/so6;->e(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p3, Lcom/google/android/gms/ads/internal/client/zzl;->zzp:Ljava/lang/String;

    invoke-interface {p0, p1}, Lcom/daaw/io6;->a(Ljava/lang/String;)Lcom/daaw/io6;

    :cond_1
    return-object p0
.end method
