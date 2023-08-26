.class public Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;
.super Ljava/lang/Object;
.source "ShoutcastDirectory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$GenresReceivedListener;,
        Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$StationsReceivedListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V::",
        "Ljava/util/List<",
        "TT;>;G:",
        "Ljava/lang/Object;",
        "G",
        "List::Ljava/util/List<",
        "TG;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final cachedMaxFileAgeMinutes:I = 0x2d0

.field private static final createInstanceLock:Ljava/lang/Object;

.field private static volatile instanceWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;",
            ">;"
        }
    .end annotation
.end field

.field private static lastTimeRefresh:J


# instance fields
.field directoryUrl:Ljava/lang/String;

.field downloadTaskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

.field listFactory:Lcom/daaw/avee/Common/Func/Func;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func<",
            "TV;>;"
        }
    .end annotation
.end field

.field final tempFilePrefix:Ljava/lang/String;

.field final xmlGenresPriParser:Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser<",
            "TG;TG",
            "List;",
            "TT;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->createInstanceLock:Ljava/lang/Object;

    .line 45
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->instanceWeak:Ljava/lang/ref/WeakReference;

    const-wide/16 v0, 0x0

    .line 48
    sput-wide v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->lastTimeRefresh:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory<",
            "TG;>;",
            "Lcom/daaw/avee/Common/Func/Func1<",
            "TG;TG",
            "List;",
            ">;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation<",
            "TT;>;",
            "Lcom/daaw/avee/Common/Func/Func<",
            "TV;>;)V"
        }
    .end annotation

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    new-instance v0, Lcom/daaw/avee/Common/TaskLimiter;

    invoke-direct {v0}, Lcom/daaw/avee/Common/TaskLimiter;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->downloadTaskLimiter:Lcom/daaw/avee/Common/TaskLimiter;

    .line 109
    new-instance v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;

    invoke-direct {v0, p2, p3, p4, p5}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation;Lcom/daaw/avee/Common/Func/Func;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->xmlGenresPriParser:Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;

    .line 121
    iget-object p2, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->listFactory:Lcom/daaw/avee/Common/Func/Func;

    iput-object p2, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->listFactory:Lcom/daaw/avee/Common/Func/Func;

    const-string p2, ""

    .line 122
    iput-object p2, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->directoryUrl:Ljava/lang/String;

    .line 123
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->tempFilePrefix:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$002(J)J
    .locals 0

    .line 39
    sput-wide p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->lastTimeRefresh:J

    return-wide p0
.end method

.method public static createInstance(Ljava/lang/String;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation;Lcom/daaw/avee/Common/Func/Func;)Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "V::",
            "Ljava/util/List<",
            "TT;>;G:",
            "Ljava/lang/Object;",
            "G",
            "List::Ljava/util/List<",
            "TG;>;>(",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory<",
            "TG;>;",
            "Lcom/daaw/avee/Common/Func/Func1<",
            "TG;TG",
            "List;",
            ">;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation<",
            "TT;>;",
            "Lcom/daaw/avee/Common/Func/Func<",
            "TV;>;)",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory<",
            "TT;TV;TG;TG",
            "List;",
            ">;"
        }
    .end annotation

    .line 70
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    if-eqz v0, :cond_0

    return-object v0

    .line 73
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->createInstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 74
    :try_start_0
    sget-object v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    if-nez v1, :cond_1

    .line 77
    new-instance v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;-><init>(Ljava/lang/String;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation;Lcom/daaw/avee/Common/Func/Func;)V

    .line 84
    new-instance p0, Ljava/lang/ref/WeakReference;

    invoke-direct {p0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->instanceWeak:Ljava/lang/ref/WeakReference;

    .line 87
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    .line 88
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private downloadResponseToFile(Lcom/daaw/avee/Common/TaskLimiter;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/Common/Action2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/TaskLimiter;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/Action2<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 370
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 374
    :cond_0
    new-instance v0, Lcom/daaw/avee/comp/IceCast/DownloadTask;

    new-instance v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$6;

    invoke-direct {v1, p0, p1, p3}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$6;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;Landroid/content/Context;Ljava/lang/String;)V

    new-instance p3, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$7;

    invoke-direct {p3, p0, p4}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$7;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;Lcom/daaw/avee/Common/Action2;)V

    invoke-direct {v0, p1, v1, p3}, Lcom/daaw/avee/comp/IceCast/DownloadTask;-><init>(Landroid/content/Context;Lcom/daaw/avee/comp/IceCast/DownloadTask$CreateFileFactory;Lcom/daaw/avee/comp/IceCast/DownloadTask$OnPostExecute;)V

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/String;

    const/4 p3, 0x0

    aput-object p2, p1, p3

    .line 403
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/IceCast/DownloadTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
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

    .line 409
    invoke-static {}, Lcom/daaw/avee/Common/Utils;->tickCount()J

    move-result-wide v0

    sget-wide v2, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->lastTimeRefresh:J

    sub-long/2addr v0, v2

    cmp-long v2, v0, p2

    if-gez v2, :cond_0

    return-void

    .line 412
    :cond_0
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p2

    if-nez p2, :cond_1

    return-void

    .line 416
    :cond_1
    new-instance p3, Lcom/daaw/avee/comp/IceCast/DownloadTask;

    new-instance v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$8;

    invoke-direct {v0, p0, p2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$8;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;Landroid/content/Context;)V

    new-instance v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$9;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$9;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;Lcom/daaw/avee/Common/Action1;)V

    invoke-direct {p3, p2, v0, v1}, Lcom/daaw/avee/comp/IceCast/DownloadTask;-><init>(Landroid/content/Context;Lcom/daaw/avee/comp/IceCast/DownloadTask$CreateFileFactory;Lcom/daaw/avee/comp/IceCast/DownloadTask$OnPostExecute;)V

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/String;

    const/4 p2, 0x0

    .line 435
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->directoryUrl:Ljava/lang/String;

    aput-object v0, p1, p2

    invoke-virtual {p3, p1}, Lcom/daaw/avee/comp/IceCast/DownloadTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public getGenreName(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func1;)Lcom/daaw/avee/Common/IVAsyncTask;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/Func/Func1<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/util/List<",
            "TG;>;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 199
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "-1"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 202
    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->getGenresSecondary(Ljava/lang/String;)Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object p1

    goto :goto_1

    .line 200
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->getGenresPrimary()Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object p1

    .line 205
    :goto_1
    new-instance p2, Lcom/daaw/avee/Common/VAsyncTaskResultConvert;

    invoke-direct {p2, p1, p3}, Lcom/daaw/avee/Common/VAsyncTaskResultConvert;-><init>(Lcom/daaw/avee/Common/VAsyncTask;Lcom/daaw/avee/Common/Func/Func1;)V

    return-object p2
.end method

.method public getGenres(Ljava/lang/String;)Lcom/daaw/avee/Common/VAsyncTask;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/util/List<",
            "TG;>;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;>;"
        }
    .end annotation

    .line 251
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "http://api.shoutcast.com/genre/secondary?parentid="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "0"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&k="

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getdkey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&f=xml"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->tempFilePrefix:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_genres_sec_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$3;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;)V

    const/16 v2, 0x2d0

    invoke-static {p1, v0, v1, v2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->parseXmlResponse(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func2;I)Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object p1

    return-object p1
.end method

.method public getGenresPrimary()Lcom/daaw/avee/Common/VAsyncTask;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/util/List<",
            "TG;>;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;>;"
        }
    .end annotation

    .line 211
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://api.shoutcast.com/genre/primary?k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getdkey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&f=xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->tempFilePrefix:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_genres_pri"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$2;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$2;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;)V

    const/16 v3, 0x2d0

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->parseXmlResponse(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func2;I)Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object v0

    return-object v0
.end method

.method public getGenresSecondary(Ljava/lang/String;)Lcom/daaw/avee/Common/VAsyncTask;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/util/List<",
            "TG;>;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;>;"
        }
    .end annotation

    .line 290
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://api.shoutcast.com/genre/secondary?parentid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getdkey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&f=xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->tempFilePrefix:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_genres_sec_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$4;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;)V

    const/16 v2, 0x2d0

    invoke-static {v0, p1, v1, v2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->parseXmlResponse(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func2;I)Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object p1

    return-object p1
.end method

.method public getStations(Ljava/lang/String;)Lcom/daaw/avee/Common/VAsyncTask;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "TV;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;>;"
        }
    .end annotation

    .line 329
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://api.shoutcast.com/station/advancedsearch?genre_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&limit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "&f=xml&k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getdkey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->tempFilePrefix:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_stations_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$5;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;)V

    const/16 v2, 0x2d0

    invoke-static {v0, p1, v1, v2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->parseXmlResponse(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func2;I)Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object p1

    return-object p1
.end method

.method public tuneInStation(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/Common/VAsyncTask;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;>;"
        }
    .end annotation

    .line 145
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://yp.shoutcast.com/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "?id="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->tempFilePrefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_station_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$1;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;)V

    const/16 v1, 0x2d0

    invoke-static {p1, p2, v0, v1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->parseXmlResponse(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func2;I)Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object p1

    return-object p1
.end method
