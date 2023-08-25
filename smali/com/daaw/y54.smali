.class public final Lcom/daaw/y54;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/p46;


# instance fields
.field public final a:Lcom/daaw/p46;

.field public final b:J

.field public final c:Lcom/daaw/p46;

.field public d:J

.field public e:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lcom/daaw/p46;ILcom/daaw/p46;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/y54;->a:Lcom/daaw/p46;

    int-to-long p1, p2

    iput-wide p1, p0, Lcom/daaw/y54;->b:J

    iput-object p3, p0, Lcom/daaw/y54;->c:Lcom/daaw/p46;

    return-void
.end method


# virtual methods
.method public final a([BII)I
    .locals 8

    iget-wide v0, p0, Lcom/daaw/y54;->d:J

    iget-wide v2, p0, Lcom/daaw/y54;->b:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    int-to-long v4, p3

    sub-long/2addr v2, v0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/y54;->a:Lcom/daaw/p46;

    long-to-int v1, v0

    invoke-interface {v2, p1, p2, v1}, Lcom/daaw/xp8;->a([BII)I

    move-result v0

    iget-wide v1, p0, Lcom/daaw/y54;->d:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/daaw/y54;->d:J

    move-wide v6, v1

    move v2, v0

    move-wide v0, v6

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-wide v3, p0, Lcom/daaw/y54;->b:J

    cmp-long v5, v0, v3

    if-ltz v5, :cond_1

    iget-object v0, p0, Lcom/daaw/y54;->c:Lcom/daaw/p46;

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/xp8;->a([BII)I

    move-result p1

    iget-wide p2, p0, Lcom/daaw/y54;->d:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lcom/daaw/y54;->d:J

    add-int/2addr v2, p1

    :cond_1
    return v2
.end method

.method public final d(Lcom/daaw/qz6;)V
    .locals 0

    return-void
.end method

.method public final g(Lcom/daaw/pa6;)J
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, Lcom/daaw/pa6;->a:Landroid/net/Uri;

    iput-object v2, v0, Lcom/daaw/y54;->e:Landroid/net/Uri;

    iget-wide v8, v1, Lcom/daaw/pa6;->f:J

    iget-wide v2, v0, Lcom/daaw/y54;->b:J

    const/4 v14, 0x0

    const-wide/16 v15, -0x1

    cmp-long v4, v8, v2

    if-ltz v4, :cond_0

    move-object v2, v14

    goto :goto_0

    :cond_0
    iget-wide v4, v1, Lcom/daaw/pa6;->g:J

    cmp-long v6, v4, v15

    sub-long/2addr v2, v8

    if-eqz v6, :cond_1

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    :cond_1
    move-wide v10, v2

    new-instance v2, Lcom/daaw/pa6;

    iget-object v4, v1, Lcom/daaw/pa6;->a:Landroid/net/Uri;

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v3, v2

    move-wide v6, v8

    invoke-direct/range {v3 .. v13}, Lcom/daaw/pa6;-><init>(Landroid/net/Uri;[BJJJLjava/lang/String;I)V

    :goto_0
    iget-wide v3, v1, Lcom/daaw/pa6;->g:J

    cmp-long v5, v3, v15

    if-eqz v5, :cond_2

    iget-wide v5, v1, Lcom/daaw/pa6;->f:J

    add-long/2addr v5, v3

    iget-wide v3, v0, Lcom/daaw/y54;->b:J

    cmp-long v7, v5, v3

    if-gtz v7, :cond_2

    goto :goto_2

    :cond_2
    iget-wide v3, v0, Lcom/daaw/y54;->b:J

    iget-wide v5, v1, Lcom/daaw/pa6;->f:J

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v22

    iget-wide v3, v1, Lcom/daaw/pa6;->g:J

    cmp-long v5, v3, v15

    if-eqz v5, :cond_3

    iget-wide v5, v1, Lcom/daaw/pa6;->f:J

    add-long/2addr v5, v3

    iget-wide v7, v0, Lcom/daaw/y54;->b:J

    sub-long/2addr v5, v7

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    move-wide/from16 v24, v3

    goto :goto_1

    :cond_3
    move-wide/from16 v24, v15

    :goto_1
    new-instance v14, Lcom/daaw/pa6;

    iget-object v3, v1, Lcom/daaw/pa6;->a:Landroid/net/Uri;

    const/16 v19, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v17, v14

    move-object/from16 v18, v3

    move-wide/from16 v20, v22

    invoke-direct/range {v17 .. v27}, Lcom/daaw/pa6;-><init>(Landroid/net/Uri;[BJJJLjava/lang/String;I)V

    :goto_2
    const-wide/16 v3, 0x0

    if-eqz v2, :cond_4

    iget-object v5, v0, Lcom/daaw/y54;->a:Lcom/daaw/p46;

    invoke-interface {v5, v2}, Lcom/daaw/p46;->g(Lcom/daaw/pa6;)J

    move-result-wide v5

    goto :goto_3

    :cond_4
    move-wide v5, v3

    :goto_3
    if-eqz v14, :cond_5

    iget-object v2, v0, Lcom/daaw/y54;->c:Lcom/daaw/p46;

    invoke-interface {v2, v14}, Lcom/daaw/p46;->g(Lcom/daaw/pa6;)J

    move-result-wide v3

    :cond_5
    iget-wide v1, v1, Lcom/daaw/pa6;->f:J

    iput-wide v1, v0, Lcom/daaw/y54;->d:J

    cmp-long v1, v5, v15

    if-eqz v1, :cond_7

    cmp-long v1, v3, v15

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    add-long/2addr v5, v3

    return-wide v5

    :cond_7
    :goto_4
    return-wide v15
.end method

.method public final zzc()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y54;->e:Landroid/net/Uri;

    return-object v0
.end method

.method public final zzd()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/y54;->a:Lcom/daaw/p46;

    invoke-interface {v0}, Lcom/daaw/p46;->zzd()V

    iget-object v0, p0, Lcom/daaw/y54;->c:Lcom/daaw/p46;

    invoke-interface {v0}, Lcom/daaw/p46;->zzd()V

    return-void
.end method

.method public final zze()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lcom/daaw/b27;->d()Lcom/daaw/b27;

    move-result-object v0

    return-object v0
.end method
