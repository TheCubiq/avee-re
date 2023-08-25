.class public Lcom/daaw/fd0;
.super Lcom/daaw/id0;
.source ""


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/id0;-><init>([BI)V

    return-void
.end method


# virtual methods
.method public e([BI)V
    .locals 3

    add-int/lit8 p2, p2, 0x4

    aget-byte v0, p1, p2

    add-int/lit8 v1, p2, 0x1

    aget-byte v1, p1, v1

    add-int/lit8 v2, p2, 0x2

    aget-byte v2, p1, v2

    add-int/lit8 p2, p2, 0x3

    aget-byte p1, p1, p2

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/wc;->m(BBBB)I

    move-result p1

    iput p1, p0, Lcom/daaw/id0;->b:I

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/daaw/fd0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-super {p0, p1}, Lcom/daaw/id0;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
