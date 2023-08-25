.class public Lcom/daaw/gd0;
.super Lcom/daaw/l;
.source ""


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/l;-><init>([B)V

    return-void
.end method


# virtual methods
.method public c([BI)Lcom/daaw/id0;
    .locals 1

    new-instance v0, Lcom/daaw/fd0;

    invoke-direct {v0, p1, p2}, Lcom/daaw/fd0;-><init>([BI)V

    return-object v0
.end method

.method public g([B)V
    .locals 3

    const/4 v0, 0x5

    aget-byte v1, p1, v0

    const/4 v2, 0x7

    invoke-static {v1, v2}, Lcom/daaw/wc;->d(BI)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/l;->a:Z

    aget-byte v1, p1, v0

    const/4 v2, 0x6

    invoke-static {v1, v2}, Lcom/daaw/wc;->d(BI)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/l;->b:Z

    aget-byte v1, p1, v0

    invoke-static {v1, v0}, Lcom/daaw/wc;->d(BI)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/l;->c:Z

    aget-byte p1, p1, v0

    const/4 v0, 0x4

    invoke-static {p1, v0}, Lcom/daaw/wc;->d(BI)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/l;->d:Z

    return-void
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/l;->a:Z

    return v0
.end method
