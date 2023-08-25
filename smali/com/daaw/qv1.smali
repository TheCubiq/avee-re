.class public Lcom/daaw/qv1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/qv1$v;
    }
.end annotation


# static fields
.field public static P:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "[",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static Q:Lcom/daaw/sw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sw1<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static R:Lcom/daaw/ow1;
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

.field public static final S:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static volatile T:Z

.field public static U:J

.field public static V:J

.field public static W:J


# instance fields
.field public volatile A:I

.field public volatile B:Z

.field public C:Lcom/daaw/qv1$v;

.field public D:Lcom/daaw/dv1$d;

.field public E:J

.field public F:J

.field public G:J

.field public volatile H:Lcom/daaw/s7;

.field public I:Landroid/os/Handler;

.field public volatile J:I

.field public K:I

.field public L:I

.field public M:Lcom/daaw/dv1$f;

.field public N:Z

.field public O:Lcom/daaw/wf1;

.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/xw0;

.field public c:Lcom/daaw/vm0;

.field public d:[Lcom/daaw/dv1$e;

.field public e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lcom/daaw/tx0$b;

.field public g:Lcom/daaw/tx0;

.field public h:J

.field public i:Lcom/daaw/avee/comp/playback/a;

.field public j:Lcom/daaw/avee/comp/playback/a;

.field public volatile k:Z

.field public volatile l:I

.field public volatile m:J

.field public volatile n:F

.field public volatile o:Z

.field public volatile p:F

.field public volatile q:I

.field public volatile r:Ljava/lang/String;

.field public volatile s:Ljava/lang/String;

.field public volatile t:I

.field public volatile u:Lcom/daaw/f40;

.field public volatile v:Lcom/daaw/avee/comp/playback/a$g;

.field public volatile w:Ljava/io/File;

.field public volatile x:Ljava/io/OutputStream;

.field public volatile y:I

.field public volatile z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/qv1;->P:Lcom/daaw/ww1;

    new-instance v0, Lcom/daaw/sw1;

    invoke-direct {v0}, Lcom/daaw/sw1;-><init>()V

    sput-object v0, Lcom/daaw/qv1;->Q:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/ow1;

    invoke-direct {v0}, Lcom/daaw/ow1;-><init>()V

    sput-object v0, Lcom/daaw/qv1;->R:Lcom/daaw/ow1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/qv1;->S:Lcom/daaw/qw1;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/daaw/qv1;->T:Z

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/daaw/qv1;->U:J

    sput-wide v0, Lcom/daaw/qv1;->V:J

    sput-wide v0, Lcom/daaw/qv1;->W:J

    return-void
.end method

.method public constructor <init>(Lcom/daaw/pv1;Lcom/daaw/xw0;Lcom/daaw/vm0;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/qv1;->d:[Lcom/daaw/dv1$e;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/daaw/qv1;->e:Ljava/lang/ref/WeakReference;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/daaw/qv1;->h:J

    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/daaw/qv1;->k:Z

    const/16 v4, 0x1e

    iput v4, p0, Lcom/daaw/qv1;->l:I

    const-wide/32 v4, 0x8235

    iput-wide v4, p0, Lcom/daaw/qv1;->m:J

    const/high16 v4, 0x41000000    # 8.0f

    iput v4, p0, Lcom/daaw/qv1;->n:F

    iput-boolean v3, p0, Lcom/daaw/qv1;->o:Z

    const/high16 v3, 0x43a00000    # 320.0f

    iput v3, p0, Lcom/daaw/qv1;->p:F

    const/4 v3, 0x2

    iput v3, p0, Lcom/daaw/qv1;->q:I

    const-string v3, ""

    iput-object v3, p0, Lcom/daaw/qv1;->r:Ljava/lang/String;

    iput-object v3, p0, Lcom/daaw/qv1;->s:Ljava/lang/String;

    const/4 v3, 0x0

    iput v3, p0, Lcom/daaw/qv1;->t:I

    new-instance v4, Lcom/daaw/avee/comp/playback/a$g;

    invoke-direct {v4}, Lcom/daaw/avee/comp/playback/a$g;-><init>()V

    iput-object v4, p0, Lcom/daaw/qv1;->v:Lcom/daaw/avee/comp/playback/a$g;

    iput v3, p0, Lcom/daaw/qv1;->y:I

    iput v3, p0, Lcom/daaw/qv1;->z:I

    iput v3, p0, Lcom/daaw/qv1;->A:I

    iput-boolean v3, p0, Lcom/daaw/qv1;->B:Z

    new-instance v4, Lcom/daaw/qv1$v;

    invoke-direct {v4, p0, v0}, Lcom/daaw/qv1$v;-><init>(Lcom/daaw/qv1;Lcom/daaw/qv1$k;)V

    iput-object v4, p0, Lcom/daaw/qv1;->C:Lcom/daaw/qv1$v;

    iput-object v0, p0, Lcom/daaw/qv1;->D:Lcom/daaw/dv1$d;

    iput-wide v1, p0, Lcom/daaw/qv1;->E:J

    iput-wide v1, p0, Lcom/daaw/qv1;->F:J

    iput-wide v1, p0, Lcom/daaw/qv1;->G:J

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/daaw/qv1;->I:Landroid/os/Handler;

    iput v3, p0, Lcom/daaw/qv1;->J:I

    iput v3, p0, Lcom/daaw/qv1;->K:I

    iput v3, p0, Lcom/daaw/qv1;->L:I

    iput-boolean v3, p0, Lcom/daaw/qv1;->N:Z

    new-instance v0, Lcom/daaw/wf1;

    invoke-direct {v0}, Lcom/daaw/wf1;-><init>()V

    iput-object v0, p0, Lcom/daaw/qv1;->O:Lcom/daaw/wf1;

    iput-object p2, p0, Lcom/daaw/qv1;->b:Lcom/daaw/xw0;

    iput-object p3, p0, Lcom/daaw/qv1;->c:Lcom/daaw/vm0;

    sget-object p3, Lcom/daaw/o30;->w:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/qv1$k;

    invoke-direct {v0, p0}, Lcom/daaw/qv1$k;-><init>(Lcom/daaw/qv1;)V

    iget-object v1, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p3, Lcom/daaw/o30;->A:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/qv1$n;

    invoke-direct {v0, p0}, Lcom/daaw/qv1$n;-><init>(Lcom/daaw/qv1;)V

    iget-object v1, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p3, Lcom/daaw/o30;->B:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/qv1$o;

    invoke-direct {v0, p0}, Lcom/daaw/qv1$o;-><init>(Lcom/daaw/qv1;)V

    iget-object v1, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p3, Lcom/daaw/dv1;->M:Lcom/daaw/tw1;

    new-instance v0, Lcom/daaw/qv1$p;

    invoke-direct {v0, p0}, Lcom/daaw/qv1$p;-><init>(Lcom/daaw/qv1;)V

    iget-object v1, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/tw1;->b(Lcom/daaw/tw1$a;Ljava/util/List;)V

    sget-object p3, Lcom/daaw/dv1;->N:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/qv1$q;

    invoke-direct {v0, p0}, Lcom/daaw/qv1$q;-><init>(Lcom/daaw/qv1;)V

    iget-object v1, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object p3, Lcom/daaw/dv1;->O:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/qv1$r;

    invoke-direct {v0, p0}, Lcom/daaw/qv1$r;-><init>(Lcom/daaw/qv1;)V

    iget-object v1, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object p3, Lcom/daaw/dv1;->P:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/qv1$s;

    invoke-direct {v0, p0}, Lcom/daaw/qv1$s;-><init>(Lcom/daaw/qv1;)V

    iget-object v1, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object p3, Lcom/daaw/st;->t:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/qv1$t;

    invoke-direct {v0, p0}, Lcom/daaw/qv1$t;-><init>(Lcom/daaw/qv1;)V

    iget-object v1, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object p3, Lcom/daaw/dv1;->R:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/qv1$u;

    invoke-direct {v0, p0}, Lcom/daaw/qv1$u;-><init>(Lcom/daaw/qv1;)V

    iget-object v1, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p3, Lcom/daaw/avee/MainActivity;->p0:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/qv1$a;

    invoke-direct {v0, p0, p2}, Lcom/daaw/qv1$a;-><init>(Lcom/daaw/qv1;Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object p3, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->g0:Lcom/daaw/uw1;

    new-instance v0, Lcom/daaw/qv1$b;

    invoke-direct {v0, p0, p2}, Lcom/daaw/qv1$b;-><init>(Lcom/daaw/qv1;Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/uw1;->b(Lcom/daaw/uw1$a;Ljava/util/List;)V

    sget-object p3, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->D:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/qv1$c;

    invoke-direct {v0, p0, p1}, Lcom/daaw/qv1$c;-><init>(Lcom/daaw/qv1;Lcom/daaw/pv1;)V

    iget-object p1, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p3, v0, p1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->E:Lcom/daaw/vw1;

    new-instance p3, Lcom/daaw/qv1$d;

    invoke-direct {p3, p0}, Lcom/daaw/qv1$d;-><init>(Lcom/daaw/qv1;)V

    iget-object v0, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p1, p3, v0}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/b5;->c:Lcom/daaw/xw1;

    new-instance p3, Lcom/daaw/qv1$e;

    invoke-direct {p3, p0}, Lcom/daaw/qv1$e;-><init>(Lcom/daaw/qv1;)V

    iget-object v0, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p1, p3, v0}, Lcom/daaw/xw1;->b(Lcom/daaw/xw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->h0:Lcom/daaw/tw1;

    new-instance p3, Lcom/daaw/qv1$f;

    invoke-direct {p3, p0}, Lcom/daaw/qv1$f;-><init>(Lcom/daaw/qv1;)V

    iget-object v0, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p1, p3, v0}, Lcom/daaw/tw1;->b(Lcom/daaw/tw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->B:Lcom/daaw/vw1;

    new-instance p3, Lcom/daaw/qv1$g;

    invoke-direct {p3, p0}, Lcom/daaw/qv1$g;-><init>(Lcom/daaw/qv1;)V

    iget-object v0, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p1, p3, v0}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->F:Lcom/daaw/sw1;

    new-instance p3, Lcom/daaw/qv1$h;

    invoke-direct {p3, p0}, Lcom/daaw/qv1$h;-><init>(Lcom/daaw/qv1;)V

    iget-object v0, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p1, p3, v0}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->p0:Lcom/daaw/uw1;

    new-instance p3, Lcom/daaw/qv1$i;

    invoke-direct {p3, p0, p2}, Lcom/daaw/qv1$i;-><init>(Lcom/daaw/qv1;Lcom/daaw/xw0;)V

    iget-object p2, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p1, p3, p2}, Lcom/daaw/uw1;->b(Lcom/daaw/uw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/b5;->e:Lcom/daaw/ww1;

    new-instance p2, Lcom/daaw/qv1$j;

    invoke-direct {p2, p0}, Lcom/daaw/qv1$j;-><init>(Lcom/daaw/qv1;)V

    iget-object p3, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/b5;->g:Lcom/daaw/ww1;

    new-instance p2, Lcom/daaw/qv1$l;

    invoke-direct {p2, p0}, Lcom/daaw/qv1$l;-><init>(Lcom/daaw/qv1;)V

    iget-object p3, p0, Lcom/daaw/qv1;->a:Ljava/util/List;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic A(Lcom/daaw/qv1;)I
    .locals 0

    iget p0, p0, Lcom/daaw/qv1;->L:I

    return p0
.end method

.method public static synthetic B(Lcom/daaw/qv1;)I
    .locals 2

    iget v0, p0, Lcom/daaw/qv1;->L:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/daaw/qv1;->L:I

    return v0
.end method

.method public static synthetic C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qv1;->M:Lcom/daaw/dv1$f;

    return-object p0
.end method

.method public static synthetic D(Lcom/daaw/qv1;Lcom/daaw/dv1$f;)Lcom/daaw/dv1$f;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1;->M:Lcom/daaw/dv1$f;

    return-object p1
.end method

.method public static synthetic E(Lcom/daaw/qv1;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qv1;->I:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic F(Lcom/daaw/qv1;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/qv1;->N:Z

    return p1
.end method

.method public static synthetic G(Lcom/daaw/qv1;)Lcom/daaw/s7;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qv1;->H:Lcom/daaw/s7;

    return-object p0
.end method

.method public static synthetic H(Lcom/daaw/qv1;)Ljava/io/File;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qv1;->w:Ljava/io/File;

    return-object p0
.end method

.method public static synthetic I(Lcom/daaw/qv1;)Ljava/io/OutputStream;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qv1;->x:Ljava/io/OutputStream;

    return-object p0
.end method

.method public static synthetic J(Lcom/daaw/qv1;IIILjava/io/File;Ljava/io/OutputStream;)Ljava/lang/String;
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/qv1;->U(IIILjava/io/File;Ljava/io/OutputStream;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K()J
    .locals 2

    sget-wide v0, Lcom/daaw/qv1;->V:J

    return-wide v0
.end method

.method public static synthetic L(Lcom/daaw/qv1;)I
    .locals 0

    iget p0, p0, Lcom/daaw/qv1;->K:I

    return p0
.end method

.method public static synthetic M(Lcom/daaw/qv1;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/qv1;->f0(I)V

    return-void
.end method

.method public static synthetic N(Lcom/daaw/qv1;ZLcom/daaw/wf1;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/qv1;->j0(ZLcom/daaw/wf1;Z)V

    return-void
.end method

.method public static synthetic O(Lcom/daaw/qv1;)Lcom/daaw/dv1$d;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qv1;->D:Lcom/daaw/dv1$d;

    return-object p0
.end method

.method public static synthetic P(Lcom/daaw/qv1;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/qv1;->E:J

    return-wide v0
.end method

.method public static synthetic Q(Lcom/daaw/qv1;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/qv1;->F:J

    return-wide v0
.end method

.method public static synthetic R(Lcom/daaw/qv1;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/qv1;->G:J

    return-wide v0
.end method

.method public static synthetic S(Lcom/daaw/qv1;)I
    .locals 0

    iget p0, p0, Lcom/daaw/qv1;->q:I

    return p0
.end method

.method public static Z()J
    .locals 2

    sget-wide v0, Lcom/daaw/qv1;->W:J

    return-wide v0
.end method

.method public static synthetic a(Lcom/daaw/qv1;)I
    .locals 0

    iget p0, p0, Lcom/daaw/qv1;->l:I

    return p0
.end method

.method public static a0()J
    .locals 2

    sget-wide v0, Lcom/daaw/qv1;->V:J

    return-wide v0
.end method

.method public static synthetic b(Lcom/daaw/qv1;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1;->e:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method public static b0()Z
    .locals 1

    sget-boolean v0, Lcom/daaw/qv1;->T:Z

    return v0
.end method

.method public static synthetic c(Lcom/daaw/qv1;)[Lcom/daaw/dv1$e;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qv1;->d:[Lcom/daaw/dv1$e;

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/qv1;[Lcom/daaw/dv1$e;)[Lcom/daaw/dv1$e;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1;->d:[Lcom/daaw/dv1$e;

    return-object p1
.end method

.method public static synthetic e(Lcom/daaw/qv1;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/qv1;->Y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/qv1;)Lcom/daaw/tx0$b;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qv1;->f:Lcom/daaw/tx0$b;

    return-object p0
.end method

.method public static synthetic g(Lcom/daaw/qv1;Lcom/daaw/tx0$b;)Lcom/daaw/tx0$b;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1;->f:Lcom/daaw/tx0$b;

    return-object p1
.end method

.method public static g0(ILandroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3, p5}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p3, 0x0

    const/high16 p5, 0x4000000

    invoke-static {p1, p3, v0, p5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p3

    const-string p5, "notification"

    invoke-virtual {p1, p5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Landroid/app/NotificationManager;

    new-instance v0, Lcom/daaw/dt0$d;

    invoke-direct {v0, p1}, Lcom/daaw/dt0$d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p4}, Lcom/daaw/dt0$d;->i(Ljava/lang/CharSequence;)Lcom/daaw/dt0$d;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/daaw/dt0$d;->h(Ljava/lang/CharSequence;)Lcom/daaw/dt0$d;

    move-result-object p1

    const p2, 0x7f08011a

    invoke-virtual {p1, p2}, Lcom/daaw/dt0$d;->n(I)Lcom/daaw/dt0$d;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/daaw/dt0$d;->g(Landroid/app/PendingIntent;)Lcom/daaw/dt0$d;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/daaw/dt0$d;->l(Z)Lcom/daaw/dt0$d;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/daaw/dt0$d;->e(Z)Lcom/daaw/dt0$d;

    invoke-virtual {v0}, Lcom/daaw/dt0$d;->b()Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {p5, p0, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static synthetic h()Z
    .locals 1

    sget-boolean v0, Lcom/daaw/qv1;->T:Z

    return v0
.end method

.method public static synthetic i(Z)Z
    .locals 0

    sput-boolean p0, Lcom/daaw/qv1;->T:Z

    return p0
.end method

.method public static synthetic j(Lcom/daaw/qv1;)I
    .locals 0

    iget p0, p0, Lcom/daaw/qv1;->A:I

    return p0
.end method

.method public static synthetic k(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qv1;->j:Lcom/daaw/avee/comp/playback/a;

    return-object p0
.end method

.method public static synthetic l(Lcom/daaw/qv1;Lcom/daaw/avee/comp/playback/a;)Lcom/daaw/avee/comp/playback/a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1;->j:Lcom/daaw/avee/comp/playback/a;

    return-object p1
.end method

.method public static synthetic m(Lcom/daaw/qv1;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/qv1;->B:Z

    return p1
.end method

.method public static synthetic n(Lcom/daaw/qv1;)I
    .locals 0

    iget p0, p0, Lcom/daaw/qv1;->J:I

    return p0
.end method

.method public static synthetic o(Lcom/daaw/qv1;)I
    .locals 0

    iget p0, p0, Lcom/daaw/qv1;->y:I

    return p0
.end method

.method public static synthetic p(Lcom/daaw/qv1;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/qv1;->h:J

    return-wide v0
.end method

.method public static synthetic q(Lcom/daaw/qv1;)I
    .locals 0

    iget p0, p0, Lcom/daaw/qv1;->z:I

    return p0
.end method

.method public static synthetic r(Lcom/daaw/qv1;J)J
    .locals 0

    iput-wide p1, p0, Lcom/daaw/qv1;->h:J

    return-wide p1
.end method

.method public static synthetic s(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a$g;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qv1;->v:Lcom/daaw/avee/comp/playback/a$g;

    return-object p0
.end method

.method public static synthetic t()J
    .locals 2

    sget-wide v0, Lcom/daaw/qv1;->U:J

    return-wide v0
.end method

.method public static synthetic u(Lcom/daaw/qv1;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/qv1;->T(J)V

    return-void
.end method

.method public static synthetic v(Lcom/daaw/qv1;)Lcom/daaw/wf1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qv1;->O:Lcom/daaw/wf1;

    return-object p0
.end method

.method public static synthetic w(Lcom/daaw/qv1;)Lcom/daaw/avee/comp/playback/a;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qv1;->i:Lcom/daaw/avee/comp/playback/a;

    return-object p0
.end method

.method public static synthetic x(Lcom/daaw/qv1;Lcom/daaw/avee/comp/playback/a;)Lcom/daaw/avee/comp/playback/a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1;->i:Lcom/daaw/avee/comp/playback/a;

    return-object p1
.end method

.method public static synthetic y(Lcom/daaw/qv1;Lcom/daaw/tx0;)Lcom/daaw/tx0;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1;->g:Lcom/daaw/tx0;

    return-object p1
.end method

.method public static synthetic z(Lcom/daaw/qv1;)Lcom/daaw/f40;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qv1;->u:Lcom/daaw/f40;

    return-object p0
.end method


# virtual methods
.method public final T(J)V
    .locals 0

    return-void
.end method

.method public final U(IIILjava/io/File;Ljava/io/OutputStream;)Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/qv1;->C:Lcom/daaw/qv1$v;

    invoke-virtual {v1}, Lcom/daaw/qv1$v;->a()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/qv1;->X(Lcom/daaw/wf1;)V

    const-string v2, "initialize VideoSequenceEncoder"

    invoke-static {v2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    new-instance v2, Lcom/daaw/s7;

    invoke-direct {v2}, Lcom/daaw/s7;-><init>()V

    iput-object v2, v0, Lcom/daaw/qv1;->H:Lcom/daaw/s7;

    if-nez p4, :cond_0

    if-eqz p5, :cond_0

    :try_start_0
    const-string v2, "aveeexport"

    invoke-static {v2, v1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v2

    goto :goto_0

    :catch_0
    :cond_0
    move-object/from16 v3, p4

    :goto_0
    const/4 v15, 0x1

    if-eqz v3, :cond_3

    iget-object v2, v0, Lcom/daaw/qv1;->H:Lcom/daaw/s7;

    iget v5, v0, Lcom/daaw/qv1;->l:I

    iget v8, v0, Lcom/daaw/qv1;->n:F

    iget-boolean v9, v0, Lcom/daaw/qv1;->o:Z

    iget v10, v0, Lcom/daaw/qv1;->p:F

    iget v11, v0, Lcom/daaw/qv1;->q:I

    iget-object v13, v0, Lcom/daaw/qv1;->r:Ljava/lang/String;

    iget-object v14, v0, Lcom/daaw/qv1;->s:Ljava/lang/String;

    iget v12, v0, Lcom/daaw/qv1;->t:I

    move-object/from16 v4, p5

    move/from16 v6, p1

    move/from16 v7, p2

    move/from16 v16, v12

    move/from16 v12, p3

    const/4 v1, 0x1

    move/from16 v15, v16

    invoke-virtual/range {v2 .. v15}, Lcom/daaw/s7;->l(Ljava/io/File;Ljava/io/OutputStream;IIIFZFIILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v3, v0, Lcom/daaw/qv1;->C:Lcom/daaw/qv1$v;

    iput-boolean v1, v3, Lcom/daaw/qv1$v;->a:Z

    iget v1, v0, Lcom/daaw/qv1;->l:I

    const/16 v3, 0x28

    const-string v4, "Failed to initialize encoder: "

    if-le v1, v3, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " Try lower value for Fps?"

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    goto :goto_2

    :cond_3
    const/4 v1, 0x1

    iget-object v2, v0, Lcom/daaw/qv1;->C:Lcom/daaw/qv1$v;

    iput-boolean v1, v2, Lcom/daaw/qv1$v;->a:Z

    const-string v1, "Failed to create file"

    :goto_2
    if-eqz v1, :cond_4

    invoke-static {v1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_4
    return-object v1
.end method

.method public V(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/daaw/qv1;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/cr1;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x3e8

    if-ge p4, v1, :cond_1

    add-int/lit8 p4, p4, 0x1

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/qv1;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0
.end method

.method public X(Lcom/daaw/wf1;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qv1;->H:Lcom/daaw/s7;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qv1;->H:Lcom/daaw/s7;

    invoke-virtual {v0, p1}, Lcom/daaw/s7;->e(Lcom/daaw/wf1;)Z

    iget-object p1, p0, Lcom/daaw/qv1;->H:Lcom/daaw/s7;

    invoke-virtual {p1}, Lcom/daaw/s7;->m()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/qv1;->H:Lcom/daaw/s7;

    :cond_0
    return-void
.end method

.method public final Y(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    :try_start_1
    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    nop

    :cond_0
    :goto_1
    if-eqz v0, :cond_1

    :try_start_2
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_1
    return-object p1
.end method

.method public final c0(JZ)J
    .locals 2

    const-wide/32 v0, 0x493e0

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    const-wide/16 v0, 0x3e8

    div-long/2addr p1, v0

    sget-object p3, Lcom/daaw/avee/comp/playback/c;->i:Lcom/daaw/iw1;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/c;->f:Lcom/daaw/iw1;

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    const-wide/16 p1, 0x12c

    return-wide p1
.end method

.method public d0()V
    .locals 0

    return-void
.end method

.method public e0()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qv1;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->n()V

    :cond_0
    return-void
.end method

.method public final f0(I)V
    .locals 4

    iput p1, p0, Lcom/daaw/qv1;->J:I

    iget p1, p0, Lcom/daaw/qv1;->J:I

    iget v0, p0, Lcom/daaw/qv1;->y:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/qv1;->K:I

    iget p1, p0, Lcom/daaw/qv1;->l:I

    iget v0, p0, Lcom/daaw/qv1;->K:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1}, Lcom/daaw/s7;->c(JI)J

    move-result-wide v0

    sput-wide v0, Lcom/daaw/qv1;->V:J

    iget v0, p0, Lcom/daaw/qv1;->J:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1}, Lcom/daaw/s7;->c(JI)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sput-wide v0, Lcom/daaw/qv1;->U:J

    return-void
.end method

.method public h0(Lcom/daaw/al;Lcom/daaw/dv1$d;Ljava/io/File;Ljava/io/OutputStream;JJJ)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    sget-boolean v2, Lcom/daaw/qv1;->T:Z

    if-eqz v2, :cond_0

    return-void

    :cond_0
    iget-object v2, v0, Lcom/daaw/qv1;->O:Lcom/daaw/wf1;

    invoke-virtual {v2}, Lcom/daaw/wf1;->g()V

    iget-object v2, v0, Lcom/daaw/qv1;->c:Lcom/daaw/vm0;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/daaw/vm0;->e(Z)V

    invoke-static {}, Ljava/lang/System;->gc()V

    iget-object v2, v1, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    iget-object v4, v0, Lcom/daaw/qv1;->d:[Lcom/daaw/dv1$e;

    invoke-virtual {v0, v2, v4}, Lcom/daaw/qv1;->k0(Lcom/daaw/dv1$e;[Lcom/daaw/dv1$e;)V

    invoke-static/range {p5 .. p8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    move-wide/from16 v8, p7

    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    const-wide/16 v10, 0x32

    sub-long v10, p9, v10

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    iget-object v2, v1, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    iget v2, v2, Lcom/daaw/dv1$e;->e:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v0, Lcom/daaw/qv1;->l:I

    const-wide/32 v10, 0xf4240

    iget v2, v0, Lcom/daaw/qv1;->l:I

    int-to-long v12, v2

    div-long/2addr v10, v12

    iput-wide v10, v0, Lcom/daaw/qv1;->m:J

    iget-object v2, v1, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    iget v2, v2, Lcom/daaw/dv1$e;->f:F

    iput v2, v0, Lcom/daaw/qv1;->n:F

    iget-boolean v2, v1, Lcom/daaw/dv1$d;->l:Z

    iput-boolean v2, v0, Lcom/daaw/qv1;->k:Z

    iget-boolean v2, v1, Lcom/daaw/dv1$d;->h:Z

    iput-boolean v2, v0, Lcom/daaw/qv1;->o:Z

    iget-object v2, v1, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    iget v2, v2, Lcom/daaw/dv1$e;->h:F

    iput v2, v0, Lcom/daaw/qv1;->p:F

    iget-object v2, v1, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    iget v2, v2, Lcom/daaw/dv1$e;->g:I

    iput v2, v0, Lcom/daaw/qv1;->q:I

    iget v2, v1, Lcom/daaw/dv1$d;->e:I

    invoke-virtual {v1, v2}, Lcom/daaw/dv1$d;->f(I)Lcom/daaw/dx$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/dx$a;->b()Ljava/lang/String;

    move-result-object v10

    iput-object v10, v0, Lcom/daaw/qv1;->r:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/daaw/dx$a;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/daaw/qv1;->s:Ljava/lang/String;

    iget-object v2, v1, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    iget v2, v2, Lcom/daaw/dv1$e;->i:I

    iput v2, v0, Lcom/daaw/qv1;->t:I

    iget-boolean v2, v1, Lcom/daaw/dv1$d;->m:Z

    iget-object v10, v1, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    iget v10, v10, Lcom/daaw/dv1$e;->c:I

    const/16 v11, 0x10

    invoke-static {v11, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    const/16 v12, 0x2000

    invoke-static {v12, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    iget-object v1, v1, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    iget v1, v1, Lcom/daaw/dv1$e;->d:I

    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v12, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-boolean v11, v0, Lcom/daaw/qv1;->k:Z

    if-eqz v11, :cond_1

    invoke-static {v10}, Lcom/daaw/s7;->i(I)I

    move-result v10

    invoke-static {v1}, Lcom/daaw/s7;->h(I)I

    move-result v1

    :cond_1
    new-instance v11, Lcom/daaw/f40;

    invoke-direct {v11}, Lcom/daaw/f40;-><init>()V

    iput-object v11, v0, Lcom/daaw/qv1;->u:Lcom/daaw/f40;

    iget-object v11, v0, Lcom/daaw/qv1;->u:Lcom/daaw/f40;

    const/4 v12, 0x0

    iput-boolean v12, v11, Lcom/daaw/f40;->d:Z

    iget-object v11, v0, Lcom/daaw/qv1;->u:Lcom/daaw/f40;

    iget-wide v13, v0, Lcom/daaw/qv1;->m:J

    const-wide/16 v15, 0x3e8

    div-long/2addr v13, v15

    long-to-int v14, v13

    iput v14, v11, Lcom/daaw/f40;->c:I

    iget-object v11, v0, Lcom/daaw/qv1;->u:Lcom/daaw/f40;

    iput v10, v11, Lcom/daaw/f40;->a:I

    iget-object v10, v0, Lcom/daaw/qv1;->u:Lcom/daaw/f40;

    iput v1, v10, Lcom/daaw/f40;->b:I

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v1

    iget-object v10, v0, Lcom/daaw/qv1;->v:Lcom/daaw/avee/comp/playback/a$g;

    iget v11, v0, Lcom/daaw/qv1;->q:I

    iput v11, v10, Lcom/daaw/avee/comp/playback/a$h;->a:I

    iget-object v10, v0, Lcom/daaw/qv1;->v:Lcom/daaw/avee/comp/playback/a$g;

    sget v11, Lcom/daaw/j5;->A:I

    invoke-virtual {v1, v11}, Lcom/daaw/j5;->h(I)Z

    move-result v11

    iput-boolean v11, v10, Lcom/daaw/avee/comp/playback/a$g;->e:Z

    iget-object v10, v0, Lcom/daaw/qv1;->v:Lcom/daaw/avee/comp/playback/a$g;

    const-wide/16 v13, -0x1

    iput-wide v13, v10, Lcom/daaw/avee/comp/playback/a$g;->g:J

    iget-object v10, v0, Lcom/daaw/qv1;->v:Lcom/daaw/avee/comp/playback/a$g;

    sget v11, Lcom/daaw/j5;->W:I

    invoke-virtual {v1, v11}, Lcom/daaw/j5;->k(I)I

    move-result v1

    iput v1, v10, Lcom/daaw/avee/comp/playback/a$h;->b:I

    mul-long v4, v4, v15

    iget-wide v10, v0, Lcom/daaw/qv1;->m:J

    div-long v10, v4, v10

    long-to-int v1, v10

    iput v1, v0, Lcom/daaw/qv1;->y:I

    mul-long v8, v8, v15

    iget-wide v10, v0, Lcom/daaw/qv1;->m:J

    div-long/2addr v8, v10

    long-to-int v1, v8

    iput v1, v0, Lcom/daaw/qv1;->z:I

    iget v1, v0, Lcom/daaw/qv1;->y:I

    add-int/2addr v1, v3

    iget v8, v0, Lcom/daaw/qv1;->z:I

    invoke-static {v1, v8}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lcom/daaw/qv1;->z:I

    iget v1, v0, Lcom/daaw/qv1;->z:I

    iget v8, v0, Lcom/daaw/qv1;->y:I

    sub-int/2addr v1, v8

    int-to-long v8, v1

    iget-wide v10, v0, Lcom/daaw/qv1;->m:J

    mul-long v8, v8, v10

    sput-wide v8, Lcom/daaw/qv1;->W:J

    iget v1, v0, Lcom/daaw/qv1;->y:I

    add-int/lit8 v1, v1, -0x3c

    invoke-virtual {v0, v1}, Lcom/daaw/qv1;->f0(I)V

    iput v12, v0, Lcom/daaw/qv1;->L:I

    iput v12, v0, Lcom/daaw/qv1;->A:I

    move-object/from16 v1, p3

    iput-object v1, v0, Lcom/daaw/qv1;->w:Ljava/io/File;

    move-object/from16 v1, p4

    iput-object v1, v0, Lcom/daaw/qv1;->x:Ljava/io/OutputStream;

    iget-object v1, v0, Lcom/daaw/qv1;->w:Ljava/io/File;

    if-nez v1, :cond_2

    iget-object v1, v0, Lcom/daaw/qv1;->x:Ljava/io/OutputStream;

    if-nez v1, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v8, 0x7f1002eb

    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget-object v8, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {v8, v1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_2
    iget-object v1, v0, Lcom/daaw/qv1;->w:Ljava/io/File;

    if-nez v1, :cond_3

    iget-object v1, v0, Lcom/daaw/qv1;->x:Ljava/io/OutputStream;

    if-nez v1, :cond_3

    new-instance v1, Lcom/daaw/dv1$f;

    invoke-direct {v1}, Lcom/daaw/dv1$f;-><init>()V

    iput-boolean v12, v1, Lcom/daaw/dv1$f;->a:Z

    invoke-static {v1}, Lcom/daaw/dv1;->K(Lcom/daaw/dv1$f;)V

    return-void

    :cond_3
    new-instance v1, Lcom/daaw/dv1$f;

    invoke-direct {v1}, Lcom/daaw/dv1$f;-><init>()V

    iput-boolean v3, v1, Lcom/daaw/dv1$f;->a:Z

    iput v12, v1, Lcom/daaw/dv1$f;->c:I

    const/16 v8, 0x64

    iput v8, v1, Lcom/daaw/dv1$f;->d:I

    invoke-static {v1}, Lcom/daaw/dv1;->K(Lcom/daaw/dv1$f;)V

    sget-object v1, Lcom/daaw/avee/comp/playback/c;->f:Lcom/daaw/iw1;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    sget-object v1, Lcom/daaw/avee/comp/playback/c;->i:Lcom/daaw/iw1;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    invoke-virtual {v0, v4, v5, v3}, Lcom/daaw/qv1;->c0(JZ)J

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v1

    sget v4, Lcom/daaw/j5;->K:I

    invoke-virtual {v1, v4, v3}, Lcom/daaw/j5;->c0(II)V

    sput-boolean v3, Lcom/daaw/qv1;->T:Z

    sget-object v1, Lcom/daaw/qv1;->Q:Lcom/daaw/sw1;

    sget-boolean v3, Lcom/daaw/qv1;->T:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static/range {p9 .. p10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v3, v4, v2}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/qv1;->e0()V

    return-void
.end method

.method public i0(Landroid/app/Fragment;Lcom/daaw/al;Lcom/daaw/dv1$d;JJJ)V
    .locals 12

    move-object v11, p0

    move-object v2, p3

    iget-object v0, v2, Lcom/daaw/dv1$d;->f:Ljava/lang/String;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v0, v1, :cond_1

    :cond_0
    const-string v0, "/"

    iput-object v0, v2, Lcom/daaw/dv1$d;->f:Ljava/lang/String;

    :cond_1
    iget-object v0, v2, Lcom/daaw/dv1$d;->g:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v0, v1, :cond_3

    :cond_2
    const-string v0, "exported"

    iput-object v0, v2, Lcom/daaw/dv1$d;->g:Ljava/lang/String;

    :cond_3
    iget-object v0, v2, Lcom/daaw/dv1$d;->g:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/cr1;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v2, v11, Lcom/daaw/qv1;->D:Lcom/daaw/dv1$d;

    move-wide/from16 v5, p4

    iput-wide v5, v11, Lcom/daaw/qv1;->E:J

    move-wide/from16 v7, p6

    iput-wide v7, v11, Lcom/daaw/qv1;->F:J

    move-wide/from16 v9, p8

    iput-wide v9, v11, Lcom/daaw/qv1;->G:J

    iget-object v1, v2, Lcom/daaw/dv1$d;->f:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/s7;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v1, v0, v3}, Lcom/daaw/qv1;->V(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    invoke-virtual {v3}, Ljava/io/File;->canWrite()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    invoke-virtual/range {v0 .. v10}, Lcom/daaw/qv1;->h0(Lcom/daaw/al;Lcom/daaw/dv1$d;Ljava/io/File;Ljava/io/OutputStream;JJJ)V

    goto :goto_1

    :cond_4
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.CREATE_DOCUMENT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "android.intent.category.OPENABLE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/daaw/s7;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.extra.TITLE"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/16 v0, 0x36

    move-object v2, p1

    invoke-virtual {p1, v1, v0}, Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_1
    return-void
.end method

.method public final j0(ZLcom/daaw/wf1;Z)V
    .locals 9

    if-nez p3, :cond_0

    sget-boolean p3, Lcom/daaw/qv1;->T:Z

    if-nez p3, :cond_0

    return-void

    :cond_0
    iget-object p3, p0, Lcom/daaw/qv1;->c:Lcom/daaw/vm0;

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/daaw/vm0;->e(Z)V

    iput-boolean v0, p0, Lcom/daaw/qv1;->B:Z

    sput-boolean v0, Lcom/daaw/qv1;->T:Z

    sget-object p3, Lcom/daaw/qv1;->Q:Lcom/daaw/sw1;

    sget-boolean v1, Lcom/daaw/qv1;->T:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p3, v1, v2, v3}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p3, 0x0

    :goto_0
    iget-boolean v1, p0, Lcom/daaw/qv1;->B:Z

    if-nez v1, :cond_1

    const/16 v1, 0x32

    if-ge p3, v1, :cond_1

    add-int/lit8 p3, p3, 0x1

    const-wide/16 v1, 0x64

    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    :cond_1
    iget-boolean p3, p0, Lcom/daaw/qv1;->B:Z

    if-nez p3, :cond_2

    const-string p3, "glThreadSignalDoneExporting timed out"

    invoke-static {p3}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_2
    const/4 p3, 0x0

    iput-object p3, p0, Lcom/daaw/qv1;->M:Lcom/daaw/dv1$f;

    iget-object v1, p0, Lcom/daaw/qv1;->b:Lcom/daaw/xw0;

    invoke-virtual {v1, v0}, Lcom/daaw/xw0;->l(Z)V

    sget-object v1, Lcom/daaw/avee/comp/playback/c;->f:Lcom/daaw/iw1;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    new-instance v1, Lcom/daaw/dv1$f;

    invoke-direct {v1}, Lcom/daaw/dv1$f;-><init>()V

    iput-boolean v0, v1, Lcom/daaw/dv1$f;->a:Z

    invoke-static {v1}, Lcom/daaw/dv1;->K(Lcom/daaw/dv1$f;)V

    invoke-static {}, Lcom/daaw/dx0;->b()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v1, p0, Lcom/daaw/qv1;->w:Ljava/io/File;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/daaw/qv1;->w:Ljava/io/File;

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "notify file: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/qv1;->w:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/cr1;->r(Landroid/content/Context;Ljava/lang/String;)V

    :cond_3
    if-eqz p1, :cond_7

    iget-object v1, p0, Lcom/daaw/qv1;->w:Ljava/io/File;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/daaw/qv1;->w:Ljava/io/File;

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v6

    const/4 v3, 0x3

    invoke-virtual {v6}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/cr1;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v5, "Exported visualizer"

    const-string v8, "video/mp4"

    move-object v4, v0

    invoke-static/range {v3 .. v8}, Lcom/daaw/qv1;->g0(ILandroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/daaw/wf1;->e()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_5
    const-string v1, ""

    :goto_1
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    invoke-static {}, Lcom/daaw/dx0;->d()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    if-nez v3, :cond_8

    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const v0, 0x7f1002e9

    invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const v0, 0x7f1000b0

    new-instance v1, Lcom/daaw/qv1$m;

    invoke-direct {v1, p0}, Lcom/daaw/qv1$m;-><init>(Lcom/daaw/qv1;)V

    invoke-virtual {v3, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    const v1, 0x102000b

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_8

    const/high16 v1, 0x41600000    # 14.0f

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1002ed

    goto :goto_2

    :cond_7
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1002e5

    :goto_2
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {v1, v0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_8
    :goto_3
    iput-object p3, p0, Lcom/daaw/qv1;->u:Lcom/daaw/f40;

    iput-object p3, p0, Lcom/daaw/qv1;->w:Ljava/io/File;

    invoke-virtual {p0}, Lcom/daaw/qv1;->e0()V

    if-eqz p1, :cond_a

    if-eqz p2, :cond_9

    invoke-virtual {p2}, Lcom/daaw/wf1;->f()Z

    move-result p1

    if-nez p1, :cond_a

    :cond_9
    sget-object p1, Lcom/daaw/qv1;->S:Lcom/daaw/qw1;

    iget-boolean p2, p0, Lcom/daaw/qv1;->N:Z

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_a
    return-void
.end method

.method public final k0(Lcom/daaw/dv1$e;[Lcom/daaw/dv1$e;)V
    .locals 5

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Integer;

    iget v1, p0, Lcom/daaw/qv1;->q:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lcom/daaw/qv1;->t:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/16 v1, 0x7c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    sget-object v1, Lcom/daaw/qv1;->P:Lcom/daaw/ww1;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0, v4}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    aget-object v1, v0, v2

    aget-object v0, v0, v3

    invoke-virtual {v1, v0}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p2}, Lcom/daaw/dv1$e;->d([Lcom/daaw/dv1$e;)Lcom/daaw/dv1$e;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/dv1$e;->c(Lcom/daaw/dv1$e;)V

    return-void
.end method
