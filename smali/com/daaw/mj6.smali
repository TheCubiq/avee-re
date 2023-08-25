.class public final Lcom/daaw/mj6;
.super Lcom/daaw/sx5;
.source ""

# interfaces
.implements Lcom/daaw/iu6;


# instance fields
.field public final e:Z

.field public final f:I

.field public final g:I

.field public final h:Ljava/lang/String;

.field public final i:Lcom/daaw/kt6;

.field public final j:Lcom/daaw/kt6;

.field public k:Lcom/daaw/pa6;

.field public l:Ljava/net/HttpURLConnection;

.field public m:Ljava/io/InputStream;

.field public n:Z

.field public o:I

.field public p:J

.field public q:J


# direct methods
.method public constructor <init>(Ljava/lang/String;IIZLcom/daaw/kt6;Lcom/daaw/ty6;Z)V
    .locals 0

    const/4 p6, 0x1

    invoke-direct {p0, p6}, Lcom/daaw/sx5;-><init>(Z)V

    iput-object p1, p0, Lcom/daaw/mj6;->h:Ljava/lang/String;

    iput p2, p0, Lcom/daaw/mj6;->f:I

    iput p3, p0, Lcom/daaw/mj6;->g:I

    iput-boolean p4, p0, Lcom/daaw/mj6;->e:Z

    iput-object p5, p0, Lcom/daaw/mj6;->i:Lcom/daaw/kt6;

    new-instance p1, Lcom/daaw/kt6;

    invoke-direct {p1}, Lcom/daaw/kt6;-><init>()V

    iput-object p1, p0, Lcom/daaw/mj6;->j:Lcom/daaw/kt6;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIZLcom/daaw/kt6;Lcom/daaw/ty6;ZLcom/daaw/ki6;)V
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v7}, Lcom/daaw/mj6;-><init>(Ljava/lang/String;IIZLcom/daaw/kt6;Lcom/daaw/ty6;Z)V

    return-void
.end method


# virtual methods
.method public final a([BII)I
    .locals 6

    const/4 v0, -0x1

    if-nez p3, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-wide v1, p0, Lcom/daaw/mj6;->p:J

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    iget-wide v3, p0, Lcom/daaw/mj6;->q:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    int-to-long v3, p3

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int p3, v1

    :cond_2
    iget-object v1, p0, Lcom/daaw/mj6;->m:Ljava/io/InputStream;

    sget v2, Lcom/daaw/it5;->a:I

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-ne p1, v0, :cond_3

    goto :goto_0

    :cond_3
    iget-wide p2, p0, Lcom/daaw/mj6;->q:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lcom/daaw/mj6;->q:J

    invoke-virtual {p0, p1}, Lcom/daaw/sx5;->c(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, p1

    :goto_0
    return v0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/daaw/mj6;->k:Lcom/daaw/pa6;

    sget p3, Lcom/daaw/it5;->a:I

    const/4 p3, 0x2

    invoke-static {p1, p2, p3}, Lcom/daaw/cq6;->a(Ljava/io/IOException;Lcom/daaw/pa6;I)Lcom/daaw/cq6;

    move-result-object p1

    throw p1
.end method

.method public final g(Lcom/daaw/pa6;)J
    .locals 24

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    iput-object v13, v12, Lcom/daaw/mj6;->k:Lcom/daaw/pa6;

    const-wide/16 v14, 0x0

    iput-wide v14, v12, Lcom/daaw/mj6;->q:J

    iput-wide v14, v12, Lcom/daaw/mj6;->p:J

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/sx5;->l(Lcom/daaw/pa6;)V

    const/4 v11, 0x1

    :try_start_0
    new-instance v2, Ljava/net/URL;

    iget-object v0, v13, Lcom/daaw/pa6;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iget-wide v9, v13, Lcom/daaw/pa6;->f:J

    iget-wide v7, v13, Lcom/daaw/pa6;->g:J

    invoke-virtual {v13, v11}, Lcom/daaw/pa6;->b(I)Z

    move-result v0

    iget-boolean v1, v12, Lcom/daaw/mj6;->e:Z

    const/4 v5, 0x0

    if-nez v1, :cond_0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/16 v16, 0x1

    iget-object v6, v13, Lcom/daaw/pa6;->d:Ljava/util/Map;

    move-object/from16 v1, p0

    move-object/from16 v17, v6

    move-wide v5, v9

    move v9, v0

    move/from16 v10, v16

    move-object/from16 v11, v17

    invoke-virtual/range {v1 .. v11}, Lcom/daaw/mj6;->n(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    move-result-object v0

    goto :goto_1

    :cond_0
    move-object v11, v2

    const/4 v5, 0x0

    :goto_0
    add-int/lit8 v6, v5, 0x1

    const/16 v1, 0x14

    if-gt v5, v1, :cond_14

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/16 v16, 0x0

    iget-object v5, v13, Lcom/daaw/pa6;->d:Ljava/util/Map;

    move-object/from16 v1, p0

    move-object v2, v11

    move-object/from16 v17, v5

    move/from16 v18, v6

    move-wide v5, v9

    move-wide/from16 v19, v7

    move-wide/from16 v21, v9

    move v9, v0

    move/from16 v10, v16

    move-object/from16 v23, v11

    move-object/from16 v11, v17

    invoke-virtual/range {v1 .. v11}, Lcom/daaw/mj6;->n(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    const-string v3, "Location"

    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x12c

    if-eq v2, v4, :cond_13

    const/16 v4, 0x12d

    if-eq v2, v4, :cond_13

    const/16 v4, 0x12e

    if-eq v2, v4, :cond_13

    const/16 v4, 0x12f

    if-eq v2, v4, :cond_13

    const/16 v4, 0x133

    if-eq v2, v4, :cond_13

    const/16 v4, 0x134

    if-ne v2, v4, :cond_1

    goto/16 :goto_a

    :cond_1
    move-object v0, v1

    :goto_1
    iput-object v0, v12, Lcom/daaw/mj6;->l:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    iput v1, v12, Lcom/daaw/mj6;->o:I

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    iget v1, v12, Lcom/daaw/mj6;->o:I

    const/16 v2, 0x7d8

    const-string v4, "Content-Range"

    const/16 v5, 0xc8

    const-wide/16 v6, -0x1

    if-lt v1, v5, :cond_d

    const/16 v8, 0x12b

    if-le v1, v8, :cond_2

    goto/16 :goto_6

    :cond_2
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    iget v1, v12, Lcom/daaw/mj6;->o:I

    if-ne v1, v5, :cond_3

    iget-wide v8, v13, Lcom/daaw/pa6;->f:J

    cmp-long v1, v8, v14

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    move-wide v8, v14

    :goto_2
    const-string v1, "Content-Encoding"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "gzip"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_6

    iget-wide v10, v13, Lcom/daaw/pa6;->g:J

    cmp-long v3, v10, v6

    if-eqz v3, :cond_4

    iput-wide v10, v12, Lcom/daaw/mj6;->p:J

    goto :goto_3

    :cond_4
    const-string v3, "Content-Length"

    invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v4}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/ev6;->a(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v3

    cmp-long v5, v3, v6

    if-eqz v5, :cond_5

    sub-long v6, v3, v8

    :cond_5
    iput-wide v6, v12, Lcom/daaw/mj6;->p:J

    goto :goto_3

    :cond_6
    iget-wide v3, v13, Lcom/daaw/pa6;->g:J

    iput-wide v3, v12, Lcom/daaw/mj6;->p:J

    :goto_3
    const/16 v3, 0x7d0

    :try_start_1
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, v12, Lcom/daaw/mj6;->m:Ljava/io/InputStream;

    if-eqz v1, :cond_7

    new-instance v0, Ljava/util/zip/GZIPInputStream;

    iget-object v1, v12, Lcom/daaw/mj6;->m:Ljava/io/InputStream;

    invoke-direct {v0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, v12, Lcom/daaw/mj6;->m:Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_7
    const/4 v5, 0x1

    iput-boolean v5, v12, Lcom/daaw/mj6;->n:Z

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/sx5;->m(Lcom/daaw/pa6;)V

    cmp-long v0, v8, v14

    if-nez v0, :cond_8

    goto :goto_5

    :cond_8
    const/16 v0, 0x1000

    :try_start_2
    new-array v0, v0, [B

    :goto_4
    cmp-long v1, v8, v14

    if-lez v1, :cond_b

    const-wide/16 v6, 0x1000

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v1, v6

    iget-object v4, v12, Lcom/daaw/mj6;->m:Ljava/io/InputStream;

    sget v6, Lcom/daaw/it5;->a:I

    const/4 v6, 0x0

    invoke-virtual {v4, v0, v6, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v4

    if-nez v4, :cond_a

    const/4 v4, -0x1

    if-eq v1, v4, :cond_9

    int-to-long v10, v1

    sub-long/2addr v8, v10

    invoke-virtual {v12, v1}, Lcom/daaw/sx5;->c(I)V

    goto :goto_4

    :cond_9
    new-instance v0, Lcom/daaw/cq6;

    invoke-direct {v0, v13, v2, v5}, Lcom/daaw/cq6;-><init>(Lcom/daaw/pa6;II)V

    throw v0

    :cond_a
    new-instance v0, Lcom/daaw/cq6;

    new-instance v1, Ljava/io/InterruptedIOException;

    invoke-direct {v1}, Ljava/io/InterruptedIOException;-><init>()V

    invoke-direct {v0, v1, v13, v3, v5}, Lcom/daaw/cq6;-><init>(Ljava/io/IOException;Lcom/daaw/pa6;II)V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_b
    :goto_5
    iget-wide v0, v12, Lcom/daaw/mj6;->p:J

    return-wide v0

    :catch_0
    move-exception v0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/mj6;->p()V

    instance-of v1, v0, Lcom/daaw/cq6;

    if-eqz v1, :cond_c

    check-cast v0, Lcom/daaw/cq6;

    throw v0

    :cond_c
    new-instance v1, Lcom/daaw/cq6;

    invoke-direct {v1, v0, v13, v3, v5}, Lcom/daaw/cq6;-><init>(Ljava/io/IOException;Lcom/daaw/pa6;II)V

    throw v1

    :catch_1
    move-exception v0

    const/4 v5, 0x1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/mj6;->p()V

    new-instance v1, Lcom/daaw/cq6;

    invoke-direct {v1, v0, v13, v3, v5}, Lcom/daaw/cq6;-><init>(Ljava/io/IOException;Lcom/daaw/pa6;II)V

    throw v1

    :cond_d
    :goto_6
    const/4 v5, 0x1

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v8

    iget v1, v12, Lcom/daaw/mj6;->o:I

    const/16 v9, 0x1a0

    if-ne v1, v9, :cond_f

    invoke-virtual {v0, v4}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/ev6;->b(Ljava/lang/String;)J

    move-result-wide v10

    move-object v4, v3

    iget-wide v2, v13, Lcom/daaw/pa6;->f:J

    cmp-long v16, v2, v10

    if-nez v16, :cond_10

    iput-boolean v5, v12, Lcom/daaw/mj6;->n:Z

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/sx5;->m(Lcom/daaw/pa6;)V

    iget-wide v0, v13, Lcom/daaw/pa6;->g:J

    cmp-long v2, v0, v6

    if-eqz v2, :cond_e

    return-wide v0

    :cond_e
    return-wide v14

    :cond_f
    move-object v4, v3

    :cond_10
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_11

    :try_start_3
    invoke-static {v0}, Lcom/daaw/it5;->C(Ljava/io/InputStream;)[B

    move-result-object v0

    goto :goto_7

    :cond_11
    sget-object v0, Lcom/daaw/it5;->f:[B
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :goto_7
    move-object v7, v0

    goto :goto_8

    :catch_2
    sget-object v0, Lcom/daaw/it5;->f:[B

    goto :goto_7

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/mj6;->p()V

    iget v0, v12, Lcom/daaw/mj6;->o:I

    if-ne v0, v9, :cond_12

    new-instance v0, Lcom/daaw/s56;

    const/16 v1, 0x7d8

    invoke-direct {v0, v1}, Lcom/daaw/s56;-><init>(I)V

    goto :goto_9

    :cond_12
    const/4 v0, 0x0

    :goto_9
    new-instance v9, Lcom/daaw/hs6;

    iget v2, v12, Lcom/daaw/mj6;->o:I

    move-object v1, v9

    move-object v3, v4

    move-object v4, v0

    move-object v5, v8

    move-object/from16 v6, p1

    invoke-direct/range {v1 .. v7}, Lcom/daaw/hs6;-><init>(ILjava/lang/String;Ljava/io/IOException;Ljava/util/Map;Lcom/daaw/pa6;[B)V

    throw v9

    :cond_13
    :goto_a
    const/4 v5, 0x1

    const/4 v6, 0x0

    :try_start_4
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    move-object/from16 v2, v23

    invoke-virtual {v12, v2, v3, v13}, Lcom/daaw/mj6;->o(Ljava/net/URL;Ljava/lang/String;Lcom/daaw/pa6;)Ljava/net/URL;

    move-result-object v11

    move/from16 v5, v18

    move-wide/from16 v7, v19

    move-wide/from16 v9, v21

    goto/16 :goto_0

    :cond_14
    move/from16 v18, v6

    const/4 v5, 0x1

    new-instance v0, Lcom/daaw/cq6;

    new-instance v1, Ljava/net/NoRouteToHostException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Too many redirects: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v3, v18

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/NoRouteToHostException;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x7d1

    invoke-direct {v0, v1, v13, v2, v5}, Lcom/daaw/cq6;-><init>(Ljava/io/IOException;Lcom/daaw/pa6;II)V

    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    move-exception v0

    goto :goto_b

    :catch_4
    move-exception v0

    const/4 v5, 0x1

    :goto_b
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/mj6;->p()V

    invoke-static {v0, v13, v5}, Lcom/daaw/cq6;->a(Ljava/io/IOException;Lcom/daaw/pa6;I)Lcom/daaw/cq6;

    move-result-object v0

    goto :goto_d

    :goto_c
    throw v0

    :goto_d
    goto :goto_c
.end method

.method public final n(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;
    .locals 2

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    iget p2, p0, Lcom/daaw/mj6;->f:I

    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    iget p2, p0, Lcom/daaw/mj6;->g:I

    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iget-object p3, p0, Lcom/daaw/mj6;->i:Lcom/daaw/kt6;

    invoke-virtual {p3}, Lcom/daaw/kt6;->a()Ljava/util/Map;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object p3, p0, Lcom/daaw/mj6;->j:Lcom/daaw/kt6;

    invoke-virtual {p3}, Lcom/daaw/kt6;->a()Ljava/util/Map;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-interface {p2, p10}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p10

    check-cast p10, Ljava/lang/String;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p1, p10, p3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-wide/16 p2, 0x0

    const-wide/16 v0, -0x1

    cmp-long p10, p4, p2

    if-nez p10, :cond_2

    cmp-long p4, p6, v0

    if-nez p4, :cond_1

    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    move-wide p4, p2

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "bytes="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, "-"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    cmp-long p3, p6, v0

    if-eqz p3, :cond_3

    add-long/2addr p4, p6

    add-long/2addr p4, v0

    invoke-virtual {p2, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_1
    if-eqz p2, :cond_4

    const-string p3, "Range"

    invoke-virtual {p1, p3, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-object p2, p0, Lcom/daaw/mj6;->h:Ljava/lang/String;

    if-eqz p2, :cond_5

    const-string p3, "User-Agent"

    invoke-virtual {p1, p3, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    const/4 p2, 0x1

    if-eq p2, p8, :cond_6

    const-string p3, "identity"

    goto :goto_2

    :cond_6
    const-string p3, "gzip"

    :goto_2
    const-string p4, "Accept-Encoding"

    invoke-virtual {p1, p4, p3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, p9}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    invoke-static {p2}, Lcom/daaw/pa6;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->connect()V

    return-object p1
.end method

.method public final o(Ljava/net/URL;Ljava/lang/String;Lcom/daaw/pa6;)Ljava/net/URL;
    .locals 5

    const/4 v0, 0x1

    const/16 v1, 0x7d1

    if-eqz p2, :cond_4

    :try_start_0
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, p1, p2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v2}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object p2

    const-string v3, "https"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "http"

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/cq6;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v2, "Unsupported protocol redirect: "

    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p3, v1, v0}, Lcom/daaw/cq6;-><init>(Ljava/lang/String;Lcom/daaw/pa6;II)V

    throw p1

    :cond_1
    :goto_0
    iget-boolean v3, p0, Lcom/daaw/mj6;->e:Z

    if-nez v3, :cond_3

    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    new-instance v2, Lcom/daaw/cq6;

    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Disallowed cross-protocol redirect ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, p3, v1, v0}, Lcom/daaw/cq6;-><init>(Ljava/lang/String;Lcom/daaw/pa6;II)V

    throw v2

    :cond_3
    :goto_1
    return-object v2

    :catch_0
    move-exception p1

    new-instance p2, Lcom/daaw/cq6;

    invoke-direct {p2, p1, p3, v1, v0}, Lcom/daaw/cq6;-><init>(Ljava/io/IOException;Lcom/daaw/pa6;II)V

    throw p2

    :cond_4
    new-instance p1, Lcom/daaw/cq6;

    const-string p2, "Null location redirect"

    invoke-direct {p1, p2, p3, v1, v0}, Lcom/daaw/cq6;-><init>(Ljava/lang/String;Lcom/daaw/pa6;II)V

    throw p1
.end method

.method public final p()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/mj6;->l:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "DefaultHttpDataSource"

    const-string v2, "Unexpected error while disconnecting"

    invoke-static {v1, v2, v0}, Lcom/daaw/s95;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/mj6;->l:Ljava/net/HttpURLConnection;

    :cond_0
    return-void
.end method

.method public final zzc()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/daaw/mj6;->l:Ljava/net/HttpURLConnection;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/daaw/mj6;->m:Ljava/io/InputStream;

    if-eqz v2, :cond_6

    iget-wide v3, p0, Lcom/daaw/mj6;->p:J

    const-wide/16 v5, -0x1

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    move-wide v3, v5

    goto :goto_0

    :cond_0
    iget-wide v7, p0, Lcom/daaw/mj6;->q:J

    sub-long/2addr v3, v7

    :goto_0
    iget-object v7, p0, Lcom/daaw/mj6;->l:Ljava/net/HttpURLConnection;

    if-eqz v7, :cond_5

    sget v8, Lcom/daaw/it5;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v9, 0x14

    if-le v8, v9, :cond_1

    goto :goto_2

    :cond_1
    :try_start_1
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v7

    cmp-long v8, v3, v5

    if-nez v8, :cond_2

    invoke-virtual {v7}, Ljava/io/InputStream;->read()I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_5

    goto :goto_1

    :cond_2
    const-wide/16 v5, 0x800

    cmp-long v8, v3, v5

    if-gtz v8, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    :cond_4
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    const-string v4, "unexpectedEndOfInput"

    new-array v5, v1, [Ljava/lang/Class;

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {v3, v7, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_0
    :cond_5
    :goto_2
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :catch_1
    move-exception v2

    :try_start_4
    new-instance v3, Lcom/daaw/cq6;

    iget-object v4, p0, Lcom/daaw/mj6;->k:Lcom/daaw/pa6;

    sget v5, Lcom/daaw/it5;->a:I

    const/16 v5, 0x7d0

    const/4 v6, 0x3

    invoke-direct {v3, v2, v4, v5, v6}, Lcom/daaw/cq6;-><init>(Ljava/io/IOException;Lcom/daaw/pa6;II)V

    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_6
    :goto_3
    iput-object v0, p0, Lcom/daaw/mj6;->m:Ljava/io/InputStream;

    invoke-virtual {p0}, Lcom/daaw/mj6;->p()V

    iget-boolean v0, p0, Lcom/daaw/mj6;->n:Z

    if-eqz v0, :cond_7

    iput-boolean v1, p0, Lcom/daaw/mj6;->n:Z

    invoke-virtual {p0}, Lcom/daaw/sx5;->k()V

    :cond_7
    return-void

    :catchall_0
    move-exception v2

    iput-object v0, p0, Lcom/daaw/mj6;->m:Ljava/io/InputStream;

    invoke-virtual {p0}, Lcom/daaw/mj6;->p()V

    iget-boolean v0, p0, Lcom/daaw/mj6;->n:Z

    if-eqz v0, :cond_8

    iput-boolean v1, p0, Lcom/daaw/mj6;->n:Z

    invoke-virtual {p0}, Lcom/daaw/sx5;->k()V

    :cond_8
    throw v2
.end method

.method public final zze()Ljava/util/Map;
    .locals 2

    iget-object v0, p0, Lcom/daaw/mj6;->l:Ljava/net/HttpURLConnection;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/b27;->d()Lcom/daaw/b27;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Lcom/daaw/hh6;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/daaw/hh6;-><init>(Ljava/util/Map;)V

    return-object v1
.end method
