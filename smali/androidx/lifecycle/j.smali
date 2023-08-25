.class public Landroidx/lifecycle/j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/j$a;
    }
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/e;

.field public final b:Landroid/os/Handler;

.field public c:Landroidx/lifecycle/j$a;


# direct methods
.method public constructor <init>(Lcom/daaw/sj0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/e;

    invoke-direct {v0, p1}, Landroidx/lifecycle/e;-><init>(Lcom/daaw/sj0;)V

    iput-object v0, p0, Landroidx/lifecycle/j;->a:Landroidx/lifecycle/e;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/j;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/c;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/j;->a:Landroidx/lifecycle/e;

    return-object v0
.end method

.method public b()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/c$b;->ON_START:Landroidx/lifecycle/c$b;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/j;->f(Landroidx/lifecycle/c$b;)V

    return-void
.end method

.method public c()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/c$b;->ON_CREATE:Landroidx/lifecycle/c$b;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/j;->f(Landroidx/lifecycle/c$b;)V

    return-void
.end method

.method public d()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/c$b;->ON_STOP:Landroidx/lifecycle/c$b;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/j;->f(Landroidx/lifecycle/c$b;)V

    sget-object v0, Landroidx/lifecycle/c$b;->ON_DESTROY:Landroidx/lifecycle/c$b;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/j;->f(Landroidx/lifecycle/c$b;)V

    return-void
.end method

.method public e()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/c$b;->ON_START:Landroidx/lifecycle/c$b;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/j;->f(Landroidx/lifecycle/c$b;)V

    return-void
.end method

.method public final f(Landroidx/lifecycle/c$b;)V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/j;->c:Landroidx/lifecycle/j$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/j$a;->run()V

    :cond_0
    new-instance v0, Landroidx/lifecycle/j$a;

    iget-object v1, p0, Landroidx/lifecycle/j;->a:Landroidx/lifecycle/e;

    invoke-direct {v0, v1, p1}, Landroidx/lifecycle/j$a;-><init>(Landroidx/lifecycle/e;Landroidx/lifecycle/c$b;)V

    iput-object v0, p0, Landroidx/lifecycle/j;->c:Landroidx/lifecycle/j$a;

    iget-object p1, p0, Landroidx/lifecycle/j;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method
