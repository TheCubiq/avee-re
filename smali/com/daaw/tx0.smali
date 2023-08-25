.class public Lcom/daaw/tx0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/tx0$a;,
        Lcom/daaw/tx0$c;,
        Lcom/daaw/tx0$b;,
        Lcom/daaw/tx0$d;
    }
.end annotation


# static fields
.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lcom/daaw/tx0$b;

.field public static final i:Lcom/daaw/tx0$b;

.field public static final j:Lcom/daaw/tx0$b;

.field public static final k:Lcom/daaw/tx0;

.field public static l:Ljava/lang/String;

.field public static m:Ljava/lang/String;


# instance fields
.field public a:Landroid/net/Uri;

.field public b:Ljava/lang/String;

.field public volatile c:Lcom/daaw/tx0$b;

.field public volatile d:Lcom/daaw/tx0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    sget-boolean v0, Lcom/daaw/br1;->a:Z

    const-string v0, "duration"

    sput-object v0, Lcom/daaw/tx0;->e:Ljava/lang/String;

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "_id"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "artist"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "album"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "title"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    aput-object v0, v1, v2

    const/4 v0, 0x5

    const-string v2, "mime_type"

    aput-object v2, v1, v0

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/daaw/tx0;->f:Ljava/util/List;

    const-string v0, "album_id"

    const-string v1, "artist_id"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/daaw/tx0;->g:Ljava/util/List;

    new-instance v0, Lcom/daaw/tx0$b;

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-direct {v0, v1}, Lcom/daaw/tx0$b;-><init>(Landroid/net/Uri;)V

    sput-object v0, Lcom/daaw/tx0;->h:Lcom/daaw/tx0$b;

    new-instance v1, Lcom/daaw/tx0$b;

    sget-object v2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-direct {v1, v2}, Lcom/daaw/tx0$b;-><init>(Landroid/net/Uri;)V

    sput-object v1, Lcom/daaw/tx0;->i:Lcom/daaw/tx0$b;

    new-instance v1, Lcom/daaw/tx0$b;

    sget-object v2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-direct {v1, v2}, Lcom/daaw/tx0$b;-><init>(Landroid/net/Uri;)V

    sput-object v1, Lcom/daaw/tx0;->j:Lcom/daaw/tx0$b;

    new-instance v1, Lcom/daaw/tx0;

    invoke-direct {v1, v0}, Lcom/daaw/tx0;-><init>(Lcom/daaw/tx0$b;)V

    sput-object v1, Lcom/daaw/tx0;->k:Lcom/daaw/tx0;

    const/4 v0, 0x0

    sput-object v0, Lcom/daaw/tx0;->l:Ljava/lang/String;

    sput-object v0, Lcom/daaw/tx0;->m:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(JLandroid/net/Uri;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p3, p1}, Lcom/daaw/tx0;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;)V
    .locals 0

    if-nez p3, :cond_0

    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    goto :goto_0

    :cond_0
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/daaw/tx0;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-nez p3, :cond_0

    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    goto :goto_0

    :cond_0
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    invoke-direct {p0, p1, p4}, Lcom/daaw/tx0;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/daaw/tx0;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object v0, p0, Lcom/daaw/tx0;->a:Landroid/net/Uri;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/tx0;->d:Lcom/daaw/tx0$a;

    if-nez p1, :cond_0

    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    :cond_0
    iput-object p1, p0, Lcom/daaw/tx0;->a:Landroid/net/Uri;

    iput-object p2, p0, Lcom/daaw/tx0;->b:Ljava/lang/String;

    sget-object p1, Lcom/daaw/tx0;->i:Lcom/daaw/tx0$b;

    iput-object p1, p0, Lcom/daaw/tx0;->c:Lcom/daaw/tx0$b;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/tx0$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object v0, p0, Lcom/daaw/tx0;->a:Landroid/net/Uri;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/tx0;->d:Lcom/daaw/tx0$a;

    iput-object p1, p0, Lcom/daaw/tx0;->c:Lcom/daaw/tx0$b;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/daaw/tx0;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/daaw/tx0;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method public static c(Lcom/daaw/tx0$b;Landroid/content/Context;Landroid/net/Uri;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/daaw/wx0;->d(Landroid/content/Context;Landroid/net/Uri;Lcom/daaw/tx0$b;)Lcom/daaw/tx0$c;

    move-result-object p1

    iget-object p2, p1, Lcom/daaw/tx0$c;->e:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget-boolean p2, p1, Lcom/daaw/tx0$c;->b:Z

    iput-boolean p2, p0, Lcom/daaw/tx0$b;->c:Z

    iget-object p2, p1, Lcom/daaw/tx0$c;->e:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    iget-object p2, p1, Lcom/daaw/tx0$c;->h:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, Lcom/daaw/tx0;->m:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-object p2, p1, Lcom/daaw/tx0$c;->f:Ljava/lang/String;

    :goto_0
    iput-object p2, p0, Lcom/daaw/tx0$b;->f:Ljava/lang/String;

    iget-object p2, p1, Lcom/daaw/tx0$c;->g:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    sget-object p2, Lcom/daaw/tx0;->l:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iget-object p2, p1, Lcom/daaw/tx0$c;->g:Ljava/lang/String;

    :goto_1
    iput-object p2, p0, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    iget p2, p1, Lcom/daaw/tx0$c;->i:I

    iput p2, p0, Lcom/daaw/tx0$b;->j:I

    iget p2, p1, Lcom/daaw/tx0$c;->l:I

    iput p2, p0, Lcom/daaw/tx0$b;->m:I

    iget p2, p1, Lcom/daaw/tx0$c;->m:I

    iput p2, p0, Lcom/daaw/tx0$b;->n:I

    iget p1, p1, Lcom/daaw/tx0$c;->n:I

    iput p1, p0, Lcom/daaw/tx0$b;->o:I

    const/4 p0, 0x1

    return p0
.end method

.method public static f(Z)[Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lcom/daaw/tx0;->f:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    if-eqz p0, :cond_0

    sget-object p0, Lcom/daaw/tx0;->g:Ljava/util/List;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_0
    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static o(Landroid/net/Uri;Landroid/content/ContentResolver;)Z
    .locals 3

    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v0, p0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v2, "content"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1, p0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    return v1

    :cond_3
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_4

    return v1

    :cond_4
    const-string p1, "audio"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static q(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Lcom/daaw/tx0;

    const-wide/16 v3, -0x1

    invoke-direct {v2, v3, v4, v1}, Lcom/daaw/tx0;-><init>(JLjava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lcom/daaw/tx0$b;
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v7, p2

    const-string v8, "<unknown>"

    :try_start_0
    sget-object v1, Lcom/daaw/tx0;->m:Ljava/lang/String;

    if-nez v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1002c4

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/daaw/tx0;->l:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1002c3

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/daaw/tx0;->m:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "Unknown artist"

    sput-object v1, Lcom/daaw/tx0;->l:Ljava/lang/String;

    const-string v1, "Unknown album"

    sput-object v1, Lcom/daaw/tx0;->m:Ljava/lang/String;

    :cond_0
    :goto_0
    new-instance v9, Lcom/daaw/tx0$b;

    invoke-direct {v9, v7}, Lcom/daaw/tx0$b;-><init>(Landroid/net/Uri;)V

    if-eqz v7, :cond_22

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    if-ne v7, v1, :cond_1

    goto/16 :goto_12

    :cond_1
    invoke-static/range {p2 .. p2}, Lcom/daaw/tx0$b;->j(Landroid/net/Uri;)Z

    move-result v1

    iput-boolean v1, v9, Lcom/daaw/tx0$b;->c:Z

    if-eqz v0, :cond_2

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    move-object v15, v1

    goto :goto_1

    :cond_2
    const/4 v15, 0x0

    :goto_1
    const/4 v14, 0x1

    const/4 v13, 0x0

    if-eqz v15, :cond_e

    invoke-static {v7, v15}, Lcom/daaw/tx0;->o(Landroid/net/Uri;Landroid/content/ContentResolver;)Z

    move-result v1

    invoke-static {v1}, Lcom/daaw/tx0;->f(Z)[Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    const-string v4, "content"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v15

    move-object/from16 v2, p2

    invoke-static/range {v1 .. v6}, Lcom/daaw/dp0;->e(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cursor is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object v5, v15

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x1

    goto/16 :goto_8

    :cond_3
    iget-boolean v2, v9, Lcom/daaw/tx0$b;->c:Z

    if-eqz v2, :cond_5

    if-eqz p3, :cond_4

    move-object/from16 v1, p3

    goto :goto_2

    :cond_4
    invoke-static/range {p2 .. p2}, Lcom/daaw/br1;->G(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v3, v2

    move-object v5, v15

    const/4 v6, 0x0

    const/4 v10, 0x1

    move-object v2, v1

    const/4 v1, 0x0

    goto/16 :goto_8

    :cond_5
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_e

    if-eqz v1, :cond_6

    sget-object v1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    goto :goto_3

    :cond_6
    sget-object v1, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    :goto_3
    new-array v4, v14, [Ljava/lang/String;

    aput-object v2, v4, v13

    const/16 v16, 0x0

    const-string v5, "_data=?"

    move-object v11, v15

    move-object v12, v1

    const/4 v6, 0x0

    move-object v13, v3

    const/4 v10, 0x1

    move-object v14, v5

    move-object v5, v15

    move-object v15, v4

    invoke-static/range {v11 .. v16}, Lcom/daaw/dp0;->e(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    if-eqz v11, :cond_8

    invoke-interface {v11}, Landroid/database/Cursor;->getCount()I

    move-result v12

    if-gtz v12, :cond_7

    goto :goto_4

    :cond_7
    move-object v4, v11

    goto :goto_5

    :cond_8
    :goto_4
    if-eqz v11, :cond_9

    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    :cond_9
    const/16 v16, 0x0

    const-string v14, "_data=? COLLATE NOCASE"

    move-object v11, v5

    move-object v12, v1

    move-object v13, v3

    move-object v15, v4

    invoke-static/range {v11 .. v16}, Lcom/daaw/dp0;->e(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    :goto_5
    if-eqz v4, :cond_a

    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    move-result v11

    if-gtz v11, :cond_d

    :cond_a
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v11

    const-string v12, "file"

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_d

    :cond_b
    :try_start_1
    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :catch_1
    const/4 v2, 0x0

    :goto_6
    if-eqz v2, :cond_d

    if-eqz v4, :cond_c

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    :cond_c
    new-array v15, v10, [Ljava/lang/String;

    aput-object v2, v15, v6

    const/16 v16, 0x0

    const-string v14, "_data=?"

    move-object v11, v5

    move-object v12, v1

    move-object v13, v3

    invoke-static/range {v11 .. v16}, Lcom/daaw/dp0;->e(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    goto :goto_7

    :cond_d
    move-object v1, v4

    goto :goto_7

    :cond_e
    move-object v5, v15

    const/4 v6, 0x0

    const/4 v10, 0x1

    const/4 v1, 0x0

    :goto_7
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_8
    const-string v4, ""

    if-eqz v1, :cond_18

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v13

    if-lez v13, :cond_18

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v13

    if-eqz v13, :cond_18

    :try_start_2
    const-string v13, "_id"

    invoke-interface {v1, v13}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    const-wide/16 v14, 0x0

    if-ltz v13, :cond_f

    invoke-interface {v1, v13}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v17

    move-wide/from16 v10, v17

    goto :goto_9

    :cond_f
    move-wide v10, v14

    :goto_9
    iput-wide v10, v9, Lcom/daaw/tx0$b;->d:J

    const-string v10, "title"

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    if-ltz v10, :cond_10

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_a

    :cond_10
    const/4 v10, 0x0

    :goto_a
    iput-object v10, v9, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    const-string v10, "album"

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    if-ltz v10, :cond_11

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_b

    :cond_11
    const/4 v10, 0x0

    :goto_b
    iput-object v10, v9, Lcom/daaw/tx0$b;->f:Ljava/lang/String;

    const-string v10, "album_id"

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    if-ltz v10, :cond_12

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    goto :goto_c

    :cond_12
    const-wide/16 v10, -0x1

    :goto_c
    iput-wide v10, v9, Lcom/daaw/tx0$b;->g:J

    const-string v10, "artist"

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    if-ltz v10, :cond_13

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_d

    :cond_13
    const/4 v10, 0x0

    :goto_d
    iput-object v10, v9, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    const-string v10, "artist_id"

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    if-ltz v10, :cond_14

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    goto :goto_e

    :cond_14
    const-wide/16 v10, -0x1

    :goto_e
    iput-wide v10, v9, Lcom/daaw/tx0$b;->i:J

    sget-object v10, Lcom/daaw/tx0;->e:Ljava/lang/String;

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    if-ltz v10, :cond_15

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    goto :goto_f

    :cond_15
    const/4 v10, 0x0

    :goto_f
    iput v10, v9, Lcom/daaw/tx0$b;->j:I

    iput v6, v9, Lcom/daaw/tx0$b;->m:I

    iput v6, v9, Lcom/daaw/tx0$b;->n:I

    iput v6, v9, Lcom/daaw/tx0$b;->o:I

    iput-wide v14, v9, Lcom/daaw/tx0$b;->p:J

    iput-object v4, v9, Lcom/daaw/tx0$b;->q:Ljava/lang/String;

    iget-object v10, v9, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_16

    sget-object v10, Lcom/daaw/tx0;->l:Ljava/lang/String;

    iput-object v10, v9, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    const-wide/16 v10, -0x1

    iput-wide v10, v9, Lcom/daaw/tx0$b;->i:J

    :cond_16
    iget-object v10, v9, Lcom/daaw/tx0$b;->f:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_17

    sget-object v8, Lcom/daaw/tx0;->m:Ljava/lang/String;

    iput-object v8, v9, Lcom/daaw/tx0$b;->f:Ljava/lang/String;

    const-wide/16 v10, -0x1

    iput-wide v10, v9, Lcom/daaw/tx0$b;->g:J
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :cond_17
    const/4 v14, 0x0

    goto :goto_10

    :catch_2
    :cond_18
    const/4 v14, 0x1

    :goto_10
    const-string v6, "unknown"

    if-eqz v14, :cond_1c

    invoke-static {v9, v0, v7}, Lcom/daaw/tx0;->c(Lcom/daaw/tx0$b;Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_1c

    if-nez v2, :cond_19

    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v2

    :cond_19
    if-nez v2, :cond_1a

    move-object v2, v6

    :cond_1a
    const-wide/16 v7, -0x1

    iput-wide v7, v9, Lcom/daaw/tx0$b;->d:J

    iput-object v2, v9, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    sget-object v0, Lcom/daaw/tx0;->m:Ljava/lang/String;

    iput-object v0, v9, Lcom/daaw/tx0$b;->f:Ljava/lang/String;

    iput-wide v7, v9, Lcom/daaw/tx0$b;->g:J

    if-nez v3, :cond_1b

    sget-object v0, Lcom/daaw/tx0;->l:Ljava/lang/String;

    iput-object v0, v9, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    iput-wide v7, v9, Lcom/daaw/tx0$b;->i:J

    goto :goto_11

    :cond_1b
    iput-object v3, v9, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    const-wide/16 v2, -0x2

    iput-wide v2, v9, Lcom/daaw/tx0$b;->i:J

    :cond_1c
    :goto_11
    iget-object v0, v9, Lcom/daaw/tx0$b;->b:Ljava/lang/String;

    if-nez v0, :cond_1d

    iput-object v4, v9, Lcom/daaw/tx0$b;->b:Ljava/lang/String;

    :cond_1d
    iget-object v0, v9, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    if-nez v0, :cond_1e

    iput-object v6, v9, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    :cond_1e
    iget-object v0, v9, Lcom/daaw/tx0$b;->f:Ljava/lang/String;

    if-nez v0, :cond_1f

    sget-object v0, Lcom/daaw/tx0;->m:Ljava/lang/String;

    iput-object v0, v9, Lcom/daaw/tx0$b;->f:Ljava/lang/String;

    :cond_1f
    iget-object v0, v9, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    if-nez v0, :cond_20

    sget-object v0, Lcom/daaw/tx0;->l:Ljava/lang/String;

    iput-object v0, v9, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    :cond_20
    if-eqz v1, :cond_21

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_21
    invoke-virtual {v9, v5}, Lcom/daaw/tx0$b;->a(Landroid/content/ContentResolver;)V

    :cond_22
    :goto_12
    return-object v9
.end method

.method public final b(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lcom/daaw/tx0$b;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/tx0;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lcom/daaw/tx0$b;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/daaw/tx0;)Z
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/daaw/tx0;->a:Landroid/net/Uri;

    iget-object v0, p0, Lcom/daaw/tx0;->a:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public varargs e([Ljava/lang/Object;)Lcom/daaw/tx0$b;
    .locals 3

    const/4 v0, 0x0

    aget-object v0, p1, v0

    check-cast v0, Landroid/content/Context;

    const/4 v1, 0x1

    aget-object v1, p1, v1

    check-cast v1, Landroid/net/Uri;

    const/4 v2, 0x2

    aget-object p1, p1, v2

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, v0, v1, p1}, Lcom/daaw/tx0;->b(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lcom/daaw/tx0$b;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/daaw/tx0;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/tx0;

    invoke-virtual {p0, p1}, Lcom/daaw/tx0;->d(Lcom/daaw/tx0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tx0;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()Lcom/daaw/tx0$b;
    .locals 3

    iget-object v0, p0, Lcom/daaw/tx0;->c:Lcom/daaw/tx0$b;

    sget-object v1, Lcom/daaw/tx0;->i:Lcom/daaw/tx0$b;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iput-object v2, p0, Lcom/daaw/tx0;->d:Lcom/daaw/tx0$a;

    invoke-virtual {p0, v2}, Lcom/daaw/tx0;->s(Landroid/os/Handler;)V

    sget-object v0, Lcom/daaw/tx0;->h:Lcom/daaw/tx0$b;

    return-object v0

    :cond_0
    sget-object v1, Lcom/daaw/tx0;->j:Lcom/daaw/tx0$b;

    iput-object v2, p0, Lcom/daaw/tx0;->d:Lcom/daaw/tx0$a;

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/daaw/tx0;->h:Lcom/daaw/tx0$b;

    :cond_1
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/tx0;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    return v0
.end method

.method public i(Landroid/os/Handler;Lcom/daaw/tx0$d;Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/tx0$b;
    .locals 2

    iget-object v0, p0, Lcom/daaw/tx0;->c:Lcom/daaw/tx0$b;

    sget-object v1, Lcom/daaw/tx0;->i:Lcom/daaw/tx0$b;

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/daaw/tx0$a;

    invoke-direct {v0, p0, p2, p3, p4}, Lcom/daaw/tx0$a;-><init>(Lcom/daaw/tx0;Lcom/daaw/tx0$d;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/tx0;->d:Lcom/daaw/tx0$a;

    invoke-virtual {p0, p1}, Lcom/daaw/tx0;->s(Landroid/os/Handler;)V

    :goto_0
    sget-object p1, Lcom/daaw/tx0;->h:Lcom/daaw/tx0$b;

    return-object p1

    :cond_0
    sget-object p1, Lcom/daaw/tx0;->j:Lcom/daaw/tx0$b;

    if-ne v0, p1, :cond_1

    new-instance p1, Lcom/daaw/tx0$a;

    invoke-direct {p1, p0, p2, p3, p4}, Lcom/daaw/tx0$a;-><init>(Lcom/daaw/tx0;Lcom/daaw/tx0$d;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/tx0;->d:Lcom/daaw/tx0$a;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/tx0;->d:Lcom/daaw/tx0$a;

    return-object v0
.end method

.method public j(Landroid/content/Context;)Lcom/daaw/tx0$b;
    .locals 2

    iget-object v0, p0, Lcom/daaw/tx0;->c:Lcom/daaw/tx0$b;

    sget-object v1, Lcom/daaw/tx0;->h:Lcom/daaw/tx0$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/daaw/tx0;->j:Lcom/daaw/tx0$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/daaw/tx0;->i:Lcom/daaw/tx0$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/tx0;->a:Landroid/net/Uri;

    iget-object v1, p0, Lcom/daaw/tx0;->b:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/tx0;->b(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lcom/daaw/tx0$b;

    move-result-object p1

    return-object p1
.end method

.method public k(Landroid/content/Context;)Lcom/daaw/tx0$c;
    .locals 2

    invoke-virtual {p0, p1}, Lcom/daaw/tx0;->j(Landroid/content/Context;)Lcom/daaw/tx0$b;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/tx0;->a:Landroid/net/Uri;

    invoke-static {p1, v1, v0}, Lcom/daaw/wx0;->d(Landroid/content/Context;Landroid/net/Uri;Lcom/daaw/tx0$b;)Lcom/daaw/tx0$c;

    move-result-object p1

    return-object p1
.end method

.method public l()J
    .locals 5

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/tx0;->j(Landroid/content/Context;)Lcom/daaw/tx0$b;

    move-result-object v0

    iget-wide v3, v0, Lcom/daaw/tx0$b;->d:J

    cmp-long v0, v3, v1

    if-lez v0, :cond_1

    return-wide v3

    :cond_1
    return-wide v1
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tx0;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public n()Lcom/daaw/wd0;
    .locals 2

    new-instance v0, Lcom/daaw/lo0;

    iget-object v1, p0, Lcom/daaw/tx0;->a:Landroid/net/Uri;

    invoke-direct {v0, v1}, Lcom/daaw/lo0;-><init>(Landroid/net/Uri;)V

    return-object v0
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/tx0;->a:Landroid/net/Uri;

    invoke-static {v0}, Lcom/daaw/tx0$b;->j(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public r(Lcom/daaw/tx0$b;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/tx0;->d:Lcom/daaw/tx0$a;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/tx0;->d:Lcom/daaw/tx0$a;

    iput-object p1, p0, Lcom/daaw/tx0;->c:Lcom/daaw/tx0$b;

    if-eqz v0, :cond_0

    iget-object p1, v0, Lcom/daaw/tx0$a;->a:Lcom/daaw/tx0$d;

    iget-object v1, p0, Lcom/daaw/tx0;->c:Lcom/daaw/tx0$b;

    iget-object v2, v0, Lcom/daaw/tx0$a;->b:Ljava/lang/Object;

    iget-object v0, v0, Lcom/daaw/tx0$a;->c:Ljava/lang/Object;

    invoke-interface {p1, v1, v2, v0}, Lcom/daaw/tx0$d;->a(Lcom/daaw/tx0$b;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final s(Landroid/os/Handler;)V
    .locals 6

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v1, Lcom/daaw/tx0;->j:Lcom/daaw/tx0$b;

    iput-object v1, p0, Lcom/daaw/tx0;->c:Lcom/daaw/tx0$b;

    iget-object v2, p0, Lcom/daaw/tx0;->a:Landroid/net/Uri;

    iget-object v3, p0, Lcom/daaw/tx0;->b:Ljava/lang/String;

    new-instance v5, Lcom/daaw/sx0;

    invoke-direct {v5, p0}, Lcom/daaw/sx0;-><init>(Lcom/daaw/tx0;)V

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Lcom/daaw/wx0;->c(Landroid/content/Context;Lcom/daaw/tx0;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Handler;Lcom/daaw/e0;)V

    return-void
.end method
