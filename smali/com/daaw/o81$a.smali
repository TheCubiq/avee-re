.class public Lcom/daaw/o81$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o81$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/o81;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/o81;


# direct methods
.method public constructor <init>(Lcom/daaw/o81;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/o81$a;->a:Lcom/daaw/o81;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)V
    .locals 3

    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/o81$a;->a:Lcom/daaw/o81;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/daaw/o81;->b(Lcom/daaw/o81;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b(Ljava/io/File;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/o81$a;->a:Lcom/daaw/o81;

    invoke-static {v0}, Lcom/daaw/o81;->a(Lcom/daaw/o81;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public isCancelled()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/o81$a;->a:Lcom/daaw/o81;

    invoke-virtual {v0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v0

    return v0
.end method
