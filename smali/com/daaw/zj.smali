.class public Lcom/daaw/zj;
.super Lcom/daaw/yj;
.source ""

# interfaces
.implements Lcom/daaw/ts1$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/zj$s;,
        Lcom/daaw/zj$t;,
        Lcom/daaw/zj$r;
    }
.end annotation


# static fields
.field public static final P:[Ljava/lang/String;


# instance fields
.field public C:[Lcom/daaw/l0;

.field public D:Ljava/lang/String;

.field public E:I

.field public F:Ljava/io/File;

.field public G:Ljava/lang/String;

.field public H:Ljava/lang/String;

.field public I:Ljava/lang/String;

.field public J:Z

.field public K:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/zj$s;",
            ">;"
        }
    .end annotation
.end field

.field public L:[Lcom/daaw/l0;

.field public M:[Lcom/daaw/l0;

.field public N:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/oc0;",
            ">;"
        }
    .end annotation
.end field

.field public O:Lcom/daaw/n91$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "_display_name"

    aput-object v2, v0, v1

    sget-object v1, Lcom/daaw/tx0;->e:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/daaw/zj;->P:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;I)V
    .locals 9

    new-instance v3, Lcom/daaw/tr1;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/daaw/tr1;-><init>(Ljava/lang/Object;)V

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/yj;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/me0;II)V

    const/4 p3, 0x6

    new-array v0, p3, [Lcom/daaw/l0;

    new-instance v1, Lcom/daaw/zj$i;

    invoke-direct {v1, p0}, Lcom/daaw/zj$i;-><init>(Lcom/daaw/zj;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lcom/daaw/zj$j;

    invoke-direct {v1, p0}, Lcom/daaw/zj$j;-><init>(Lcom/daaw/zj;)V

    const/4 v3, 0x1

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/zj$k;

    invoke-direct {v1, p0}, Lcom/daaw/zj$k;-><init>(Lcom/daaw/zj;)V

    const/4 v4, 0x2

    aput-object v1, v0, v4

    new-instance v1, Lcom/daaw/zj$l;

    invoke-direct {v1, p0}, Lcom/daaw/zj$l;-><init>(Lcom/daaw/zj;)V

    const/4 v5, 0x3

    aput-object v1, v0, v5

    new-instance v1, Lcom/daaw/zj$m;

    invoke-direct {v1, p0}, Lcom/daaw/zj$m;-><init>(Lcom/daaw/zj;)V

    const/4 v6, 0x4

    aput-object v1, v0, v6

    new-instance v1, Lcom/daaw/zj$n;

    invoke-direct {v1, p0}, Lcom/daaw/zj$n;-><init>(Lcom/daaw/zj;)V

    const/4 v7, 0x5

    aput-object v1, v0, v7

    iput-object v0, p0, Lcom/daaw/zj;->C:[Lcom/daaw/l0;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/zj;->D:Ljava/lang/String;

    const/4 v1, 0x7

    new-array v1, v1, [Lcom/daaw/l0;

    new-instance v8, Lcom/daaw/zj$o;

    invoke-direct {v8, p0}, Lcom/daaw/zj$o;-><init>(Lcom/daaw/zj;)V

    aput-object v8, v1, v2

    new-instance v8, Lcom/daaw/zj$p;

    invoke-direct {v8, p0}, Lcom/daaw/zj$p;-><init>(Lcom/daaw/zj;)V

    aput-object v8, v1, v3

    new-instance v8, Lcom/daaw/zj$q;

    invoke-direct {v8, p0}, Lcom/daaw/zj$q;-><init>(Lcom/daaw/zj;)V

    aput-object v8, v1, v4

    new-instance v8, Lcom/daaw/zj$a;

    invoke-direct {v8, p0}, Lcom/daaw/zj$a;-><init>(Lcom/daaw/zj;)V

    aput-object v8, v1, v5

    new-instance v5, Lcom/daaw/zj$b;

    invoke-direct {v5, p0}, Lcom/daaw/zj$b;-><init>(Lcom/daaw/zj;)V

    aput-object v5, v1, v6

    new-instance v5, Lcom/daaw/zj$c;

    invoke-direct {v5, p0}, Lcom/daaw/zj$c;-><init>(Lcom/daaw/zj;)V

    aput-object v5, v1, v7

    new-instance v5, Lcom/daaw/zj$d;

    invoke-direct {v5, p0}, Lcom/daaw/zj$d;-><init>(Lcom/daaw/zj;)V

    aput-object v5, v1, p3

    iput-object v1, p0, Lcom/daaw/zj;->L:[Lcom/daaw/l0;

    new-array p3, v4, [Lcom/daaw/l0;

    new-instance v1, Lcom/daaw/zj$e;

    invoke-direct {v1, p0}, Lcom/daaw/zj$e;-><init>(Lcom/daaw/zj;)V

    aput-object v1, p3, v2

    new-instance v1, Lcom/daaw/zj$f;

    invoke-direct {v1, p0}, Lcom/daaw/zj$f;-><init>(Lcom/daaw/zj;)V

    aput-object v1, p3, v3

    iput-object p3, p0, Lcom/daaw/zj;->M:[Lcom/daaw/l0;

    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/daaw/zj;->N:Ljava/lang/ref/WeakReference;

    new-instance p3, Lcom/daaw/zj$g;

    invoke-direct {p3, p0}, Lcom/daaw/zj$g;-><init>(Lcom/daaw/zj;)V

    iput-object p3, p0, Lcom/daaw/zj;->O:Lcom/daaw/n91$b;

    iput p4, p0, Lcom/daaw/zj;->E:I

    iput-object p2, p0, Lcom/daaw/zj;->F:Ljava/io/File;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/daaw/zj;->K:Ljava/util/List;

    iget-object p2, p0, Lcom/daaw/zj;->F:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/zj;->G:Ljava/lang/String;

    iget-object p2, p0, Lcom/daaw/zj;->F:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/zj;->H:Ljava/lang/String;

    iget-object p2, p0, Lcom/daaw/zj;->F:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/zj;->I:Ljava/lang/String;

    iget-object p2, p0, Lcom/daaw/zj;->F:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result p2

    iput-boolean p2, p0, Lcom/daaw/zj;->J:Z

    iget-object p2, p0, Lcom/daaw/zj;->F:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/zj;->H:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-lez p2, :cond_0

    iget-object p2, p0, Lcom/daaw/zj;->H:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    sub-int/2addr p3, v3

    invoke-virtual {p2, p3}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 p3, 0x2f

    if-eq p2, p3, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Lcom/daaw/zj;->H:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "/"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/zj;->H:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p2

    sget-object p3, Lcom/daaw/yj;->r:Lcom/daaw/xw1;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    const-string v0, ""

    invoke-virtual {p3, p4, p2, v0}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/zj;->o(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic P(Lcom/daaw/zj;)I
    .locals 0

    iget p0, p0, Lcom/daaw/zj;->E:I

    return p0
.end method

.method public static synthetic Q(Lcom/daaw/zj;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/zj;->K:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic R(Lcom/daaw/zj;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/yj;->C(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic S(Lcom/daaw/zj;ZZ)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/yj;->N(ZZ)V

    return-void
.end method

.method public static synthetic T(Lcom/daaw/zj;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/yj;->C(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic U(Lcom/daaw/zj;ZZ)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/yj;->N(ZZ)V

    return-void
.end method

.method public static synthetic V(Lcom/daaw/zj;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/yj;->C(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static W(Ljava/util/List;Lcom/daaw/tx0;I)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/zj$s;",
            ">;",
            "Lcom/daaw/tx0;",
            "I)I"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_2

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/zj$s;

    invoke-virtual {v1}, Lcom/daaw/zj$s;->h()Lcom/daaw/tx0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Lcom/daaw/tx0;->d(Lcom/daaw/tx0;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static a0(Ljava/lang/String;Ljava/util/List;Landroid/net/Uri;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/zj$s;",
            ">;",
            "Landroid/net/Uri;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    const/4 v1, 0x2

    new-array v6, v1, [Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v6, v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/%/%"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    invoke-static {}, Lcom/daaw/dx0;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    sget-object v4, Lcom/daaw/zj;->P:[Ljava/lang/String;

    const-string v5, "_data LIKE ? AND _data NOT LIKE ?"

    const/4 v7, 0x0

    move-object/from16 v3, p2

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "_id"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    const-string v2, "_display_name"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    sget-object v3, Lcom/daaw/tx0;->e:Ljava/lang/String;

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    move-object/from16 v6, p2

    invoke-static {v6, v4, v5}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v4

    new-instance v15, Lcom/daaw/tx0;

    invoke-direct {v15, v4}, Lcom/daaw/tx0;-><init>(Landroid/net/Uri;)V

    new-instance v5, Lcom/daaw/zj$s;

    const/4 v8, 0x0

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v12

    const-wide/16 v13, 0x0

    move-object v7, v5

    invoke-direct/range {v7 .. v15}, Lcom/daaw/zj$s;-><init>(ZLjava/lang/String;JLjava/lang/String;JLcom/daaw/tx0;)V

    move-object/from16 v4, p1

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-void
.end method

.method public static b0(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/daaw/zj$s;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;"
        }
    .end annotation

    if-nez p2, :cond_0

    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    invoke-direct {p2, p0}, Ljava/util/ArrayList;-><init>(I)V

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/zj$s;

    invoke-virtual {p1}, Lcom/daaw/zj$s;->h()Lcom/daaw/tx0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/zj$s;->h()Lcom/daaw/tx0;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p2
.end method

.method public static c0(Landroid/content/Context;ILcom/daaw/sd0;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Lcom/daaw/sd0;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;"
        }
    .end annotation

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/daaw/zj;->d0(Landroid/content/Context;ILcom/daaw/sd0;Ljava/lang/String;ZLjava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static d0(Landroid/content/Context;ILcom/daaw/sd0;Ljava/lang/String;ZLjava/util/List;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Lcom/daaw/sd0;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;"
        }
    .end annotation

    new-instance p4, Ljava/io/File;

    invoke-direct {p4, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 p3, 0x1

    invoke-static {p1, p2, p4, p3}, Lcom/daaw/zj;->g0(ILcom/daaw/sd0;Ljava/io/File;Z)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1, p5}, Lcom/daaw/zj;->b0(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static g0(ILcom/daaw/sd0;Ljava/io/File;Z)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/sd0;",
            "Ljava/io/File;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/daaw/zj$s;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lcom/daaw/zj$h;

    invoke-direct {v2, p0, p1}, Lcom/daaw/zj$h;-><init>(ILcom/daaw/sd0;)V

    invoke-static {v0, v1, p2, p3, v2}, Lcom/daaw/zj;->h0(Ljava/util/List;Ljava/util/List;Ljava/io/File;ZLcom/daaw/zj$r;)V

    sget-object p2, Lcom/daaw/yj;->s:Lcom/daaw/xw1;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 p3, 0x0

    invoke-virtual {p2, p0, p1, p3}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/ie1$h;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/daaw/g10;->b(Lcom/daaw/ie1$h;I)Ljava/util/Comparator;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {v1, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p0

    if-ge p1, p0, :cond_1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/zj$s;

    invoke-static {p0, p1}, Lcom/daaw/zj$s;->b(Lcom/daaw/zj$s;I)I

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    if-lez p0, :cond_2

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0

    :cond_2
    return-object v1
.end method

.method public static h0(Ljava/util/List;Ljava/util/List;Ljava/io/File;ZLcom/daaw/zj$r;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/zj$s;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/zj$s;",
            ">;",
            "Ljava/io/File;",
            "Z",
            "Lcom/daaw/zj$r;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {v3, v0, v4}, Lcom/daaw/zj;->a0(Ljava/lang/String;Ljava/util/List;Landroid/net/Uri;)V

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {v3, v0, v4}, Lcom/daaw/zj;->a0(Ljava/lang/String;Ljava/util/List;Landroid/net/Uri;)V

    :try_start_0
    array-length v0, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_3

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-eqz v6, :cond_2

    if-nez p3, :cond_2

    if-eqz v1, :cond_0

    invoke-interface {v1, v5}, Lcom/daaw/zj$r;->a(Ljava/io/File;)Z

    move-result v6

    goto :goto_1

    :cond_0
    const/4 v6, 0x1

    :goto_1
    if-eqz v6, :cond_2

    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v6

    if-eqz v6, :cond_1

    array-length v6, v6

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    :goto_2
    new-instance v15, Lcom/daaw/zj$s;

    const/4 v8, 0x1

    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    int-to-long v10, v6

    invoke-virtual {v5}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v13

    move-object v7, v15

    invoke-direct/range {v7 .. v14}, Lcom/daaw/zj$s;-><init>(ZLjava/lang/String;JLjava/lang/String;J)V

    move-object/from16 v5, p0

    invoke-interface {v5, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_2
    move-object/from16 v5, p0

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    :cond_3
    return-void
.end method


# virtual methods
.method public A()Z
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/zj;->Y(Z)Lcom/daaw/lo1;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lcom/daaw/yj;->B(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, v2}, Lcom/daaw/zj;->Y(Z)Lcom/daaw/lo1;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lcom/daaw/zj;->i0(Ljava/util/List;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Lcom/daaw/zj;->i0(Ljava/util/List;Ljava/lang/String;)V

    :goto_0
    return v0
.end method

.method public E(Landroid/content/Context;I)Lcom/daaw/ts1;
    .locals 1

    new-instance p1, Lcom/daaw/d90;

    const/16 p2, 0xb

    const/4 v0, 0x1

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/d90;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;II)V

    new-instance p2, Lcom/daaw/ts1;

    invoke-direct {p2, p1, p0}, Lcom/daaw/ts1;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;)V

    return-object p2
.end method

.method public H(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/zj;->Z(I)Lcom/daaw/zj$s;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/zj$s;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/zj$s;->f()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public X()Lcom/daaw/oc0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zj;->N:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/oc0;

    return-object v0
.end method

.method public Y(Z)Lcom/daaw/lo1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/daaw/lo1<",
            "Ljava/util/List<",
            "Lcom/daaw/zj$s;",
            ">;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/zj;->D:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/daaw/lo1;

    if-nez p1, :cond_0

    iget-object v1, p0, Lcom/daaw/zj;->K:Ljava/util/List;

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/daaw/zj;->D:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/zj;->K:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_1
    const-string v0, ""

    if-eqz p1, :cond_2

    new-instance p1, Lcom/daaw/lo1;

    invoke-direct {p1, v1, v0}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_2
    iget p1, p0, Lcom/daaw/zj;->E:I

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/zj;->F:Ljava/io/File;

    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v3}, Lcom/daaw/zj;->g0(ILcom/daaw/sd0;Ljava/io/File;Z)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/daaw/lo1;

    invoke-direct {v1, p1, v0}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public Z(I)Lcom/daaw/zj$s;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zj;->K:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/zj$s;

    return-object p1
.end method

.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/zj;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;
    .locals 4

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Lcom/daaw/zj;

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/daaw/zj;->H:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget v2, p0, Lcom/daaw/zj;->E:I

    invoke-direct {v0, p1, v1, p2, v2}, Lcom/daaw/zj;-><init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;I)V

    iget-object p2, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v0, p1}, Lcom/daaw/yj;->F(Landroid/content/Context;)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public e0(Lcom/daaw/zj$s;ILcom/daaw/uk;)V
    .locals 8

    invoke-virtual {p1}, Lcom/daaw/zj$s;->h()Lcom/daaw/tx0;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v1, Lcom/daaw/zj$t;

    invoke-direct {v1, p1, p2}, Lcom/daaw/zj$t;-><init>(Lcom/daaw/zj$s;I)V

    const/4 v3, 0x0

    invoke-static {p1}, Lcom/daaw/zj$s;->a(Lcom/daaw/zj$s;)I

    move-result v4

    iget-object v6, p0, Lcom/daaw/zj;->L:[Lcom/daaw/l0;

    const/4 v7, 0x0

    move-object v0, p0

    move-object v5, p3

    invoke-static/range {v0 .. v7}, Lcom/daaw/qk;->f0(Lcom/daaw/yj;Ljava/lang/Object;Lcom/daaw/tx0;Lcom/daaw/vd0;ILcom/daaw/uk;[Lcom/daaw/l0;I)V

    return-void

    :cond_0
    new-instance v0, Lcom/daaw/zj$t;

    invoke-direct {v0, p1, p2}, Lcom/daaw/zj$t;-><init>(Lcom/daaw/zj$s;I)V

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p2

    invoke-virtual {p3, p0, v0, p2}, Lcom/daaw/uk;->b0(Lcom/daaw/wc0;Ljava/lang/Object;Lcom/daaw/sd0;)V

    sget-object p2, Lcom/daaw/yj;->x:Lcom/daaw/ww1;

    iget-object v0, p3, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0, v1}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v0, p3, Lcom/daaw/uk;->w:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setSelected(Z)V

    iget-object p2, p0, Lcom/daaw/zj;->C:[Lcom/daaw/l0;

    const/4 v0, -0x1

    invoke-virtual {p3, p2, v0, p0}, Lcom/daaw/uk;->X([Lcom/daaw/l0;ILcom/daaw/wc0;)V

    iget-object p2, p3, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget p2, p0, Lcom/daaw/yj;->i:I

    invoke-virtual {p3, p2}, Lcom/daaw/uk;->V(I)V

    const p2, 0x7f0800ea

    invoke-virtual {p3, p2}, Lcom/daaw/uk;->W(I)V

    iget-object p2, p3, Lcom/daaw/uk;->y:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p2, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/daaw/zj$s;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    iget v1, p0, Lcom/daaw/yj;->g:I

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p3, v0}, Lcom/daaw/uk;->d0(I)V

    iget-object p2, p3, Lcom/daaw/uk;->B:Landroid/widget/TextView;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, ""

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/daaw/zj$s;->d()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public f(Lcom/daaw/oc0;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/zj;->N:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public f0(Lcom/daaw/zj$s;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/zj;->K:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Lcom/daaw/al;I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/zj;->M:[Lcom/daaw/l0;

    array-length v1, v0

    if-ge p2, v1, :cond_0

    aget-object p2, v0, p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/l0;->a(Lcom/daaw/al;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public i0(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/zj$s;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/daaw/yj;->B(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/daaw/zj;->K:Ljava/util/List;

    invoke-virtual {p0}, Lcom/daaw/zj;->X()Lcom/daaw/oc0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/daaw/oc0;->a()V

    :cond_1
    return-void
.end method

.method public j(IILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public j0(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    new-instance v0, Lcom/daaw/n91;

    iget-object v1, p0, Lcom/daaw/zj;->F:Ljava/io/File;

    new-instance v2, Lcom/daaw/q91;

    invoke-direct {v2, p1}, Lcom/daaw/q91;-><init>(Landroid/content/Context;)V

    new-instance v3, Ljava/lang/ref/WeakReference;

    iget-object v4, p0, Lcom/daaw/zj;->O:Lcom/daaw/n91$b;

    invoke-direct {v3, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/daaw/n91;-><init>(Landroid/content/Context;Ljava/io/File;Lcom/daaw/m10;Ljava/lang/ref/WeakReference;)V

    sget-object p1, Lcom/daaw/yj;->z:Lcom/daaw/sw1;

    iget v1, p0, Lcom/daaw/zj;->E:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1, p2}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p2, p1, v1

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public o(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/daaw/zj;->D:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/daaw/yj;->N(ZZ)V

    invoke-virtual {p0}, Lcom/daaw/zj;->A()Z

    invoke-virtual {p0, p1, p2}, Lcom/daaw/zj;->j0(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/zj;->D:Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Lcom/daaw/yj;->N(ZZ)V

    invoke-virtual {p0}, Lcom/daaw/zj;->A()Z

    :goto_1
    return-void
.end method

.method public r(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$c0;
    .locals 1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2, p0}, Lcom/daaw/gt1;->a(Landroid/content/Context;Landroid/view/ViewGroup;ILcom/daaw/wc0;)Lcom/daaw/eb;

    move-result-object p1

    return-object p1
.end method

.method public t(I)I
    .locals 0

    return p1
.end method

.method public v(Landroidx/recyclerview/widget/RecyclerView$c0;I)V
    .locals 1

    invoke-virtual {p0, p2}, Lcom/daaw/zj;->Z(I)Lcom/daaw/zj$s;

    move-result-object v0

    check-cast p1, Lcom/daaw/uk;

    iput p2, p1, Lcom/daaw/uk;->v:I

    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/zj;->e0(Lcom/daaw/zj$s;ILcom/daaw/uk;)V

    return-void
.end method

.method public x(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/sd0;)V
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f10013c

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p1

    aput-object p1, p3, v0

    return-void
.end method
