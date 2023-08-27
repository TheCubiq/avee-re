.class final synthetic Lcom/google/android/gms/internal/ads/zzapj;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzcyc:Lcom/google/android/gms/internal/ads/zzapg;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzapg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzapj;->zzcyc:Lcom/google/android/gms/internal/ads/zzapg;

    return-void
.end method

.method static zza(Lcom/google/android/gms/internal/ads/zzapg;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzapj;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzapj;-><init>(Lcom/google/android/gms/internal/ads/zzapg;)V

    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzapj;->zzcyc:Lcom/google/android/gms/internal/ads/zzapg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzapg;->stop()V

    return-void
.end method
