.class final Lcom/google/android/gms/internal/ads/zzahp;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzclu:Lcom/google/android/gms/internal/ads/zzxq;

.field private final synthetic zzclv:Lcom/google/android/gms/internal/ads/zzahn;

.field private final synthetic zzclw:Lcom/google/android/gms/internal/ads/zzahv;

.field private final synthetic zzyh:Lcom/google/android/gms/internal/ads/zzjj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzahn;Lcom/google/android/gms/internal/ads/zzxq;Lcom/google/android/gms/internal/ads/zzjj;Lcom/google/android/gms/internal/ads/zzahv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahp;->zzclv:Lcom/google/android/gms/internal/ads/zzahn;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzahp;->zzclu:Lcom/google/android/gms/internal/ads/zzxq;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzahp;->zzyh:Lcom/google/android/gms/internal/ads/zzjj;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzahp;->zzclw:Lcom/google/android/gms/internal/ads/zzahv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahp;->zzclu:Lcom/google/android/gms/internal/ads/zzxq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzahp;->zzclv:Lcom/google/android/gms/internal/ads/zzahn;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzahn;->zza(Lcom/google/android/gms/internal/ads/zzahn;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzahp;->zzyh:Lcom/google/android/gms/internal/ads/zzjj;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzahp;->zzclw:Lcom/google/android/gms/internal/ads/zzahv;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzahp;->zzclv:Lcom/google/android/gms/internal/ads/zzahn;

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzahn;->zzb(Lcom/google/android/gms/internal/ads/zzahn;)Ljava/lang/String;

    move-result-object v5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzxq;->zza(Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/internal/ads/zzjj;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaic;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Fail to initialize adapter "

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzahp;->zzclv:Lcom/google/android/gms/internal/ads/zzahn;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzahn;->zzbth:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v1, v2

    :goto_0
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahp;->zzclv:Lcom/google/android/gms/internal/ads/zzahn;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahn;->zzbth:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzahn;->zza(Ljava/lang/String;I)V

    return-void
.end method
