.class public Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;
.super Ljava/lang/Object;
.source "CharSet.java"


# instance fields
.field final count:I

.field final first:C

.field final last:C


# direct methods
.method public constructor <init>(CC)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-char p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->first:C

    .line 13
    iput-char p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->last:C

    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, 0x1

    .line 14
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count:I

    return-void
.end method

.method public static createAscii32to126()Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;
    .locals 3

    .line 18
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    const/16 v1, 0x20

    const/16 v2, 0x7e

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;-><init>(CC)V

    return-object v0
.end method

.method public static createAscii48to90()Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;
    .locals 3

    .line 22
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    const/16 v1, 0x30

    const/16 v2, 0x5a

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;-><init>(CC)V

    return-object v0
.end method

.method public static createAsciiCapitals()Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;
    .locals 3

    .line 34
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    const/16 v1, 0x41

    const/16 v2, 0x5a

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;-><init>(CC)V

    return-object v0
.end method

.method public static createAsciiNumbers()Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;
    .locals 3

    .line 26
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    const/16 v1, 0x30

    const/16 v2, 0x39

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;-><init>(CC)V

    return-object v0
.end method

.method public static createAsciiNumbersAnd1()Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;
    .locals 3

    .line 30
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    const/16 v1, 0x30

    const/16 v2, 0x3a

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;-><init>(CC)V

    return-object v0
.end method


# virtual methods
.method public count()I
    .locals 1

    .line 38
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count:I

    return v0
.end method

.method public getCharByIndex(I)C
    .locals 1

    .line 55
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count:I

    if-lt p1, v0, :cond_0

    const/4 p1, 0x0

    .line 56
    :cond_0
    iget-char v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->first:C

    add-int/2addr v0, p1

    int-to-char p1, v0

    return p1
.end method

.method public getIndexByChar(C)I
    .locals 4

    .line 42
    iget-char v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->first:C

    sub-int v1, p1, v0

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count:I

    const/4 v3, 0x0

    if-lt v1, v2, :cond_0

    return v3

    :cond_0
    sub-int v1, p1, v0

    if-gez v1, :cond_1

    return v3

    :cond_1
    sub-int/2addr p1, v0

    return p1
.end method

.method public tryGetIndexByChar(C)I
    .locals 4

    .line 49
    iget-char v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->first:C

    sub-int v1, p1, v0

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count:I

    const/4 v3, -0x1

    if-lt v1, v2, :cond_0

    return v3

    :cond_0
    sub-int v1, p1, v0

    if-gez v1, :cond_1

    return v3

    :cond_1
    sub-int/2addr p1, v0

    return p1
.end method
