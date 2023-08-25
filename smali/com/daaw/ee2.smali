.class public final Lcom/daaw/ee2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/net/Uri;

.field public final c:Lcom/daaw/ng2;

.field public final d:Lcom/daaw/pn2;

.field public final e:Ljava/util/List;

.field public final f:Lcom/daaw/y17;

.field public final g:Lcom/daaw/ar2;

.field public final h:Lcom/daaw/y13;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/ng2;

    invoke-direct {v0}, Lcom/daaw/ng2;-><init>()V

    iput-object v0, p0, Lcom/daaw/ee2;->c:Lcom/daaw/ng2;

    new-instance v0, Lcom/daaw/pn2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/pn2;-><init>(Lcom/daaw/jm2;)V

    iput-object v0, p0, Lcom/daaw/ee2;->d:Lcom/daaw/pn2;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ee2;->e:Ljava/util/List;

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ee2;->f:Lcom/daaw/y17;

    new-instance v0, Lcom/daaw/ar2;

    invoke-direct {v0}, Lcom/daaw/ar2;-><init>()V

    iput-object v0, p0, Lcom/daaw/ee2;->g:Lcom/daaw/ar2;

    sget-object v0, Lcom/daaw/y13;->c:Lcom/daaw/y13;

    iput-object v0, p0, Lcom/daaw/ee2;->h:Lcom/daaw/y13;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/daaw/ee2;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ee2;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final b(Landroid/net/Uri;)Lcom/daaw/ee2;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ee2;->b:Landroid/net/Uri;

    return-object p0
.end method

.method public final c()Lcom/daaw/f53;
    .locals 21

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/daaw/ee2;->b:Landroid/net/Uri;

    const/4 v11, 0x0

    if-eqz v2, :cond_0

    new-instance v12, Lcom/daaw/ny2;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v6, v0, Lcom/daaw/ee2;->e:Ljava/util/List;

    const/4 v7, 0x0

    iget-object v8, v0, Lcom/daaw/ee2;->f:Lcom/daaw/y17;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v12

    invoke-direct/range {v1 .. v10}, Lcom/daaw/ny2;-><init>(Landroid/net/Uri;Ljava/lang/String;Lcom/daaw/ro2;Lcom/daaw/zc2;Ljava/util/List;Ljava/lang/String;Lcom/daaw/y17;Ljava/lang/Object;Lcom/daaw/nw2;)V

    move-object/from16 v16, v12

    goto :goto_0

    :cond_0
    move-object/from16 v16, v11

    :goto_0
    new-instance v1, Lcom/daaw/f53;

    iget-object v2, v0, Lcom/daaw/ee2;->a:Ljava/lang/String;

    if-nez v2, :cond_1

    const-string v2, ""

    :cond_1
    move-object v14, v2

    iget-object v2, v0, Lcom/daaw/ee2;->c:Lcom/daaw/ng2;

    new-instance v15, Lcom/daaw/fl2;

    invoke-direct {v15, v2, v11}, Lcom/daaw/fl2;-><init>(Lcom/daaw/ng2;Lcom/daaw/bk2;)V

    iget-object v2, v0, Lcom/daaw/ee2;->g:Lcom/daaw/ar2;

    new-instance v3, Lcom/daaw/ht2;

    invoke-direct {v3, v2, v11}, Lcom/daaw/ht2;-><init>(Lcom/daaw/ar2;Lcom/daaw/fs2;)V

    sget-object v18, Lcom/daaw/gc3;->v:Lcom/daaw/gc3;

    iget-object v2, v0, Lcom/daaw/ee2;->h:Lcom/daaw/y13;

    const/16 v20, 0x0

    move-object v13, v1

    move-object/from16 v17, v3

    move-object/from16 v19, v2

    invoke-direct/range {v13 .. v20}, Lcom/daaw/f53;-><init>(Ljava/lang/String;Lcom/daaw/fl2;Lcom/daaw/ny2;Lcom/daaw/ht2;Lcom/daaw/gc3;Lcom/daaw/y13;Lcom/daaw/d43;)V

    return-object v1
.end method
