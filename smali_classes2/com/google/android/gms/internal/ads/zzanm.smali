.class public final Lcom/google/android/gms/internal/ads/zzanm;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# direct methods
.method public static zza(Lcom/google/android/gms/internal/ads/zzanz;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzann;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzann;-><init>(Ljava/lang/String;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvz:Ljava/util/concurrent/Executor;

    invoke-static {p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzano;->zza(Lcom/google/android/gms/internal/ads/zzanz;Lcom/google/android/gms/internal/ads/zzanl;Ljava/util/concurrent/Executor;)V

    return-void
.end method
