.class public Lcom/daaw/ic1$b;
.super Lcom/daaw/ic1$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ic1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final b:Lcom/daaw/ic1$d;


# direct methods
.method public constructor <init>(Lcom/daaw/ic1$d;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ic1$g;-><init>()V

    iput-object p1, p0, Lcom/daaw/ic1$b;->b:Lcom/daaw/ic1$d;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Matrix;Lcom/daaw/ec1;ILandroid/graphics/Canvas;)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/ic1$b;->b:Lcom/daaw/ic1$d;

    invoke-static {v0}, Lcom/daaw/ic1$d;->h(Lcom/daaw/ic1$d;)F

    move-result v6

    iget-object v0, p0, Lcom/daaw/ic1$b;->b:Lcom/daaw/ic1$d;

    invoke-static {v0}, Lcom/daaw/ic1$d;->i(Lcom/daaw/ic1$d;)F

    move-result v7

    new-instance v4, Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/daaw/ic1$b;->b:Lcom/daaw/ic1$d;

    invoke-static {v0}, Lcom/daaw/ic1$d;->b(Lcom/daaw/ic1$d;)F

    move-result v0

    iget-object v1, p0, Lcom/daaw/ic1$b;->b:Lcom/daaw/ic1$d;

    invoke-static {v1}, Lcom/daaw/ic1$d;->c(Lcom/daaw/ic1$d;)F

    move-result v1

    iget-object v2, p0, Lcom/daaw/ic1$b;->b:Lcom/daaw/ic1$d;

    invoke-static {v2}, Lcom/daaw/ic1$d;->d(Lcom/daaw/ic1$d;)F

    move-result v2

    iget-object v3, p0, Lcom/daaw/ic1$b;->b:Lcom/daaw/ic1$d;

    invoke-static {v3}, Lcom/daaw/ic1$d;->e(Lcom/daaw/ic1$d;)F

    move-result v3

    invoke-direct {v4, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object v1, p2

    move-object v2, p4

    move-object v3, p1

    move v5, p3

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/ec1;->a(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Landroid/graphics/RectF;IFF)V

    return-void
.end method
