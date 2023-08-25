.class public Lcom/daaw/v51$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/v51;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g0<",
        "Lcom/daaw/y31;",
        "Lcom/daaw/sr1;",
        "Lcom/daaw/w31;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/v51;


# direct methods
.method public constructor <init>(Lcom/daaw/v51;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/v51$f;->a:Lcom/daaw/v51;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/y31;

    check-cast p2, Lcom/daaw/sr1;

    check-cast p3, Lcom/daaw/w31;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/v51$f;->b(Lcom/daaw/y31;Lcom/daaw/sr1;Lcom/daaw/w31;)V

    return-void
.end method

.method public b(Lcom/daaw/y31;Lcom/daaw/sr1;Lcom/daaw/w31;)V
    .locals 5

    iget-object p3, p0, Lcom/daaw/v51$f;->a:Lcom/daaw/v51;

    iget-object p3, p3, Lcom/daaw/v51;->T:Lcom/daaw/pr1;

    invoke-virtual {p3}, Lcom/daaw/pr1;->a()[F

    move-result-object p3

    const-string v0, "u_projView"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1, p3}, Lcom/daaw/sr1;->E(Ljava/lang/String;Z[F)V

    iget-object p3, p0, Lcom/daaw/v51$f;->a:Lcom/daaw/v51;

    invoke-static {p3}, Lcom/daaw/v51;->Z(Lcom/daaw/v51;)Lcom/daaw/dm0;

    move-result-object p3

    invoke-virtual {p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/daaw/dm0;->i(Lcom/daaw/aq0;)F

    move-result p3

    new-instance v0, Lcom/daaw/bs1;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2}, Lcom/daaw/bs1;-><init>(FF)V

    iget-object v2, p0, Lcom/daaw/v51$f;->a:Lcom/daaw/v51;

    invoke-static {v2}, Lcom/daaw/v51;->a0(Lcom/daaw/v51;)Lcom/daaw/dm0;

    move-result-object v2

    invoke-virtual {p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object p1

    invoke-virtual {v2, p1, v0}, Lcom/daaw/dm0;->j(Lcom/daaw/aq0;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    iget p1, v0, Lcom/daaw/bs1;->a:F

    mul-float p1, p1, p3

    iget v0, v0, Lcom/daaw/bs1;->b:F

    mul-float v0, v0, p3

    const-string p3, "dirAmount"

    invoke-virtual {p2, p3, p1, v0}, Lcom/daaw/dc1;->t(Ljava/lang/String;FF)V

    iget-object p1, p0, Lcom/daaw/v51$f;->a:Lcom/daaw/v51;

    invoke-static {p1}, Lcom/daaw/v51;->b0(Lcom/daaw/v51;)[F

    move-result-object p1

    aget p1, p1, v1

    iget-object p3, p0, Lcom/daaw/v51$f;->a:Lcom/daaw/v51;

    invoke-static {p3}, Lcom/daaw/v51;->b0(Lcom/daaw/v51;)[F

    move-result-object p3

    const/4 v0, 0x1

    aget p3, p3, v0

    iget-object v2, p0, Lcom/daaw/v51$f;->a:Lcom/daaw/v51;

    invoke-static {v2}, Lcom/daaw/v51;->b0(Lcom/daaw/v51;)[F

    move-result-object v2

    const/4 v3, 0x2

    aget v2, v2, v3

    const-string v4, "splitColor0"

    invoke-virtual {p2, v4, p1, p3, v2}, Lcom/daaw/dc1;->u(Ljava/lang/String;FFF)V

    iget-object p1, p0, Lcom/daaw/v51$f;->a:Lcom/daaw/v51;

    invoke-static {p1}, Lcom/daaw/v51;->c0(Lcom/daaw/v51;)[F

    move-result-object p1

    aget p1, p1, v1

    iget-object p3, p0, Lcom/daaw/v51$f;->a:Lcom/daaw/v51;

    invoke-static {p3}, Lcom/daaw/v51;->c0(Lcom/daaw/v51;)[F

    move-result-object p3

    aget p3, p3, v0

    iget-object v2, p0, Lcom/daaw/v51$f;->a:Lcom/daaw/v51;

    invoke-static {v2}, Lcom/daaw/v51;->c0(Lcom/daaw/v51;)[F

    move-result-object v2

    aget v2, v2, v3

    const-string v4, "splitColor1"

    invoke-virtual {p2, v4, p1, p3, v2}, Lcom/daaw/dc1;->u(Ljava/lang/String;FFF)V

    iget-object p1, p0, Lcom/daaw/v51$f;->a:Lcom/daaw/v51;

    invoke-static {p1}, Lcom/daaw/v51;->d0(Lcom/daaw/v51;)[F

    move-result-object p1

    aget p1, p1, v1

    iget-object p3, p0, Lcom/daaw/v51$f;->a:Lcom/daaw/v51;

    invoke-static {p3}, Lcom/daaw/v51;->d0(Lcom/daaw/v51;)[F

    move-result-object p3

    aget p3, p3, v0

    iget-object v0, p0, Lcom/daaw/v51$f;->a:Lcom/daaw/v51;

    invoke-static {v0}, Lcom/daaw/v51;->d0(Lcom/daaw/v51;)[F

    move-result-object v0

    aget v0, v0, v3

    const-string v1, "splitColor2"

    invoke-virtual {p2, v1, p1, p3, v0}, Lcom/daaw/dc1;->u(Ljava/lang/String;FFF)V

    return-void
.end method
