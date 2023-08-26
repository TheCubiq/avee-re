.class final Lcom/google/android/gms/internal/ads/zzalw;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzank;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzank<",
        "Lcom/google/android/gms/internal/ads/zzp;",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final synthetic zzcti:Lcom/google/android/gms/internal/ads/zzalz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzalt;Lcom/google/android/gms/internal/ads/zzalz;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzalw;->zzcti:Lcom/google/android/gms/internal/ads/zzalz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzp;

    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzp;->data:[B

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzalw;->zzcti:Lcom/google/android/gms/internal/ads/zzalz;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzalz;->zze(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
