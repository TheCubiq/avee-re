.class Lcom/daaw/avee/comp/MediaControlsUI/MyTitleScrollingMovementMethod;
.super Ljava/lang/Object;
.source "MyTitleScrollingMovementMethod.java"

# interfaces
.implements Landroid/text/method/MovementMethod;


# static fields
.field private static sInstance:Lcom/daaw/avee/comp/MediaControlsUI/MyTitleScrollingMovementMethod;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Landroid/text/method/MovementMethod;
    .locals 1

    .line 20
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MyTitleScrollingMovementMethod;->sInstance:Lcom/daaw/avee/comp/MediaControlsUI/MyTitleScrollingMovementMethod;

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Lcom/daaw/avee/comp/MediaControlsUI/MyTitleScrollingMovementMethod;

    invoke-direct {v0}, Lcom/daaw/avee/comp/MediaControlsUI/MyTitleScrollingMovementMethod;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MyTitleScrollingMovementMethod;->sInstance:Lcom/daaw/avee/comp/MediaControlsUI/MyTitleScrollingMovementMethod;

    .line 23
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MyTitleScrollingMovementMethod;->sInstance:Lcom/daaw/avee/comp/MediaControlsUI/MyTitleScrollingMovementMethod;

    return-object v0
.end method


# virtual methods
.method public canSelectArbitrarily()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public initialize(Landroid/widget/TextView;Landroid/text/Spannable;)V
    .locals 0

    return-void
.end method

.method public onGenericMotionEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onKeyDown(Landroid/widget/TextView;Landroid/text/Spannable;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onKeyOther(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onKeyUp(Landroid/widget/TextView;Landroid/text/Spannable;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onTakeFocus(Landroid/widget/TextView;Landroid/text/Spannable;I)V
    .locals 2

    .line 47
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object p2

    if-eqz p2, :cond_0

    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_0

    .line 50
    invoke-virtual {p1}, Landroid/widget/TextView;->getScrollX()I

    move-result v0

    const/4 v1, 0x0

    .line 51
    invoke-virtual {p2, v1}, Landroid/text/Layout;->getLineTop(I)I

    move-result v1

    .line 50
    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->scrollTo(II)V

    :cond_0
    if-eqz p2, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_1

    .line 54
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result p3

    .line 55
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingBottom()I

    move-result v0

    add-int/2addr p3, v0

    .line 56
    invoke-virtual {p2}, Landroid/text/Layout;->getLineCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 58
    invoke-virtual {p1}, Landroid/widget/TextView;->getScrollX()I

    move-result v1

    add-int/lit8 v0, v0, 0x1

    .line 59
    invoke-virtual {p2, v0}, Landroid/text/Layout;->getLineTop(I)I

    move-result p2

    .line 60
    invoke-virtual {p1}, Landroid/widget/TextView;->getHeight()I

    move-result v0

    sub-int/2addr v0, p3

    sub-int/2addr p2, v0

    .line 58
    invoke-virtual {p1, v1, p2}, Landroid/widget/TextView;->scrollTo(II)V

    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onTrackballEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
