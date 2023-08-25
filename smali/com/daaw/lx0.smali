.class public Lcom/daaw/lx0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static c:Lcom/daaw/lx0;


# instance fields
.field public final a:Lcom/daaw/bl0;

.field public b:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Lcom/daaw/pe1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/el0;->a(Ljava/lang/Class;)Lcom/daaw/bl0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/lx0;->a:Lcom/daaw/bl0;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/daaw/cv0;

    invoke-direct {v1}, Lcom/daaw/cv0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/daaw/gv0;

    invoke-direct {v1}, Lcom/daaw/gv0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/daaw/cm0;

    invoke-direct {v1}, Lcom/daaw/cm0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/daaw/ev0;

    invoke-direct {v1}, Lcom/daaw/ev0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/daaw/am0;

    invoke-direct {v1}, Lcom/daaw/am0;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object v0, p0, Lcom/daaw/lx0;->b:Ljava/lang/Iterable;

    return-void
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/kx0;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, "//"

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p2, Lcom/daaw/kx0;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static h()Lcom/daaw/lx0;
    .locals 1

    sget-object v0, Lcom/daaw/lx0;->c:Lcom/daaw/lx0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/lx0;

    invoke-direct {v0}, Lcom/daaw/lx0;-><init>()V

    sput-object v0, Lcom/daaw/lx0;->c:Lcom/daaw/lx0;

    :cond_0
    sget-object v0, Lcom/daaw/lx0;->c:Lcom/daaw/lx0;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/daaw/wf1;Ljava/lang/String;Ljava/util/List;ZZ)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/wf1;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZ)I"
        }
    .end annotation

    invoke-static {p3}, Lcom/daaw/tx0;->q(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/lx0;->b(Lcom/daaw/wf1;Ljava/lang/String;Ljava/util/List;ZZ)I

    move-result p1

    return p1
.end method

.method public b(Lcom/daaw/wf1;Ljava/lang/String;Ljava/util/List;ZZ)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/wf1;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;ZZ)I"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "file:"

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/net/URL;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_9

    :goto_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    :try_start_1
    invoke-virtual {p0, v1}, Lcom/daaw/lx0;->g(Ljava/net/URL;)Lcom/daaw/oe1;

    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    :try_start_2
    invoke-interface {v1}, Lcom/daaw/oe1;->a()Lcom/daaw/pe1;

    move-result-object v3
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    instance-of v5, v1, Lcom/daaw/zl0;

    if-eqz v5, :cond_1

    move-object v5, v1

    check-cast v5, Lcom/daaw/zl0;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lcom/daaw/zl0;->d(Z)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_1
    if-eqz p4, :cond_2

    :try_start_4
    new-instance v5, Lcom/daaw/ix0;

    invoke-direct {v5}, Lcom/daaw/ix0;-><init>()V

    invoke-interface {v3, v5}, Lcom/daaw/pe1;->c(Lcom/daaw/ix0;)Lcom/daaw/oe1;

    move-result-object v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_2

    :catch_0
    move-exception v5

    :try_start_5
    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_2

    :catch_1
    move-exception v5

    goto :goto_1

    :catch_2
    move-exception v5

    move-object v3, v4

    goto :goto_1

    :catch_3
    move-exception v5

    move-object v1, v4

    move-object v3, v1

    :goto_1
    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_2
    :goto_2
    if-eqz v1, :cond_3

    if-nez v3, :cond_6

    :cond_3
    if-nez p4, :cond_4

    return v0

    :cond_4
    invoke-virtual {p0, p2}, Lcom/daaw/lx0;->d(Ljava/lang/String;)Lcom/daaw/pe1;

    move-result-object p2

    :try_start_6
    new-instance p4, Lcom/daaw/ix0;

    invoke-direct {p4}, Lcom/daaw/ix0;-><init>()V

    invoke-interface {p2, p4}, Lcom/daaw/pe1;->c(Lcom/daaw/ix0;)Lcom/daaw/oe1;

    move-result-object v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_3

    :catch_4
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    invoke-virtual {p0, p2}, Lcom/daaw/lx0;->d(Ljava/lang/String;)Lcom/daaw/pe1;

    move-result-object p2

    :try_start_7
    new-instance p4, Lcom/daaw/ix0;

    invoke-direct {p4}, Lcom/daaw/ix0;-><init>()V

    invoke-interface {p2, p4}, Lcom/daaw/pe1;->c(Lcom/daaw/ix0;)Lcom/daaw/oe1;

    move-result-object v1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_3

    :catch_5
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    move-object v1, v4

    :cond_6
    :goto_3
    if-nez v1, :cond_7

    const-string p2, "error specificPlaylist is null"

    invoke-static {p2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const-string p2, "Error specificPlaylist is null"

    invoke-virtual {p1, p2}, Lcom/daaw/wf1;->a(Ljava/lang/String;)V

    return v0

    :cond_7
    new-instance p2, Lcom/daaw/mx0$a;

    invoke-direct {p2}, Lcom/daaw/mx0$a;-><init>()V

    iput-boolean p5, p2, Lcom/daaw/mx0$a;->b:Z

    :try_start_8
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p2, Lcom/daaw/mx0$a;->a:Ljava/lang/String;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    goto :goto_4

    :catch_6
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p2, Lcom/daaw/mx0$a;->a:Ljava/lang/String;

    :goto_4
    invoke-static {v1, p2, p3}, Lcom/daaw/mx0;->f(Lcom/daaw/oe1;Lcom/daaw/mx0$a;Ljava/util/List;)I

    move-result p2

    :try_start_9
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p3

    if-eqz p3, :cond_8

    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result p4

    if-nez p4, :cond_8

    invoke-virtual {p3}, Ljava/io/File;->mkdirs()Z

    :cond_8
    new-instance p3, Ljava/io/FileOutputStream;

    invoke-direct {p3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8

    :try_start_a
    invoke-interface {v1, p3, v4}, Lcom/daaw/oe1;->b(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {p3}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    goto :goto_5

    :catch_7
    move-exception p3

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "outputSpecificPlaylist.writeTo: "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const-string p4, "OutputSpecificPlaylist"

    invoke-virtual {p1, p4, p3}, Lcom/daaw/wf1;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_5
    return p2

    :catch_8
    move-exception p2

    const-string p3, "File Output"

    invoke-virtual {p1, p3, p2}, Lcom/daaw/wf1;->b(Ljava/lang/String;Ljava/lang/Exception;)V

    return v0

    :catch_9
    const-string p2, "MalformedURLException"

    invoke-virtual {p1, p2}, Lcom/daaw/wf1;->a(Ljava/lang/String;)V

    return v0
.end method

.method public c(Lcom/daaw/wf1;Ljava/lang/String;Lcom/daaw/kx0;Ljava/util/List;Z)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/wf1;",
            "Ljava/lang/String;",
            "Lcom/daaw/kx0;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)I"
        }
    .end annotation

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/lx0;->a(Lcom/daaw/wf1;Ljava/lang/String;Ljava/util/List;ZZ)I

    move-result p1

    return p1
.end method

.method public final d(Ljava/lang/String;)Lcom/daaw/pe1;
    .locals 7

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/lx0;->b:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/pe1;

    invoke-interface {v2}, Lcom/daaw/pe1;->b()[Lcom/daaw/wk;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    invoke-virtual {v6, p1}, Lcom/daaw/wk;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object v1, v2

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v1, :cond_0

    :cond_3
    return-object v1
.end method

.method public e(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/net/URL;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_2

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {p0, v1}, Lcom/daaw/lx0;->g(Ljava/net/URL;)Lcom/daaw/oe1;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lcom/daaw/jx0$a;

    invoke-direct {v1}, Lcom/daaw/jx0$a;-><init>()V

    :try_start_2
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/jx0$a;->a:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/daaw/jx0$a;->a:Ljava/lang/String;

    :goto_1
    invoke-static {p1, v1, v0}, Lcom/daaw/jx0;->k(Lcom/daaw/oe1;Lcom/daaw/jx0$a;Ljava/util/List;)I

    :catch_2
    :cond_2
    return-object v0
.end method

.method public final g(Ljava/net/URL;)Lcom/daaw/oe1;
    .locals 8

    iget-object v0, p0, Lcom/daaw/lx0;->b:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/pe1;

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setAllowUserInteraction(Z)V

    const/16 v4, 0x2710

    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setDoInput(Z)V

    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const v3, 0xea60

    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setUseCaches(Z)V

    invoke-virtual {v2}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    :try_start_0
    iget-object v4, p0, Lcom/daaw/lx0;->a:Lcom/daaw/bl0;

    invoke-interface {v1, v2, v3, v4}, Lcom/daaw/pe1;->a(Ljava/io/InputStream;Ljava/lang/String;Lcom/daaw/bl0;)Lcom/daaw/oe1;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v3

    :try_start_1
    iget-object v4, p0, Lcom/daaw/lx0;->a:Lcom/daaw/bl0;

    invoke-interface {v4}, Lcom/daaw/bl0;->d()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v5, " cannot unmarshal <"

    const-string v6, "Playlist provider "

    if-eqz v4, :cond_0

    :try_start_2
    iget-object v4, p0, Lcom/daaw/lx0;->a:Lcom/daaw/bl0;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Lcom/daaw/pe1;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1, v3}, Lcom/daaw/bl0;->b(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lcom/daaw/lx0;->a:Lcom/daaw/bl0;

    invoke-interface {v4}, Lcom/daaw/bl0;->c()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/daaw/lx0;->a:Lcom/daaw/bl0;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Lcom/daaw/pe1;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ">: "

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Lcom/daaw/bl0;->a(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    :goto_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    goto/16 :goto_0

    :goto_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    throw p1

    :cond_2
    const/4 p1, 0x0

    :goto_3
    return-object p1
.end method
