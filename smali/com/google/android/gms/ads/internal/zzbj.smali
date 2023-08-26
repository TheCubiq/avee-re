.class final Lcom/google/android/gms/ads/internal/zzbj;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

.field private final synthetic zzaal:Ljava/lang/String;

.field private final synthetic zzaam:Lcom/google/android/gms/internal/ads/zzajh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/zzbc;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzajh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbj;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzbj;->zzaal:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzbj;->zzaam:Lcom/google/android/gms/internal/ads/zzajh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbj;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzadi:Landroidx/collection/SimpleArrayMap;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbj;->zzaal:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/collection/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzrf;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbj;->zzaam:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzajh;->zzcoj:Lcom/google/android/gms/internal/ads/zzpb;

    check-cast v1, Lcom/google/android/gms/internal/ads/zzos;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzrf;->zzb(Lcom/google/android/gms/internal/ads/zzqs;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
