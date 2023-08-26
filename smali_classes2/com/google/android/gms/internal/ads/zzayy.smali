.class public final Lcom/google/android/gms/internal/ads/zzayy;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T_WRAPPER::",
        "Lcom/google/android/gms/internal/ads/zzayz<",
        "TT_ENGINE;>;T_ENGINE:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final logger:Ljava/util/logging/Logger;

.field private static final zzdny:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/Provider;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzdnz:Lcom/google/android/gms/internal/ads/zzayy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzayy<",
            "Lcom/google/android/gms/internal/ads/zzaza;",
            "Ljavax/crypto/Cipher;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzdoa:Lcom/google/android/gms/internal/ads/zzayy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzayy<",
            "Lcom/google/android/gms/internal/ads/zzaze;",
            "Ljavax/crypto/Mac;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzdob:Lcom/google/android/gms/internal/ads/zzayy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzayy<",
            "Lcom/google/android/gms/internal/ads/zzazg;",
            "Ljava/security/Signature;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzdoc:Lcom/google/android/gms/internal/ads/zzayy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzayy<",
            "Lcom/google/android/gms/internal/ads/zzazf;",
            "Ljava/security/MessageDigest;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzdod:Lcom/google/android/gms/internal/ads/zzayy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzayy<",
            "Lcom/google/android/gms/internal/ads/zzazb;",
            "Ljavax/crypto/KeyAgreement;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzdoe:Lcom/google/android/gms/internal/ads/zzayy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzayy<",
            "Lcom/google/android/gms/internal/ads/zzazd;",
            "Ljava/security/KeyPairGenerator;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzdof:Lcom/google/android/gms/internal/ads/zzayy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzayy<",
            "Lcom/google/android/gms/internal/ads/zzazc;",
            "Ljava/security/KeyFactory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzdog:Lcom/google/android/gms/internal/ads/zzayz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT_WRAPPER;"
        }
    .end annotation
.end field

.field private zzdoh:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/Provider;",
            ">;"
        }
    .end annotation
.end field

.field private zzdoi:Z


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const-class v0, Lcom/google/android/gms/internal/ads/zzayy;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayy;->logger:Ljava/util/logging/Logger;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzazp;->zzaat()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "GmsCore_OpenSSL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "AndroidOpenSSL"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_1

    aget-object v6, v1, v5

    invoke-static {v6}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    sget-object v7, Lcom/google/android/gms/internal/ads/zzayy;->logger:Ljava/util/logging/Logger;

    sget-object v8, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    new-array v9, v4, [Ljava/lang/Object;

    aput-object v6, v9, v3

    const-string v6, "Provider %s not available"

    invoke-static {v6, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v9, "com.google.crypto.tink.subtle.EngineFactory"

    const-string v10, "toProviderList"

    invoke-virtual {v7, v8, v9, v10, v6}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    sput-object v2, Lcom/google/android/gms/internal/ads/zzayy;->zzdny:Ljava/util/List;

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayy;->zzdny:Ljava/util/List;

    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzayy;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzaza;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzaza;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzayy;-><init>(Lcom/google/android/gms/internal/ads/zzayz;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayy;->zzdnz:Lcom/google/android/gms/internal/ads/zzayy;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayy;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzaze;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzaze;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzayy;-><init>(Lcom/google/android/gms/internal/ads/zzayz;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayy;->zzdoa:Lcom/google/android/gms/internal/ads/zzayy;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayy;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzazg;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzazg;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzayy;-><init>(Lcom/google/android/gms/internal/ads/zzayz;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayy;->zzdob:Lcom/google/android/gms/internal/ads/zzayy;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayy;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzazf;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzazf;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzayy;-><init>(Lcom/google/android/gms/internal/ads/zzayz;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayy;->zzdoc:Lcom/google/android/gms/internal/ads/zzayy;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayy;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzazb;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzazb;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzayy;-><init>(Lcom/google/android/gms/internal/ads/zzayz;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayy;->zzdod:Lcom/google/android/gms/internal/ads/zzayy;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayy;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzazd;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzazd;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzayy;-><init>(Lcom/google/android/gms/internal/ads/zzayz;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayy;->zzdoe:Lcom/google/android/gms/internal/ads/zzayy;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayy;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzazc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzazc;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzayy;-><init>(Lcom/google/android/gms/internal/ads/zzayz;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayy;->zzdof:Lcom/google/android/gms/internal/ads/zzayy;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzayz;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT_WRAPPER;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzayy;->zzdog:Lcom/google/android/gms/internal/ads/zzayz;

    sget-object p1, Lcom/google/android/gms/internal/ads/zzayy;->zzdny:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzayy;->zzdoh:Ljava/util/List;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzayy;->zzdoi:Z

    return-void
.end method

.method private final zza(Ljava/lang/String;Ljava/security/Provider;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzayy;->zzdog:Lcom/google/android/gms/internal/ads/zzayz;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzayz;->zzb(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final zzek(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT_ENGINE;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzayy;->zzdoh:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/Provider;

    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/ads/zzayy;->zza(Ljava/lang/String;Ljava/security/Provider;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzayy;->zzdog:Lcom/google/android/gms/internal/ads/zzayz;

    :goto_0
    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzayz;->zzb(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzayy;->zzdoi:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzayy;->zzdog:Lcom/google/android/gms/internal/ads/zzayz;

    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "No good Provider found."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
