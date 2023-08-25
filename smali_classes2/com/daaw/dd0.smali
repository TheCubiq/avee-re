.class public Lcom/daaw/dd0;
.super Lcom/daaw/l;
.source ""


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/l;-><init>([B)V

    return-void
.end method

.method public constructor <init>([BZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/l;-><init>([BZ)V

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

    aget-byte p1, p1, v0

    const/4 v0, 0x6

    invoke-static {p1, v0}, Lcom/daaw/wc;->d(BI)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/l;->e:Z

    return-void
.end method
