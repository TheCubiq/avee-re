.class final Lcom/google/android/gms/internal/ads/zzajy;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzcqt:Lcom/google/android/gms/internal/ads/zzajx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzajx;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajy;->zzcqt:Lcom/google/android/gms/internal/ads/zzajx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajy;->zzcqt:Lcom/google/android/gms/internal/ads/zzajx;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzajx;->zza(Lcom/google/android/gms/internal/ads/zzajx;Ljava/lang/Thread;)Ljava/lang/Thread;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajy;->zzcqt:Lcom/google/android/gms/internal/ads/zzajx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzajx;->zzdn()V

    return-void
.end method
