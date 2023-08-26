.class public Lcom/google/android/gms/internal/ads/zzakv;
.super Lcom/google/android/gms/internal/ads/zzakt;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzakt;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Landroid/net/http/SslError;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public zzrq()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
