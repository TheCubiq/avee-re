.class public final Lcom/daaw/mq5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nq5;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Ljava/lang/String;)Lcom/daaw/yp6;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x16d03d69

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    const v1, 0x6b0147b

    if-eq v0, v1, :cond_1

    const v1, 0x2a9c68ab

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "nativeDisplay"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const-string v0, "video"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x2

    goto :goto_1

    :cond_2
    const-string v0, "htmlDisplay"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p0, -0x1

    :goto_1
    if-eqz p0, :cond_6

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    sget-object p0, Lcom/daaw/yp6;->t:Lcom/daaw/yp6;

    return-object p0

    :cond_5
    sget-object p0, Lcom/daaw/yp6;->s:Lcom/daaw/yp6;

    return-object p0

    :cond_6
    sget-object p0, Lcom/daaw/yp6;->r:Lcom/daaw/yp6;

    return-object p0
.end method

.method public static f(Ljava/lang/String;)Lcom/daaw/dq6;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x41cfa846

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    const v1, 0x4e906dcd

    if-eq v0, v1, :cond_1

    const v1, 0x768243c0

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "onePixel"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x2

    goto :goto_1

    :cond_1
    const-string v0, "definedByJavascript"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "beginToRender"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p0, -0x1

    :goto_1
    if-eqz p0, :cond_6

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_4

    sget-object p0, Lcom/daaw/dq6;->r:Lcom/daaw/dq6;

    return-object p0

    :cond_4
    sget-object p0, Lcom/daaw/dq6;->u:Lcom/daaw/dq6;

    return-object p0

    :cond_5
    sget-object p0, Lcom/daaw/dq6;->q:Lcom/daaw/dq6;

    return-object p0

    :cond_6
    sget-object p0, Lcom/daaw/dq6;->t:Lcom/daaw/dq6;

    return-object p0
.end method

.method public static g(Ljava/lang/String;)Lcom/daaw/eq6;
    .locals 1

    const-string v0, "native"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/daaw/eq6;->q:Lcom/daaw/eq6;

    return-object p0

    :cond_0
    const-string v0, "javascript"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lcom/daaw/eq6;->r:Lcom/daaw/eq6;

    return-object p0

    :cond_1
    sget-object p0, Lcom/daaw/eq6;->s:Lcom/daaw/eq6;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/pq5;Lcom/daaw/oq5;Ljava/lang/String;)Lcom/daaw/yd0;
    .locals 2

    sget-object p3, Lcom/daaw/g93;->y4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_4

    invoke-static {}, Lcom/daaw/rp6;->b()Z

    move-result p3

    if-nez p3, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p6, p1}, Lcom/daaw/fq6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/fq6;

    move-result-object p1

    const-string p3, "javascript"

    invoke-static {p3}, Lcom/daaw/mq5;->g(Ljava/lang/String;)Lcom/daaw/eq6;

    move-result-object p3

    invoke-static {p5}, Lcom/daaw/mq5;->g(Ljava/lang/String;)Lcom/daaw/eq6;

    move-result-object p6

    invoke-virtual {p8}, Lcom/daaw/oq5;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/mq5;->e(Ljava/lang/String;)Lcom/daaw/yp6;

    move-result-object v0

    sget-object v1, Lcom/daaw/eq6;->s:Lcom/daaw/eq6;

    if-ne p3, v1, :cond_1

    const-string p1, "Omid js session error; Unable to parse impression owner: javascript"

    :goto_0
    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    return-object p4

    :cond_1
    if-nez v0, :cond_2

    invoke-static {p8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Omid js session error; Unable to parse creative type: "

    :goto_1
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    sget-object p8, Lcom/daaw/yp6;->t:Lcom/daaw/yp6;

    if-ne v0, p8, :cond_3

    if-ne p6, v1, :cond_3

    invoke-static {p5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Omid js session error; Video events owner unknown for video creative: "

    goto :goto_1

    :cond_3
    const-string p4, ""

    invoke-static {p1, p2, p9, p4}, Lcom/daaw/vp6;->c(Lcom/daaw/fq6;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/vp6;

    move-result-object p1

    invoke-virtual {p7}, Lcom/daaw/pq5;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/mq5;->f(Ljava/lang/String;)Lcom/daaw/dq6;

    move-result-object p2

    const/4 p4, 0x1

    invoke-static {v0, p2, p3, p6, p4}, Lcom/daaw/up6;->a(Lcom/daaw/yp6;Lcom/daaw/dq6;Lcom/daaw/eq6;Lcom/daaw/eq6;Z)Lcom/daaw/up6;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/daaw/tp6;->a(Lcom/daaw/up6;Lcom/daaw/vp6;)Lcom/daaw/tp6;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_2
    return-object p4
.end method

.method public final b(Lcom/daaw/yd0;Landroid/view/View;)V
    .locals 2

    sget-object v0, Lcom/daaw/g93;->y4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/daaw/rp6;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/daaw/tp6;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/daaw/tp6;

    invoke-virtual {p1, p2}, Lcom/daaw/tp6;->d(Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final c(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/pq5;Lcom/daaw/oq5;Ljava/lang/String;)Lcom/daaw/yd0;
    .locals 3

    sget-object p3, Lcom/daaw/g93;->y4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_4

    invoke-static {}, Lcom/daaw/rp6;->b()Z

    move-result p3

    if-nez p3, :cond_0

    goto :goto_2

    :cond_0
    const-string p3, "Google"

    invoke-static {p3, p1}, Lcom/daaw/fq6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/fq6;

    move-result-object p1

    const-string p3, "javascript"

    invoke-static {p3}, Lcom/daaw/mq5;->g(Ljava/lang/String;)Lcom/daaw/eq6;

    move-result-object p3

    invoke-virtual {p7}, Lcom/daaw/oq5;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/mq5;->e(Ljava/lang/String;)Lcom/daaw/yp6;

    move-result-object v0

    sget-object v1, Lcom/daaw/eq6;->s:Lcom/daaw/eq6;

    if-ne p3, v1, :cond_1

    const-string p1, "Omid html session error; Unable to parse impression owner: javascript"

    :goto_0
    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    if-nez v0, :cond_2

    invoke-static {p7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Omid html session error; Unable to parse creative type: "

    :goto_1
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p5}, Lcom/daaw/mq5;->g(Ljava/lang/String;)Lcom/daaw/eq6;

    move-result-object p7

    sget-object v2, Lcom/daaw/yp6;->t:Lcom/daaw/yp6;

    if-ne v0, v2, :cond_3

    if-ne p7, v1, :cond_3

    invoke-static {p5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Omid html session error; Video events owner unknown for video creative: "

    goto :goto_1

    :cond_3
    const-string p4, ""

    invoke-static {p1, p2, p8, p4}, Lcom/daaw/vp6;->b(Lcom/daaw/fq6;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/vp6;

    move-result-object p1

    invoke-virtual {p6}, Lcom/daaw/pq5;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/mq5;->f(Ljava/lang/String;)Lcom/daaw/dq6;

    move-result-object p2

    const/4 p4, 0x1

    invoke-static {v0, p2, p3, p7, p4}, Lcom/daaw/up6;->a(Lcom/daaw/yp6;Lcom/daaw/dq6;Lcom/daaw/eq6;Lcom/daaw/eq6;Z)Lcom/daaw/up6;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/daaw/tp6;->a(Lcom/daaw/up6;Lcom/daaw/vp6;)Lcom/daaw/tp6;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p4

    :cond_4
    :goto_2
    return-object p4
.end method

.method public final d(Landroid/content/Context;)Z
    .locals 2

    sget-object v0, Lcom/daaw/g93;->y4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Omid flag is disabled"

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {}, Lcom/daaw/rp6;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-static {p1}, Lcom/daaw/rp6;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/daaw/rp6;->b()Z

    move-result p1

    return p1
.end method

.method public final zzd(Lcom/daaw/yd0;)V
    .locals 2

    sget-object v0, Lcom/daaw/g93;->y4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/daaw/rp6;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/daaw/tp6;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/daaw/tp6;

    invoke-virtual {p1}, Lcom/daaw/tp6;->e()V

    :cond_1
    :goto_0
    return-void
.end method
