.class public Lcom/daaw/xw0$h0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xw0;-><init>(Lcom/daaw/uf1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/sw1$a<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/xw0;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$h0;->a:Lcom/daaw/xw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/xw0$h0;->b(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method

.method public b(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p3

    sget v0, Lcom/daaw/j5;->K:I

    if-ne p3, v0, :cond_0

    iget-object p1, p0, Lcom/daaw/xw0$h0;->a:Lcom/daaw/xw0;

    invoke-virtual {p1, p2}, Lcom/daaw/xw0;->k(Ljava/lang/Integer;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p3

    sget v0, Lcom/daaw/j5;->O:I

    if-ne p3, v0, :cond_2

    invoke-static {}, Lcom/daaw/ko0;->q()Lcom/daaw/ko0;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/daaw/xw0$h0;->a:Lcom/daaw/xw0;

    invoke-static {p3}, Lcom/daaw/xw0;->d(Lcom/daaw/xw0;)Z

    move-result p3

    invoke-virtual {p1, p3}, Lcom/daaw/ko0;->u(Z)V

    :cond_1
    sget-object p1, Lcom/daaw/avee/comp/playback/c;->s:Lcom/daaw/iw1;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-float p2, p2

    const p3, 0x3c23d70a    # 0.01f

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget p3, Lcom/daaw/j5;->P:I

    if-ne p1, p3, :cond_3

    sget-object p1, Lcom/daaw/avee/comp/playback/c;->t:Lcom/daaw/iw1;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-float p2, p2

    const p3, 0x3a83126f    # 0.001f

    mul-float p2, p2, p3

    iget-object p3, p0, Lcom/daaw/xw0$h0;->a:Lcom/daaw/xw0;

    invoke-static {p3}, Lcom/daaw/xw0;->c(Lcom/daaw/xw0;)F

    move-result p3

    :goto_0
    mul-float p2, p2, p3

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method
