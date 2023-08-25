.class public Lcom/daaw/n91$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/n91$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/n91;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/n91;


# direct methods
.method public constructor <init>(Lcom/daaw/n91;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n91$a;->a:Lcom/daaw/n91;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/zj$s;)V
    .locals 0

    return-void
.end method

.method public b(Lcom/daaw/zj$s;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/n91$a;->a:Lcom/daaw/n91;

    invoke-static {v0}, Lcom/daaw/n91;->a(Lcom/daaw/n91;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/zj$s;->j(I)V

    iget-object v0, p0, Lcom/daaw/n91$a;->a:Lcom/daaw/n91;

    invoke-static {v0}, Lcom/daaw/n91;->b(Lcom/daaw/n91;)I

    iget-object v0, p0, Lcom/daaw/n91$a;->a:Lcom/daaw/n91;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/daaw/n91;->c(Lcom/daaw/n91;[Ljava/lang/Object;)V

    return-void
.end method

.method public isCancelled()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/n91$a;->a:Lcom/daaw/n91;

    invoke-virtual {v0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v0

    return v0
.end method
