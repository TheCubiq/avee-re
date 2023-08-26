.class public final Lcom/google/android/gms/internal/ads/zzaun;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final zzdhm:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TP;"
        }
    .end annotation
.end field

.field private final zzdhn:[B

.field private final zzdho:Lcom/google/android/gms/internal/ads/zzaxl;

.field private final zzdhp:Lcom/google/android/gms/internal/ads/zzayd;


# direct methods
.method public constructor <init>(Ljava/lang/Object;[BLcom/google/android/gms/internal/ads/zzaxl;Lcom/google/android/gms/internal/ads/zzayd;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;[B",
            "Lcom/google/android/gms/internal/ads/zzaxl;",
            "Lcom/google/android/gms/internal/ads/zzayd;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaun;->zzdhm:Ljava/lang/Object;

    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaun;->zzdhn:[B

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzaun;->zzdho:Lcom/google/android/gms/internal/ads/zzaxl;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzaun;->zzdhp:Lcom/google/android/gms/internal/ads/zzayd;

    return-void
.end method


# virtual methods
.method public final zzwi()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TP;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaun;->zzdhm:Ljava/lang/Object;

    return-object v0
.end method

.method public final zzwj()[B
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaun;->zzdhn:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method
