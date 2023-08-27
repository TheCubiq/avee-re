.class Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;
.super Landroid/widget/PopupWindow;
.source "ThreeDotPopupWindow.java"


# instance fields
.field private btn3:Landroid/widget/ImageView;

.field private btn4:Landroid/widget/ImageView;

.field buttonColor:I

.field private buttonIcons:[Landroid/widget/ImageView;

.field private buttonTexts:[Landroid/widget/TextView;

.field private handler:Landroid/os/Handler;

.field private musicSys0Button:Landroid/widget/ImageView;

.field private musicSys1Button:Landroid/widget/ImageView;

.field private repeatAllButton:Landroid/widget/ImageView;

.field private repeatOnceButton:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 11

    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 166
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const v4, 0x7f110107

    .line 40
    invoke-direct {p0, v0, v1, v2, v4}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x7

    new-array v4, v0, [Landroid/widget/TextView;

    .line 34
    iput-object v4, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->buttonTexts:[Landroid/widget/TextView;

    new-array v4, v0, [Landroid/widget/ImageView;

    .line 35
    iput-object v4, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->buttonIcons:[Landroid/widget/ImageView;

    .line 42
    new-instance v4, Landroid/os/Handler;

    new-instance v5, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$1;

    invoke-direct {v5, p0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$1;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;)V

    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v4, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->handler:Landroid/os/Handler;

    const v4, 0x7f0401bf

    .line 52
    invoke-static {p1, v4}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v4

    iput v4, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->buttonColor:I

    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x7f0c00ba

    invoke-static {v4, v5, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    new-array v0, v0, [Landroid/view/View;

    const v4, 0x7f09010b

    .line 57
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    aput-object v4, v0, v2

    const v4, 0x7f09010c

    .line 58
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v0, v5

    const v4, 0x7f090111

    .line 59
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v6, 0x2

    aput-object v4, v0, v6

    const v4, 0x7f09010f

    .line 60
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v7, 0x3

    aput-object v4, v0, v7

    const v4, 0x7f09010e

    .line 62
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v8, 0x4

    aput-object v4, v0, v8

    const v4, 0x7f09010d

    .line 63
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const/4 v9, 0x5

    aput-object v4, v0, v9

    const v4, 0x7f09007d

    .line 65
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->musicSys0Button:Landroid/widget/ImageView;

    .line 66
    aget-object v4, v0, v2

    new-instance v10, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$2;

    invoke-direct {v10, p0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$2;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;)V

    invoke-virtual {v4, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f09007e

    .line 73
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->musicSys1Button:Landroid/widget/ImageView;

    .line 74
    aget-object v4, v0, v5

    new-instance v10, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$3;

    invoke-direct {v10, p0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$3;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;)V

    invoke-virtual {v4, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f09008d

    .line 82
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->btn3:Landroid/widget/ImageView;

    .line 83
    aget-object v4, v0, v6

    new-instance v10, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$4;

    invoke-direct {v10, p0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$4;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;)V

    invoke-virtual {v4, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f09008b

    .line 90
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->btn4:Landroid/widget/ImageView;

    .line 91
    aget-object v4, v0, v7

    new-instance v7, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$5;

    invoke-direct {v7, p0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$5;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;)V

    invoke-virtual {v4, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f090084

    .line 116
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->repeatOnceButton:Landroid/widget/ImageView;

    .line 117
    aget-object v4, v0, v8

    new-instance v7, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$6;

    invoke-direct {v7, p0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$6;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;)V

    invoke-virtual {v4, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f090083

    .line 131
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->repeatAllButton:Landroid/widget/ImageView;

    .line 132
    aget-object v0, v0, v9

    new-instance v4, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$7;

    invoke-direct {v4, p0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$7;-><init>(Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->setContentView(Landroid/view/View;)V

    const/4 v0, -0x2

    .line 157
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->setHeight(I)V

    .line 158
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->setWidth(I)V

    .line 161
    invoke-virtual {p0, v5}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->setOutsideTouchable(Z)V

    .line 162
    invoke-virtual {p0, v5}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->setFocusable(Z)V

    .line 164
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->btn4:Landroid/widget/ImageView;

    iget v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->buttonColor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 166
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 167
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->updateVideoScaleMode(I)V

    .line 169
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestMusicSystemIndex:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 170
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->onMusicSysChanged(I)V

    .line 171
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestRepeatMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->onRepeatModeChanged(I)V

    .line 172
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestShuffleMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->onShuffleModeChanged(I)V

    .line 175
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const v1, 0x800053

    const/16 v3, 0x11

    if-lt v0, v3, :cond_0

    new-array v0, v6, [I

    .line 177
    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    .line 178
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    invoke-virtual {p1}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 179
    iget v3, v3, Landroid/graphics/Point;->y:I

    aget v4, v0, v5

    sub-int/2addr v3, v4

    aput v3, v0, v5

    .line 180
    aget v2, v0, v2

    aget v0, v0, v5

    invoke-virtual {p0, p1, v1, v2, v0}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->showAtLocation(Landroid/view/View;III)V

    goto :goto_0

    .line 182
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f07015e

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 183
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07015f

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    .line 184
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 185
    invoke-virtual {p1, v4}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 186
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    new-array v6, v6, [I

    .line 188
    invoke-virtual {p1, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 190
    aget v2, v6, v2

    sub-int/2addr v2, v3

    aget v3, v6, v5

    sub-int/2addr v4, v3

    add-int/2addr v4, v0

    invoke-virtual {p0, p1, v1, v2, v4}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->showAtLocation(Landroid/view/View;III)V

    :goto_0
    return-void
.end method


# virtual methods
.method public onMusicSysChanged(I)V
    .locals 2

    const v0, 0x7f0401c1

    const v1, 0x7f0401bf

    if-nez p1, :cond_0

    .line 219
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->musicSys0Button:Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 220
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->musicSys1Button:Landroid/widget/ImageView;

    invoke-static {p1, v1}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_0

    .line 222
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->musicSys0Button:Landroid/widget/ImageView;

    invoke-static {p1, v1}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 223
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->musicSys1Button:Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    :goto_0
    return-void
.end method

.method public onRepeatModeChanged(I)V
    .locals 2

    const v0, 0x7f0401c1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 199
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->repeatOnceButton:Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 200
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->repeatAllButton:Landroid/widget/ImageView;

    iget v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->buttonColor:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne p1, v1, :cond_1

    .line 202
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->repeatOnceButton:Landroid/widget/ImageView;

    iget v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->buttonColor:I

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 203
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->repeatAllButton:Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_0

    .line 205
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->repeatOnceButton:Landroid/widget/ImageView;

    iget v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->buttonColor:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 206
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->repeatAllButton:Landroid/widget/ImageView;

    iget v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->buttonColor:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    :goto_0
    return-void
.end method

.method public onShuffleModeChanged(I)V
    .locals 0

    return-void
.end method

.method public updateVideoScaleMode(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 229
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->btn3:Landroid/widget/ImageView;

    const v0, 0x7f080112

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 231
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->btn3:Landroid/widget/ImageView;

    const v0, 0x7f080113

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 233
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->btn3:Landroid/widget/ImageView;

    const v0, 0x7f080115

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 236
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->btn3:Landroid/widget/ImageView;

    iget v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;->buttonColor:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    return-void
.end method
