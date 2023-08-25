.class public Lcom/daaw/cv0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pe1;


# static fields
.field public static final a:[Lcom/daaw/wk;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/daaw/wk;

    new-instance v1, Lcom/daaw/wk;

    const-string v2, ".pla"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "application/octet-stream"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Lcom/daaw/gx0;

    const-string v6, "iRiver iQuickList File"

    invoke-direct {v1, v2, v3, v5, v6}, Lcom/daaw/wk;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lcom/daaw/gx0;Ljava/lang/String;)V

    aput-object v1, v0, v4

    sput-object v0, Lcom/daaw/cv0;->a:[Lcom/daaw/wk;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;Ljava/lang/String;Lcom/daaw/bl0;)Lcom/daaw/oe1;
    .locals 8

    new-instance p2, Lcom/daaw/bv0;

    invoke-direct {p2}, Lcom/daaw/bv0;-><init>()V

    invoke-virtual {p2, p0}, Lcom/daaw/bv0;->d(Lcom/daaw/pe1;)V

    const/16 v0, 0x200

    new-array v1, v0, [B

    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    if-ne v2, v0, :cond_3

    new-instance v2, Ljava/lang/String;

    const/4 v3, 0x4

    const/16 v4, 0xe

    const-string v5, "US-ASCII"

    invoke-direct {v2, v1, v3, v4, v5}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    const-string v3, "iriver UMS PLA"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x3

    aget-byte v2, v1, v2

    and-int/lit16 v2, v2, 0xff

    const/4 v3, 0x0

    shl-int/2addr v2, v3

    const/4 v4, 0x2

    aget-byte v5, v1, v4

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x8

    or-int/2addr v2, v5

    const/4 v5, 0x1

    aget-byte v5, v1, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x10

    or-int/2addr v2, v5

    aget-byte v5, v1, v3

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x18

    or-int/2addr v2, v5

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-eq v5, v0, :cond_0

    const-string p1, "Malformed PLA playlist (file too small)"

    invoke-interface {p3, p1}, Lcom/daaw/bl0;->f(Ljava/lang/Object;)V

    const/4 p2, 0x0

    goto :goto_1

    :cond_0
    new-instance v5, Ljava/lang/String;

    const/16 v6, 0x1fe

    const-string v7, "UTF-16BE"

    invoke-direct {v5, v1, v4, v6, v7}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {p2}, Lcom/daaw/bv0;->c()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object p2

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Not a PLA playlist format (bad magic)"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Not a PLA playlist format (file too small)"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public b()[Lcom/daaw/wk;
    .locals 1

    sget-object v0, Lcom/daaw/cv0;->a:[Lcom/daaw/wk;

    invoke-virtual {v0}, [Lcom/daaw/wk;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/wk;

    return-object v0
.end method

.method public c(Lcom/daaw/ix0;)Lcom/daaw/oe1;
    .locals 2

    new-instance v0, Lcom/daaw/bv0;

    invoke-direct {v0}, Lcom/daaw/bv0;-><init>()V

    invoke-virtual {v0, p0}, Lcom/daaw/bv0;->d(Lcom/daaw/pe1;)V

    invoke-virtual {v0}, Lcom/daaw/bv0;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/ix0;->a()Lcom/daaw/fb1;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lcom/daaw/cv0;->d(Ljava/util/List;Lcom/daaw/n;)V

    return-object v0
.end method

.method public final d(Ljava/util/List;Lcom/daaw/n;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/daaw/n;",
            ")V"
        }
    .end annotation

    instance-of v0, p2, Lcom/daaw/fb1;

    if-eqz v0, :cond_2

    check-cast p2, Lcom/daaw/fb1;

    invoke-virtual {p2}, Lcom/daaw/n;->a()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-virtual {p2}, Lcom/daaw/p;->b()[Lcom/daaw/n;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p2}, Lcom/daaw/n;->a()I

    move-result v3

    if-ge v2, v3, :cond_5

    array-length v3, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_0

    aget-object v5, v0, v4

    invoke-virtual {p0, p1, v5}, Lcom/daaw/cv0;->d(Ljava/util/List;Lcom/daaw/n;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A PLA playlist cannot handle a sequence repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    instance-of p1, p2, Lcom/daaw/yn0;

    if-eqz p1, :cond_5

    check-cast p2, Lcom/daaw/yn0;

    invoke-virtual {p2}, Lcom/daaw/yn0;->b()Ljava/lang/Long;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-virtual {p2}, Lcom/daaw/n;->a()I

    move-result p1

    if-ltz p1, :cond_3

    invoke-virtual {p2}, Lcom/daaw/yn0;->c()Lcom/daaw/rk;

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A PLA playlist cannot handle a media repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A PLA playlist cannot handle a timed media"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    return-void
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "pla"

    return-object v0
.end method
