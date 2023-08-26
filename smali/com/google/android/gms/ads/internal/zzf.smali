.class final synthetic Lcom/google/android/gms/ads/internal/zzf;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzwj:Lcom/google/android/gms/ads/internal/zzbl;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/ads/internal/zzbl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzf;->zzwj:Lcom/google/android/gms/ads/internal/zzbl;

    return-void
.end method

.method static zza(Lcom/google/android/gms/ads/internal/zzbl;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/zzf;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/internal/zzf;-><init>(Lcom/google/android/gms/ads/internal/zzbl;)V

    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzf;->zzwj:Lcom/google/android/gms/ads/internal/zzbl;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzbl;->resume()V

    return-void
.end method
