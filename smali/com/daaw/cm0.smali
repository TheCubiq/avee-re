.class public Lcom/daaw/cm0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pe1;


# static fields
.field public static final a:[Lcom/daaw/wk;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const/4 v0, 0x1

    new-array v1, v0, [Lcom/daaw/wk;

    new-instance v2, Lcom/daaw/wk;

    const-string v3, ".mpcpl"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "text/plain"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    new-array v5, v0, [Lcom/daaw/gx0;

    new-instance v6, Lcom/daaw/gx0;

    sget-object v7, Lcom/daaw/gx0$a;->r:Lcom/daaw/gx0$a;

    const/4 v8, 0x0

    invoke-direct {v6, v7, v0, v8}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v0, 0x0

    aput-object v6, v5, v0

    const-string v6, "Media Player Classic Playlist"

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/daaw/wk;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lcom/daaw/gx0;Ljava/lang/String;)V

    aput-object v2, v1, v0

    sput-object v1, Lcom/daaw/cm0;->a:[Lcom/daaw/wk;

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

    const-string p2, "UTF-8"

    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance p1, Lcom/daaw/bm0;

    invoke-direct {p1}, Lcom/daaw/bm0;-><init>()V

    invoke-virtual {p1, p0}, Lcom/daaw/bm0;->d(Lcom/daaw/pe1;)V

    const/4 p2, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_1

    if-nez v2, :cond_3

    const-string v2, "MPCPLAYLIST"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Not a MPCPL playlist format"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/16 v5, 0x2c

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    const-string v7, "Malformed MPCPL playlist entry "

    if-gtz v6, :cond_4

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    :goto_1
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-interface {p3, p1}, Lcom/daaw/bl0;->f(Ljava/lang/Object;)V

    move-object p1, v4

    goto/16 :goto_4

    :cond_4
    invoke-virtual {v3, p2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-gtz v5, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_1

    :cond_5
    invoke-virtual {v3, p2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    :try_start_0
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    sub-int/2addr v4, v1

    invoke-virtual {p1}, Lcom/daaw/bm0;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    :goto_3
    add-int/lit8 v7, v4, 0x1

    if-ge v5, v7, :cond_6

    invoke-virtual {p1}, Lcom/daaw/bm0;->c()Ljava/util/List;

    move-result-object v7

    new-instance v8, Lcom/daaw/y41;

    invoke-direct {v8}, Lcom/daaw/y41;-><init>()V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, Lcom/daaw/bm0;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/y41;

    const-string v5, "filename"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {v4, v3}, Lcom/daaw/y41;->d(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_7
    const-string v5, "type"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {v4, v3}, Lcom/daaw/y41;->f(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_8
    const-string v5, "subtitle"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {v4, v3}, Lcom/daaw/y41;->e(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_9
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unknown MPCPL keyword "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p3, v3}, Lcom/daaw/bl0;->e(Ljava/lang/Object;)V

    goto/16 :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->toString()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_2

    :cond_a
    :goto_4
    return-object p1
.end method

.method public b()[Lcom/daaw/wk;
    .locals 1

    sget-object v0, Lcom/daaw/cm0;->a:[Lcom/daaw/wk;

    invoke-virtual {v0}, [Lcom/daaw/wk;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/wk;

    return-object v0
.end method

.method public c(Lcom/daaw/ix0;)Lcom/daaw/oe1;
    .locals 2

    new-instance v0, Lcom/daaw/bm0;

    invoke-direct {v0}, Lcom/daaw/bm0;-><init>()V

    invoke-virtual {v0, p0}, Lcom/daaw/bm0;->d(Lcom/daaw/pe1;)V

    invoke-virtual {v0}, Lcom/daaw/bm0;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/ix0;->a()Lcom/daaw/fb1;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lcom/daaw/cm0;->d(Ljava/util/List;Lcom/daaw/n;)V

    return-object v0
.end method

.method public final d(Ljava/util/List;Lcom/daaw/n;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/y41;",
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

    invoke-virtual {p0, p1, v5}, Lcom/daaw/cm0;->d(Ljava/util/List;Lcom/daaw/n;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A MPCPL playlist cannot handle a sequence repeated indefinitely"

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

    const-string p2, "A MPCPL playlist cannot handle a media repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A MPCPL playlist cannot handle a timed media"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    return-void
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "mpcpl"

    return-object v0
.end method
