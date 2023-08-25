.class public Lcom/daaw/pb1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/mm;

.field public final b:Lcom/daaw/ym;

.field public final c:Lcom/daaw/rp;

.field public final d:Lcom/daaw/fl0;

.field public final e:Lcom/daaw/nq1;


# direct methods
.method public constructor <init>(Lcom/daaw/mm;Lcom/daaw/ym;Lcom/daaw/rp;Lcom/daaw/fl0;Lcom/daaw/nq1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pb1;->a:Lcom/daaw/mm;

    iput-object p2, p0, Lcom/daaw/pb1;->b:Lcom/daaw/ym;

    iput-object p3, p0, Lcom/daaw/pb1;->c:Lcom/daaw/rp;

    iput-object p4, p0, Lcom/daaw/pb1;->d:Lcom/daaw/fl0;

    iput-object p5, p0, Lcom/daaw/pb1;->e:Lcom/daaw/nq1;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/pb1;Lcom/daaw/rj1;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/pb1;->p(Lcom/daaw/rj1;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/daaw/lm$c;Lcom/daaw/lm$c;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/pb1;->m(Lcom/daaw/lm$c;Lcom/daaw/lm$c;)I

    move-result p0

    return p0
.end method

.method public static e(Landroid/app/ApplicationExitInfo;)Lcom/daaw/lm$a;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getTraceInputStream()Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/daaw/pb1;->f(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not get input trace in application exit info: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " Error: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-static {}, Lcom/daaw/lm$a;->a()Lcom/daaw/lm$a$a;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getImportance()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/daaw/lm$a$a;->b(I)Lcom/daaw/lm$a$a;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getProcessName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/lm$a$a;->d(Ljava/lang/String;)Lcom/daaw/lm$a$a;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getReason()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/daaw/lm$a$a;->f(I)Lcom/daaw/lm$a$a;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/lm$a$a;->h(J)Lcom/daaw/lm$a$a;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getPid()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/daaw/lm$a$a;->c(I)Lcom/daaw/lm$a$a;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getPss()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/lm$a$a;->e(J)Lcom/daaw/lm$a$a;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getRss()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/lm$a$a;->g(J)Lcom/daaw/lm$a$a;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/daaw/lm$a$a;->i(Ljava/lang/String;)Lcom/daaw/lm$a$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/lm$a$a;->a()Lcom/daaw/lm$a;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x2000

    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;Lcom/daaw/ue0;Lcom/daaw/h10;Lcom/daaw/a5;Lcom/daaw/fl0;Lcom/daaw/nq1;Lcom/daaw/ef1;Lcom/daaw/zb1;Lcom/daaw/fu0;)Lcom/daaw/pb1;
    .locals 6

    new-instance v1, Lcom/daaw/mm;

    invoke-direct {v1, p0, p1, p3, p6}, Lcom/daaw/mm;-><init>(Landroid/content/Context;Lcom/daaw/ue0;Lcom/daaw/a5;Lcom/daaw/ef1;)V

    new-instance v2, Lcom/daaw/ym;

    invoke-direct {v2, p2, p7}, Lcom/daaw/ym;-><init>(Lcom/daaw/h10;Lcom/daaw/zb1;)V

    invoke-static {p0, p7, p8}, Lcom/daaw/rp;->b(Landroid/content/Context;Lcom/daaw/zb1;Lcom/daaw/fu0;)Lcom/daaw/rp;

    move-result-object v3

    new-instance p0, Lcom/daaw/pb1;

    move-object v0, p0

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/daaw/pb1;-><init>(Lcom/daaw/mm;Lcom/daaw/ym;Lcom/daaw/rp;Lcom/daaw/fl0;Lcom/daaw/nq1;)V

    return-object p0
.end method

.method public static k(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/lm$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-static {}, Lcom/daaw/lm$c;->a()Lcom/daaw/lm$c$a;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/daaw/lm$c$a;->b(Ljava/lang/String;)Lcom/daaw/lm$c$a;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Lcom/daaw/lm$c$a;->c(Ljava/lang/String;)Lcom/daaw/lm$c$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/lm$c$a;->a()Lcom/daaw/lm$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/daaw/ob1;->p:Lcom/daaw/ob1;

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static synthetic m(Lcom/daaw/lm$c;Lcom/daaw/lm$c;)I
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/lm$c;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/daaw/lm$c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final c(Lcom/daaw/lm$e$d;)Lcom/daaw/lm$e$d;
    .locals 2

    iget-object v0, p0, Lcom/daaw/pb1;->d:Lcom/daaw/fl0;

    iget-object v1, p0, Lcom/daaw/pb1;->e:Lcom/daaw/nq1;

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/pb1;->d(Lcom/daaw/lm$e$d;Lcom/daaw/fl0;Lcom/daaw/nq1;)Lcom/daaw/lm$e$d;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/daaw/lm$e$d;Lcom/daaw/fl0;Lcom/daaw/nq1;)Lcom/daaw/lm$e$d;
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/lm$e$d;->g()Lcom/daaw/lm$e$d$b;

    move-result-object v0

    invoke-virtual {p2}, Lcom/daaw/fl0;->c()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/daaw/lm$e$d$d;->a()Lcom/daaw/lm$e$d$d$a;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/daaw/lm$e$d$d$a;->b(Ljava/lang/String;)Lcom/daaw/lm$e$d$d$a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/lm$e$d$d$a;->a()Lcom/daaw/lm$e$d$d;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/daaw/lm$e$d$b;->d(Lcom/daaw/lm$e$d$d;)Lcom/daaw/lm$e$d$b;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p2

    const-string v1, "No log data to include with this event."

    invoke-virtual {p2, v1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p3}, Lcom/daaw/nq1;->a()Ljava/util/Map;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/pb1;->k(Ljava/util/Map;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3}, Lcom/daaw/nq1;->b()Ljava/util/Map;

    move-result-object p3

    invoke-static {p3}, Lcom/daaw/pb1;->k(Ljava/util/Map;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/lm$e$d;->b()Lcom/daaw/lm$e$d$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a;->g()Lcom/daaw/lm$e$d$a$a;

    move-result-object p1

    invoke-static {p2}, Lcom/daaw/of0;->d(Ljava/util/List;)Lcom/daaw/of0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/lm$e$d$a$a;->c(Lcom/daaw/of0;)Lcom/daaw/lm$e$d$a$a;

    move-result-object p1

    invoke-static {p3}, Lcom/daaw/of0;->d(Ljava/util/List;)Lcom/daaw/of0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/lm$e$d$a$a;->e(Lcom/daaw/of0;)Lcom/daaw/lm$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$a;->a()Lcom/daaw/lm$e$d$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/lm$e$d$b;->b(Lcom/daaw/lm$e$d$a;)Lcom/daaw/lm$e$d$b;

    :cond_2
    invoke-virtual {v0}, Lcom/daaw/lm$e$d$b;->a()Lcom/daaw/lm$e$d;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/wr0;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "SessionReportingCoordinator#finalizeSessionWithNativeEvent"

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/wr0;

    invoke-interface {v1}, Lcom/daaw/wr0;->d()Lcom/daaw/lm$d$b;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/daaw/pb1;->b:Lcom/daaw/ym;

    invoke-static {}, Lcom/daaw/lm$d;->a()Lcom/daaw/lm$d$a;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/of0;->d(Ljava/util/List;)Lcom/daaw/of0;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/daaw/lm$d$a;->b(Lcom/daaw/of0;)Lcom/daaw/lm$d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/lm$d$a;->a()Lcom/daaw/lm$d;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/ym;->l(Ljava/lang/String;Lcom/daaw/lm$d;)V

    return-void
.end method

.method public i(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/pb1;->b:Lcom/daaw/ym;

    invoke-virtual {v0, p3, p1, p2}, Lcom/daaw/ym;->k(Ljava/lang/String;J)V

    return-void
.end method

.method public final j(Ljava/lang/String;Ljava/util/List;)Landroid/app/ApplicationExitInfo;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/app/ApplicationExitInfo;",
            ">;)",
            "Landroid/app/ApplicationExitInfo;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/pb1;->b:Lcom/daaw/ym;

    invoke-virtual {v0, p1}, Lcom/daaw/ym;->q(Ljava/lang/String;)J

    move-result-wide v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/ApplicationExitInfo;

    invoke-virtual {p2}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v3

    cmp-long v5, v3, v0

    if-gez v5, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {p2}, Landroid/app/ApplicationExitInfo;->getReason()I

    move-result v2

    const/4 v3, 0x6

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    return-object p2

    :cond_2
    return-object v2
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/pb1;->b:Lcom/daaw/ym;

    invoke-virtual {v0}, Lcom/daaw/ym;->r()Z

    move-result v0

    return v0
.end method

.method public n()Ljava/util/SortedSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/SortedSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/pb1;->b:Lcom/daaw/ym;

    invoke-virtual {v0}, Lcom/daaw/ym;->p()Ljava/util/SortedSet;

    move-result-object v0

    return-object v0
.end method

.method public o(Ljava/lang/String;J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/pb1;->a:Lcom/daaw/mm;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/mm;->d(Ljava/lang/String;J)Lcom/daaw/lm;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/pb1;->b:Lcom/daaw/ym;

    invoke-virtual {p2, p1}, Lcom/daaw/ym;->z(Lcom/daaw/lm;)V

    return-void
.end method

.method public final p(Lcom/daaw/rj1;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rj1<",
            "Lcom/daaw/zm;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/rj1;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/rj1;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/zm;

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Crashlytics report successfully enqueued to DataTransport: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/daaw/zm;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/daaw/zm;->c()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Deleted report file: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Crashlytics could not delete report file: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/rj1;->j()Ljava/lang/Exception;

    move-result-object p1

    const-string v1, "Crashlytics report could not be enqueued to DataTransport"

    invoke-virtual {v0, v1, p1}, Lcom/daaw/ml0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final q(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V
    .locals 11

    move-object v0, p0

    const-string v1, "crash"

    move-object v5, p4

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Lcom/daaw/pb1;->a:Lcom/daaw/mm;

    const/4 v8, 0x4

    const/16 v9, 0x8

    move-object v3, p1

    move-object v4, p2

    move-wide/from16 v6, p5

    move/from16 v10, p7

    invoke-virtual/range {v2 .. v10}, Lcom/daaw/mm;->c(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;JIIZ)Lcom/daaw/lm$e$d;

    move-result-object v2

    iget-object v3, v0, Lcom/daaw/pb1;->b:Lcom/daaw/ym;

    invoke-virtual {p0, v2}, Lcom/daaw/pb1;->c(Lcom/daaw/lm$e$d;)Lcom/daaw/lm$e$d;

    move-result-object v2

    move-object v4, p3

    invoke-virtual {v3, v2, p3, v1}, Lcom/daaw/ym;->y(Lcom/daaw/lm$e$d;Ljava/lang/String;Z)V

    return-void
.end method

.method public r(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V
    .locals 10

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Persisting fatal event for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    const-string v6, "crash"

    const/4 v9, 0x1

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v7, p4

    invoke-virtual/range {v2 .. v9}, Lcom/daaw/pb1;->q(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V

    return-void
.end method

.method public s(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V
    .locals 10

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Persisting non-fatal event for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    const-string v6, "error"

    const/4 v9, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v7, p4

    invoke-virtual/range {v2 .. v9}, Lcom/daaw/pb1;->q(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V

    return-void
.end method

.method public t(Ljava/lang/String;Ljava/util/List;Lcom/daaw/fl0;Lcom/daaw/nq1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/app/ApplicationExitInfo;",
            ">;",
            "Lcom/daaw/fl0;",
            "Lcom/daaw/nq1;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/daaw/pb1;->j(Ljava/lang/String;Ljava/util/List;)Landroid/app/ApplicationExitInfo;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "No relevant ApplicationExitInfo occurred during session: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/pb1;->a:Lcom/daaw/mm;

    invoke-static {p2}, Lcom/daaw/pb1;->e(Landroid/app/ApplicationExitInfo;)Lcom/daaw/lm$a;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/daaw/mm;->b(Lcom/daaw/lm$a;)Lcom/daaw/lm$e$d;

    move-result-object p2

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Persisting anr for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/pb1;->b:Lcom/daaw/ym;

    invoke-virtual {p0, p2, p3, p4}, Lcom/daaw/pb1;->d(Lcom/daaw/lm$e$d;Lcom/daaw/fl0;Lcom/daaw/nq1;)Lcom/daaw/lm$e$d;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {v0, p2, p1, p3}, Lcom/daaw/ym;->y(Lcom/daaw/lm$e$d;Ljava/lang/String;Z)V

    return-void
.end method

.method public u()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/pb1;->b:Lcom/daaw/ym;

    invoke-virtual {v0}, Lcom/daaw/ym;->i()V

    return-void
.end method

.method public v(Ljava/util/concurrent/Executor;)Lcom/daaw/rj1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/pb1;->w(Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public w(Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/daaw/rj1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/pb1;->b:Lcom/daaw/ym;

    invoke-virtual {v0}, Lcom/daaw/ym;->w()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/zm;

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Lcom/daaw/zm;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    iget-object v3, p0, Lcom/daaw/pb1;->c:Lcom/daaw/rp;

    if-eqz p2, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v3, v2, v4}, Lcom/daaw/rp;->c(Lcom/daaw/zm;Z)Lcom/daaw/rj1;

    move-result-object v2

    new-instance v3, Lcom/daaw/nb1;

    invoke-direct {v3, p0}, Lcom/daaw/nb1;-><init>(Lcom/daaw/pb1;)V

    invoke-virtual {v2, p1, v3}, Lcom/daaw/rj1;->g(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v1}, Lcom/daaw/dk1;->f(Ljava/util/Collection;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method
