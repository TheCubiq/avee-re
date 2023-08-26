.class public Lcom/daaw/avee/comp/VisualUI/Fragment2;
.super Landroid/app/Fragment;
.source "Fragment2.java"


# static fields
.field public static onCustomizeAction:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onExportAction:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestIsExportAvailable:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestShowVideoContentState:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestUIComponentNeedChangedValue:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestVideoWidthHeightRatio:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static onSurfaceCreated:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
            ">;"
        }
    .end annotation
.end field

.field public static onUIComponentNeedChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onVideoElementInteracted:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onVideoSurfaceHolderCreated:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Landroid/view/SurfaceHolder;",
            ">;"
        }
    .end annotation
.end field

.field public static onVideoSurfaceHolderDestroyed:Lcom/daaw/avee/Common/Events/WeakEvent;


# instance fields
.field private btn1:Landroid/widget/ImageButton;

.field private layoutButtons:Landroid/view/View;

.field private layoutButtonsShadow:Landroid/view/View;

.field private rootView:Landroid/view/View;

.field private surfaceViewTag:I

.field private surfaceViewVideo:Landroid/view/SurfaceView;

.field private surfaceViewVideoTag:I

.field private surfaceViewVisualizer:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field private videoFrame:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

.field private widthHeightRatio:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onSurfaceCreated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 30
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestShowVideoContentState:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 32
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 33
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestVideoWidthHeightRatio:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 35
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestIsExportAvailable:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 36
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onExportAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 37
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onVideoSurfaceHolderCreated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 38
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onVideoSurfaceHolderDestroyed:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 39
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestUIComponentNeedChangedValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 40
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onVideoElementInteracted:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 41
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onUIComponentNeedChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 42
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onCustomizeAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewTag:I

    .line 51
    iput v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVideoTag:I

    const/4 v0, 0x0

    .line 54
    iput v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->widthHeightRatio:F

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/VisualUI/Fragment2;)Landroid/view/View;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->rootView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/VisualUI/Fragment2;Landroid/view/View;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->createThemeChooserMenu(Landroid/view/View;)V

    return-void
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/VisualUI/Fragment2;)I
    .locals 0

    .line 27
    iget p0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVideoTag:I

    return p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/VisualUI/Fragment2;)Landroid/view/SurfaceView;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVideo:Landroid/view/SurfaceView;

    return-object p0
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/VisualUI/Fragment2;)I
    .locals 0

    .line 27
    iget p0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewTag:I

    return p0
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/VisualUI/Fragment2;)Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVisualizer:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    return-object p0
.end method

.method static synthetic access$602(Lcom/daaw/avee/comp/VisualUI/Fragment2;F)F
    .locals 0

    .line 27
    iput p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->widthHeightRatio:F

    return p1
.end method

.method private createThemeChooserMenu(Landroid/view/View;)V
    .locals 0

    .line 331
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->createAndShowDialog(Landroid/app/Activity;)Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

    return-void
.end method

.method public static newInstance()Lcom/daaw/avee/comp/VisualUI/Fragment2;
    .locals 2

    .line 60
    new-instance v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;

    invoke-direct {v0}, Lcom/daaw/avee/comp/VisualUI/Fragment2;-><init>()V

    .line 61
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 62
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private static setStatusBarDimensions(Landroid/view/View;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 392
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 393
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/UtilsUI;->getStatusBarHeight(Landroid/content/Context;)I

    move-result p0

    iput p0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    return-void
.end method


# virtual methods
.method public animateShow(Z)V
    .locals 5

    .line 303
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->layoutButtons:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 307
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x10e0000

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 311
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->layoutButtons:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 312
    invoke-virtual {p1, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    int-to-long v3, v0

    .line 313
    invoke-virtual {p1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 315
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->layoutButtonsShadow:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 316
    invoke-virtual {p1, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 317
    invoke-virtual {p1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    goto :goto_0

    .line 320
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->layoutButtons:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->layoutButtons:Landroid/view/View;

    .line 321
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    int-to-long v2, v0

    .line 322
    invoke-virtual {p1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 324
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->layoutButtonsShadow:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->layoutButtons:Landroid/view/View;

    .line 325
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 326
    invoke-virtual {p1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    :goto_0
    return-void
.end method

.method isSurfaceVisible()Z
    .locals 2

    .line 199
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVideo:Landroid/view/SurfaceView;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVideoTag:I

    if-eq v0, v1, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVisualizer:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v0, :cond_1

    .line 200
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewTag:I

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method isViewCreated()Z
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->rootView:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const/4 p3, 0x0

    .line 118
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const v1, 0x7f0c0076

    .line 69
    invoke-virtual {p1, v1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->rootView:Landroid/view/View;

    const p2, 0x7f090272

    .line 71
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/UtilsUI;->setStatusBarDimensions(Landroid/view/View;)V

    .line 73
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->rootView:Landroid/view/View;

    new-instance p2, Lcom/daaw/avee/comp/VisualUI/Fragment2$1;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/VisualUI/Fragment2$1;-><init>(Lcom/daaw/avee/comp/VisualUI/Fragment2;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 93
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->layoutButtons:Landroid/view/View;

    const/high16 p2, 0x3f800000    # 1.0f

    if-eqz p1, :cond_1

    const v1, 0x7f09005c

    .line 94
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    .line 95
    new-instance v1, Lcom/daaw/avee/comp/VisualUI/Fragment2$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/VisualUI/Fragment2$2;-><init>(Lcom/daaw/avee/comp/VisualUI/Fragment2;)V

    invoke-virtual {p1, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->layoutButtons:Landroid/view/View;

    const v1, 0x7f09005d

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->btn1:Landroid/widget/ImageButton;

    .line 103
    new-instance v1, Lcom/daaw/avee/comp/VisualUI/Fragment2$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/VisualUI/Fragment2$3;-><init>(Lcom/daaw/avee/comp/VisualUI/Fragment2;)V

    invoke-virtual {p1, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->layoutButtons:Landroid/view/View;

    const v1, 0x7f090061

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    .line 111
    new-instance v1, Lcom/daaw/avee/comp/VisualUI/Fragment2$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/VisualUI/Fragment2$4;-><init>(Lcom/daaw/avee/comp/VisualUI/Fragment2;)V

    invoke-virtual {p1, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 118
    sget-object v1, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestIsExportAvailable:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-virtual {v1, v0}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 119
    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setAlpha(F)V

    goto :goto_0

    :cond_0
    const/high16 v1, 0x3e800000    # 0.25f

    .line 121
    invoke-virtual {p1, v1}, Landroid/widget/ImageButton;->setAlpha(F)V

    .line 124
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->rootView:Landroid/view/View;

    const v1, 0x7f0901eb

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/MyView;

    .line 125
    new-instance v1, Lcom/daaw/avee/comp/VisualUI/Fragment2$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/VisualUI/Fragment2$5;-><init>(Lcom/daaw/avee/comp/VisualUI/Fragment2;)V

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/MyView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->rootView:Landroid/view/View;

    const v1, 0x7f090269

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->videoFrame:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    .line 133
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->rootView:Landroid/view/View;

    const v1, 0x7f0901ed

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVisualizer:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p1, :cond_2

    .line 135
    new-instance v1, Lcom/daaw/avee/comp/VisualUI/Fragment2$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/VisualUI/Fragment2$6;-><init>(Lcom/daaw/avee/comp/VisualUI/Fragment2;)V

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->rootView:Landroid/view/View;

    const v1, 0x7f0901ec

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/SurfaceView;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVideo:Landroid/view/SurfaceView;

    .line 144
    new-instance v1, Lcom/daaw/avee/comp/VisualUI/Fragment2$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/VisualUI/Fragment2$7;-><init>(Lcom/daaw/avee/comp/VisualUI/Fragment2;)V

    invoke-virtual {p1, v1}, Landroid/view/SurfaceView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    sget-object p1, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onSurfaceCreated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVisualizer:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {p1, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 155
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVideo:Landroid/view/SurfaceView;

    if-eqz p1, :cond_3

    .line 156
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    .line 157
    sget-object v1, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onVideoSurfaceHolderCreated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v1, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 160
    :cond_3
    sget-object p1, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 161
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->updateVideoScaleMode(I)V

    .line 163
    sget-object p1, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestVideoWidthHeightRatio:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 164
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->setVideoSize(F)V

    .line 167
    sget-object p1, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestUIComponentNeedChangedValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 168
    sget-object p2, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestShowVideoContentState:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-virtual {p2, v0}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 169
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->updateSurfaceVisibility(ZZ)V

    .line 173
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->rootView:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 179
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onVideoSurfaceHolderDestroyed:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    .line 180
    invoke-super {p0}, Landroid/app/Fragment;->onDestroyView()V

    return-void
.end method

.method public onPause()V
    .locals 0

    .line 190
    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 185
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    return-void
.end method

.method public setShowVideoContentState(Z)V
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->isSurfaceVisible()Z

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->updateSurfaceVisibility(ZZ)V

    return-void
.end method

.method public setVideoSize(F)V
    .locals 1

    .line 273
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 274
    :cond_0
    iput p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->widthHeightRatio:F

    .line 275
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->rootView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->rootView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->updateVideoSize(FF)V

    return-void
.end method

.method public setVideoSizeTh(F)V
    .locals 2

    .line 279
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 280
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->rootView:Landroid/view/View;

    new-instance v1, Lcom/daaw/avee/comp/VisualUI/Fragment2$10;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/VisualUI/Fragment2$10;-><init>(Lcom/daaw/avee/comp/VisualUI/Fragment2;F)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public updateSurfaceVisibility(ZZ)V
    .locals 4

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-wide/16 v2, 0xfa

    const/4 p1, 0x1

    if-eqz p2, :cond_1

    .line 209
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVisualizer:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p2, :cond_0

    .line 210
    iput v1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewTag:I

    .line 211
    invoke-virtual {p2, v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setVisibility(I)V

    .line 214
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVideo:Landroid/view/SurfaceView;

    if-eqz p2, :cond_5

    .line 215
    iput p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVideoTag:I

    .line 216
    new-instance p1, Lcom/daaw/avee/comp/VisualUI/Fragment2$8;

    invoke-direct {p1, p0}, Lcom/daaw/avee/comp/VisualUI/Fragment2$8;-><init>(Lcom/daaw/avee/comp/VisualUI/Fragment2;)V

    invoke-virtual {p2, p1, v2, v3}, Landroid/view/SurfaceView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 230
    :cond_1
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVideo:Landroid/view/SurfaceView;

    if-eqz p2, :cond_2

    .line 231
    iput v1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVideoTag:I

    .line 232
    invoke-virtual {p2, v0}, Landroid/view/SurfaceView;->setVisibility(I)V

    .line 234
    :cond_2
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVisualizer:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p2, :cond_5

    .line 235
    iput p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewTag:I

    .line 236
    new-instance p1, Lcom/daaw/avee/comp/VisualUI/Fragment2$9;

    invoke-direct {p1, p0}, Lcom/daaw/avee/comp/VisualUI/Fragment2$9;-><init>(Lcom/daaw/avee/comp/VisualUI/Fragment2;)V

    invoke-virtual {p2, p1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 247
    :cond_3
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVideo:Landroid/view/SurfaceView;

    if-eqz p1, :cond_4

    .line 248
    iput v1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVideoTag:I

    .line 249
    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setVisibility(I)V

    .line 251
    :cond_4
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewVisualizer:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p1, :cond_5

    .line 252
    iput v1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->surfaceViewTag:I

    .line 253
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setVisibility(I)V

    :cond_5
    :goto_0
    return-void
.end method

.method public updateVideoScaleMode(I)V
    .locals 0

    return-void
.end method

.method updateVideoSize(FF)V
    .locals 3

    .line 290
    iget v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->widthHeightRatio:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-nez v2, :cond_0

    cmpl-float v0, p1, v1

    if-lez v0, :cond_1

    cmpl-float v0, p2, v1

    if-lez v0, :cond_1

    div-float/2addr p1, p2

    .line 294
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->videoFrame:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;->setAspectRatio(F)V

    goto :goto_0

    .line 297
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->videoFrame:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;->setAspectRatio(F)V

    :cond_1
    :goto_0
    return-void
.end method
