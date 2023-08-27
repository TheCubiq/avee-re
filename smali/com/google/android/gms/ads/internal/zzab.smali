.class final Lcom/google/android/gms/ads/internal/zzab;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzxl:Lcom/google/android/gms/ads/internal/zzy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/zzy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzab;->zzxl:Lcom/google/android/gms/ads/internal/zzy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzab;->zzxl:Lcom/google/android/gms/ads/internal/zzy;

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/zzy;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzy;->zzd(Lcom/google/android/gms/internal/ads/zzajh;)V

    return-void
.end method
