.class public final Lcom/daaw/ts3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static d:Lcom/daaw/zy3;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "InternalQueryInfoGenerator.class"
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/google/android/gms/ads/AdFormat;

.field public final c:Lcom/google/android/gms/ads/internal/client/zzdx;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdFormat;Lcom/google/android/gms/ads/internal/client/zzdx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ts3;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/ts3;->b:Lcom/google/android/gms/ads/AdFormat;

    iput-object p3, p0, Lcom/daaw/ts3;->c:Lcom/google/android/gms/ads/internal/client/zzdx;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/daaw/zy3;
    .locals 3

    const-class v0, Lcom/daaw/ts3;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/ts3;->d:Lcom/daaw/zy3;

    if-nez v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzay;->zza()Lcom/google/android/gms/ads/internal/client/zzaw;

    move-result-object v1

    new-instance v2, Lcom/daaw/xm3;

    invoke-direct {v2}, Lcom/daaw/xm3;-><init>()V

    invoke-virtual {v1, p0, v2}, Lcom/google/android/gms/ads/internal/client/zzaw;->zzr(Landroid/content/Context;Lcom/daaw/an3;)Lcom/daaw/zy3;

    move-result-object p0

    sput-object p0, Lcom/daaw/ts3;->d:Lcom/daaw/zy3;

    :cond_0
    sget-object p0, Lcom/daaw/ts3;->d:Lcom/daaw/zy3;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/ads/query/QueryInfoGenerationCallback;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/ts3;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/ts3;->a(Landroid/content/Context;)Lcom/daaw/zy3;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "Internal Error, query info generator is null."

    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/query/QueryInfoGenerationCallback;->onFailure(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/ts3;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/ts3;->c:Lcom/google/android/gms/ads/internal/client/zzdx;

    if-nez v2, :cond_1

    new-instance v2, Lcom/google/android/gms/ads/internal/client/zzm;

    invoke-direct {v2}, Lcom/google/android/gms/ads/internal/client/zzm;-><init>()V

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/client/zzm;->zza()Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    goto :goto_1

    :cond_1
    sget-object v3, Lcom/google/android/gms/ads/internal/client/zzp;->zza:Lcom/google/android/gms/ads/internal/client/zzp;

    iget-object v4, p0, Lcom/daaw/ts3;->a:Landroid/content/Context;

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/ads/internal/client/zzp;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzdx;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    :goto_1
    new-instance v3, Lcom/google/android/gms/internal/ads/zzcgj;

    iget-object v4, p0, Lcom/daaw/ts3;->b:Lcom/google/android/gms/ads/AdFormat;

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v3, v5, v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzcgj;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzq;Lcom/google/android/gms/ads/internal/client/zzl;)V

    :try_start_0
    new-instance v2, Lcom/daaw/ss3;

    invoke-direct {v2, p0, p1}, Lcom/daaw/ss3;-><init>(Lcom/daaw/ts3;Lcom/google/android/gms/ads/query/QueryInfoGenerationCallback;)V

    invoke-interface {v0, v1, v3, v2}, Lcom/daaw/zy3;->zze(Lcom/daaw/yd0;Lcom/google/android/gms/internal/ads/zzcgj;Lcom/daaw/wy3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "Internal Error."

    goto :goto_0
.end method
