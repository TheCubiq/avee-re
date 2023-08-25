.class public Lcom/daaw/pv1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static u:Lcom/daaw/ow1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ow1<",
            "Lcom/daaw/avee/comp/playback/a;",
            "Lcom/daaw/avee/comp/playback/a$g;",
            "Lcom/daaw/avee/comp/playback/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public volatile a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/SurfaceHolder;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
            ">;"
        }
    .end annotation
.end field

.field public volatile c:F

.field public d:Z

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public f:Landroid/os/Handler;

.field public g:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/lang/String;

.field public j:Z

.field public final k:Ljava/util/Random;

.field public l:Landroid/os/Handler;

.field public m:Lcom/daaw/bs1;

.field public n:Lcom/daaw/bs1;

.field public o:F

.field public p:I

.field public final q:Lcom/daaw/p80;

.field public final r:Lcom/daaw/p80;

.field public s:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public t:Lcom/daaw/z31;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ow1;

    invoke-direct {v0}, Lcom/daaw/ow1;-><init>()V

    sput-object v0, Lcom/daaw/pv1;->u:Lcom/daaw/ow1;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/pv1;->a:Ljava/lang/ref/WeakReference;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/pv1;->b:Ljava/lang/ref/WeakReference;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/pv1;->c:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/pv1;->d:Z

    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    iput-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    iput-object v2, p0, Lcom/daaw/pv1;->f:Landroid/os/Handler;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/daaw/pv1;->g:Ljava/lang/ref/WeakReference;

    iput-object v1, p0, Lcom/daaw/pv1;->h:Ljava/util/List;

    iput-object v1, p0, Lcom/daaw/pv1;->i:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/pv1;->j:Z

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    iput-object v2, p0, Lcom/daaw/pv1;->k:Ljava/util/Random;

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    iput-object v2, p0, Lcom/daaw/pv1;->l:Landroid/os/Handler;

    new-instance v2, Lcom/daaw/bs1;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v2, p0, Lcom/daaw/pv1;->m:Lcom/daaw/bs1;

    new-instance v2, Lcom/daaw/bs1;

    invoke-direct {v2, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v2, p0, Lcom/daaw/pv1;->n:Lcom/daaw/bs1;

    iput v3, p0, Lcom/daaw/pv1;->o:F

    const/4 v2, -0x1

    iput v2, p0, Lcom/daaw/pv1;->p:I

    new-instance v2, Lcom/daaw/p80;

    sget-object v3, Lcom/daaw/p80;->f:Lcom/daaw/p80$a;

    invoke-direct {v2, v3}, Lcom/daaw/p80;-><init>(Lcom/daaw/p80$a;)V

    iput-object v2, p0, Lcom/daaw/pv1;->q:Lcom/daaw/p80;

    new-instance v2, Lcom/daaw/p80;

    sget-object v3, Lcom/daaw/p80;->g:Lcom/daaw/p80$a;

    invoke-direct {v2, v3}, Lcom/daaw/p80;-><init>(Lcom/daaw/p80$a;)V

    iput-object v2, p0, Lcom/daaw/pv1;->r:Lcom/daaw/p80;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/daaw/pv1;->s:Ljava/util/HashMap;

    new-instance v2, Lcom/daaw/z31;

    invoke-direct {v2}, Lcom/daaw/z31;-><init>()V

    iput-object v2, p0, Lcom/daaw/pv1;->t:Lcom/daaw/z31;

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v3

    const-string v4, "pref_highQualityBlur"

    invoke-virtual {v3, v2, v4, v1}, Lcom/daaw/j5;->K(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/pv1;->j:Z

    sget-object v0, Lcom/daaw/avee/SettingsActivity;->s:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/pv1$k;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$k;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->h0:Lcom/daaw/tw1;

    new-instance v1, Lcom/daaw/pv1$v;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$v;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/tw1;->b(Lcom/daaw/tw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->v0:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/pv1$g0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$g0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->u0:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/pv1$q0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$q0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->t0:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/pv1$r0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$r0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/o30;->w:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/pv1$s0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$s0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/b5;->d:Lcom/daaw/xw1;

    new-instance v1, Lcom/daaw/pv1$t0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$t0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/xw1;->b(Lcom/daaw/xw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->A:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/pv1$u0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$u0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->u:Lcom/daaw/xw1;

    new-instance v1, Lcom/daaw/pv1$v0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$v0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/xw1;->b(Lcom/daaw/xw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->v:Lcom/daaw/zw1;

    new-instance v1, Lcom/daaw/pv1$a;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$a;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/zw1;->b(Lcom/daaw/zw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->w:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/pv1$b;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$b;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->x:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/pv1$c;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$c;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->G:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/pv1$d;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$d;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/iv1;->y:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/pv1$e;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$e;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/iv1;->F:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/pv1$f;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$f;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/iv1;->z:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/pv1$g;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$g;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/iv1;->A:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/pv1$h;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$h;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/iv1;->B:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/pv1$i;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$i;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/iv1;->C:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/pv1$j;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$j;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/j5;->i:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/pv1$l;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$l;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->y:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/pv1$m;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$m;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->z:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/pv1$n;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$n;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->J:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/pv1$o;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$o;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/b5;->f:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/pv1$p;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$p;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/b5;->h:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/pv1$q;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$q;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/o30;->x:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/pv1$r;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$r;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ko0;->j0:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/pv1$s;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$s;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/o30;->y:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/pv1$t;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$t;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ko0;->i0:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/pv1$u;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$u;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/o30;->z:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/pv1$w;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$w;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ko0;->k0:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/pv1$x;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$x;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/o30;->C:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/pv1$y;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$y;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/o30;->D:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/pv1$z;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$z;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->p0:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/pv1$a0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$a0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/o30;->G:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/pv1$b0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$b0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/o30;->E:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/pv1$c0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$c0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/o30;->F:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/pv1$d0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$d0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/o30;->H:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/pv1$e0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$e0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->L:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/pv1$f0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$f0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->M:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/pv1$h0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$h0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->I:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/pv1$i0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$i0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->E:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/pv1$j0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$j0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->G:Lcom/daaw/tw1;

    new-instance v1, Lcom/daaw/pv1$k0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$k0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/tw1;->b(Lcom/daaw/tw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->H:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/pv1$l0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$l0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->J:Lcom/daaw/uw1;

    new-instance v1, Lcom/daaw/pv1$m0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$m0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/uw1;->b(Lcom/daaw/uw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ho;->K:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/pv1$n0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$n0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/j5;->g:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/pv1$o0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$o0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/j5;->h:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/pv1$p0;

    invoke-direct {v1, p0}, Lcom/daaw/pv1$p0;-><init>(Lcom/daaw/pv1;)V

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->L0:Lcom/daaw/xw1;

    sget-object v1, Lcom/daaw/mv1;->a:Lcom/daaw/mv1;

    iget-object v2, p0, Lcom/daaw/pv1;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/xw1;->b(Lcom/daaw/xw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic A(Lcom/daaw/pv1;F)F
    .locals 0

    iput p1, p0, Lcom/daaw/pv1;->c:F

    return p1
.end method

.method public static synthetic B(Lcom/daaw/pv1;F)F
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/pv1;->Q(F)F

    move-result p0

    return p0
.end method

.method public static synthetic C(Lcom/daaw/pv1;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pv1;->f:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic D(Lcom/daaw/pv1;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pv1;->b:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static synthetic E(Lcom/daaw/pv1;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1;->b:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method public static synthetic F(Lcom/daaw/pv1;ILcom/daaw/avee/comp/playback/a;)Lcom/daaw/avee/comp/playback/a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/pv1;->P(ILcom/daaw/avee/comp/playback/a;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lcom/daaw/pv1;)F
    .locals 0

    iget p0, p0, Lcom/daaw/pv1;->o:F

    return p0
.end method

.method public static synthetic H(Lcom/daaw/pv1;F)F
    .locals 1

    iget v0, p0, Lcom/daaw/pv1;->o:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/daaw/pv1;->o:F

    return v0
.end method

.method public static synthetic I(Lcom/daaw/pv1;)Lcom/daaw/bs1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pv1;->m:Lcom/daaw/bs1;

    return-object p0
.end method

.method public static J(Lcom/daaw/vn;Ljava/util/List;I)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vn;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I)I"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    const/4 v1, -0x1

    if-nez p0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-static {}, Lcom/daaw/tv1;->i()Lcom/daaw/tv1;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/daaw/tv1;->g(I)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-static {v3}, Lcom/daaw/j5;->j0(I)I

    move-result v4

    if-gez v4, :cond_3

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const p1, 0x7f1002e1

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {p1, p0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_2
    return v1

    :cond_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/daaw/vn;->h()I

    move-result v1

    if-gez v1, :cond_4

    if-lez p2, :cond_4

    invoke-virtual {p0, p2}, Lcom/daaw/vn;->q(I)V

    :cond_4
    invoke-virtual {v0, v3, p0, v2}, Lcom/daaw/j5;->W(ILcom/daaw/vn;Z)V

    invoke-virtual {v0, p1}, Lcom/daaw/j5;->f0(Ljava/util/List;)V

    return v3

    :cond_5
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method public static K(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/f61;ILjava/lang/String;Lcom/daaw/vn;Z)V
    .locals 1

    if-nez p4, :cond_1

    if-eqz p0, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/vn;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p4}, Lcom/daaw/vn;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p0, :cond_2

    invoke-virtual {p0, p4}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/vn;)V

    :cond_2
    if-eqz p1, :cond_8

    :goto_0
    invoke-virtual {p1, p4}, Lcom/daaw/f61;->t0(Lcom/daaw/vn;)V

    goto :goto_1

    :cond_3
    const-string v0, "visualizer customization, version mismatch"

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    if-eqz p5, :cond_5

    if-eqz p0, :cond_4

    invoke-virtual {p0, p4}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/vn;)V

    :cond_4
    if-eqz p1, :cond_8

    goto :goto_0

    :cond_5
    invoke-virtual {p4, p3}, Lcom/daaw/vn;->t(Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p3

    const/4 p5, 0x0

    invoke-virtual {p3, p2, p4, p5}, Lcom/daaw/j5;->W(ILcom/daaw/vn;Z)V

    invoke-static {}, Lcom/daaw/dx0;->c()Landroid/content/Context;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance p3, Landroid/app/AlertDialog$Builder;

    invoke-direct {p3, p2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const p2, 0x7f1002d8

    invoke-virtual {p3, p2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_6
    if-eqz p0, :cond_7

    invoke-virtual {p0, p4}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/vn;)V

    :cond_7
    if-eqz p1, :cond_8

    goto :goto_0

    :cond_8
    :goto_1
    return-void
.end method

.method public static O(I[I)Lcom/daaw/vn;
    .locals 2

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/daaw/j5;->n(I[I)Lcom/daaw/vn;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/daaw/tv1;->i()Lcom/daaw/tv1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/tv1;->b(I)Lcom/daaw/vn;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    const/4 p0, 0x0

    invoke-virtual {v0}, Lcom/daaw/vn;->o()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/j5;->g(Ljava/lang/String;)I

    move-result v1

    aput v1, p1, p0

    :cond_1
    return-object v0
.end method

.method public static synthetic T(Lcom/daaw/al;Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_0
    sget-object p1, Lcom/daaw/o30;->B:Lcom/daaw/qw1;

    :goto_0
    invoke-virtual {p1, p0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :goto_1
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_1
    sget-object p1, Lcom/daaw/o30;->H:Lcom/daaw/qw1;

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/al;->a()Landroid/app/Activity;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/iv1;->d(Landroid/app/Activity;)Lcom/daaw/iv1;

    goto :goto_1
.end method

.method public static synthetic U(Lcom/daaw/ho;Lcom/daaw/vn;ZI)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ho;->x(Lcom/daaw/vn;ZI)V

    return-void
.end method

.method public static synthetic V(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/ho;Lcom/daaw/vn;ZILcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 0

    new-instance p5, Lcom/daaw/nv1;

    invoke-direct {p5, p1, p2, p3, p4}, Lcom/daaw/nv1;-><init>(Lcom/daaw/ho;Lcom/daaw/vn;ZI)V

    invoke-virtual {p0, p5}, Landroid/opengl/GLSurfaceView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic W(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V
    .locals 9

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/daaw/vn;->d()Lcom/daaw/vn;

    move-result-object v6

    new-instance v7, Lcom/daaw/ht;

    invoke-direct {v7}, Lcom/daaw/ht;-><init>()V

    new-instance v8, Lcom/daaw/lv1;

    move-object v0, v8

    move-object v1, p0

    move-object v3, v6

    move v4, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/daaw/lv1;-><init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/ho;Lcom/daaw/vn;ZI)V

    invoke-virtual {p0, v6, v7, v8}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->j(Lcom/daaw/vn;Lcom/daaw/od0;Lcom/daaw/e0;)V

    :cond_0
    return-void
.end method

.method public static Z(I)V
    .locals 3

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->I:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Lcom/daaw/j5;->d0(IIZ)V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p0

    sget v0, Lcom/daaw/j5;->o:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/j5;->a0(IZ)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/al;Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/pv1;->T(Lcom/daaw/al;Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/ho;Lcom/daaw/vn;ZILcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/daaw/pv1;->V(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/ho;Lcom/daaw/vn;ZILcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    return-void
.end method

.method public static b0(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V
    .locals 1

    new-instance v0, Lcom/daaw/ov1;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/ov1;-><init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V

    invoke-virtual {p0, v0}, Landroid/opengl/GLSurfaceView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic c(Lcom/daaw/ho;Lcom/daaw/vn;ZI)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/pv1;->U(Lcom/daaw/ho;Lcom/daaw/vn;ZI)V

    return-void
.end method

.method public static synthetic d(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/pv1;->W(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V

    return-void
.end method

.method public static synthetic h(Lcom/daaw/pv1;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/pv1;->j:Z

    return p1
.end method

.method public static synthetic i(Lcom/daaw/pv1;)I
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/pv1;->N()I

    move-result p0

    return p0
.end method

.method public static synthetic j(Lcom/daaw/pv1;)Lcom/daaw/bs1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pv1;->n:Lcom/daaw/bs1;

    return-object p0
.end method

.method public static synthetic k(Lcom/daaw/pv1;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/pv1;->L(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/daaw/pv1;)Lcom/daaw/p80;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pv1;->r:Lcom/daaw/p80;

    return-object p0
.end method

.method public static synthetic m(Lcom/daaw/pv1;)Lcom/daaw/p80;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pv1;->q:Lcom/daaw/p80;

    return-object p0
.end method

.method public static synthetic n(Lcom/daaw/pv1;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/f61;IZLcom/daaw/vn;)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/pv1;->Y(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/f61;IZLcom/daaw/vn;)V

    return-void
.end method

.method public static synthetic o(Lcom/daaw/pv1;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/pv1;->d:Z

    return p0
.end method

.method public static synthetic p(Lcom/daaw/pv1;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/pv1;->d:Z

    return p1
.end method

.method public static synthetic q(Lcom/daaw/pv1;ILjava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/pv1;->e(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic r(Lcom/daaw/pv1;Ljava/lang/Integer;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/pv1;->a0(Ljava/lang/Integer;Z)V

    return-void
.end method

.method public static synthetic s(Lcom/daaw/pv1;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1;->g:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method public static synthetic t(Lcom/daaw/pv1;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1;->h:Ljava/util/List;

    return-object p1
.end method

.method public static synthetic u(Lcom/daaw/pv1;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pv1;->a:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static synthetic v(Lcom/daaw/pv1;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1;->i:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic w(Lcom/daaw/pv1;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1;->a:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method public static synthetic x(Lcom/daaw/pv1;Lcom/daaw/ho;IILandroid/net/Uri;Ljava/lang/String;I)V
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/pv1;->g(Lcom/daaw/ho;IILandroid/net/Uri;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic y(Lcom/daaw/pv1;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;IZ[I)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/pv1;->X(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;IZ[I)V

    return-void
.end method

.method public static synthetic z(Lcom/daaw/pv1;)F
    .locals 0

    iget p0, p0, Lcom/daaw/pv1;->c:F

    return p0
.end method


# virtual methods
.method public final L(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)Ljava/lang/String;
    .locals 7

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v2

    :goto_0
    if-ge v3, v0, :cond_4

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x7b

    if-ne v5, v6, :cond_1

    if-eqz v4, :cond_0

    move-object v4, v2

    goto :goto_2

    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v6, 0x10

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_1
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_1
    const/16 v6, 0x7d

    if-ne v5, v6, :cond_2

    if-eqz v4, :cond_2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4, p2}, Lcom/daaw/pv1;->M(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v4, v2

    goto :goto_3

    :cond_2
    :goto_2
    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final M(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)Ljava/lang/String;
    .locals 7

    const-string v0, "{TimeCurrent}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-wide/16 v1, 0x3e8

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/b5;->d()J

    move-result-wide p1

    div-long/2addr p1, v1

    long-to-int p2, p1

    invoke-static {p2}, Lcom/daaw/br1;->o(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "{TimeRemaining}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/daaw/b5;->d()J

    move-result-wide p1

    invoke-static {}, Lcom/daaw/b5;->c()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    sub-long/2addr v3, p1

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    div-long/2addr p1, v1

    long-to-int p2, p1

    invoke-static {p2}, Lcom/daaw/br1;->o(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v0, "{TimeLength}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/daaw/b5;->c()J

    move-result-wide p1

    div-long/2addr p1, v1

    long-to-int p2, p1

    invoke-static {p2}, Lcom/daaw/br1;->o(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v0, "{Artist}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_4

    sget-object p1, Lcom/daaw/ww0;->d:Lcom/daaw/tx0$b;

    invoke-virtual {p1}, Lcom/daaw/tx0$b;->h()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object v1, p1, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    :cond_3
    return-object v1

    :cond_4
    const-string v0, "{ArtistOrTitle}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Lcom/daaw/ww0;->d:Lcom/daaw/tx0$b;

    invoke-virtual {p1}, Lcom/daaw/tx0$b;->h()Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p1, p1, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    goto :goto_0

    :cond_5
    sget-object p1, Lcom/daaw/ww0;->d:Lcom/daaw/tx0$b;

    iget-object p1, p1, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    :goto_0
    return-object p1

    :cond_6
    const-string v0, "{ArtistAndTitle}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p1, Lcom/daaw/ww0;->d:Lcom/daaw/tx0$b;

    invoke-virtual {p1}, Lcom/daaw/tx0$b;->h()Z

    move-result p2

    const-string v0, "\n"

    if-eqz p2, :cond_7

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_8
    const-string v0, "{MarkedArtistAndTitle}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object p1, Lcom/daaw/ww0;->d:Lcom/daaw/tx0$b;

    invoke-virtual {p1}, Lcom/daaw/tx0$b;->h()Z

    move-result p2

    const-string v0, "Avee Player\n"

    if-eqz p2, :cond_9

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p1, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " - "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_a
    const-string v0, "{Title}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object p1, Lcom/daaw/ww0;->d:Lcom/daaw/tx0$b;

    iget-object p1, p1, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    return-object p1

    :cond_b
    const-string v0, "{Album}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object p1, Lcom/daaw/ww0;->d:Lcom/daaw/tx0$b;

    iget-object p1, p1, Lcom/daaw/tx0$b;->f:Ljava/lang/String;

    return-object p1

    :cond_c
    const-string v0, "{Fps}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameStats()Lcom/daaw/g40;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/g40;->a()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_d
    const-string v0, "{FrameTime}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameTimeMs()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_e
    const-string v0, "{StatFlush}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameStats()Lcom/daaw/g40;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/g40;->c()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_f
    const-string v0, "{WaitResLoad}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameStats()Lcom/daaw/g40;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/g40;->b()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_10
    const-string v0, "{ResLoad}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameStats()Lcom/daaw/g40;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/g40;->f()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_11
    const-string v0, "{GradualResLoad}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameStats()Lcom/daaw/g40;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/g40;->d()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_12
    const-string v0, "{RTSwitch}"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameStats()Lcom/daaw/g40;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/g40;->e()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_13
    return-object p1
.end method

.method public final N()I
    .locals 3

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->L:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->k(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    return v2

    :cond_1
    return v1
.end method

.method public final P(ILcom/daaw/avee/comp/playback/a;)Lcom/daaw/avee/comp/playback/a;
    .locals 4

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    new-instance v1, Lcom/daaw/avee/comp/playback/a$g;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/a$g;-><init>()V

    sget v2, Lcom/daaw/j5;->A:I

    invoke-virtual {v0, v2}, Lcom/daaw/j5;->h(I)Z

    move-result v2

    iput-boolean v2, v1, Lcom/daaw/avee/comp/playback/a$g;->e:Z

    const-wide/16 v2, -0x1

    iput-wide v2, v1, Lcom/daaw/avee/comp/playback/a$g;->g:J

    const/4 v2, 0x1

    iput v2, v1, Lcom/daaw/avee/comp/playback/a$h;->a:I

    sget v2, Lcom/daaw/j5;->W:I

    invoke-virtual {v0, v2}, Lcom/daaw/j5;->k(I)I

    move-result v0

    iput v0, v1, Lcom/daaw/avee/comp/playback/a$h;->b:I

    const-wide/16 v2, 0x0

    iput-wide v2, v1, Lcom/daaw/avee/comp/playback/a$h;->c:J

    iput p1, v1, Lcom/daaw/avee/comp/playback/a$h;->d:I

    sget-object p1, Lcom/daaw/pv1;->u:Lcom/daaw/ow1;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v1, v0}, Lcom/daaw/ow1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/a;

    return-object p1
.end method

.method public final Q(F)F
    .locals 3

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->L:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->k(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return p1

    :cond_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    return v2

    :cond_1
    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    return v2

    :cond_2
    return p1
.end method

.method public R()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/pv1;->j:Z

    return v0
.end method

.method public S()Z
    .locals 1

    invoke-static {}, Lcom/daaw/qv1;->b0()Z

    move-result v0

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/daaw/xw0;->d:Z

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

.method public final X(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;IZ[I)V
    .locals 6

    invoke-static {p2, p4}, Lcom/daaw/pv1;->O(I[I)Lcom/daaw/vn;

    move-result-object v5

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/pv1;->Y(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/f61;IZLcom/daaw/vn;)V

    return-void
.end method

.method public final Y(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/f61;IZLcom/daaw/vn;)V
    .locals 6

    sget-object v3, Lcom/daaw/tv1;->c:Ljava/lang/String;

    move-object v0, p1

    move-object v1, p2

    move v2, p3

    move-object v4, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/daaw/pv1;->K(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/f61;ILjava/lang/String;Lcom/daaw/vn;Z)V

    return-void
.end method

.method public final a0(Ljava/lang/Integer;Z)V
    .locals 1

    if-nez p2, :cond_0

    iget p2, p0, Lcom/daaw/pv1;->p:I

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p2, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iput p2, p0, Lcom/daaw/pv1;->p:I

    iget-object p2, p0, Lcom/daaw/pv1;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p2, :cond_1

    const/4 v0, 0x3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2, v0, p1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->q(II)V

    :cond_1
    return-void
.end method

.method public final e(ILjava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/daaw/j5;->a(I)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, -0x1

    :goto_0
    array-length v5, p1

    if-ge v2, v5, :cond_2

    aget-object v5, p1, v2

    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/daaw/cr1;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, ".json"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v4, v2

    :cond_0
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "scene.json"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v3, v2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    if-ne v3, v1, :cond_3

    move v3, v4

    :cond_3
    const/4 v1, 0x0

    if-ltz v3, :cond_4

    aput-object v1, p1, v3

    :cond_4
    const/4 v2, 0x0

    :goto_1
    array-length v3, p1

    if-ge v2, v3, :cond_8

    aget-object v3, p1, v2

    if-nez v3, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6, v5}, Lcom/daaw/pv1;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    aput-object v1, p1, v2

    goto :goto_2

    :cond_7
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_8
    :goto_4
    array-length p2, p1

    if-ge v0, p2, :cond_a

    aget-object p2, p1, v0

    if-nez p2, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_a
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/16 v0, 0x3a

    invoke-static {p2, v0}, Lcom/daaw/cr1;->h(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final g(Lcom/daaw/ho;IILandroid/net/Uri;Ljava/lang/String;I)V
    .locals 0

    const/16 p2, 0x2b

    if-ne p3, p2, :cond_1

    iget-object p2, p0, Lcom/daaw/pv1;->h:Ljava/util/List;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/pv1;->i:Ljava/lang/String;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/pv1;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iget-object p3, p0, Lcom/daaw/pv1;->h:Ljava/util/List;

    iget-object p4, p0, Lcom/daaw/pv1;->i:Ljava/lang/String;

    invoke-virtual {p1, p2, p3, p4, p5}, Lcom/daaw/ho;->t(Landroid/widget/TextView;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_0
    const-string p1, "PICK_IMAGE_PROPERTY_REQUEST_CODE invalid data"

    :goto_0
    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    const/16 p2, 0x2c

    if-ne p3, p2, :cond_4

    iget-object p2, p0, Lcom/daaw/pv1;->h:Ljava/util/List;

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/daaw/pv1;->i:Ljava/lang/String;

    if-eqz p2, :cond_3

    and-int/lit8 p2, p6, 0x40

    if-eqz p2, :cond_2

    if-eqz p4, :cond_2

    const-string p2, "offered FLAG_GRANT_PERSISTABLE_URI_PERMISSION"

    invoke-static {p2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p4, p3}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    sget-object p3, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p6, "Error TakePersistableUriPermission "

    invoke-virtual {p4, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_2
    :goto_1
    :try_start_1
    iget-object p2, p0, Lcom/daaw/pv1;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iget-object p3, p0, Lcom/daaw/pv1;->h:Ljava/util/List;

    iget-object p4, p0, Lcom/daaw/pv1;->i:Ljava/lang/String;

    invoke-virtual {p1, p2, p3, p4, p5}, Lcom/daaw/ho;->t(Landroid/widget/TextView;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    sget-object p2, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Error OnImagePropertyValuePicked "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    const-string p1, "PICK_IMAGE_PROPERTY_REQUEST_CODE_KITKAT invalid data"

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method
