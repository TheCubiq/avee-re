.class public Lcom/daaw/s4;
.super Landroid/widget/SeekBar;
.source ""


# instance fields
.field public final p:Lcom/daaw/t4;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lcom/daaw/x01;->L:I

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/s4;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/SeekBar;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/daaw/yk1;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lcom/daaw/t4;

    invoke-direct {p1, p0}, Lcom/daaw/t4;-><init>(Landroid/widget/SeekBar;)V

    iput-object p1, p0, Lcom/daaw/s4;->p:Lcom/daaw/t4;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/t4;->c(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/SeekBar;->drawableStateChanged()V

    iget-object v0, p0, Lcom/daaw/s4;->p:Lcom/daaw/t4;

    invoke-virtual {v0}, Lcom/daaw/t4;->h()V

    return-void
.end method

.method public jumpDrawablesToCurrentState()V
    .locals 1

    invoke-super {p0}, Landroid/widget/SeekBar;->jumpDrawablesToCurrentState()V

    iget-object v0, p0, Lcom/daaw/s4;->p:Lcom/daaw/t4;

    invoke-virtual {v0}, Lcom/daaw/t4;->i()V

    return-void
.end method

.method public declared-synchronized onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-super {p0, p1}, Landroid/widget/SeekBar;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/daaw/s4;->p:Lcom/daaw/t4;

    invoke-virtual {v0, p1}, Lcom/daaw/t4;->g(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
