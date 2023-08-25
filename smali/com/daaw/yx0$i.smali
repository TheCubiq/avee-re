.class public Lcom/daaw/yx0$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yx0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Lcom/daaw/al;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/yx0;


# direct methods
.method public constructor <init>(Lcom/daaw/yx0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yx0$i;->a:Lcom/daaw/yx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/al;)V
    .locals 5

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/yx0$i;->a:Lcom/daaw/yx0;

    invoke-static {v1}, Lcom/daaw/yx0;->c(Lcom/daaw/yx0;)Lcom/daaw/yx0$r;

    move-result-object v1

    iput-object p1, v1, Lcom/daaw/yx0$r;->a:Lcom/daaw/al;

    new-instance v1, Ljava/io/File;

    const-string v2, "/storage/"

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/daaw/yx0$s;

    invoke-direct {v2}, Lcom/daaw/yx0$s;-><init>()V

    new-instance v3, Ljava/lang/ref/WeakReference;

    iget-object v4, p0, Lcom/daaw/yx0$i;->a:Lcom/daaw/yx0;

    invoke-static {v4}, Lcom/daaw/yx0;->c(Lcom/daaw/yx0;)Lcom/daaw/yx0$r;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/o81;->c(Landroid/content/Context;Ljava/io/File;Lcom/daaw/o81$b;Ljava/lang/ref/WeakReference;)Lcom/daaw/o81;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/yx0$i;->a:Lcom/daaw/yx0;

    invoke-static {v1}, Lcom/daaw/yx0;->b(Lcom/daaw/yx0;)Lcom/daaw/t91;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/daaw/t91;->d(Landroid/os/AsyncTask;I)V

    invoke-virtual {v0}, Lcom/daaw/o81;->i()V

    invoke-virtual {p1}, Lcom/daaw/al;->a()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/daaw/n81;->b(Lcom/daaw/al;)Lcom/daaw/n81;

    :cond_1
    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/al;

    invoke-virtual {p0, p1}, Lcom/daaw/yx0$i;->a(Lcom/daaw/al;)V

    return-void
.end method
