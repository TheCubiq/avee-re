.class public Lcom/daaw/s91;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/s91$c;,
        Lcom/daaw/s91$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T1:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT1;>;"
        }
    .end annotation
.end field

.field public b:Lcom/daaw/m10;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/m10<",
            "TT1;>;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/s91$b<",
            "TT1;>;>;"
        }
    .end annotation
.end field

.field public d:I

.field public e:Lcom/daaw/s91$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/s91$c<",
            "TT1;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Lcom/daaw/m10;Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "TT1;>;",
            "Lcom/daaw/m10<",
            "TT1;>;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/s91$b<",
            "TT1;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/s91;->d:I

    new-instance p1, Lcom/daaw/s91$a;

    invoke-direct {p1, p0}, Lcom/daaw/s91$a;-><init>(Lcom/daaw/s91;)V

    iput-object p1, p0, Lcom/daaw/s91;->e:Lcom/daaw/s91$c;

    iput-object p2, p0, Lcom/daaw/s91;->a:Ljava/util/List;

    iput-object p3, p0, Lcom/daaw/s91;->b:Lcom/daaw/m10;

    iput-object p4, p0, Lcom/daaw/s91;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/s91;)I
    .locals 2

    iget v0, p0, Lcom/daaw/s91;->d:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/daaw/s91;->d:I

    return v0
.end method

.method public static synthetic b(Lcom/daaw/s91;[Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public varargs c([Ljava/lang/String;)Ljava/lang/Void;
    .locals 4

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-object v0, p0, Lcom/daaw/s91;->b:Lcom/daaw/m10;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/s91;->b:Lcom/daaw/m10;

    invoke-interface {v0, p1}, Lcom/daaw/m10;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    iget-object v0, p0, Lcom/daaw/s91;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/s91;->e:Lcom/daaw/s91$c;

    invoke-interface {v3}, Lcom/daaw/s91$c;->isCancelled()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    iget-object v3, p0, Lcom/daaw/s91;->b:Lcom/daaw/m10;

    invoke-interface {v3, v2}, Lcom/daaw/m10;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/daaw/s91;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/s91;->e:Lcom/daaw/s91$c;

    invoke-interface {v3}, Lcom/daaw/s91$c;->isCancelled()Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    iget-object v3, p0, Lcom/daaw/s91;->b:Lcom/daaw/m10;

    invoke-interface {v3, p1, v2}, Lcom/daaw/m10;->b(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/daaw/s91;->e:Lcom/daaw/s91$c;

    invoke-interface {v3, v2}, Lcom/daaw/s91$c;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doInBackground Exception: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_6
    :goto_4
    return-object v1
.end method

.method public d(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/s91;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/s91$b;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, p0, v0}, Lcom/daaw/s91$b;->a(Landroid/os/AsyncTask;Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/s91;->c([Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/s91;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/s91$b;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, p0, v0}, Lcom/daaw/s91$b;->a(Landroid/os/AsyncTask;Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/s91;->d(Ljava/lang/Void;)V

    return-void
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/s91;->e(Ljava/lang/Void;)V

    return-void
.end method

.method public onPreExecute()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s91;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/s91$b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/daaw/s91$b;->b(Landroid/os/AsyncTask;)V

    :cond_0
    return-void
.end method

.method public varargs onProgressUpdate([Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/s91;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/s91$b;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    aget-object p1, p1, v1

    invoke-interface {v0, p0, p1}, Lcom/daaw/s91$b;->c(Landroid/os/AsyncTask;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
