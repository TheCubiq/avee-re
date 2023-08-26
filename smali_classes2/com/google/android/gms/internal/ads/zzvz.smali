.class final Lcom/google/android/gms/internal/ads/zzvz;
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
.field final synthetic zzbqw:Lcom/google/android/gms/internal/ads/zzvw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzvw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvz;->zzbqw:Lcom/google/android/gms/internal/ads/zzvw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zze(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/zzuu;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvy:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzwa;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzwa;-><init>(Lcom/google/android/gms/internal/ads/zzvz;Lcom/google/android/gms/internal/ads/zzuu;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
