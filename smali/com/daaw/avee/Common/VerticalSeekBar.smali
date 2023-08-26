.class public Lcom/daaw/avee/Common/VerticalSeekBar;
.super Landroidx/appcompat/widget/AppCompatSeekBar;
.source "VerticalSeekBar.java"


# instance fields
.field private mOnSeekBarChangeFromUserListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatSeekBar;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    const/high16 v0, -0x3d4c0000    # -90.0f

    .line 40
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->rotate(F)V

    .line 41
    invoke-virtual {p0}, Lcom/daaw/avee/Common/VerticalSeekBar;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 43
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatSeekBar;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected declared-synchronized onMeasure(II)V
    .locals 0

    monitor-enter p0

    .line 35
    :try_start_0
    invoke-super {p0, p2, p1}, Landroidx/appcompat/widget/AppCompatSeekBar;->onMeasure(II)V

    .line 36
    invoke-virtual {p0}, Lcom/daaw/avee/Common/VerticalSeekBar;->getMeasuredHeight()I

    move-result p1

    invoke-virtual {p0}, Lcom/daaw/avee/Common/VerticalSeekBar;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Common/VerticalSeekBar;->setMeasuredDimension(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 30
    invoke-super {p0, p2, p1, p4, p3}, Landroidx/appcompat/widget/AppCompatSeekBar;->onSizeChanged(IIII)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 48
    invoke-virtual {p0}, Lcom/daaw/avee/Common/VerticalSeekBar;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 52
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-eq v0, v2, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {p0}, Lcom/daaw/avee/Common/VerticalSeekBar;->getMax()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/avee/Common/VerticalSeekBar;->getMax()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    mul-float v3, v3, p1

    invoke-virtual {p0}, Lcom/daaw/avee/Common/VerticalSeekBar;->getHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v3, p1

    float-to-int p1, v3

    sub-int/2addr v0, p1

    .line 57
    invoke-virtual {p0, v0}, Lcom/daaw/avee/Common/VerticalSeekBar;->setProgress(I)V

    .line 58
    invoke-virtual {p0}, Lcom/daaw/avee/Common/VerticalSeekBar;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Lcom/daaw/avee/Common/VerticalSeekBar;->getHeight()I

    move-result v3

    invoke-virtual {p0, p1, v3, v1, v1}, Lcom/daaw/avee/Common/VerticalSeekBar;->onSizeChanged(IIII)V

    .line 59
    iget-object p1, p0, Lcom/daaw/avee/Common/VerticalSeekBar;->mOnSeekBarChangeFromUserListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    if-eqz p1, :cond_2

    .line 60
    invoke-interface {p1, p0, v0, v2}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onProgressChanged(Landroid/widget/SeekBar;IZ)V

    :cond_2
    :goto_0
    return v2
.end method

.method public setOnSeekBarChangeFromUserListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/daaw/avee/Common/VerticalSeekBar;->mOnSeekBarChangeFromUserListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    return-void
.end method

.method public updateThumb()V
    .locals 3

    .line 74
    invoke-virtual {p0}, Lcom/daaw/avee/Common/VerticalSeekBar;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/avee/Common/VerticalSeekBar;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2, v2}, Lcom/daaw/avee/Common/VerticalSeekBar;->onSizeChanged(IIII)V

    return-void
.end method
