.class public Lcom/daaw/ve;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:C

.field public final b:C

.field public final c:I


# direct methods
.method public constructor <init>(CC)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-char p1, p0, Lcom/daaw/ve;->a:C

    iput-char p2, p0, Lcom/daaw/ve;->b:C

    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/daaw/ve;->c:I

    return-void
.end method

.method public static b()Lcom/daaw/ve;
    .locals 3

    new-instance v0, Lcom/daaw/ve;

    const/16 v1, 0x600

    const/16 v2, 0x6ff

    invoke-direct {v0, v1, v2}, Lcom/daaw/ve;-><init>(CC)V

    return-object v0
.end method

.method public static c()Lcom/daaw/ve;
    .locals 3

    new-instance v0, Lcom/daaw/ve;

    const/16 v1, 0x20

    const/16 v2, 0x7e

    invoke-direct {v0, v1, v2}, Lcom/daaw/ve;-><init>(CC)V

    return-object v0
.end method

.method public static d()Lcom/daaw/ve;
    .locals 3

    new-instance v0, Lcom/daaw/ve;

    const/16 v1, 0x30

    const/16 v2, 0x5a

    invoke-direct {v0, v1, v2}, Lcom/daaw/ve;-><init>(CC)V

    return-object v0
.end method

.method public static e()Lcom/daaw/ve;
    .locals 3

    new-instance v0, Lcom/daaw/ve;

    const/16 v1, 0x400

    const/16 v2, 0x4ff

    invoke-direct {v0, v1, v2}, Lcom/daaw/ve;-><init>(CC)V

    return-object v0
.end method

.method public static f()Lcom/daaw/ve;
    .locals 3

    new-instance v0, Lcom/daaw/ve;

    const/16 v1, 0x900

    const/16 v2, 0x97f

    invoke-direct {v0, v1, v2}, Lcom/daaw/ve;-><init>(CC)V

    return-object v0
.end method

.method public static g()Lcom/daaw/ve;
    .locals 3

    new-instance v0, Lcom/daaw/ve;

    const/16 v1, 0xa80

    const/16 v2, 0xaff

    invoke-direct {v0, v1, v2}, Lcom/daaw/ve;-><init>(CC)V

    return-object v0
.end method

.method public static h()Lcom/daaw/ve;
    .locals 3

    new-instance v0, Lcom/daaw/ve;

    const/16 v1, 0x1100

    const/16 v2, 0x11ff

    invoke-direct {v0, v1, v2}, Lcom/daaw/ve;-><init>(CC)V

    return-object v0
.end method

.method public static i()Lcom/daaw/ve;
    .locals 3

    new-instance v0, Lcom/daaw/ve;

    const/16 v1, 0x3040

    const/16 v2, 0x309f

    invoke-direct {v0, v1, v2}, Lcom/daaw/ve;-><init>(CC)V

    return-object v0
.end method

.method public static j()Lcom/daaw/ve;
    .locals 3

    new-instance v0, Lcom/daaw/ve;

    const/16 v1, 0x30a0

    const/16 v2, 0x30ff

    invoke-direct {v0, v1, v2}, Lcom/daaw/ve;-><init>(CC)V

    return-object v0
.end method

.method public static k()Lcom/daaw/ve;
    .locals 3

    new-instance v0, Lcom/daaw/ve;

    const/16 v1, 0x1780

    const/16 v2, 0x17ff

    invoke-direct {v0, v1, v2}, Lcom/daaw/ve;-><init>(CC)V

    return-object v0
.end method

.method public static l()Lcom/daaw/ve;
    .locals 3

    new-instance v0, Lcom/daaw/ve;

    const/16 v1, 0xbf

    const/16 v2, 0x17e

    invoke-direct {v0, v1, v2}, Lcom/daaw/ve;-><init>(CC)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/daaw/ve;->c:I

    return v0
.end method

.method public m(I)C
    .locals 1

    iget v0, p0, Lcom/daaw/ve;->c:I

    if-lt p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iget-char v0, p0, Lcom/daaw/ve;->a:C

    add-int/2addr v0, p1

    int-to-char p1, v0

    return p1
.end method

.method public n(C)I
    .locals 4

    iget-char v0, p0, Lcom/daaw/ve;->a:C

    sub-int v1, p1, v0

    iget v2, p0, Lcom/daaw/ve;->c:I

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
