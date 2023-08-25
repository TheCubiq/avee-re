.class public Lcom/daaw/n91;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/n91$c;,
        Lcom/daaw/n91$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/io/File;

.field public c:Lcom/daaw/m10;

.field public d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/n91$b;",
            ">;"
        }
    .end annotation
.end field

.field public e:I

.field public f:Lcom/daaw/n91$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Lcom/daaw/m10;Ljava/lang/ref/WeakReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/io/File;",
            "Lcom/daaw/m10<",
            "Lcom/daaw/tx0;",
            ">;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/n91$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/n91;->e:I

    new-instance v0, Lcom/daaw/n91$a;

    invoke-direct {v0, p0}, Lcom/daaw/n91$a;-><init>(Lcom/daaw/n91;)V

    iput-object v0, p0, Lcom/daaw/n91;->f:Lcom/daaw/n91$c;

    iput-object p1, p0, Lcom/daaw/n91;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/n91;->b:Ljava/io/File;

    iput-object p3, p0, Lcom/daaw/n91;->c:Lcom/daaw/m10;

    iput-object p4, p0, Lcom/daaw/n91;->d:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/n91;)I
    .locals 0

    iget p0, p0, Lcom/daaw/n91;->e:I

    return p0
.end method

.method public static synthetic b(Lcom/daaw/n91;)I
    .locals 2

    iget v0, p0, Lcom/daaw/n91;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/daaw/n91;->e:I

    return v0
.end method

.method public static synthetic c(Lcom/daaw/n91;[Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    return-void
.end method

.method public static e(Landroid/content/Context;Lcom/daaw/n91$c;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/m10;)Z
    .locals 21

    move-object/from16 v6, p1

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v7

    const/4 v8, 0x1

    :try_start_0
    array-length v9, v7

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v9, :cond_7

    aget-object v2, v7, v11

    invoke-interface/range {p1 .. p1}, Lcom/daaw/n91$c;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return v10

    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez p3, :cond_3

    if-nez p5, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    array-length v0, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    new-instance v1, Lcom/daaw/zj$s;

    const/4 v13, 0x1

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    int-to-long v3, v0

    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    move-result-wide v18

    move-object v12, v1

    move-wide v15, v3

    invoke-direct/range {v12 .. v19}, Lcom/daaw/zj$s;-><init>(ZLjava/lang/String;JLjava/lang/String;J)V

    invoke-interface {v6, v1}, Lcom/daaw/n91$c;->a(Lcom/daaw/zj$s;)V

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Lcom/daaw/n91;->e(Landroid/content/Context;Lcom/daaw/n91$c;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/m10;)Z

    move-result v0

    if-nez v0, :cond_3

    return v10

    :cond_3
    :goto_2
    move-object/from16 v1, p4

    goto :goto_4

    :cond_4
    if-eqz p5, :cond_5

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    goto :goto_3

    :cond_5
    move-object/from16 v1, p4

    const/4 v0, 0x1

    :goto_3
    if-eqz v0, :cond_6

    new-instance v0, Lcom/daaw/tx0;

    invoke-direct {v0, v2}, Lcom/daaw/tx0;-><init>(Ljava/io/File;)V

    new-instance v3, Lcom/daaw/zj$s;

    const/4 v13, 0x0

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v15

    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    move-result-wide v18

    move-object v12, v3

    move-object/from16 v20, v0

    invoke-direct/range {v12 .. v20}, Lcom/daaw/zj$s;-><init>(ZLjava/lang/String;JLjava/lang/String;JLcom/daaw/tx0;)V

    invoke-interface {v6, v3}, Lcom/daaw/n91$c;->b(Lcom/daaw/zj$s;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_6
    :goto_4
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    :catch_0
    :cond_7
    return v8
.end method

.method public static f(Landroid/content/Context;Lcom/daaw/n91$c;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/m10;)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    if-nez p5, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p5, p4}, Lcom/daaw/m10;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v6, p5

    move-object v5, v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object v5, v0

    move-object v6, v5

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-static/range {v1 .. v6}, Lcom/daaw/n91;->e(Landroid/content/Context;Lcom/daaw/n91$c;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/m10;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public varargs d([Ljava/lang/String;)Ljava/lang/Void;
    .locals 7

    const/4 v0, 0x0

    aget-object v5, p1, v0

    iget-object v1, p0, Lcom/daaw/n91;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/n91;->f:Lcom/daaw/n91$c;

    iget-object v3, p0, Lcom/daaw/n91;->b:Ljava/io/File;

    iget-object v6, p0, Lcom/daaw/n91;->c:Lcom/daaw/m10;

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/daaw/n91;->f(Landroid/content/Context;Lcom/daaw/n91$c;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/m10;)Z

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/n91;->d([Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/n91;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/n91$b;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, p0, v0}, Lcom/daaw/n91$b;->a(Landroid/os/AsyncTask;Z)V

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/n91;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/n91$b;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, p0, v0}, Lcom/daaw/n91$b;->a(Landroid/os/AsyncTask;Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/n91;->g(Ljava/lang/Void;)V

    return-void
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/n91;->h(Ljava/lang/Void;)V

    return-void
.end method

.method public onPreExecute()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n91;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/n91$b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/daaw/n91$b;->b(Landroid/os/AsyncTask;)V

    :cond_0
    return-void
.end method

.method public varargs onProgressUpdate([Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n91;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/n91$b;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    aget-object p1, p1, v1

    check-cast p1, Lcom/daaw/zj$s;

    invoke-interface {v0, p0, p1}, Lcom/daaw/n91$b;->c(Landroid/os/AsyncTask;Lcom/daaw/zj$s;)V

    :cond_0
    return-void
.end method
