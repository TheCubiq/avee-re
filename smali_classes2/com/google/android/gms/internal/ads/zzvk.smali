.class final Lcom/google/android/gms/internal/ads/zzvk;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
        "Lcom/google/android/gms/internal/ads/zzwb;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzbqi:Lcom/google/android/gms/internal/ads/zzvw;

.field private final synthetic zzbqj:Lcom/google/android/gms/internal/ads/zzuu;

.field private final synthetic zzbqk:Lcom/google/android/gms/internal/ads/zzvf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzvw;Lcom/google/android/gms/internal/ads/zzuu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvk;->zzbqk:Lcom/google/android/gms/internal/ads/zzvf;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzvk;->zzbqi:Lcom/google/android/gms/internal/ads/zzvw;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzvk;->zzbqj:Lcom/google/android/gms/internal/ads/zzuu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvk;->zzbqk:Lcom/google/android/gms/internal/ads/zzvf;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzvf;->zza(Lcom/google/android/gms/internal/ads/zzvf;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzvk;->zzbqi:Lcom/google/android/gms/internal/ads/zzvw;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaop;->getStatus()I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzvk;->zzbqi:Lcom/google/android/gms/internal/ads/zzvw;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaop;->getStatus()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzvk;->zzbqk:Lcom/google/android/gms/internal/ads/zzvf;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/zzvf;->zza(Lcom/google/android/gms/internal/ads/zzvf;I)I

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzvk;->zzbqk:Lcom/google/android/gms/internal/ads/zzvf;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzvf;->zzc(Lcom/google/android/gms/internal/ads/zzvf;)Lcom/google/android/gms/internal/ads/zzalo;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvk;->zzbqj:Lcom/google/android/gms/internal/ads/zzuu;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/zzalo;->zze(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzvk;->zzbqi:Lcom/google/android/gms/internal/ads/zzvw;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvk;->zzbqj:Lcom/google/android/gms/internal/ads/zzuu;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzaop;->zzk(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzvk;->zzbqk:Lcom/google/android/gms/internal/ads/zzvf;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvk;->zzbqi:Lcom/google/android/gms/internal/ads/zzvw;

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/zzvf;->zza(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzvw;)Lcom/google/android/gms/internal/ads/zzvw;

    const-string p2, "Successfully loaded JS Engine."

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzakb;->v(Ljava/lang/String;)V

    monitor-exit p1

    return-void

    :cond_1
    :goto_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
