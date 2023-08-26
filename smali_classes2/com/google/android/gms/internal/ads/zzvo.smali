.class final Lcom/google/android/gms/internal/ads/zzvo;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaoo;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzaoo<",
        "Lcom/google/android/gms/internal/ads/zzuu;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzbqk:Lcom/google/android/gms/internal/ads/zzvf;

.field private final synthetic zzbqn:Lcom/google/android/gms/internal/ads/zzvw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzvw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvo;->zzbqk:Lcom/google/android/gms/internal/ads/zzvf;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzvo;->zzbqn:Lcom/google/android/gms/internal/ads/zzvw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zze(Ljava/lang/Object;)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvo;->zzbqk:Lcom/google/android/gms/internal/ads/zzvf;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzvf;->zza(Lcom/google/android/gms/internal/ads/zzvf;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvo;->zzbqk:Lcom/google/android/gms/internal/ads/zzvf;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzvf;->zza(Lcom/google/android/gms/internal/ads/zzvf;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvo;->zzbqk:Lcom/google/android/gms/internal/ads/zzvf;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzvf;->zzb(Lcom/google/android/gms/internal/ads/zzvf;)Lcom/google/android/gms/internal/ads/zzvw;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvo;->zzbqn:Lcom/google/android/gms/internal/ads/zzvw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvo;->zzbqk:Lcom/google/android/gms/internal/ads/zzvf;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzvf;->zzb(Lcom/google/android/gms/internal/ads/zzvf;)Lcom/google/android/gms/internal/ads/zzvw;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const-string v0, "New JS engine is loaded, marking previous one as destroyable."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvo;->zzbqk:Lcom/google/android/gms/internal/ads/zzvf;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzvf;->zzb(Lcom/google/android/gms/internal/ads/zzvf;)Lcom/google/android/gms/internal/ads/zzvw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzmb()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvo;->zzbqk:Lcom/google/android/gms/internal/ads/zzvf;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvo;->zzbqn:Lcom/google/android/gms/internal/ads/zzvw;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzvf;->zza(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzvw;)Lcom/google/android/gms/internal/ads/zzvw;

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
