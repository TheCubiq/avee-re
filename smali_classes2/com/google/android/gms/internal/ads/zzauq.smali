.class final Lcom/google/android/gms/internal/ads/zzauq;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaua;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzaua<",
        "Lcom/google/android/gms/internal/ads/zzatz;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Ljava/lang/String;Ljava/lang/String;I)Lcom/google/android/gms/internal/ads/zzaug;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/internal/ads/zzaug<",
            "Lcom/google/android/gms/internal/ads/zzatz;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const v4, 0x2d9f47

    if-eq v1, v4, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "aead"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, -0x1

    :goto_1
    const/4 v1, 0x1

    if-nez v0, :cond_a

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const/4 v0, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    sparse-switch p2, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string p2, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 v2, 0x5

    goto :goto_2

    :sswitch_1
    const-string p2, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 v2, 0x2

    goto :goto_2

    :sswitch_2
    const-string p2, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :sswitch_3
    const-string p2, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 v2, 0x4

    goto :goto_2

    :sswitch_4
    const-string p2, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :sswitch_5
    const-string p2, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 v2, 0x3

    :cond_2
    :goto_2
    if-eqz v2, :cond_8

    if-eq v2, v1, :cond_7

    if-eq v2, v6, :cond_6

    if-eq v2, v5, :cond_5

    if-eq v2, v4, :cond_4

    if-ne v2, v0, :cond_3

    new-instance p2, Lcom/google/android/gms/internal/ads/zzauz;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzauz;-><init>()V

    goto :goto_3

    :cond_3
    new-instance p2, Ljava/security/GeneralSecurityException;

    new-array p3, v1, [Ljava/lang/Object;

    aput-object p1, p3, v3

    const-string p1, "No support for primitive \'Aead\' with key type \'%s\'."

    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p2, Lcom/google/android/gms/internal/ads/zzaux;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzaux;-><init>()V

    goto :goto_3

    :cond_5
    new-instance p2, Lcom/google/android/gms/internal/ads/zzauw;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzauw;-><init>()V

    goto :goto_3

    :cond_6
    new-instance p2, Lcom/google/android/gms/internal/ads/zzauv;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzauv;-><init>()V

    goto :goto_3

    :cond_7
    new-instance p2, Lcom/google/android/gms/internal/ads/zzauu;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzauu;-><init>()V

    goto :goto_3

    :cond_8
    new-instance p2, Lcom/google/android/gms/internal/ads/zzaus;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzaus;-><init>()V

    :goto_3
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzaug;->getVersion()I

    move-result v0

    if-lt v0, p3, :cond_9

    return-object p2

    :cond_9
    new-instance p2, Ljava/security/GeneralSecurityException;

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "No key manager for key type \'%s\' with version at least %d."

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_a
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-array p3, v1, [Ljava/lang/Object;

    aput-object p2, p3, v3

    const-string p2, "No support for primitive \'%s\'."

    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1580a8e0 -> :sswitch_5
        0x4878f271 -> :sswitch_4
        0x579e3055 -> :sswitch_3
        0x6b1dc604 -> :sswitch_2
        0x6e9ea62f -> :sswitch_1
        0x7bee4165 -> :sswitch_0
    .end sparse-switch
.end method
