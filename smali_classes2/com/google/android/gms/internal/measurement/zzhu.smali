.class final Lcom/google/android/gms/internal/measurement/zzhu;
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
        "Ljava/lang/Float;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/zzid<",
        "Ljava/lang/Float;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/zzjs;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field private static final zza:Lcom/google/android/gms/internal/measurement/zzhu;


# instance fields
.field private zzb:[F

.field private zzc:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 131
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzhu;

    const/4 v1, 0x0

    new-array v2, v1, [F

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/measurement/zzhu;-><init>([FI)V

    .line 132
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzhu;->zza:Lcom/google/android/gms/internal/measurement/zzhu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgg;->i_()V

    return-void
.end method

.method constructor <init>()V
    .locals 2

    const/16 v0, 0xa

    new-array v0, v0, [F

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzhu;-><init>([FI)V

    return-void
.end method

.method private constructor <init>([FI)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzgg;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    .line 5
    iput p2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    return-void
.end method

.method private final zzb(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 77
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    if-ge p1, v0, :cond_0

    return-void

    .line 78
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhu;->zzc(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final zzc(I)Ljava/lang/String;
    .locals 3

    .line 80
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

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
    .locals 4

    .line 100
    check-cast p2, Ljava/lang/Float;

    .line 101
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    .line 102
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzc()V

    if-ltz p1, :cond_1

    .line 103
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    if-gt p1, v0, :cond_1

    .line 105
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    array-length v2, v1

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, p1, 0x1

    sub-int/2addr v0, p1

    .line 106
    invoke-static {v1, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    mul-int/lit8 v0, v0, 0x3

    .line 107
    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    .line 108
    new-array v0, v0, [F

    const/4 v2, 0x0

    .line 109
    invoke-static {v1, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 110
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    add-int/lit8 v2, p1, 0x1

    iget v3, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    sub-int/2addr v3, p1

    invoke-static {v1, p1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 111
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    .line 112
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    aput p2, v0, p1

    .line 113
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    .line 114
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->modCount:I

    return-void

    .line 104
    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhu;->zzc(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final synthetic add(Ljava/lang/Object;)Z
    .locals 0

    .line 116
    check-cast p1, Ljava/lang/Float;

    .line 117
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhu;->zza(F)V

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
            "Ljava/lang/Float;",
            ">;)Z"
        }
    .end annotation

    .line 51
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzc()V

    .line 52
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzhx;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zzhu;

    if-nez v0, :cond_0

    .line 54
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/measurement/zzgg;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    .line 55
    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzhu;

    .line 56
    iget v0, p1, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const v2, 0x7fffffff

    .line 58
    iget v3, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    sub-int/2addr v2, v3

    if-lt v2, v0, :cond_3

    add-int/2addr v3, v0

    .line 62
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    array-length v2, v0

    if-le v3, v2, :cond_2

    .line 63
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    .line 64
    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    iget v4, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    iget p1, p1, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    invoke-static {v0, v1, v2, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 65
    iput v3, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    .line 66
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->modCount:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->modCount:I

    return v0

    .line 60
    :cond_3
    new-instance p1, Ljava/lang/OutOfMemoryError;

    invoke-direct {p1}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 41
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhu;->indexOf(Ljava/lang/Object;)I

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
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 16
    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zzhu;

    if-nez v1, :cond_1

    .line 17
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/measurement/zzgg;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 18
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzhu;

    .line 19
    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    iget v2, p1, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 21
    :cond_2
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    const/4 v1, 0x0

    .line 22
    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    if-ge v1, v2, :cond_4

    .line 23
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    aget v2, v2, v1

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    aget v4, p1, v1

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    if-eq v2, v4, :cond_3

    return v3

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public final synthetic get(I)Ljava/lang/Object;
    .locals 1

    .line 127
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhu;->zzb(I)V

    .line 128
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    aget p1, v0, p1

    .line 129
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 28
    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    if-ge v1, v2, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    .line 29
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    aget v2, v2, v1

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 4

    .line 32
    instance-of v0, p1, Ljava/lang/Float;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 34
    :cond_0
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 35
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhu;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 37
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    aget v3, v3, v2

    cmpl-float v3, v3, p1

    if-nez v3, :cond_1

    return v2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final synthetic remove(I)Ljava/lang/Object;
    .locals 4

    .line 91
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzc()V

    .line 92
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhu;->zzb(I)V

    .line 93
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    aget v1, v0, p1

    .line 94
    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    add-int/lit8 v3, v2, -0x1

    if-ge p1, v3, :cond_0

    add-int/lit8 v3, p1, 0x1

    sub-int/2addr v2, p1

    add-int/lit8 v2, v2, -0x1

    .line 95
    invoke-static {v0, v3, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    :cond_0
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    .line 97
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->modCount:I

    .line 98
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 4

    .line 68
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzc()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 69
    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    if-ge v1, v2, :cond_1

    .line 70
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    aget v2, v2, v1

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 71
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    add-int/lit8 v0, v1, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    sub-int/2addr v2, v1

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-static {p1, v0, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 72
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    sub-int/2addr p1, v3

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    .line 73
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->modCount:I

    add-int/2addr p1, v3

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->modCount:I

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
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    sub-int/2addr v1, p2

    invoke-static {v0, p2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    sub-int/2addr p2, p1

    sub-int/2addr v0, p2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    .line 12
    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->modCount:I

    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "toIndex < fromIndex"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 81
    check-cast p2, Ljava/lang/Float;

    .line 82
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    .line 83
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzc()V

    .line 84
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzhu;->zzb(I)V

    .line 85
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    aget v1, v0, p1

    .line 86
    aput p2, v0, p1

    .line 88
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    return v0
.end method

.method public final synthetic zza(I)Lcom/google/android/gms/internal/measurement/zzid;
    .locals 2

    .line 121
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    if-lt p1, v0, :cond_0

    .line 123
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzhu;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object p1

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/measurement/zzhu;-><init>([FI)V

    return-object v0

    .line 122
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final zza(F)V
    .locals 4

    .line 43
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzc()V

    .line 44
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v2, v0, 0x3

    .line 45
    div-int/lit8 v2, v2, 0x2

    add-int/lit8 v2, v2, 0x1

    .line 46
    new-array v2, v2, [F

    const/4 v3, 0x0

    .line 47
    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 48
    iput-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzb:[F

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/measurement/zzhu;->zzc:I

    aput p1, v0, v1

    return-void
.end method
