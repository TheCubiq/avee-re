.class public Lcom/google/android/gms/internal/ads/zzbbu;
.super Ljava/io/IOException;


# instance fields
.field private zzdut:Lcom/google/android/gms/internal/ads/zzbcu;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbbu;->zzdut:Lcom/google/android/gms/internal/ads/zzbcu;

    return-void
.end method

.method static zzadl()Lcom/google/android/gms/internal/ads/zzbbu;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbbu;

    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbbu;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static zzadm()Lcom/google/android/gms/internal/ads/zzbbu;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbbu;

    const-string v1, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbbu;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static zzadn()Lcom/google/android/gms/internal/ads/zzbbu;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbbu;

    const-string v1, "CodedInputStream encountered a malformed varint."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbbu;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static zzado()Lcom/google/android/gms/internal/ads/zzbbu;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbbu;

    const-string v1, "Protocol message contained an invalid tag (zero)."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbbu;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static zzadp()Lcom/google/android/gms/internal/ads/zzbbu;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbbu;

    const-string v1, "Protocol message end-group tag did not match expected tag."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbbu;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static zzadq()Lcom/google/android/gms/internal/ads/zzbbv;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbbv;

    const-string v1, "Protocol message tag had invalid wire type."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbbv;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static zzadr()Lcom/google/android/gms/internal/ads/zzbbu;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbbu;

    const-string v1, "Failed to parse the message."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbbu;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static zzads()Lcom/google/android/gms/internal/ads/zzbbu;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbbu;

    const-string v1, "Protocol message had invalid UTF-8."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbbu;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final zzj(Lcom/google/android/gms/internal/ads/zzbcu;)Lcom/google/android/gms/internal/ads/zzbbu;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbbu;->zzdut:Lcom/google/android/gms/internal/ads/zzbcu;

    return-object p0
.end method
