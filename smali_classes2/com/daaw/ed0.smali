.class public Lcom/daaw/ed0;
.super Lcom/daaw/l;
.source ""


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/l;-><init>([B)V

    return-void
.end method


# virtual methods
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

    aget-byte p1, p1, v0

    invoke-static {p1, v0}, Lcom/daaw/wc;->d(BI)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/l;->c:Z

    return-void
.end method
