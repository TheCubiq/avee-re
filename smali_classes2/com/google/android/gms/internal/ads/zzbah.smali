.class public abstract Lcom/google/android/gms/internal/ads/zzbah;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Byte;",
        ">;"
    }
.end annotation


# static fields
.field public static final zzdpq:Lcom/google/android/gms/internal/ads/zzbah;

.field private static final zzdpr:Lcom/google/android/gms/internal/ads/zzbal;


# instance fields
.field private zzdpa:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbao;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbq;->zzduq:[B

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbao;-><init>([B)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbah;->zzdpq:Lcom/google/android/gms/internal/ads/zzbah;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbac;->zzabb()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbap;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbap;-><init>(Lcom/google/android/gms/internal/ads/zzbai;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbaj;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbaj;-><init>(Lcom/google/android/gms/internal/ads/zzbai;)V

    :goto_0
    sput-object v0, Lcom/google/android/gms/internal/ads/zzbah;->zzdpr:Lcom/google/android/gms/internal/ads/zzbal;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbah;->zzdpa:I

    return-void
.end method

.method static zzbo(I)Lcom/google/android/gms/internal/ads/zzbam;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbam;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzbam;-><init>(ILcom/google/android/gms/internal/ads/zzbai;)V

    return-object v0
.end method

.method public static zzc([BII)Lcom/google/android/gms/internal/ads/zzbah;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbao;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbah;->zzdpr:Lcom/google/android/gms/internal/ads/zzbal;

    invoke-interface {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzbal;->zzd([BII)[B

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzbao;-><init>([B)V

    return-object v0
.end method

.method static zzd(III)I
    .locals 3

    sub-int v0, p1, p0

    or-int v1, p0, p1

    or-int/2addr v1, v0

    sub-int v2, p2, p1

    or-int/2addr v1, v2

    if-gez v1, :cond_2

    if-ltz p0, :cond_1

    if-ge p1, p0, :cond_0

    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const/16 v0, 0x42

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Beginning index larger than ending index: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const/16 v0, 0x25

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "End index: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " >= "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const/16 p2, 0x20

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "Beginning index: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " < 0"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return v0
.end method

.method public static zzem(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzbah;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbao;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbq;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzbao;-><init>([B)V

    return-object v0
.end method

.method public static zzo([B)Lcom/google/android/gms/internal/ads/zzbah;
    .locals 2

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/ads/zzbah;->zzc([BII)Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object p0

    return-object p0
.end method

.method static zzp([B)Lcom/google/android/gms/internal/ads/zzbah;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbao;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzbao;-><init>([B)V

    return-object v0
.end method


# virtual methods
.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbah;->zzdpa:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbah;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0}, Lcom/google/android/gms/internal/ads/zzbah;->zzc(III)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbah;->zzdpa:I

    :cond_1
    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbai;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzbai;-><init>(Lcom/google/android/gms/internal/ads/zzbah;)V

    return-object v0
.end method

.method public abstract size()I
.end method

.method public final toByteArray()[B
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbah;->size()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbq;->zzduq:[B

    return-object v0

    :cond_0
    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v2, v0}, Lcom/google/android/gms/internal/ads/zzbah;->zza([BIII)V

    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbah;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "<ByteString@%s size=%d>"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected abstract zza(Ljava/nio/charset/Charset;)Ljava/lang/String;
.end method

.method abstract zza(Lcom/google/android/gms/internal/ads/zzbag;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method protected abstract zza([BIII)V
.end method

.method public final zzabd()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbq;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbah;->size()I

    move-result v1

    if-nez v1, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzbah;->zza(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract zzabe()Z
.end method

.method public abstract zzabf()Lcom/google/android/gms/internal/ads/zzbaq;
.end method

.method protected final zzabg()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbah;->zzdpa:I

    return v0
.end method

.method public abstract zzbn(I)B
.end method

.method protected abstract zzc(III)I
.end method

.method public abstract zzk(II)Lcom/google/android/gms/internal/ads/zzbah;
.end method
