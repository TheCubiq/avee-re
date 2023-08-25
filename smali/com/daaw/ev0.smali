.class public Lcom/daaw/ev0;
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

    const-string v2, ".plp"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "text/plain"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Lcom/daaw/gx0;

    const-string v6, "Sansa Playlist File"

    invoke-direct {v1, v2, v3, v5, v6}, Lcom/daaw/wk;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lcom/daaw/gx0;Ljava/lang/String;)V

    aput-object v1, v0, v4

    sput-object v0, Lcom/daaw/ev0;->a:[Lcom/daaw/wk;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;Ljava/lang/String;Lcom/daaw/bl0;)Lcom/daaw/oe1;
    .locals 9

    if-nez p2, :cond_0

    const-string p2, "UTF-16LE"

    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance p1, Lcom/daaw/dv0;

    invoke-direct {p1}, Lcom/daaw/dv0;-><init>()V

    invoke-virtual {p1, p0}, Lcom/daaw/dv0;->e(Lcom/daaw/pe1;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_1

    if-nez v3, :cond_3

    const-string v3, "PLP PLAYLIST"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Not a PLP playlist format"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    if-nez v4, :cond_5

    const-string v4, "VERSION 1.20"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string p1, "Malformed PLP playlist (no version information)"

    goto :goto_1

    :cond_4
    const/4 v4, 0x1

    goto :goto_0

    :cond_5
    const/16 v7, 0x2c

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    if-gtz v7, :cond_6

    const-string p1, "Malformed PLP playlist (playlist entry line format)"

    :goto_1
    invoke-interface {p3, p1}, Lcom/daaw/bl0;->f(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_3

    :cond_6
    invoke-virtual {v6, v1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    if-nez v5, :cond_7

    move-object v5, v8

    goto :goto_2

    :cond_7
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    const-string p1, "Malformed PLP playlist (inconsistent disk specifier)"

    goto :goto_1

    :cond_8
    :goto_2
    invoke-virtual {p1}, Lcom/daaw/dv0;->c()Ljava/util/List;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_9
    :goto_3
    if-eqz p1, :cond_a

    if-eqz v5, :cond_a

    invoke-virtual {p1, v5}, Lcom/daaw/dv0;->d(Ljava/lang/String;)V

    :cond_a
    return-object p1
.end method

.method public b()[Lcom/daaw/wk;
    .locals 1

    sget-object v0, Lcom/daaw/ev0;->a:[Lcom/daaw/wk;

    invoke-virtual {v0}, [Lcom/daaw/wk;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/wk;

    return-object v0
.end method

.method public c(Lcom/daaw/ix0;)Lcom/daaw/oe1;
    .locals 2

    new-instance v0, Lcom/daaw/dv0;

    invoke-direct {v0}, Lcom/daaw/dv0;-><init>()V

    invoke-virtual {v0, p0}, Lcom/daaw/dv0;->e(Lcom/daaw/pe1;)V

    invoke-virtual {v0}, Lcom/daaw/dv0;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/ix0;->a()Lcom/daaw/fb1;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lcom/daaw/ev0;->d(Ljava/util/List;Lcom/daaw/n;)V

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

    invoke-virtual {p0, p1, v5}, Lcom/daaw/ev0;->d(Ljava/util/List;Lcom/daaw/n;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A PLP playlist cannot handle a sequence repeated indefinitely"

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

    const-string p2, "A PLP playlist cannot handle a media repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A PLP playlist cannot handle a timed media"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    return-void
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "plp"

    return-object v0
.end method
