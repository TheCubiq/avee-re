.class public Lcom/daaw/zl4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/fi6;

.field public final b:Lcom/daaw/th6;

.field public final c:Lcom/daaw/nr4;

.field public final d:Lcom/daaw/as4;

.field public final e:Lcom/daaw/we6;

.field public final f:Lcom/daaw/eq4;

.field public final g:Lcom/daaw/ev4;

.field public final h:Lcom/daaw/hs4;


# direct methods
.method public constructor <init>(Lcom/daaw/yl4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/yl4;->h(Lcom/daaw/yl4;)Lcom/daaw/fi6;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/zl4;->a:Lcom/daaw/fi6;

    invoke-static {p1}, Lcom/daaw/yl4;->g(Lcom/daaw/yl4;)Lcom/daaw/th6;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/zl4;->b:Lcom/daaw/th6;

    invoke-static {p1}, Lcom/daaw/yl4;->b(Lcom/daaw/yl4;)Lcom/daaw/nr4;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/zl4;->c:Lcom/daaw/nr4;

    invoke-static {p1}, Lcom/daaw/yl4;->c(Lcom/daaw/yl4;)Lcom/daaw/as4;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/zl4;->d:Lcom/daaw/as4;

    invoke-static {p1}, Lcom/daaw/yl4;->f(Lcom/daaw/yl4;)Lcom/daaw/we6;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/zl4;->e:Lcom/daaw/we6;

    invoke-static {p1}, Lcom/daaw/yl4;->a(Lcom/daaw/yl4;)Lcom/daaw/eq4;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/zl4;->f:Lcom/daaw/eq4;

    invoke-static {p1}, Lcom/daaw/yl4;->e(Lcom/daaw/yl4;)Lcom/daaw/ev4;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/zl4;->g:Lcom/daaw/ev4;

    invoke-static {p1}, Lcom/daaw/yl4;->d(Lcom/daaw/yl4;)Lcom/daaw/hs4;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/zl4;->h:Lcom/daaw/hs4;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/zl4;->c:Lcom/daaw/nr4;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/nr4;->C0(Landroid/content/Context;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/zl4;->d:Lcom/daaw/as4;

    invoke-virtual {v0}, Lcom/daaw/as4;->zzn()V

    iget-object v0, p0, Lcom/daaw/zl4;->h:Lcom/daaw/hs4;

    invoke-virtual {v0, p0}, Lcom/daaw/hs4;->f(Lcom/daaw/zl4;)V

    return-void
.end method

.method public final c()Lcom/daaw/eq4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zl4;->f:Lcom/daaw/eq4;

    return-object v0
.end method

.method public final d()Lcom/daaw/nr4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zl4;->c:Lcom/daaw/nr4;

    return-object v0
.end method

.method public final e()Lcom/daaw/cv4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zl4;->g:Lcom/daaw/ev4;

    invoke-virtual {v0}, Lcom/daaw/ev4;->l()Lcom/daaw/cv4;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/daaw/we6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zl4;->e:Lcom/daaw/we6;

    return-object v0
.end method

.method public final g()Lcom/daaw/fi6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zl4;->a:Lcom/daaw/fi6;

    return-object v0
.end method
