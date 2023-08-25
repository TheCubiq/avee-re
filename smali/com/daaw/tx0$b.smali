.class public Lcom/daaw/tx0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tx0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final r:Landroid/net/Uri;


# instance fields
.field public final a:Landroid/net/Uri;

.field public b:Ljava/lang/String;

.field public c:Z

.field public d:J

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:J

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:J

.field public q:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "content://media/external/audio/albumart"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/daaw/tx0$b;->r:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tx0$b;->a:Landroid/net/Uri;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/tx0$b;->c:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/tx0$b;->d:J

    const-string v2, ""

    iput-object v2, p0, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    iput-object v2, p0, Lcom/daaw/tx0$b;->f:Ljava/lang/String;

    iput-wide v0, p0, Lcom/daaw/tx0$b;->g:J

    iput-object v2, p0, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    const-wide/16 v3, -0x1

    iput-wide v3, p0, Lcom/daaw/tx0$b;->i:J

    iput p1, p0, Lcom/daaw/tx0$b;->j:I

    iput p1, p0, Lcom/daaw/tx0$b;->k:I

    iput p1, p0, Lcom/daaw/tx0$b;->l:I

    iput p1, p0, Lcom/daaw/tx0$b;->m:I

    iput p1, p0, Lcom/daaw/tx0$b;->n:I

    iput p1, p0, Lcom/daaw/tx0$b;->o:I

    iput-wide v0, p0, Lcom/daaw/tx0$b;->p:J

    iput-object v2, p0, Lcom/daaw/tx0$b;->q:Ljava/lang/String;

    return-void
.end method

.method public static j(Landroid/net/Uri;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p0

    const-string v0, "https"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public a(Landroid/content/ContentResolver;)V
    .locals 10

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/tx0$b;->q:Ljava/lang/String;

    if-eqz p1, :cond_2

    sget-boolean v0, Lcom/daaw/g2;->a:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Landroid/provider/MediaStore$Audio$Albums;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v0, "_id"

    const-string v7, "album_art"

    filled-new-array {v0, v7}, [Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    iget-wide v8, p0, Lcom/daaw/tx0$b;->g:J

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v5, v0

    const/4 v6, 0x0

    const-string v4, "_id=?"

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lcom/daaw/dp0;->e(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/tx0$b;->q:Ljava/lang/String;

    :cond_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_2
    :goto_0
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/tx0$b;->h()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    const/16 v2, 0x2d

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v2, 0x3

    if-ge v0, v2, :cond_1

    iget-object v0, p0, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    const-string v3, "_-_"

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    :cond_1
    const/4 v3, 0x0

    const/16 v4, 0x20

    if-ge v0, v2, :cond_4

    iget-object v0, p0, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    if-eqz v1, :cond_3

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    goto :goto_1

    :cond_3
    const-string v1, "__"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    :cond_4
    :goto_1
    if-ge v0, v2, :cond_5

    iget-object v0, p0, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    return-object v0

    :cond_5
    iget-object v1, p0, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v4, :cond_6

    add-int/lit8 v0, v0, -0x1

    :cond_6
    iget-object v1, p0, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 5

    iget-wide v0, p0, Lcom/daaw/tx0$b;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://media/external/audio/media/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/daaw/tx0$b;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "/albumart"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tx0$b;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/tx0$b;->c()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tx0$b;->q:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/daaw/tx0$b;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/tx0$b;->a:Landroid/net/Uri;

    check-cast p1, Lcom/daaw/tx0$b;

    iget-object p1, p1, Lcom/daaw/tx0$b;->a:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/daaw/tx0$b;->j:I

    div-int/lit16 v0, v0, 0x3e8

    return v0
.end method

.method public g()Z
    .locals 5

    iget-wide v0, p0, Lcom/daaw/tx0$b;->i:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h()Z
    .locals 5

    iget-wide v0, p0, Lcom/daaw/tx0$b;->i:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()Z
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/tx0$b;->h()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p0, Lcom/daaw/tx0$b;->i:J

    const-wide/16 v2, -0x2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
