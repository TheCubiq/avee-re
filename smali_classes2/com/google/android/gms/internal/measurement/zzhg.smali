.class final Lcom/google/android/gms/internal/measurement/zzhg;
.super Lcom/google/android/gms/internal/measurement/zzgg;
.source "com.google.android.gms:play-services-measurement-base@@17.5.0"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzid;
.implements Lcom/google/android/gms/internal/measurement/zzjs;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzgg<",
        "Ljava/lang/Double;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/zzid<",
        "Ljava/lang/Double;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/zzjs;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field private static final zza:Lcom/google/android/gms/internal/measurement/zzhg;


# instance fields
.field private zzb:[D

.field private zzc:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 132
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzhg;

    const/4 v1, 0x0

    new-array v2, v1, [D

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/measurement/zzhg;-><init>([DI)V

    .line 133
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzhg;->zza:Lcom/google/android/gms/internal/measurement/zzhg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgg;->i_()V

    return-void
.end method

.method constructor <init>()V
    .locals 2

    const/16 v0, 0xa

    new-array v0, v0, [D

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzhg;-><init>([DI)V

    return-void
.end method

.method private constructor <init>([DI)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzgg;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    .line 5
    iput p2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    return-void
.end method

.method private final zzb(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 78
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    if-ge p1, v0, :cond_0

    return-void

    .line 79
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhg;->zzc(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final zzc(I)Ljava/lang/String;
    .locals 3

    .line 81
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x23

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Index:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", Size:"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final synthetic add(ILjava/lang/Object;)V
    .locals 5

    .line 101
    check-cast p2, Ljava/lang/Double;

    .line 102
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    .line 103
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzc()V

    if-ltz p1, :cond_1

    .line 104
    iget p2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    if-gt p1, p2, :cond_1

    .line 106
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    array-length v3, v2

    if-ge p2, v3, :cond_0

    add-int/lit8 v3, p1, 0x1

    sub-int/2addr p2, p1

    .line 107
    invoke-static {v2, p1, v2, v3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    mul-int/lit8 p2, p2, 0x3

    .line 108
    div-int/lit8 p2, p2, 0x2

    add-int/lit8 p2, p2, 0x1

    .line 109
    new-array p2, p2, [D

    const/4 v3, 0x0

    .line 110
    invoke-static {v2, v3, p2, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 111
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    add-int/lit8 v3, p1, 0x1

    iget v4, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    sub-int/2addr v4, p1

    invoke-static {v2, p1, p2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 112
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    .line 113
    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    aput-wide v0, p2, p1

    .line 114
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    .line 115
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->modCount:I

    return-void

    .line 105
    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhg;->zzc(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final synthetic add(Ljava/lang/Object;)Z
    .locals 2

    .line 117
    check-cast p1, Ljava/lang/Double;

    .line 118
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzhg;->zza(D)V

    const/4 p1, 0x1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Double;",
            ">;)Z"
        }
    .end annotation

    .line 52
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzc()V

    .line 53
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzhx;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zzhg;

    if-nez v0, :cond_0

    .line 55
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/measurement/zzgg;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    .line 56
    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzhg;

    .line 57
    iget v0, p1, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const v2, 0x7fffffff

    .line 59
    iget v3, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    sub-int/2addr v2, v3

    if-lt v2, v0, :cond_3

    add-int/2addr v3, v0

    .line 63
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    array-length v2, v0

    if-le v3, v2, :cond_2

    .line 64
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    .line 65
    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    iget v4, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    iget p1, p1, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    invoke-static {v0, v1, v2, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 66
    iput v3, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    .line 67
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->modCount:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->modCount:I

    return v0

    .line 61
    :cond_3
    new-instance p1, Ljava/lang/OutOfMemoryError;

    invoke-direct {p1}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 42
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhg;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 16
    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zzhg;

    if-nez v1, :cond_1

    .line 17
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/measurement/zzgg;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 18
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzhg;

    .line 19
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    iget v2, p1, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 21
    :cond_2
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    const/4 v1, 0x0

    .line 22
    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    if-ge v1, v2, :cond_4

    .line 23
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    aget-wide v4, v2, v1

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    aget-wide v6, p1, v1

    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v6

    cmp-long v2, v4, v6

    if-eqz v2, :cond_3

    return v3

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public final synthetic get(I)Ljava/lang/Object;
    .locals 3

    .line 128
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhg;->zzb(I)V

    .line 129
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    aget-wide v1, v0, p1

    .line 130
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 28
    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    if-ge v1, v2, :cond_0

    .line 29
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    aget-wide v3, v2, v1

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    mul-int/lit8 v0, v0, 0x1f

    .line 30
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/zzhx;->zza(J)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 7

    .line 33
    instance-of v0, p1, Ljava/lang/Double;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 35
    :cond_0
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    .line 36
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhg;->size()I

    move-result p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_2

    .line 38
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    aget-wide v5, v4, v0

    cmpl-double v4, v5, v2

    if-nez v4, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final synthetic remove(I)Ljava/lang/Object;
    .locals 5

    .line 92
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzc()V

    .line 93
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhg;->zzb(I)V

    .line 94
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    aget-wide v1, v0, p1

    .line 95
    iget v3, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    add-int/lit8 v4, v3, -0x1

    if-ge p1, v4, :cond_0

    add-int/lit8 v4, p1, 0x1

    sub-int/2addr v3, p1

    add-int/lit8 v3, v3, -0x1

    .line 96
    invoke-static {v0, v4, v0, p1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 97
    :cond_0
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    .line 98
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->modCount:I

    .line 99
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 5

    .line 69
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzc()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 70
    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    if-ge v1, v2, :cond_1

    .line 71
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    aget-wide v3, v2, v1

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 72
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    add-int/lit8 v0, v1, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    sub-int/2addr v2, v1

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-static {p1, v0, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 73
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    sub-int/2addr p1, v3

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    .line 74
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->modCount:I

    add-int/2addr p1, v3

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->modCount:I

    return v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method protected final removeRange(II)V
    .locals 2

    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzc()V

    if-lt p2, p1, :cond_0

    .line 10
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    sub-int/2addr v1, p2

    invoke-static {v0, p2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    sub-int/2addr p2, p1

    sub-int/2addr v0, p2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    .line 12
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->modCount:I

    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "toIndex < fromIndex"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 82
    check-cast p2, Ljava/lang/Double;

    .line 83
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    .line 84
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzc()V

    .line 85
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhg;->zzb(I)V

    .line 86
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    aget-wide v2, p2, p1

    .line 87
    aput-wide v0, p2, p1

    .line 89
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 43
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    return v0
.end method

.method public final synthetic zza(I)Lcom/google/android/gms/internal/measurement/zzid;
    .locals 2

    .line 122
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    if-lt p1, v0, :cond_0

    .line 124
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzhg;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object p1

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/measurement/zzhg;-><init>([DI)V

    return-object v0

    .line 123
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final zza(D)V
    .locals 4

    .line 44
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzc()V

    .line 45
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v2, v0, 0x3

    .line 46
    div-int/lit8 v2, v2, 0x2

    add-int/lit8 v2, v2, 0x1

    .line 47
    new-array v2, v2, [D

    const/4 v3, 0x0

    .line 48
    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 49
    iput-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzb:[D

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzc:I

    aput-wide p1, v0, v1

    return-void
.end method
