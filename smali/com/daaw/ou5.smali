.class public final Lcom/daaw/ou5;
.super Lcom/daaw/nu5;
.source ""


# instance fields
.field public final a:Lcom/daaw/b94;

.field public final b:Lcom/daaw/sp4;

.field public final c:Lcom/daaw/cx5;

.field public final d:Lcom/daaw/pw4;

.field public final e:Lcom/daaw/l15;

.field public final f:Lcom/daaw/jt4;

.field public final g:Landroid/view/ViewGroup;

.field public final h:Lcom/daaw/wv4;


# direct methods
.method public constructor <init>(Lcom/daaw/b94;Lcom/daaw/sp4;Lcom/daaw/cx5;Lcom/daaw/pw4;Lcom/daaw/l15;Lcom/daaw/jt4;Landroid/view/ViewGroup;Lcom/daaw/wv4;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/nu5;-><init>()V

    iput-object p1, p0, Lcom/daaw/ou5;->a:Lcom/daaw/b94;

    iput-object p2, p0, Lcom/daaw/ou5;->b:Lcom/daaw/sp4;

    iput-object p3, p0, Lcom/daaw/ou5;->c:Lcom/daaw/cx5;

    iput-object p4, p0, Lcom/daaw/ou5;->d:Lcom/daaw/pw4;

    iput-object p5, p0, Lcom/daaw/ou5;->e:Lcom/daaw/l15;

    iput-object p6, p0, Lcom/daaw/ou5;->f:Lcom/daaw/jt4;

    iput-object p7, p0, Lcom/daaw/ou5;->g:Landroid/view/ViewGroup;

    iput-object p8, p0, Lcom/daaw/ou5;->h:Lcom/daaw/wv4;

    return-void
.end method


# virtual methods
.method public final c(Lcom/daaw/ri6;Landroid/os/Bundle;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ou5;->a:Lcom/daaw/b94;

    invoke-virtual {v0}, Lcom/daaw/b94;->j()Lcom/daaw/yj4;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ou5;->b:Lcom/daaw/sp4;

    invoke-virtual {v1, p1}, Lcom/daaw/sp4;->f(Lcom/daaw/ri6;)Lcom/daaw/sp4;

    invoke-virtual {v1, p2}, Lcom/daaw/sp4;->d(Landroid/os/Bundle;)Lcom/daaw/sp4;

    invoke-virtual {v1}, Lcom/daaw/sp4;->g()Lcom/daaw/up4;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/yj4;->n(Lcom/daaw/up4;)Lcom/daaw/yj4;

    iget-object p1, p0, Lcom/daaw/ou5;->d:Lcom/daaw/pw4;

    invoke-interface {v0, p1}, Lcom/daaw/yj4;->k(Lcom/daaw/pw4;)Lcom/daaw/yj4;

    iget-object p1, p0, Lcom/daaw/ou5;->c:Lcom/daaw/cx5;

    invoke-interface {v0, p1}, Lcom/daaw/yj4;->o(Lcom/daaw/cx5;)Lcom/daaw/yj4;

    iget-object p1, p0, Lcom/daaw/ou5;->e:Lcom/daaw/l15;

    invoke-interface {v0, p1}, Lcom/daaw/yj4;->d(Lcom/daaw/l15;)Lcom/daaw/yj4;

    new-instance p1, Lcom/daaw/rl4;

    iget-object p2, p0, Lcom/daaw/ou5;->f:Lcom/daaw/jt4;

    iget-object v1, p0, Lcom/daaw/ou5;->h:Lcom/daaw/wv4;

    invoke-direct {p1, p2, v1}, Lcom/daaw/rl4;-><init>(Lcom/daaw/jt4;Lcom/daaw/wv4;)V

    invoke-interface {v0, p1}, Lcom/daaw/yj4;->i(Lcom/daaw/rl4;)Lcom/daaw/yj4;

    new-instance p1, Lcom/daaw/wi4;

    iget-object p2, p0, Lcom/daaw/ou5;->g:Landroid/view/ViewGroup;

    invoke-direct {p1, p2}, Lcom/daaw/wi4;-><init>(Landroid/view/ViewGroup;)V

    invoke-interface {v0, p1}, Lcom/daaw/yj4;->c(Lcom/daaw/wi4;)Lcom/daaw/yj4;

    invoke-interface {v0}, Lcom/daaw/yj4;->zzj()Lcom/daaw/zj4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/zj4;->d()Lcom/daaw/jn4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/jn4;->j()Lcom/daaw/f77;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/jn4;->i(Lcom/daaw/f77;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
