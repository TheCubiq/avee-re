.class final Lcom/google/android/gms/internal/ads/zzauv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaug;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzaug<",
        "Lcom/google/android/gms/internal/ads/zzatz;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final zzd(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzatz;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const-string v0, "expected AesGcmKey proto"

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzawe;->zzr(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzawe;

    move-result-object p1

    instance-of v1, p1, Lcom/google/android/gms/internal/ads/zzawe;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ads/zzawe;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawe;->getVersion()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzazq;->zzj(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawe;->zzwv()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbah;->size()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzazq;->zzbi(I)V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzayj;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawe;->zzwv()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbah;->toByteArray()[B

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzayj;-><init>([B)V

    check-cast v1, Lcom/google/android/gms/internal/ads/zzatz;

    return-object v1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzbbu; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getVersion()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzbah;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzauv;->zzd(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzatz;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzbcu;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzawe;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ads/zzawe;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawe;->getVersion()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzazq;->zzj(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawe;->zzwv()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbah;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzazq;->zzbi(I)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayj;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawe;->zzwv()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbah;->toByteArray()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzayj;-><init>([B)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "expected AesGcmKey proto"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzbcu;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzawg;->zzt(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzawg;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzauv;->zzb(Lcom/google/android/gms/internal/ads/zzbcu;)Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzbbu; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "expected serialized AesGcmKeyFormat proto"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzbcu;)Lcom/google/android/gms/internal/ads/zzbcu;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzawg;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ads/zzawg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawg;->getKeySize()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzazq;->zzbi(I)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzawe;->zzxk()Lcom/google/android/gms/internal/ads/zzawe$zza;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawg;->getKeySize()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzazl;->zzbh(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbah;->zzo([B)Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzawe$zza;->zzs(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzawe$zza;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzawe$zza;->zzao(I)Lcom/google/android/gms/internal/ads/zzawe$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadi()Lcom/google/android/gms/internal/ads/zzbbo;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbbo;

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "expected AesGcmKeyFormat proto"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzaxi;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzauv;->zzb(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzawe;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzaxi;->zzyz()Lcom/google/android/gms/internal/ads/zzaxi$zza;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaxi$zza;->zzeb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaxi$zza;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzazy;->zzaav()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzaxi$zza;->zzai(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzaxi$zza;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaxi$zzb;->zzdkx:Lcom/google/android/gms/internal/ads/zzaxi$zzb;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzaxi$zza;->zzb(Lcom/google/android/gms/internal/ads/zzaxi$zzb;)Lcom/google/android/gms/internal/ads/zzaxi$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbbo$zza;->zzadi()Lcom/google/android/gms/internal/ads/zzbbo;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbbo;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzaxi;

    return-object p1
.end method
