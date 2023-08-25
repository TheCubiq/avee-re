.class public Lcom/daaw/o81;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/o81$d;,
        Lcom/daaw/o81$c;,
        Lcom/daaw/o81$b;
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

.field public c:Lcom/daaw/o81$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/o81$b<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/o81$c;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/String;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lcom/daaw/o81$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Lcom/daaw/o81$b;Ljava/lang/ref/WeakReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/io/File;",
            "Lcom/daaw/o81$b<",
            "Ljava/io/File;",
            ">;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/o81$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/o81;->f:Ljava/util/List;

    new-instance v0, Lcom/daaw/o81$a;

    invoke-direct {v0, p0}, Lcom/daaw/o81$a;-><init>(Lcom/daaw/o81;)V

    iput-object v0, p0, Lcom/daaw/o81;->g:Lcom/daaw/o81$d;

    iput-object p1, p0, Lcom/daaw/o81;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/o81;->b:Ljava/io/File;

    iput-object p3, p0, Lcom/daaw/o81;->c:Lcom/daaw/o81$b;

    iput-object p4, p0, Lcom/daaw/o81;->d:Ljava/lang/ref/WeakReference;

    const-string p1, ""

    iput-object p1, p0, Lcom/daaw/o81;->e:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/o81;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/o81;->f:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/o81;[Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/io/File;Lcom/daaw/o81$b;Ljava/lang/ref/WeakReference;)Lcom/daaw/o81;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/io/File;",
            "Lcom/daaw/o81$b<",
            "Ljava/io/File;",
            ">;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/o81$c;",
            ">;)",
            "Lcom/daaw/o81;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/o81;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/daaw/o81;-><init>(Landroid/content/Context;Ljava/io/File;Lcom/daaw/o81$b;Ljava/lang/ref/WeakReference;)V

    return-object v0
.end method

.method public static e(Landroid/content/Context;Lcom/daaw/o81$d;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/o81$b;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/o81$d;",
            "Ljava/io/File;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/daaw/o81$b<",
            "Ljava/io/File;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p2

    const/4 v0, 0x1

    :try_start_0
    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    aget-object v6, p2, v3

    invoke-interface {p1}, Lcom/daaw/o81$d;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_0

    return v2

    :cond_0
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1, v6}, Lcom/daaw/o81$d;->a(Ljava/io/File;)V

    if-nez p3, :cond_3

    const/4 v7, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v8, p4

    move-object v9, p5

    invoke-static/range {v4 .. v9}, Lcom/daaw/o81;->e(Landroid/content/Context;Lcom/daaw/o81$d;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/o81$b;)Z

    move-result v4

    if-nez v4, :cond_3

    return v2

    :cond_1
    if-eqz p5, :cond_2

    invoke-interface {p5, p4, v6}, Lcom/daaw/o81$b;->b(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v4

    goto :goto_1

    :cond_2
    const/4 v4, 0x1

    :goto_1
    if-eqz v4, :cond_3

    invoke-interface {p1, v6}, Lcom/daaw/o81$d;->b(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    :cond_4
    return v0
.end method

.method public static f(Landroid/content/Context;Lcom/daaw/o81$d;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/o81$b;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/o81$d;",
            "Ljava/io/File;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/daaw/o81$b<",
            "Ljava/io/File;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p5, p4}, Lcom/daaw/o81$b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lcom/daaw/o81;->e(Landroid/content/Context;Lcom/daaw/o81$d;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/o81$b;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public varargs d([Ljava/lang/String;)Ljava/lang/Void;
    .locals 7

    const/4 v0, 0x0

    aget-object v5, p1, v0

    iget-object v1, p0, Lcom/daaw/o81;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/o81;->g:Lcom/daaw/o81$d;

    iget-object v3, p0, Lcom/daaw/o81;->b:Ljava/io/File;

    iget-object v6, p0, Lcom/daaw/o81;->c:Lcom/daaw/o81$b;

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/daaw/o81;->f(Landroid/content/Context;Lcom/daaw/o81$d;Ljava/io/File;ZLjava/lang/String;Lcom/daaw/o81$b;)Z

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/o81;->d([Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/Void;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/o81;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/o81$c;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, p0, v0, v1}, Lcom/daaw/o81$c;->a(Landroid/os/AsyncTask;ZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Void;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/o81;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/o81$c;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/daaw/o81;->f:Ljava/util/List;

    invoke-interface {p1, p0, v0, v1}, Lcom/daaw/o81$c;->a(Landroid/os/AsyncTask;ZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public i()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/o81;->e:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public bridge synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/o81;->g(Ljava/lang/Void;)V

    return-void
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/o81;->h(Ljava/lang/Void;)V

    return-void
.end method

.method public onPreExecute()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/o81;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/o81$c;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/daaw/o81$c;->c(Landroid/os/AsyncTask;)V

    :cond_0
    return-void
.end method

.method public varargs onProgressUpdate([Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/o81;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/o81$c;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    aget-object p1, p1, v1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v0, p0, p1}, Lcom/daaw/o81$c;->b(Landroid/os/AsyncTask;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
