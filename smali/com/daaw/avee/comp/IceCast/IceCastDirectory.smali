.class public Lcom/daaw/avee/comp/IceCast/IceCastDirectory;
.super Ljava/lang/Object;
.source "IceCastDirectory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/IceCast/IceCastDirectory$GenresReceivedListener;,
        Lcom/daaw/avee/comp/IceCast/IceCastDirectory$StationsReceivedListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V::",
        "Ljava/util/List<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final cachedMaxFileAgeMinutes:I = 0x2d0

.field private static lastTimeRefresh:J


# instance fields
.field directoryUrl:Ljava/lang/String;

.field listFactory:Lcom/daaw/avee/Common/Func/Func;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func<",
            "TV;>;"
        }
    .end annotation
.end field

.field final tempFilePrefix:Ljava/lang/String;

.field xmlParser:Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser<",
            "TT;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory<",
            "TT;>;",
            "Lcom/daaw/avee/Common/Func/Func<",
            "TV;>;)V"
        }
    .end annotation

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;

    invoke-direct {v0, p3, p4}, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;-><init>(Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory;Lcom/daaw/avee/Common/Func/Func;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->xmlParser:Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;

    .line 58
    iput-object p4, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->listFactory:Lcom/daaw/avee/Common/Func/Func;

    .line 59
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->directoryUrl:Ljava/lang/String;

    .line 60
    iput-object p2, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->tempFilePrefix:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$002(J)J
    .locals 0

    .line 28
    sput-wide p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->lastTimeRefresh:J

    return-wide p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/IceCast/IceCastDirectory;Ljava/io/File;)Ljava/util/List;
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->loadDataFromFile(Ljava/io/File;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private loadDataFromFile(Ljava/io/File;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")TV;"
        }
    .end annotation

    .line 176
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 178
    iget-object p1, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->xmlParser:Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->parse(Ljava/io/InputStream;Lcom/daaw/avee/Common/StatusMsg;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 183
    throw p1

    .line 186
    :catch_0
    iget-object p1, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->listFactory:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {p1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method


# virtual methods
.method public Refresh(Lcom/daaw/avee/Common/Action1;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/String;",
            ">;J)V"
        }
    .end annotation

    .line 118
    invoke-static {}, Lcom/daaw/avee/Common/Utils;->tickCount()J

    move-result-wide v0

    sget-wide v2, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->lastTimeRefresh:J

    sub-long/2addr v0, v2

    cmp-long v2, v0, p2

    if-gez v2, :cond_0

    return-void

    .line 121
    :cond_0
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p2

    if-nez p2, :cond_1

    return-void

    .line 125
    :cond_1
    new-instance p3, Lcom/daaw/avee/comp/IceCast/DownloadTask;

    new-instance v0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$2;

    invoke-direct {v0, p0, p2}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$2;-><init>(Lcom/daaw/avee/comp/IceCast/IceCastDirectory;Landroid/content/Context;)V

    new-instance v1, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$3;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$3;-><init>(Lcom/daaw/avee/comp/IceCast/IceCastDirectory;Lcom/daaw/avee/Common/Action1;)V

    invoke-direct {p3, p2, v0, v1}, Lcom/daaw/avee/comp/IceCast/DownloadTask;-><init>(Landroid/content/Context;Lcom/daaw/avee/comp/IceCast/DownloadTask$CreateFileFactory;Lcom/daaw/avee/comp/IceCast/DownloadTask$OnPostExecute;)V

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/String;

    const/4 p2, 0x0

    .line 144
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->directoryUrl:Ljava/lang/String;

    aput-object v0, p1, p2

    invoke-virtual {p3, p1}, Lcom/daaw/avee/comp/IceCast/DownloadTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public getCachedEntries()Lcom/daaw/avee/Common/VAsyncTask;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "TV;>;"
        }
    .end annotation

    .line 152
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 154
    new-instance v0, Lcom/daaw/avee/Common/VAsyncTask;

    new-instance v1, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$4;-><init>(Lcom/daaw/avee/comp/IceCast/IceCastDirectory;)V

    invoke-direct {v0, v1}, Lcom/daaw/avee/Common/VAsyncTask;-><init>(Lcom/daaw/avee/Common/VAsyncTask$TaskListener;)V

    return-object v0

    .line 162
    :cond_0
    new-instance v1, Lcom/daaw/avee/Common/VAsyncTask;

    new-instance v2, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$5;

    invoke-direct {v2, p0, v0}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$5;-><init>(Lcom/daaw/avee/comp/IceCast/IceCastDirectory;Landroid/content/Context;)V

    invoke-direct {v1, v2}, Lcom/daaw/avee/Common/VAsyncTask;-><init>(Lcom/daaw/avee/Common/VAsyncTask$TaskListener;)V

    return-object v1
.end method

.method public getStations()Lcom/daaw/avee/Common/VAsyncTask;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "TV;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;>;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->directoryUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;->tempFilePrefix:Ljava/lang/String;

    new-instance v2, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$1;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory$1;-><init>(Lcom/daaw/avee/comp/IceCast/IceCastDirectory;)V

    const/16 v3, 0x2d0

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->parseXmlResponse(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func2;I)Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object v0

    return-object v0
.end method
