.class public Lcom/daaw/rc1;
.super Ljava/lang/Object;
.source ""


# annotations
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
.field public static final d:Ljava/lang/Object;

.field public static e:Lcom/daaw/rc1;


# instance fields
.field public a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/uc1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/uc1<",
            "TG;TG",
            "List;",
            "TT;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/rc1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/daaw/uc1$c;Lcom/daaw/r40;Lcom/daaw/uc1$d;Lcom/daaw/w40;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/daaw/uc1$c<",
            "TG;>;",
            "Lcom/daaw/r40<",
            "TG;TG",
            "List;",
            ">;",
            "Lcom/daaw/uc1$d<",
            "TT;>;",
            "Lcom/daaw/w40<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/uc1;

    invoke-direct {v0, p2, p3, p4, p5}, Lcom/daaw/uc1;-><init>(Lcom/daaw/uc1$c;Lcom/daaw/r40;Lcom/daaw/uc1$d;Lcom/daaw/w40;)V

    iput-object v0, p0, Lcom/daaw/rc1;->c:Lcom/daaw/uc1;

    const-string p2, ""

    iput-object p2, p0, Lcom/daaw/rc1;->a:Ljava/lang/String;

    iput-object p1, p0, Lcom/daaw/rc1;->b:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/rc1;Ljava/io/File;[Ljava/lang/Boolean;)Lcom/daaw/lo1;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/rc1;->h(Ljava/io/File;[Ljava/lang/Boolean;)Lcom/daaw/lo1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/rc1;Ljava/io/File;[Ljava/lang/Boolean;)Lcom/daaw/lo1;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/rc1;->g(Ljava/io/File;[Ljava/lang/Boolean;)Lcom/daaw/lo1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/io/File;[Ljava/lang/Boolean;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/rc1;->i(Ljava/io/File;[Ljava/lang/Boolean;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/String;Lcom/daaw/uc1$c;Lcom/daaw/r40;Lcom/daaw/uc1$d;Lcom/daaw/w40;)Lcom/daaw/rc1;
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
            "Lcom/daaw/uc1$c<",
            "TG;>;",
            "Lcom/daaw/r40<",
            "TG;TG",
            "List;",
            ">;",
            "Lcom/daaw/uc1$d<",
            "TT;>;",
            "Lcom/daaw/w40<",
            "TV;>;)",
            "Lcom/daaw/rc1<",
            "TT;TV;TG;TG",
            "List;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/rc1;->e:Lcom/daaw/rc1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lcom/daaw/rc1;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/rc1;->e:Lcom/daaw/rc1;

    if-nez v1, :cond_1

    new-instance v1, Lcom/daaw/rc1;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/daaw/rc1;-><init>(Ljava/lang/String;Lcom/daaw/uc1$c;Lcom/daaw/r40;Lcom/daaw/uc1$d;Lcom/daaw/w40;)V

    sput-object v1, Lcom/daaw/rc1;->e:Lcom/daaw/rc1;

    :cond_1
    sget-object p0, Lcom/daaw/rc1;->e:Lcom/daaw/rc1;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private synthetic g(Ljava/io/File;[Ljava/lang/Boolean;)Lcom/daaw/lo1;
    .locals 3

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
    iget-object v2, p0, Lcom/daaw/rc1;->c:Lcom/daaw/uc1;

    invoke-virtual {v2, v1, p1}, Lcom/daaw/uc1;->c(Ljava/io/InputStream;Lcom/daaw/wf1;)Ljava/util/List;

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

.method private synthetic h(Ljava/io/File;[Ljava/lang/Boolean;)Lcom/daaw/lo1;
    .locals 3

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
    iget-object v2, p0, Lcom/daaw/rc1;->c:Lcom/daaw/uc1;

    invoke-virtual {v2, v1, p1}, Lcom/daaw/uc1;->d(Ljava/io/InputStream;Lcom/daaw/wf1;)Ljava/util/List;

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

.method public static synthetic i(Ljava/io/File;[Ljava/lang/Boolean;)Ljava/util/List;
    .locals 2

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lcom/daaw/lx0;->h()Lcom/daaw/lx0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/lx0;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, p1, v0

    return-object p0
.end method


# virtual methods
.method public e(Ljava/lang/String;)Lcom/daaw/ir1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/ir1<",
            "Lcom/daaw/lo1<",
            "Ljava/util/List<",
            "TG;>;",
            "Lcom/daaw/wf1;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://api.shoutcast.com/genre/secondary?parentid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/daaw/tc1;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&f=xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/rc1;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_genres_sec_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/daaw/pc1;

    invoke-direct {v1, p0}, Lcom/daaw/pc1;-><init>(Lcom/daaw/rc1;)V

    const/16 v2, 0x2d0

    invoke-static {v0, p1, v1, v2}, Lcom/daaw/tc1;->g(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/s40;I)Lcom/daaw/ir1;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/String;)Lcom/daaw/ir1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/ir1<",
            "Lcom/daaw/lo1<",
            "TV;",
            "Lcom/daaw/wf1;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://api.shoutcast.com/station/advancedsearch?genre_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&limit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "&f=xml&k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/daaw/tc1;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/rc1;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_stations_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/daaw/oc1;

    invoke-direct {v1, p0}, Lcom/daaw/oc1;-><init>(Lcom/daaw/rc1;)V

    const/16 v2, 0x2d0

    invoke-static {v0, p1, v1, v2}, Lcom/daaw/tc1;->g(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/s40;I)Lcom/daaw/ir1;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ir1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/ir1<",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://yp.shoutcast.com/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "?id="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/rc1;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_station_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/daaw/qc1;->a:Lcom/daaw/qc1;

    const/16 v1, 0x2d0

    invoke-static {p1, p2, v0, v1}, Lcom/daaw/tc1;->g(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/s40;I)Lcom/daaw/ir1;

    move-result-object p1

    return-object p1
.end method
