.class public Lcom/daaw/i7;
.super Lcom/daaw/tv;
.source ""


# instance fields
.field public G:Lcom/daaw/fe0;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/tv;-><init>(IFF)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/i7;->G:Lcom/daaw/fe0;

    invoke-virtual {p0, v0}, Lcom/daaw/i7;->Y(Lcom/daaw/fe0;)V

    return-void
.end method


# virtual methods
.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    return-void
.end method

.method public Y(Lcom/daaw/fe0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/i7;->G:Lcom/daaw/fe0;

    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "AudioProvider"

    return-object v0
.end method

.method public t(Lcom/daaw/un;)V
    .locals 2

    const-string v0, "sampleProvider"

    invoke-virtual {p1, v0}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v0

    const-string v1, "Spectrum"

    invoke-virtual {v0, v1}, Lcom/daaw/un;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/i7;->G:Lcom/daaw/fe0;

    invoke-static {v0, v1}, Lcom/daaw/ma1;->a(Ljava/lang/String;Lcom/daaw/fe0;)Lcom/daaw/fe0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/i7;->G:Lcom/daaw/fe0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/daaw/zc0;->a(Lcom/daaw/un;)V

    :cond_0
    return-void
.end method

.method public v(Lcom/daaw/y31;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/tv;->v(Lcom/daaw/y31;)Z

    move-result p1

    return p1
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/tv;->x(Lcom/daaw/y31;)V

    return-void
.end method

.method public y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/tv;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    iget-object p2, p0, Lcom/daaw/i7;->G:Lcom/daaw/fe0;

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object p3

    invoke-interface {p3}, Lcom/daaw/de0$a;->b()Lcom/daaw/sg0;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/daaw/fe0;->n(Lcom/daaw/de0;Lcom/daaw/sg0;)V

    invoke-interface {p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/i7;->G:Lcom/daaw/fe0;

    invoke-interface {p3}, Lcom/daaw/rd0;->c()F

    move-result p3

    invoke-virtual {p2, p3}, Lcom/daaw/aq0;->p(F)V

    invoke-interface {p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/i7;->G:Lcom/daaw/fe0;

    invoke-interface {p3}, Lcom/daaw/rd0;->j()F

    move-result p3

    invoke-virtual {p2, p3}, Lcom/daaw/aq0;->q(F)V

    :cond_0
    invoke-interface {p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/i7;->G:Lcom/daaw/fe0;

    invoke-virtual {p1, p2}, Lcom/daaw/aq0;->a(Lcom/daaw/fe0;)V

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 3

    const p2, 0x7f10029f

    invoke-virtual {p0, p2}, Lcom/daaw/tv;->j(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/un;->p0(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/i7;->G:Lcom/daaw/fe0;

    const-string v0, "Spectrum"

    invoke-static {p2, v0}, Lcom/daaw/ma1;->b(Lcom/daaw/fe0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/daaw/ma1;->a:[Ljava/lang/String;

    const-string v1, "sampleProvider"

    const-string v2, "0_general"

    invoke-virtual {p1, v1, p2, v2, v0}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    iget-object p2, p0, Lcom/daaw/i7;->G:Lcom/daaw/fe0;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/daaw/zc0;->o(Lcom/daaw/un;)V

    :cond_0
    return-void
.end method
