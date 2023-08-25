.class public final Lcom/daaw/re8;
.super Lcom/daaw/z48;
.source ""

# interfaces
.implements Ljava/util/RandomAccess;


# static fields
.field public static final s:Lcom/daaw/re8;


# instance fields
.field public q:[Ljava/lang/Object;

.field public r:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/re8;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lcom/daaw/re8;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lcom/daaw/re8;->s:Lcom/daaw/re8;

    invoke-virtual {v0}, Lcom/daaw/z48;->zzb()V

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/z48;-><init>()V

    iput-object p1, p0, Lcom/daaw/re8;->q:[Ljava/lang/Object;

    iput p2, p0, Lcom/daaw/re8;->r:I

    return-void
.end method

.method public static e()Lcom/daaw/re8;
    .locals 1

    sget-object v0, Lcom/daaw/re8;->s:Lcom/daaw/re8;

    return-object v0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/z48;->d()V

    if-ltz p1, :cond_1

    iget v0, p0, Lcom/daaw/re8;->r:I

    if-gt p1, v0, :cond_1

    iget-object v1, p0, Lcom/daaw/re8;->q:[Ljava/lang/Object;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, p1, 0x1

    sub-int/2addr v0, p1

    invoke-static {v1, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lcom/daaw/re8;->q:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    iget v3, p0, Lcom/daaw/re8;->r:I

    sub-int/2addr v3, p1

    invoke-static {v1, p1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lcom/daaw/re8;->q:[Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lcom/daaw/re8;->q:[Ljava/lang/Object;

    aput-object p2, v0, p1

    iget p1, p0, Lcom/daaw/re8;->r:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/re8;->r:I

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    invoke-virtual {p0, p1}, Lcom/daaw/re8;->f(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/z48;->d()V

    iget v0, p0, Lcom/daaw/re8;->r:I

    iget-object v1, p0, Lcom/daaw/re8;->q:[Ljava/lang/Object;

    array-length v2, v1

    const/4 v3, 0x1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v3

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/re8;->q:[Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/daaw/re8;->q:[Ljava/lang/Object;

    iget v1, p0, Lcom/daaw/re8;->r:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/re8;->r:I

    aput-object p1, v0, v1

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/2addr p1, v3

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return v3
.end method

.method public final bridge synthetic b(I)Lcom/daaw/db8;
    .locals 2

    iget v0, p0, Lcom/daaw/re8;->r:I

    if-lt p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/re8;->q:[Ljava/lang/Object;

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    new-instance v0, Lcom/daaw/re8;

    iget v1, p0, Lcom/daaw/re8;->r:I

    invoke-direct {v0, p1, v1}, Lcom/daaw/re8;-><init>([Ljava/lang/Object;I)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final f(I)Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/daaw/re8;->r:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

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

.method public final get(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/re8;->h(I)V

    iget-object v0, p0, Lcom/daaw/re8;->q:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final h(I)V
    .locals 1

    if-ltz p1, :cond_0

    iget v0, p0, Lcom/daaw/re8;->r:I

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-virtual {p0, p1}, Lcom/daaw/re8;->f(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/z48;->d()V

    invoke-virtual {p0, p1}, Lcom/daaw/re8;->h(I)V

    iget-object v0, p0, Lcom/daaw/re8;->q:[Ljava/lang/Object;

    aget-object v1, v0, p1

    iget v2, p0, Lcom/daaw/re8;->r:I

    add-int/lit8 v3, v2, -0x1

    if-ge p1, v3, :cond_0

    add-int/lit8 v3, p1, 0x1

    sub-int/2addr v2, p1

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v3, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    iget p1, p0, Lcom/daaw/re8;->r:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/re8;->r:I

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-object v1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/z48;->d()V

    invoke-virtual {p0, p1}, Lcom/daaw/re8;->h(I)V

    iget-object v0, p0, Lcom/daaw/re8;->q:[Ljava/lang/Object;

    aget-object v1, v0, p1

    aput-object p2, v0, p1

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-object v1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/daaw/re8;->r:I

    return v0
.end method
