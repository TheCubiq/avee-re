.class public final Lcom/daaw/vv8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:[Ljava/lang/String;

.field public final b:[I

.field public final c:[Lcom/daaw/au8;

.field public final d:[I

.field public final e:[[[I

.field public final f:Lcom/daaw/au8;


# direct methods
.method public constructor <init>([Ljava/lang/String;[I[Lcom/daaw/au8;[I[[[ILcom/daaw/au8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vv8;->a:[Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/vv8;->b:[I

    iput-object p3, p0, Lcom/daaw/vv8;->c:[Lcom/daaw/au8;

    iput-object p5, p0, Lcom/daaw/vv8;->e:[[[I

    iput-object p4, p0, Lcom/daaw/vv8;->d:[I

    iput-object p6, p0, Lcom/daaw/vv8;->f:Lcom/daaw/au8;

    return-void
.end method


# virtual methods
.method public final a(IIZ)I
    .locals 8

    iget-object p3, p0, Lcom/daaw/vv8;->c:[Lcom/daaw/au8;

    aget-object p3, p3, p1

    invoke-virtual {p3, p2}, Lcom/daaw/au8;->b(I)Lcom/daaw/r84;

    move-result-object p3

    iget p3, p3, Lcom/daaw/r84;->a:I

    const/4 p3, 0x1

    new-array v0, p3, [I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-gtz v2, :cond_1

    iget-object v4, p0, Lcom/daaw/vv8;->e:[[[I

    aget-object v4, v4, p1

    aget-object v4, v4, p2

    aget v4, v4, v2

    and-int/lit8 v4, v4, 0x7

    const/4 v5, 0x4

    if-ne v4, v5, :cond_0

    add-int/lit8 v4, v3, 0x1

    aput v2, v0, v3

    move v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    const/16 v2, 0x10

    const/4 v3, 0x0

    move-object v5, v3

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v4, 0x10

    :goto_1
    array-length v6, v0

    if-ge v1, v6, :cond_3

    aget v6, v0, v1

    iget-object v7, p0, Lcom/daaw/vv8;->c:[Lcom/daaw/au8;

    aget-object v7, v7, p1

    invoke-virtual {v7, p2}, Lcom/daaw/au8;->b(I)Lcom/daaw/r84;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/daaw/r84;->b(I)Lcom/daaw/f92;

    move-result-object v6

    iget-object v6, v6, Lcom/daaw/f92;->l:Ljava/lang/String;

    add-int/lit8 v7, v3, 0x1

    if-eqz v3, :cond_2

    invoke-static {v5, v6}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/2addr v3, p3

    or-int/2addr v2, v3

    goto :goto_2

    :cond_2
    move-object v5, v6

    :goto_2
    iget-object v3, p0, Lcom/daaw/vv8;->e:[[[I

    aget-object v3, v3, p1

    aget-object v3, v3, p2

    aget v3, v3, v1

    and-int/lit8 v3, v3, 0x18

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    add-int/lit8 v1, v1, 0x1

    move v3, v7

    goto :goto_1

    :cond_3
    if-eqz v2, :cond_4

    iget-object p2, p0, Lcom/daaw/vv8;->d:[I

    aget p1, p2, p1

    invoke-static {v4, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1

    :cond_4
    return v4
.end method

.method public final b(III)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/vv8;->e:[[[I

    aget-object p1, v0, p1

    aget-object p1, p1, p2

    aget p1, p1, p3

    return p1
.end method

.method public final c(I)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/vv8;->b:[I

    aget p1, v0, p1

    return p1
.end method

.method public final d(I)Lcom/daaw/au8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vv8;->c:[Lcom/daaw/au8;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final e()Lcom/daaw/au8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vv8;->f:Lcom/daaw/au8;

    return-object v0
.end method
