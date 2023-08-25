.class public Lcom/daaw/avee/comp/playback/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/avee/comp/playback/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/d;-><init>(Lcom/daaw/avee/comp/playback/e;Lcom/daaw/avee/comp/playback/e$b;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/avee/comp/playback/d;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/d;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/playback/e$b;->a(ZLjava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e$b;->b()V

    return-void
.end method

.method public c(Lcom/daaw/avee/comp/playback/b$b;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->c(Lcom/daaw/avee/comp/playback/b$b;)V

    return-void
.end method

.method public d(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/b$c;
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->d(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/b$c;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->e(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public f(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->f(Z)V

    return-void
.end method

.method public g(Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->e(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/d$b;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->e(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/d$b;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->e(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/d$b;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->g(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e$b;->h()Z

    move-result v0

    return v0
.end method

.method public i(IIF)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/avee/comp/playback/e$b;->i(IIF)V

    return-void
.end method

.method public j(ZI)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/playback/e$b;->j(ZI)V

    return-void
.end method

.method public k(Lcom/daaw/pz;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/e$b;->k(Lcom/daaw/pz;)V

    return-void
.end method

.method public l()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e$b;->l()I

    move-result v0

    return v0
.end method

.method public m(J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/playback/e$b;->m(J)V

    return-void
.end method

.method public n()Landroid/view/SurfaceHolder;
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e$b;->n()Landroid/view/SurfaceHolder;

    move-result-object v0

    return-object v0
.end method

.method public o()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->e(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/d$b;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->e(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/d$b;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->e(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/d$b;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/d$a;->a:Lcom/daaw/avee/comp/playback/d;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/d;->l(Lcom/daaw/avee/comp/playback/d;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e$b;->o()V

    :cond_1
    :goto_0
    return-void
.end method
