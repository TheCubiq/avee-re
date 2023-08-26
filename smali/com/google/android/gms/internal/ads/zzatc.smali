.class final Lcom/google/android/gms/internal/ads/zzatc;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# static fields
.field private static final zzdbo:[Ljava/lang/String;

.field private static final zzdbp:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/16 v0, 0xf

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "HOST_LOOKUP"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "UNSUPPORTED_AUTH_SCHEME"

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-string v1, "AUTHENTICATION"

    const/4 v5, 0x3

    aput-object v1, v0, v5

    const-string v1, "PROXY_AUTHENTICATION"

    const/4 v6, 0x4

    aput-object v1, v0, v6

    const-string v1, "CONNECT"

    const/4 v7, 0x5

    aput-object v1, v0, v7

    const-string v1, "IO"

    const/4 v8, 0x6

    aput-object v1, v0, v8

    const/4 v1, 0x7

    const-string v9, "TIMEOUT"

    aput-object v9, v0, v1

    const/16 v1, 0x8

    const-string v9, "REDIRECT_LOOP"

    aput-object v9, v0, v1

    const/16 v1, 0x9

    const-string v9, "UNSUPPORTED_SCHEME"

    aput-object v9, v0, v1

    const/16 v1, 0xa

    const-string v9, "FAILED_SSL_HANDSHAKE"

    aput-object v9, v0, v1

    const/16 v1, 0xb

    const-string v9, "BAD_URL"

    aput-object v9, v0, v1

    const/16 v1, 0xc

    const-string v9, "FILE"

    aput-object v9, v0, v1

    const/16 v1, 0xd

    const-string v9, "FILE_NOT_FOUND"

    aput-object v9, v0, v1

    const/16 v1, 0xe

    const-string v9, "TOO_MANY_REQUESTS"

    aput-object v9, v0, v1

    sput-object v0, Lcom/google/android/gms/internal/ads/zzatc;->zzdbo:[Ljava/lang/String;

    new-array v0, v8, [Ljava/lang/String;

    const-string v1, "NOT_YET_VALID"

    aput-object v1, v0, v2

    const-string v1, "EXPIRED"

    aput-object v1, v0, v3

    const-string v1, "ID_MISMATCH"

    aput-object v1, v0, v4

    const-string v1, "UNTRUSTED"

    aput-object v1, v0, v5

    const-string v1, "DATE_INVALID"

    aput-object v1, v0, v6

    const-string v1, "INVALID"

    aput-object v1, v0, v7

    sput-object v0, Lcom/google/android/gms/internal/ads/zzatc;->zzdbp:[Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zznk;->zzazy:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "err"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "code"

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-string p0, ""

    :goto_0
    const-string p1, "host"

    invoke-virtual {v0, p1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method final zzb(Landroid/net/http/SslError;)V
    .locals 3
    .param p1    # Landroid/net/http/SslError;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/net/http/SslError;->getPrimaryError()I

    move-result v0

    if-ltz v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/ads/zzatc;->zzdbp:[Ljava/lang/String;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v0, v1, v0

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    move-result-object p1

    const-string v1, "ssl_err"

    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/ads/zzatc;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method final zze(ILjava/lang/String;)V
    .locals 3

    if-gez p1, :cond_0

    neg-int v0, p1

    add-int/lit8 v0, v0, -0x1

    sget-object v1, Lcom/google/android/gms/internal/ads/zzatc;->zzdbo:[Ljava/lang/String;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object p1, v1, v0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string v0, "http_err"

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzatc;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
