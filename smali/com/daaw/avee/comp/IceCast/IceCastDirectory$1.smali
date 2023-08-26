.class Lcom/daaw/avee/comp/IceCast/IceCastDirectory$1;
.super Ljava/lang/Object;
.source "IceCastDirectory.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->getStations()Lcom/daaw/avee/Common/VAsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func2<",
        "Ljava/io/File;",
        "[",
        "Ljava/lang/Boolean;",
        "Lcom/daaw/avee/Common/Tuple2<",
        "TV;",
        "Lcom/daaw/avee/Common/StatusMsg;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/IceCast/IceCastDirectory;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$1;->this$0:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Invoke(Ljava/io/File;[Ljava/lang/Boolean;)Lcom/daaw/avee/Common/Tuple2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "[",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/daaw/avee/Common/Tuple2<",
            "TV;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 84
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    .line 89
    :goto_0
    new-instance p1, Lcom/daaw/avee/Common/StatusMsg;

    invoke-direct {p1}, Lcom/daaw/avee/Common/StatusMsg;-><init>()V

    if-nez v1, :cond_0

    const-string p2, "Network error"

    .line 93
    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/StatusMsg;->addCriticalError(Ljava/lang/String;)V

    .line 94
    new-instance p2, Lcom/daaw/avee/Common/Tuple2;

    invoke-direct {p2, v0, p1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2

    .line 98
    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$1;->this$0:Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

    iget-object v2, v2, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->xmlParser:Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;

    invoke-virtual {v2, v1, p1}, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->parse(Ljava/io/InputStream;Lcom/daaw/avee/Common/StatusMsg;)Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    const-string v2, "io"

    .line 105
    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/Common/StatusMsg;->addCriticalErrorException(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_1

    :catch_2
    move-exception v1

    const-string v2, "xml parser"

    .line 101
    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/Common/StatusMsg;->addCriticalErrorException(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_1
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 108
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, p2, v1

    .line 110
    new-instance p2, Lcom/daaw/avee/Common/Tuple2;

    invoke-direct {p2, v0, p1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method public bridge synthetic Invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 78
    check-cast p1, Ljava/io/File;

    check-cast p2, [Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$1;->Invoke(Ljava/io/File;[Ljava/lang/Boolean;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method
