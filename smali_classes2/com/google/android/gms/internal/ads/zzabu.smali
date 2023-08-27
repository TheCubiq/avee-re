.class final Lcom/google/android/gms/internal/ads/zzabu;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaam:Lcom/google/android/gms/internal/ads/zzajh;

.field private final synthetic zzbzw:Lcom/google/android/gms/internal/ads/zzabt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzabt;Lcom/google/android/gms/internal/ads/zzajh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabu;->zzbzw:Lcom/google/android/gms/internal/ads/zzabt;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzabu;->zzaam:Lcom/google/android/gms/internal/ads/zzajh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabu;->zzbzw:Lcom/google/android/gms/internal/ads/zzabt;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzabt;->zza(Lcom/google/android/gms/internal/ads/zzabt;)Lcom/google/android/gms/internal/ads/zzabm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzabu;->zzaam:Lcom/google/android/gms/internal/ads/zzajh;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzabm;->zzb(Lcom/google/android/gms/internal/ads/zzajh;)V

    return-void
.end method
