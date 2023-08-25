.class public final Lcom/daaw/lq3;
.super Lcom/google/android/gms/ads/nativead/NativeAd$Image;
.source ""


# instance fields
.field public final a:Lcom/daaw/vc3;

.field public final b:Landroid/graphics/drawable/Drawable;

.field public final c:Landroid/net/Uri;

.field public final d:D


# direct methods
.method public constructor <init>(Lcom/daaw/vc3;)V
    .locals 3

    const-string v0, ""

    invoke-direct {p0}, Lcom/google/android/gms/ads/nativead/NativeAd$Image;-><init>()V

    iput-object p1, p0, Lcom/daaw/lq3;->a:Lcom/daaw/vc3;

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p1}, Lcom/daaw/vc3;->zzf()Lcom/daaw/yd0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    move-object p1, v1

    :goto_0
    iput-object p1, p0, Lcom/daaw/lq3;->b:Landroid/graphics/drawable/Drawable;

    :try_start_1
    iget-object p1, p0, Lcom/daaw/lq3;->a:Lcom/daaw/vc3;

    invoke-interface {p1}, Lcom/daaw/vc3;->zze()Landroid/net/Uri;

    move-result-object v1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    iput-object v1, p0, Lcom/daaw/lq3;->c:Landroid/net/Uri;

    :try_start_2
    iget-object p1, p0, Lcom/daaw/lq3;->a:Lcom/daaw/vc3;

    invoke-interface {p1}, Lcom/daaw/vc3;->zzb()D

    move-result-wide v1
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    :goto_2
    iput-wide v1, p0, Lcom/daaw/lq3;->d:D

    :try_start_3
    iget-object p1, p0, Lcom/daaw/lq3;->a:Lcom/daaw/vc3;

    invoke-interface {p1}, Lcom/daaw/vc3;->zzd()I
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception p1

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    :try_start_4
    iget-object p1, p0, Lcom/daaw/lq3;->a:Lcom/daaw/vc3;

    invoke-interface {p1}, Lcom/daaw/vc3;->zzc()I
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_4

    return-void

    :catch_4
    move-exception p1

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final getDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lq3;->b:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getScale()D
    .locals 2

    iget-wide v0, p0, Lcom/daaw/lq3;->d:D

    return-wide v0
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lq3;->c:Landroid/net/Uri;

    return-object v0
.end method
