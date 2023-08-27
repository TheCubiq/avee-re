.class public final Lcom/google/android/gms/internal/ads/zzx;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final result:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final zzbg:Lcom/google/android/gms/internal/ads/zzc;

.field public final zzbh:Lcom/google/android/gms/internal/ads/zzae;

.field public zzbi:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzae;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzx;->zzbi:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzx;->result:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzx;->zzbg:Lcom/google/android/gms/internal/ads/zzc;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzx;->zzbh:Lcom/google/android/gms/internal/ads/zzae;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzc;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/internal/ads/zzc;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzx;->zzbi:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzx;->result:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzx;->zzbg:Lcom/google/android/gms/internal/ads/zzc;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzx;->zzbh:Lcom/google/android/gms/internal/ads/zzae;

    return-void
.end method

.method public static zza(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzc;)Lcom/google/android/gms/internal/ads/zzx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/google/android/gms/internal/ads/zzc;",
            ")",
            "Lcom/google/android/gms/internal/ads/zzx<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/zzx;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzx;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzc;)V

    return-object v0
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzae;)Lcom/google/android/gms/internal/ads/zzx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/zzae;",
            ")",
            "Lcom/google/android/gms/internal/ads/zzx<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/zzx;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzx;-><init>(Lcom/google/android/gms/internal/ads/zzae;)V

    return-object v0
.end method
