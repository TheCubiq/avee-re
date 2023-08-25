.class public Lcom/daaw/oe0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/s40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/oe0;->a()Lcom/daaw/ir1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/s40<",
        "Ljava/io/File;",
        "[",
        "Ljava/lang/Boolean;",
        "Lcom/daaw/lo1<",
        "TV;",
        "Lcom/daaw/wf1;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/oe0;


# direct methods
.method public constructor <init>(Lcom/daaw/oe0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/oe0$a;->a:Lcom/daaw/oe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/io/File;

    check-cast p2, [Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/oe0$a;->b(Ljava/io/File;[Ljava/lang/Boolean;)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/io/File;[Ljava/lang/Boolean;)Lcom/daaw/lo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "[",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/daaw/lo1<",
            "TV;",
            "Lcom/daaw/wf1;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    new-instance p1, Lcom/daaw/wf1;

    invoke-direct {p1}, Lcom/daaw/wf1;-><init>()V

    if-nez v1, :cond_0

    const-string p2, "Network error"

    invoke-virtual {p1, p2}, Lcom/daaw/wf1;->a(Ljava/lang/String;)V

    new-instance p2, Lcom/daaw/lo1;

    invoke-direct {p2, v0, p1}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2

    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/daaw/oe0$a;->a:Lcom/daaw/oe0;

    iget-object v2, v2, Lcom/daaw/oe0;->c:Lcom/daaw/gz1;

    invoke-virtual {v2, v1, p1}, Lcom/daaw/gz1;->a(Ljava/io/InputStream;Lcom/daaw/wf1;)Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v1

    const-string v2, "io"

    goto :goto_1

    :catch_2
    move-exception v1

    const-string v2, "xml parser"

    :goto_1
    invoke-virtual {p1, v2, v1}, Lcom/daaw/wf1;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_2
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_3

    :cond_1
    const/4 v2, 0x0

    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, p2, v1

    new-instance p2, Lcom/daaw/lo1;

    invoke-direct {p2, v0, p1}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method
