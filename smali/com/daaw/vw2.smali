.class public Lcom/daaw/vw2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/mw2;

.field public final b:[I

.field public final c:[Lcom/google/android/gms/internal/ads/zzatd;

.field public d:I


# direct methods
.method public varargs constructor <init>(Lcom/daaw/mw2;[I)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/vw2;->a:Lcom/daaw/mw2;

    const/4 v0, 0x1

    new-array v1, v0, [Lcom/google/android/gms/internal/ads/zzatd;

    iput-object v1, p0, Lcom/daaw/vw2;->c:[Lcom/google/android/gms/internal/ads/zzatd;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-gtz v2, :cond_0

    iget-object v3, p0, Lcom/daaw/vw2;->c:[Lcom/google/android/gms/internal/ads/zzatd;

    aget v4, p2, v2

    invoke-virtual {p1, v4}, Lcom/daaw/mw2;->b(I)Lcom/google/android/gms/internal/ads/zzatd;

    move-result-object v4

    aput-object v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/daaw/vw2;->c:[Lcom/google/android/gms/internal/ads/zzatd;

    new-instance v2, Lcom/daaw/uw2;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/daaw/uw2;-><init>(Lcom/daaw/tw2;)V

    invoke-static {p2, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    new-array p2, v0, [I

    iput-object p2, p0, Lcom/daaw/vw2;->b:[I

    :goto_1
    if-gtz v1, :cond_1

    iget-object p2, p0, Lcom/daaw/vw2;->b:[I

    iget-object v0, p0, Lcom/daaw/vw2;->c:[Lcom/google/android/gms/internal/ads/zzatd;

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Lcom/daaw/mw2;->a(Lcom/google/android/gms/internal/ads/zzatd;)I

    move-result v0

    aput v0, p2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    iget-object p1, p0, Lcom/daaw/vw2;->b:[I

    const/4 v0, 0x0

    aget p1, p1, v0

    return p1
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/vw2;->b:[I

    array-length v0, v0

    const/4 v0, 0x1

    return v0
.end method

.method public final c(I)Lcom/google/android/gms/internal/ads/zzatd;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vw2;->c:[Lcom/google/android/gms/internal/ads/zzatd;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final d()Lcom/daaw/mw2;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vw2;->a:Lcom/daaw/mw2;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/daaw/vw2;

    iget-object v2, p0, Lcom/daaw/vw2;->a:Lcom/daaw/mw2;

    iget-object v3, p1, Lcom/daaw/vw2;->a:Lcom/daaw/mw2;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/daaw/vw2;->b:[I

    iget-object p1, p1, Lcom/daaw/vw2;->b:[I

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lcom/daaw/vw2;->d:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/vw2;->a:Lcom/daaw/mw2;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/vw2;->b:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/vw2;->d:I

    :cond_0
    return v0
.end method
