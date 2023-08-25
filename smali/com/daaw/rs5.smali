.class public final Lcom/daaw/rs5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qq5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/s05;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Lcom/daaw/sh6;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/s05;Lcom/daaw/sh6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rs5;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/rs5;->b:Lcom/daaw/s05;

    iput-object p2, p0, Lcom/daaw/rs5;->c:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lcom/daaw/rs5;->d:Lcom/daaw/sh6;

    return-void
.end method

.method public static d(Lcom/daaw/th6;)Ljava/lang/String;
    .locals 1

    :try_start_0
    iget-object p0, p0, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    const-string v0, "tab_url"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z
    .locals 1

    iget-object p1, p0, Lcom/daaw/rs5;->a:Landroid/content/Context;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/daaw/ia3;->g(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p2}, Lcom/daaw/rs5;->d(Lcom/daaw/th6;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/f77;
    .locals 3

    invoke-static {p2}, Lcom/daaw/rs5;->d(Lcom/daaw/th6;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {v1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v1

    new-instance v2, Lcom/daaw/ps5;

    invoke-direct {v2, p0, v0, p1, p2}, Lcom/daaw/ps5;-><init>(Lcom/daaw/rs5;Landroid/net/Uri;Lcom/daaw/fi6;Lcom/daaw/th6;)V

    iget-object p1, p0, Lcom/daaw/rs5;->c:Ljava/util/concurrent/Executor;

    invoke-static {v1, v2, p1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Landroid/net/Uri;Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 11

    :try_start_0
    new-instance p4, Lcom/daaw/co$a;

    invoke-direct {p4}, Lcom/daaw/co$a;-><init>()V

    invoke-virtual {p4}, Lcom/daaw/co$a;->a()Lcom/daaw/co;

    move-result-object p4

    iget-object v0, p4, Lcom/daaw/co;->a:Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    new-instance v2, Lcom/google/android/gms/ads/internal/overlay/zzc;

    iget-object p1, p4, Lcom/daaw/co;->a:Landroid/content/Intent;

    const/4 p4, 0x0

    invoke-direct {v2, p1, p4}, Lcom/google/android/gms/ads/internal/overlay/zzc;-><init>(Landroid/content/Intent;Lcom/google/android/gms/ads/internal/overlay/zzx;)V

    new-instance p1, Lcom/daaw/e14;

    invoke-direct {p1}, Lcom/daaw/e14;-><init>()V

    iget-object v0, p0, Lcom/daaw/rs5;->b:Lcom/daaw/s05;

    new-instance v1, Lcom/daaw/rm4;

    invoke-direct {v1, p2, p3, p4}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance p2, Lcom/daaw/sz4;

    new-instance p3, Lcom/daaw/qs5;

    invoke-direct {p3, p1}, Lcom/daaw/qs5;-><init>(Lcom/daaw/e14;)V

    invoke-direct {p2, p3, p4}, Lcom/daaw/sz4;-><init>(Lcom/daaw/c15;Lcom/daaw/a74;)V

    invoke-virtual {v0, v1, p2}, Lcom/daaw/s05;->c(Lcom/daaw/rm4;Lcom/daaw/sz4;)Lcom/daaw/pz4;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    invoke-virtual {p2}, Lcom/daaw/pz4;->h()Lcom/daaw/xs4;

    move-result-object v4

    new-instance p4, Lcom/google/android/gms/internal/ads/zzchu;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, p4

    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/internal/ads/zzchu;-><init>(IIZZZ)V

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/overlay/zzc;Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/google/android/gms/ads/internal/overlay/zzz;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/a74;Lcom/daaw/vy4;)V

    invoke-virtual {p1, p3}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/rs5;->d:Lcom/daaw/sh6;

    invoke-virtual {p1}, Lcom/daaw/sh6;->a()V

    invoke-virtual {p2}, Lcom/daaw/pz4;->i()Lcom/daaw/oz4;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    const-string p2, "Error in CustomTabsAdRenderer"

    invoke-static {p2, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method
