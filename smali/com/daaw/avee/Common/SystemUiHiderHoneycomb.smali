.class public Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;
.super Lcom/daaw/avee/Common/SystemUiHider;
.source "SystemUiHiderHoneycomb.java"


# instance fields
.field private mHideFlags:I

.field private mShowFlags:I

.field private mSystemUiVisibilityChangeListener:Landroid/view/View$OnSystemUiVisibilityChangeListener;

.field private mTestFlags:I

.field private mVisible:Z


# direct methods
.method public constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 83
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Common/SystemUiHider;-><init>(Landroid/view/View;I)V

    const/4 p1, 0x1

    .line 37
    iput-boolean p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mVisible:Z

    .line 38
    new-instance p2, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb$1;

    invoke-direct {p2, p0}, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb$1;-><init>(Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;)V

    iput-object p2, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mSystemUiVisibilityChangeListener:Landroid/view/View$OnSystemUiVisibilityChangeListener;

    const/4 p2, 0x0

    .line 85
    iput p2, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mShowFlags:I

    .line 86
    iput p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mHideFlags:I

    .line 87
    iput p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mTestFlags:I

    .line 89
    iget p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mFlags:I

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    const/16 p1, 0x400

    .line 102
    iput p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mShowFlags:I

    const/16 p1, 0x404

    .line 103
    iput p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mHideFlags:I

    const/4 p1, 0x4

    .line 106
    iput p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mTestFlags:I

    .line 109
    :cond_0
    iget p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mFlags:I

    and-int/lit8 p1, p1, 0x6

    if-eqz p1, :cond_1

    .line 111
    iget p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mShowFlags:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mShowFlags:I

    .line 112
    iget p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mHideFlags:I

    or-int/lit16 p1, p1, 0x202

    iput p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mHideFlags:I

    .line 116
    iget p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mTestFlags:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mTestFlags:I

    :cond_1
    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;)I
    .locals 0

    .line 13
    iget p0, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mTestFlags:I

    return p0
.end method

.method static synthetic access$102(Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;Z)Z
    .locals 0

    .line 13
    iput-boolean p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mVisible:Z

    return p1
.end method

.method static synthetic access$200(Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;)I
    .locals 0

    .line 13
    iget p0, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mShowFlags:I

    return p0
.end method


# virtual methods
.method public hide()V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mAnchorView:Landroid/view/View;

    iget v1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mHideFlags:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method public isVisible()Z
    .locals 1

    .line 149
    iget-boolean v0, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mVisible:Z

    return v0
.end method

.method public setup()V
    .locals 2

    .line 125
    iget-object v0, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mAnchorView:Landroid/view/View;

    iget-object v1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mSystemUiVisibilityChangeListener:Landroid/view/View$OnSystemUiVisibilityChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    return-void
.end method

.method public show()V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mAnchorView:Landroid/view/View;

    iget v1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mShowFlags:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method
