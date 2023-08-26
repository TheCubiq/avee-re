.class public final Lcom/google/android/gms/internal/ads/zzbeh;
.super Ljava/util/AbstractList;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbcd;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList<",
        "Ljava/lang/String;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzbcd;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field private final zzdyz:Lcom/google/android/gms/internal/ads/zzbcd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzbcd;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbeh;->zzdyz:Lcom/google/android/gms/internal/ads/zzbcd;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzbeh;)Lcom/google/android/gms/internal/ads/zzbcd;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzbeh;->zzdyz:Lcom/google/android/gms/internal/ads/zzbcd;

    return-object p0
.end method


# virtual methods
.method public final synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbeh;->zzdyz:Lcom/google/android/gms/internal/ads/zzbcd;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzbcd;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbej;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzbej;-><init>(Lcom/google/android/gms/internal/ads/zzbeh;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbei;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzbei;-><init>(Lcom/google/android/gms/internal/ads/zzbeh;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbeh;->zzdyz:Lcom/google/android/gms/internal/ads/zzbcd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbcd;->size()I

    move-result v0

    return v0
.end method

.method public final zzadw()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbeh;->zzdyz:Lcom/google/android/gms/internal/ads/zzbcd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbcd;->zzadw()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final zzadx()Lcom/google/android/gms/internal/ads/zzbcd;
    .locals 0

    return-object p0
.end method

.method public final zzap(Lcom/google/android/gms/internal/ads/zzbah;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final zzcp(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbeh;->zzdyz:Lcom/google/android/gms/internal/ads/zzbcd;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzbcd;->zzcp(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
