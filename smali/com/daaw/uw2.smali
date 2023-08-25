.class public final Lcom/daaw/uw2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/tw2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/zzatd;

    check-cast p2, Lcom/google/android/gms/internal/ads/zzatd;

    iget p2, p2, Lcom/google/android/gms/internal/ads/zzatd;->q:I

    iget p1, p1, Lcom/google/android/gms/internal/ads/zzatd;->q:I

    sub-int/2addr p2, p1

    return p2
.end method
