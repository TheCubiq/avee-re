.class public Lcom/daaw/yv0$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/t40;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yv0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/t40<",
        "Ljava/lang/Integer;",
        "[F[I",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/yv0;


# direct methods
.method public constructor <init>(Lcom/daaw/yv0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yv0$g;->a:Lcom/daaw/yv0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;
    .locals 7

    iget-object p3, p0, Lcom/daaw/yv0$g;->a:Lcom/daaw/yv0;

    invoke-static {p3}, Lcom/daaw/yv0;->a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;

    move-result-object p3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aget-object p3, p3, v0

    invoke-interface {p3}, Lcom/daaw/zd0;->getPosition()Lcom/daaw/ds1;

    move-result-object p3

    iget-object v0, p0, Lcom/daaw/yv0$g;->a:Lcom/daaw/yv0;

    invoke-static {v0}, Lcom/daaw/yv0;->a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/daaw/yv0$g;->a:Lcom/daaw/yv0;

    iget v3, v2, Lcom/daaw/yv0;->g0:F

    iget v4, p3, Lcom/daaw/ds1;->a:F

    sub-float v4, v3, v4

    add-float/2addr v3, v4

    iget v4, v2, Lcom/daaw/yv0;->h0:F

    iget v5, p3, Lcom/daaw/ds1;->b:F

    sub-float v5, v4, v5

    add-float/2addr v4, v5

    iget p3, p3, Lcom/daaw/ds1;->c:F

    invoke-static {v2}, Lcom/daaw/yv0;->a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aget-object p1, v2, p1

    invoke-interface {p1}, Lcom/daaw/zd0;->g()F

    move-result p1

    neg-float v5, p1

    move v2, v3

    move v3, v4

    move v4, p3

    move-object v6, p2

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/yv0;->k0(Lcom/daaw/zd0;FFFF[F)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, [F

    check-cast p3, [I

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/yv0$g;->a(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
