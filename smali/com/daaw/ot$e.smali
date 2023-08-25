.class public Lcom/daaw/ot$e;
.super Lcom/daaw/r30;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ot;->j()Lcom/daaw/r30;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/r30;

.field public final synthetic b:Lcom/daaw/ot;


# direct methods
.method public constructor <init>(Lcom/daaw/ot;Lcom/daaw/r30;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ot$e;->b:Lcom/daaw/ot;

    iput-object p2, p0, Lcom/daaw/ot$e;->a:Lcom/daaw/r30;

    invoke-direct {p0}, Lcom/daaw/r30;-><init>()V

    return-void
.end method


# virtual methods
.method public f(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ot$e;->a:Lcom/daaw/r30;

    invoke-virtual {v0}, Lcom/daaw/r30;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ot$e;->a:Lcom/daaw/r30;

    invoke-virtual {v0, p1}, Lcom/daaw/r30;->f(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/ot$e;->b:Lcom/daaw/ot;

    invoke-virtual {v0, p1}, Lcom/daaw/ot;->O1(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ot$e;->a:Lcom/daaw/r30;

    invoke-virtual {v0}, Lcom/daaw/r30;->h()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/ot$e;->b:Lcom/daaw/ot;

    invoke-virtual {v0}, Lcom/daaw/ot;->P1()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
