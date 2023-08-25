.class public Lcom/daaw/xw0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static volatile d:Z

.field public static volatile e:Z

.field public static volatile f:Lcom/daaw/tx0;

.field public static volatile g:Lcom/daaw/tx0$b;

.field public static volatile h:Lcom/daaw/hx0;

.field public static volatile i:J

.field public static volatile j:I

.field public static volatile k:I

.field public static volatile l:Z

.field public static volatile m:Z


# instance fields
.field public a:Lcom/daaw/uf1;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public c:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lcom/daaw/tx0;->k:Lcom/daaw/tx0;

    sput-object v0, Lcom/daaw/xw0;->f:Lcom/daaw/tx0;

    sget-object v0, Lcom/daaw/tx0;->h:Lcom/daaw/tx0$b;

    sput-object v0, Lcom/daaw/xw0;->g:Lcom/daaw/tx0$b;

    sget-object v0, Lcom/daaw/hx0;->c:Lcom/daaw/hx0;

    sput-object v0, Lcom/daaw/xw0;->h:Lcom/daaw/hx0;

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/daaw/xw0;->i:J

    const/4 v0, 0x0

    sput v0, Lcom/daaw/xw0;->j:I

    const/16 v1, 0xa

    sput v1, Lcom/daaw/xw0;->k:I

    sput-boolean v0, Lcom/daaw/xw0;->l:Z

    const/4 v0, 0x1

    sput-boolean v0, Lcom/daaw/xw0;->m:Z

    return-void
.end method

.method public constructor <init>(Lcom/daaw/uf1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/daaw/xw0;->c:Landroid/os/Handler;

    iput-object p1, p0, Lcom/daaw/xw0;->a:Lcom/daaw/uf1;

    sget-object p1, Lcom/daaw/avee/MainActivity;->l0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/xw0$k;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$k;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->c0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/xw0$v;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$v;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->f0:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$g0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$g0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->e0:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$m0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$m0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->h0:Lcom/daaw/tw1;

    new-instance v0, Lcom/daaw/xw0$n0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$n0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/tw1;->b(Lcom/daaw/tw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->s0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/xw0$o0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$o0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->i0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/xw0$p0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$p0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->d0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/xw0$q0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$q0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->j0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/xw0$r0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$r0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->k0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/xw0$a;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$a;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->l0:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$b;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$b;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->m0:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$c;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$c;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->n0:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$d;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$d;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->o0:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/xw0$e;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$e;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->r0:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/xw0$f;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$f;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->q0:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/xw0$g;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$g;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->z0:Lcom/daaw/uw1;

    new-instance v0, Lcom/daaw/xw0$h;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$h;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/uw1;->b(Lcom/daaw/uw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->g0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/xw0$i;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$i;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->h0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/xw0$j;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$j;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->Y:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/xw0$l;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$l;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->f0:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$m;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$m;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->F:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$n;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$n;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->G:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$o;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$o;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->P:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$p;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$p;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->Q:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$q;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$q;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->R:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$r;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$r;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->S:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$s;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$s;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->T:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/xw0$t;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$t;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->U:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/xw0$u;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$u;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->V:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/xw0$w;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$w;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->W:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$x;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$x;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->X:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/xw0$y;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$y;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->d0:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$z;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$z;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->e0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/xw0$a0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$a0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->M:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$b0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$b0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/ko0;->N:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/xw0$c0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$c0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/MainActivity;->o0:Lcom/daaw/pw1;

    new-instance v0, Lcom/daaw/xw0$d0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$d0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/MainActivity;->i0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/xw0$e0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$e0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/avee/MainActivity;->l0:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/xw0$f0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$f0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/j5;->g:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/xw0$h0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$h0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object p1, Lcom/daaw/j5;->h:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/xw0$i0;

    invoke-direct {v0, p0}, Lcom/daaw/xw0$i0;-><init>(Lcom/daaw/xw0;)V

    iget-object v1, p0, Lcom/daaw/xw0;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/xw0;)I
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/xw0;->h()I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/daaw/xw0;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xw0;->c:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic c(Lcom/daaw/xw0;)F
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/xw0;->e()F

    move-result p0

    return p0
.end method

.method public static synthetic d(Lcom/daaw/xw0;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/xw0;->j()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final e()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public f(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/daaw/tx0;Z)V
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    sput-boolean p3, Lcom/daaw/xw0;->d:Z

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    sput-boolean p3, Lcom/daaw/xw0;->e:Z

    iget-object p3, p0, Lcom/daaw/xw0;->c:Landroid/os/Handler;

    new-instance p5, Lcom/daaw/xw0$k0;

    move-object v0, p5

    move-object v1, p0

    move-object v2, p4

    move-object v3, p1

    move-object v4, p2

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/daaw/xw0$k0;-><init>(Lcom/daaw/xw0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V

    invoke-virtual {p3, p5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public g(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;ZLcom/daaw/tx0;)V
    .locals 7

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lcom/daaw/xw0;->c:Landroid/os/Handler;

    new-instance v6, Lcom/daaw/xw0$j0;

    move-object v0, v6

    move-object v1, p0

    move v2, p4

    move-object v3, p5

    move-object v4, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/xw0$j0;-><init>(Lcom/daaw/xw0;ZLcom/daaw/tx0;Ljava/lang/Long;Ljava/lang/Integer;)V

    invoke-virtual {p2, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final h()I
    .locals 2

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->K:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->k(I)I

    move-result v0

    return v0
.end method

.method public i(Ljava/lang/Integer;Landroid/app/Activity;Z)V
    .locals 1

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object p2

    if-eqz p2, :cond_2

    if-nez p3, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-boolean p1, Lcom/daaw/xw0;->d:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-virtual {p2, p1, p3}, Lcom/daaw/avee/MainActivity;->K0(ZZ)V

    :cond_2
    return-void
.end method

.method public final j()Z
    .locals 2

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->O:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->k(I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k(Ljava/lang/Integer;)V
    .locals 1

    sget-object v0, Lcom/daaw/avee/comp/playback/c;->v:Lcom/daaw/iw1;

    invoke-virtual {v0, p1}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    invoke-static {}, Lcom/daaw/ko0;->q()Lcom/daaw/ko0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/ko0;->x(I)V

    :cond_0
    return-void
.end method

.method public l(Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/xw0;->c:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/xw0$l0;

    invoke-direct {v1, p0, p1}, Lcom/daaw/xw0$l0;-><init>(Lcom/daaw/xw0;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
