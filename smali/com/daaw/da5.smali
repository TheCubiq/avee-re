.class public final synthetic Lcom/daaw/da5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/q03;


# instance fields
.field public final synthetic p:Lcom/daaw/a74;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/a74;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/da5;->p:Lcom/daaw/a74;

    return-void
.end method


# virtual methods
.method public final e0(Lcom/daaw/p03;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/da5;->p:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object v0

    iget-object p1, p1, Lcom/daaw/p03;->d:Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/Rect;->left:I

    iget p1, p1, Landroid/graphics/Rect;->top:I

    const/4 v2, 0x0

    invoke-interface {v0, v1, p1, v2}, Lcom/daaw/t84;->G(IIZ)V

    return-void
.end method
