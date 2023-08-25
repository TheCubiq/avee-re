.class public Lcom/daaw/o30;
.super Landroid/app/Fragment;
.source ""


# static fields
.field public static A:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static B:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/al;",
            ">;"
        }
    .end annotation
.end field

.field public static C:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Landroid/view/SurfaceHolder;",
            ">;"
        }
    .end annotation
.end field

.field public static D:Lcom/daaw/pw1;

.field public static E:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static F:Lcom/daaw/pw1;

.field public static G:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static H:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/al;",
            ">;"
        }
    .end annotation
.end field

.field public static w:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
            ">;"
        }
    .end annotation
.end field

.field public static x:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static y:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static z:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public p:Landroid/view/View;

.field public q:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

.field public r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field public s:Landroid/view/SurfaceView;

.field public t:I

.field public u:I

.field public v:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/o30;->w:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/o30;->x:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/o30;->y:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/o30;->z:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/o30;->A:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/o30;->B:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/o30;->C:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/pw1;

    invoke-direct {v0}, Lcom/daaw/pw1;-><init>()V

    sput-object v0, Lcom/daaw/o30;->D:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/o30;->E:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/pw1;

    invoke-direct {v0}, Lcom/daaw/pw1;-><init>()V

    sput-object v0, Lcom/daaw/o30;->F:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/o30;->G:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/o30;->H:Lcom/daaw/qw1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/o30;->t:I

    iput v0, p0, Lcom/daaw/o30;->u:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/o30;->v:F

    return-void
.end method

.method public static synthetic a(Lcom/daaw/o30;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/daaw/o30;->p:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/o30;)I
    .locals 0

    iget p0, p0, Lcom/daaw/o30;->u:I

    return p0
.end method

.method public static synthetic c(Lcom/daaw/o30;)Landroid/view/SurfaceView;
    .locals 0

    iget-object p0, p0, Lcom/daaw/o30;->s:Landroid/view/SurfaceView;

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/o30;)I
    .locals 0

    iget p0, p0, Lcom/daaw/o30;->t:I

    return p0
.end method

.method public static synthetic e(Lcom/daaw/o30;)Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;
    .locals 0

    iget-object p0, p0, Lcom/daaw/o30;->r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/o30;F)F
    .locals 0

    iput p1, p0, Lcom/daaw/o30;->v:F

    return p1
.end method

.method public static i()Lcom/daaw/o30;
    .locals 2

    new-instance v0, Lcom/daaw/o30;

    invoke-direct {v0}, Lcom/daaw/o30;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public g()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/o30;->s:Landroid/view/SurfaceView;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/daaw/o30;->u:I

    if-eq v0, v1, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/daaw/o30;->r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/daaw/o30;->t:I

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/o30;->p:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(Z)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/o30;->g()Z

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/daaw/o30;->m(ZZ)V

    return-void
.end method

.method public k(F)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/o30;->h()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/daaw/o30;->v:F

    iget-object p1, p0, Lcom/daaw/o30;->p:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/daaw/o30;->p:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/o30;->o(FF)V

    return-void
.end method

.method public l(F)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/o30;->h()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/o30;->p:Landroid/view/View;

    new-instance v1, Lcom/daaw/o30$g;

    invoke-direct {v1, p0, p1}, Lcom/daaw/o30$g;-><init>(Lcom/daaw/o30;F)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public m(ZZ)V
    .locals 4

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-wide/16 v2, 0xfa

    const/4 p1, 0x1

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/daaw/o30;->r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p2, :cond_0

    iput v1, p0, Lcom/daaw/o30;->t:I

    invoke-virtual {p2, v0}, Landroid/opengl/GLSurfaceView;->setVisibility(I)V

    :cond_0
    iget-object p2, p0, Lcom/daaw/o30;->s:Landroid/view/SurfaceView;

    if-eqz p2, :cond_5

    iput p1, p0, Lcom/daaw/o30;->u:I

    new-instance p1, Lcom/daaw/o30$e;

    invoke-direct {p1, p0}, Lcom/daaw/o30$e;-><init>(Lcom/daaw/o30;)V

    invoke-virtual {p2, p1, v2, v3}, Landroid/view/SurfaceView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/daaw/o30;->s:Landroid/view/SurfaceView;

    if-eqz p2, :cond_2

    iput v1, p0, Lcom/daaw/o30;->u:I

    invoke-virtual {p2, v0}, Landroid/view/SurfaceView;->setVisibility(I)V

    :cond_2
    iget-object p2, p0, Lcom/daaw/o30;->r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p2, :cond_5

    iput p1, p0, Lcom/daaw/o30;->t:I

    new-instance p1, Lcom/daaw/o30$f;

    invoke-direct {p1, p0}, Lcom/daaw/o30$f;-><init>(Lcom/daaw/o30;)V

    invoke-virtual {p2, p1, v2, v3}, Landroid/opengl/GLSurfaceView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/daaw/o30;->s:Landroid/view/SurfaceView;

    if-eqz p1, :cond_4

    iput v1, p0, Lcom/daaw/o30;->u:I

    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setVisibility(I)V

    :cond_4
    iget-object p1, p0, Lcom/daaw/o30;->r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p1, :cond_5

    iput v1, p0, Lcom/daaw/o30;->t:I

    invoke-virtual {p1, v0}, Landroid/opengl/GLSurfaceView;->setVisibility(I)V

    :cond_5
    :goto_0
    return-void
.end method

.method public n(I)V
    .locals 0

    return-void
.end method

.method public o(FF)V
    .locals 3

    iget v0, p0, Lcom/daaw/o30;->v:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-nez v2, :cond_0

    cmpl-float v0, p1, v1

    if-lez v0, :cond_1

    cmpl-float v0, p2, v1

    if-lez v0, :cond_1

    div-float/2addr p1, p2

    iget-object p2, p0, Lcom/daaw/o30;->q:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;->setAspectRatio(F)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/o30;->q:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;->setAspectRatio(F)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c0079

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/o30;->p:Landroid/view/View;

    const p2, 0x7f090313

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/gr1;->u(Landroid/view/View;)V

    iget-object p1, p0, Lcom/daaw/o30;->p:Landroid/view/View;

    new-instance p2, Lcom/daaw/o30$a;

    invoke-direct {p2, p0}, Lcom/daaw/o30$a;-><init>(Lcom/daaw/o30;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p1, p0, Lcom/daaw/o30;->p:Landroid/view/View;

    const p2, 0x7f09027e

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/MyView;

    new-instance p2, Lcom/daaw/o30$b;

    invoke-direct {p2, p0}, Lcom/daaw/o30$b;-><init>(Lcom/daaw/o30;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/daaw/o30;->p:Landroid/view/View;

    const p2, 0x7f09030a

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    iput-object p1, p0, Lcom/daaw/o30;->q:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    iget-object p1, p0, Lcom/daaw/o30;->p:Landroid/view/View;

    const p2, 0x7f090280

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-object p1, p0, Lcom/daaw/o30;->r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p1, :cond_0

    new-instance p2, Lcom/daaw/o30$c;

    invoke-direct {p2, p0}, Lcom/daaw/o30$c;-><init>(Lcom/daaw/o30;)V

    invoke-virtual {p1, p2}, Landroid/opengl/GLSurfaceView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    iget-object p1, p0, Lcom/daaw/o30;->p:Landroid/view/View;

    const p2, 0x7f09027f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/SurfaceView;

    iput-object p1, p0, Lcom/daaw/o30;->s:Landroid/view/SurfaceView;

    new-instance p2, Lcom/daaw/o30$d;

    invoke-direct {p2, p0}, Lcom/daaw/o30$d;-><init>(Lcom/daaw/o30;)V

    invoke-virtual {p1, p2}, Landroid/view/SurfaceView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget-object p1, Lcom/daaw/o30;->w:Lcom/daaw/qw1;

    iget-object p2, p0, Lcom/daaw/o30;->r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {p1, p2}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/o30;->s:Landroid/view/SurfaceView;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    sget-object p2, Lcom/daaw/o30;->C:Lcom/daaw/qw1;

    invoke-virtual {p2, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_1
    sget-object p1, Lcom/daaw/o30;->y:Lcom/daaw/vw1;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/o30;->n(I)V

    sget-object p1, Lcom/daaw/o30;->z:Lcom/daaw/vw1;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/o30;->k(F)V

    sget-object p1, Lcom/daaw/o30;->E:Lcom/daaw/vw1;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    sget-object p2, Lcom/daaw/o30;->x:Lcom/daaw/vw1;

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, p3}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/daaw/o30;->m(ZZ)V

    iget-object p1, p0, Lcom/daaw/o30;->p:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    sget-object v0, Lcom/daaw/o30;->D:Lcom/daaw/pw1;

    invoke-virtual {v0}, Lcom/daaw/pw1;->a()V

    invoke-super {p0}, Landroid/app/Fragment;->onDestroyView()V

    return-void
.end method

.method public onPause()V
    .locals 0

    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    return-void
.end method
