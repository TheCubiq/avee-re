.class public Lcom/daaw/nc0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/nc0$i;
    }
.end annotation


# static fields
.field public static g:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static h:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "Lcom/daaw/al;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static i:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static j:Lcom/daaw/xw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/xw1<",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:Ljava/lang/Long;

.field public static l:Z

.field public static m:Z

.field public static n:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static o:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static p:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static q:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static r:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/util/List<",
            "Lcom/daaw/kz0;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lcom/daaw/nc0$i;

.field public c:Lcom/daaw/wb;

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/kz0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/nc0;->g:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/nc0;->h:Lcom/daaw/ww1;

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/nc0;->i:Lcom/daaw/ww1;

    new-instance v0, Lcom/daaw/xw1;

    invoke-direct {v0}, Lcom/daaw/xw1;-><init>()V

    sput-object v0, Lcom/daaw/nc0;->j:Lcom/daaw/xw1;

    const-wide v0, 0x187b08f6400L

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/daaw/nc0;->k:Ljava/lang/Long;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/daaw/nc0;->l:Z

    sput-boolean v0, Lcom/daaw/nc0;->m:Z

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/nc0;->n:Lcom/daaw/ww1;

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/nc0;->o:Lcom/daaw/ww1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/nc0;->p:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/nc0;->q:Lcom/daaw/ww1;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/nc0;->r:Lcom/daaw/vw1;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/nc0;->a:Ljava/util/List;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/nc0;->d:Ljava/util/List;

    iput-object v1, p0, Lcom/daaw/nc0;->e:Ljava/util/List;

    iput-object v1, p0, Lcom/daaw/nc0;->f:Ljava/util/List;

    new-instance v2, Lcom/daaw/nc0$i;

    invoke-direct {v2, p0, v1}, Lcom/daaw/nc0$i;-><init>(Lcom/daaw/nc0;Lcom/daaw/nc0$a;)V

    iput-object v2, p0, Lcom/daaw/nc0;->b:Lcom/daaw/nc0$i;

    sget-object v1, Lcom/daaw/avee/MainActivity;->h0:Lcom/daaw/qw1;

    new-instance v2, Lcom/daaw/nc0$a;

    invoke-direct {v2, p0}, Lcom/daaw/nc0$a;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/avee/comp/Common/PrControls/PrCheckBox;->u:Lcom/daaw/xw1;

    new-instance v2, Lcom/daaw/nc0$b;

    invoke-direct {v2, p0}, Lcom/daaw/nc0$b;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/xw1;->b(Lcom/daaw/xw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;->y:Lcom/daaw/xw1;

    new-instance v2, Lcom/daaw/nc0$c;

    invoke-direct {v2, p0}, Lcom/daaw/nc0$c;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/xw1;->b(Lcom/daaw/xw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/avee/comp/Common/PrControls/PrButton;->s:Lcom/daaw/xw1;

    new-instance v2, Lcom/daaw/nc0$d;

    invoke-direct {v2, p0}, Lcom/daaw/nc0$d;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/xw1;->b(Lcom/daaw/xw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/avee/MainActivity;->j0:Lcom/daaw/qw1;

    new-instance v2, Lcom/daaw/nc0$e;

    invoke-direct {v2, p0}, Lcom/daaw/nc0$e;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/avee/MainActivity;->n0:Lcom/daaw/qw1;

    new-instance v2, Lcom/daaw/nc0$f;

    invoke-direct {v2, p0}, Lcom/daaw/nc0$f;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/hg1;->A:Lcom/daaw/qw1;

    new-instance v2, Lcom/daaw/ec0;

    invoke-direct {v2, p0}, Lcom/daaw/ec0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/avee/MainActivity;->r0:Lcom/daaw/rw1;

    new-instance v2, Lcom/daaw/nc0$g;

    invoke-direct {v2, p0}, Lcom/daaw/nc0$g;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/avee/comp/Common/PrControls/PrImageButton;->q:Lcom/daaw/xw1;

    new-instance v2, Lcom/daaw/dc0;

    invoke-direct {v2, p0}, Lcom/daaw/dc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/xw1;->b(Lcom/daaw/xw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/nc0;->h:Lcom/daaw/ww1;

    new-instance v2, Lcom/daaw/kc0;

    invoke-direct {v2, p0}, Lcom/daaw/kc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/oy0;->a:Lcom/daaw/vw1;

    new-instance v2, Lcom/daaw/fc0;

    invoke-direct {v2, p0}, Lcom/daaw/fc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/avee/comp/Common/PrControls/PrCheckBox;->t:Lcom/daaw/vw1;

    new-instance v2, Lcom/daaw/fc0;

    invoke-direct {v2, p0}, Lcom/daaw/fc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/avee/comp/Common/PrControls/PrEditText;->x:Lcom/daaw/vw1;

    new-instance v2, Lcom/daaw/hc0;

    invoke-direct {v2, p0}, Lcom/daaw/hc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/avee/comp/Common/PrControls/PrButton;->r:Lcom/daaw/ww1;

    new-instance v2, Lcom/daaw/mc0;

    invoke-direct {v2, p0}, Lcom/daaw/mc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/avee/comp/Common/PrControls/PrImageButton;->p:Lcom/daaw/vw1;

    new-instance v2, Lcom/daaw/gc0;

    invoke-direct {v2, p0}, Lcom/daaw/gc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/yn;->z:Lcom/daaw/vw1;

    new-instance v2, Lcom/daaw/fc0;

    invoke-direct {v2, p0}, Lcom/daaw/fc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/pl0;->X:Lcom/daaw/ww1;

    new-instance v2, Lcom/daaw/bc0;

    invoke-direct {v2, p0}, Lcom/daaw/bc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/xi;->S:Lcom/daaw/ww1;

    new-instance v2, Lcom/daaw/cc0;

    invoke-direct {v2, p0}, Lcom/daaw/cc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/qv1;->P:Lcom/daaw/ww1;

    new-instance v2, Lcom/daaw/ac0;

    invoke-direct {v2, p0}, Lcom/daaw/ac0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/avee/MainActivity;->H0:Lcom/daaw/vw1;

    new-instance v2, Lcom/daaw/nc0$h;

    invoke-direct {v2, p0}, Lcom/daaw/nc0$h;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/hg1;->B:Lcom/daaw/vw1;

    new-instance v2, Lcom/daaw/fc0;

    invoke-direct {v2, p0}, Lcom/daaw/fc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/nc0;->g:Lcom/daaw/vw1;

    new-instance v2, Lcom/daaw/fc0;

    invoke-direct {v2, p0}, Lcom/daaw/fc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/nc0;->o:Lcom/daaw/ww1;

    new-instance v2, Lcom/daaw/lc0;

    invoke-direct {v2, p0}, Lcom/daaw/lc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/nc0;->r:Lcom/daaw/vw1;

    new-instance v2, Lcom/daaw/jc0;

    invoke-direct {v2, p0}, Lcom/daaw/jc0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v1, Lcom/daaw/nc0;->p:Lcom/daaw/vw1;

    new-instance v2, Lcom/daaw/ic0;

    invoke-direct {v2, p0}, Lcom/daaw/ic0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v1, v2, v0}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    return-void
.end method

.method private synthetic C(Lcom/daaw/al;Lcom/daaw/avee/comp/Common/PrControls/PrImageButton;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/nc0;->A()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/nc0;->T(Lcom/daaw/al;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method private synthetic D(Lcom/daaw/al;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/nc0;->T(Lcom/daaw/al;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method private synthetic E(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/nc0;->A()Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic F([Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/nc0;->A()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/nc0;->j:Lcom/daaw/xw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p0, p1, v1}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic G(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nc0;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic H()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nc0;->f:Ljava/util/List;

    return-object v0
.end method

.method private synthetic I()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nc0;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private synthetic J()Ljava/lang/Boolean;
    .locals 7

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x2

    aput-object v2, v0, v4

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v0, v2

    invoke-virtual {p0}, Lcom/daaw/nc0;->A()Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Lcom/daaw/nc0;->j:Lcom/daaw/xw1;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v5, p0, v0, v6}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_0

    aget-object v4, v0, v4

    aget-object v0, v0, v2

    invoke-virtual {v4, v0}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private synthetic K([Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/nc0;->A()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/nc0;->j:Lcom/daaw/xw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p0, p1, v1}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic L()Ljava/lang/Boolean;
    .locals 7

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/4 v4, 0x6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x2

    aput-object v4, v0, v5

    const/4 v4, 0x3

    aput-object v1, v0, v4

    invoke-virtual {p0}, Lcom/daaw/nc0;->A()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/daaw/nc0;->j:Lcom/daaw/xw1;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, p0, v0, v6}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    aget-object v1, v0, v5

    aget-object v0, v0, v4

    invoke-virtual {v1, v0}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private synthetic M(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/nc0;->A()Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic N(Lcom/daaw/xb;Ljava/util/List;)V
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/xb;->b()I

    move-result p1

    if-nez p1, :cond_0

    iput-object p2, p0, Lcom/daaw/nc0;->f:Ljava/util/List;

    sget-object p1, Lcom/daaw/nc0;->q:Lcom/daaw/ww1;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, v0}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/daaw/nc0;->q:Lcom/daaw/ww1;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, p2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public static synthetic a(Lcom/daaw/nc0;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/nc0;->G(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/nc0;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0}, Lcom/daaw/nc0;->L()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/daaw/nc0;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0}, Lcom/daaw/nc0;->J()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/nc0;Lcom/daaw/xb;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/nc0;->N(Lcom/daaw/xb;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic e(Lcom/daaw/nc0;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/nc0;->M(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/nc0;Lcom/daaw/al;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/nc0;->D(Lcom/daaw/al;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/daaw/nc0;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/nc0;->y(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic h(Lcom/daaw/nc0;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/nc0;->E(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/daaw/nc0;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0}, Lcom/daaw/nc0;->I()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/daaw/nc0;Lcom/daaw/al;Lcom/daaw/avee/comp/Common/PrControls/PrImageButton;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/nc0;->C(Lcom/daaw/al;Lcom/daaw/avee/comp/Common/PrControls/PrImageButton;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/daaw/nc0;[Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/nc0;->K([Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/daaw/nc0;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, Lcom/daaw/nc0;->H()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/daaw/nc0;[Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/nc0;->F([Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/daaw/nc0;)Lcom/daaw/wb;
    .locals 0

    iget-object p0, p0, Lcom/daaw/nc0;->c:Lcom/daaw/wb;

    return-object p0
.end method

.method public static synthetic o(Z)Z
    .locals 0

    sput-boolean p0, Lcom/daaw/nc0;->l:Z

    return p0
.end method

.method public static synthetic p(Lcom/daaw/nc0;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/nc0;->e:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic q(Lcom/daaw/nc0;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lcom/daaw/nc0;->e:Ljava/util/List;

    return-object p1
.end method

.method public static synthetic r(Lcom/daaw/nc0;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lcom/daaw/nc0;->d:Ljava/util/List;

    return-object p1
.end method

.method public static synthetic s(Lcom/daaw/nc0;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/nc0;->Q()V

    return-void
.end method

.method public static synthetic t(Lcom/daaw/nc0;Landroid/app/Activity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/nc0;->x(Landroid/app/Activity;)V

    return-void
.end method

.method public static synthetic u(Lcom/daaw/nc0;Lcom/daaw/al;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/nc0;->T(Lcom/daaw/al;)V

    return-void
.end method

.method public static synthetic v(Lcom/daaw/nc0;Landroid/app/Activity;Z)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/nc0;->U(Landroid/app/Activity;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic w(Lcom/daaw/nc0;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/nc0;->B()V

    return-void
.end method


# virtual methods
.method public A()Ljava/lang/Boolean;
    .locals 5

    sget-boolean v0, Lcom/daaw/nc0;->l:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-object v2, Lcom/daaw/nc0;->k:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/nc0;->d:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final B()V
    .locals 1

    const-string v0, "killHelper"

    invoke-static {v0}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/nc0;->P()V

    return-void
.end method

.method public O()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/nc0;->S()V

    return-void
.end method

.method public P()V
    .locals 1

    const-string v0, "Destroying helper."

    invoke-static {v0}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/nc0;->c:Lcom/daaw/wb;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/wb;->k()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/nc0;->c:Lcom/daaw/wb;

    return-void
.end method

.method public final Q()V
    .locals 1

    invoke-static {}, Lcom/daaw/avee/MainActivity;->r0()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/MainActivity;->S0()V

    :cond_0
    return-void
.end method

.method public final R()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/nc0;->c:Lcom/daaw/wb;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/wb;->n()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/nc0;->c:Lcom/daaw/wb;

    invoke-virtual {v0}, Lcom/daaw/wb;->r()V

    :cond_0
    return-void
.end method

.method public S()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/nc0;->c:Lcom/daaw/wb;

    invoke-virtual {p0}, Lcom/daaw/nc0;->z()Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/daaw/zb0;

    invoke-direct {v2, p0}, Lcom/daaw/zb0;-><init>(Lcom/daaw/nc0;)V

    invoke-virtual {v0, v1, v2}, Lcom/daaw/wb;->s(Ljava/util/List;Lcom/daaw/lz0;)V

    return-void
.end method

.method public final T(Lcom/daaw/al;)V
    .locals 0

    invoke-static {p1}, Lcom/daaw/hg1;->f(Lcom/daaw/al;)V

    return-void
.end method

.method public final U(Landroid/app/Activity;Z)Z
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/nc0;->R()V

    const/4 p1, 0x0

    return p1
.end method

.method public final x(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/nc0;->c:Lcom/daaw/wb;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/wb;

    iget-object v1, p0, Lcom/daaw/nc0;->b:Lcom/daaw/nc0$i;

    invoke-direct {v0, p1, v1}, Lcom/daaw/wb;-><init>(Landroid/app/Activity;Lcom/daaw/wb$e;)V

    iput-object v0, p0, Lcom/daaw/nc0;->c:Lcom/daaw/wb;

    :cond_0
    return-void
.end method

.method public final y(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/nc0;->c:Lcom/daaw/wb;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/daaw/wb;->n()I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_7

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/daaw/nc0;->c:Lcom/daaw/wb;

    invoke-virtual {v1}, Lcom/daaw/wb;->n()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v3, 0x7f1000c9

    invoke-virtual {v0, v3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/nc0;->O()V

    :try_start_0
    iget-object v0, p0, Lcom/daaw/nc0;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/kz0;

    invoke-virtual {v1}, Lcom/daaw/kz0;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/daaw/nc0;->e:Ljava/util/List;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lcom/daaw/nc0;->e:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v0}, Lcom/android/billingclient/api/Purchase;->g()Z

    move-result v3

    if-eqz v3, :cond_4

    move-object v2, v0

    goto :goto_1

    :cond_5
    if-nez v2, :cond_6

    iget-object p1, p0, Lcom/daaw/nc0;->e:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/android/billingclient/api/Purchase;

    :cond_6
    iget-object p1, p0, Lcom/daaw/nc0;->c:Lcom/daaw/wb;

    invoke-virtual {p1, v1, v2}, Lcom/daaw/wb;->p(Lcom/daaw/kz0;Lcom/android/billingclient/api/Purchase;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "launchPurchaseFlow exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :goto_2
    invoke-virtual {p0}, Lcom/daaw/nc0;->Q()V

    return-void

    :cond_7
    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_8

    sget-object p1, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    const-string v0, "Billing manager not initialized"

    invoke-virtual {p1, v0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_8
    return-void
.end method

.method public final z()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/j01$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/daaw/j01$b;->a()Lcom/daaw/j01$b$a;

    move-result-object v1

    const-string v2, "premium_1month"

    invoke-virtual {v1, v2}, Lcom/daaw/j01$b$a;->b(Ljava/lang/String;)Lcom/daaw/j01$b$a;

    move-result-object v1

    const-string v2, "subs"

    invoke-virtual {v1, v2}, Lcom/daaw/j01$b$a;->c(Ljava/lang/String;)Lcom/daaw/j01$b$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/j01$b$a;->a()Lcom/daaw/j01$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/daaw/j01$b;->a()Lcom/daaw/j01$b$a;

    move-result-object v1

    const-string v3, "premium_3month"

    invoke-virtual {v1, v3}, Lcom/daaw/j01$b$a;->b(Ljava/lang/String;)Lcom/daaw/j01$b$a;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/daaw/j01$b$a;->c(Ljava/lang/String;)Lcom/daaw/j01$b$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/j01$b$a;->a()Lcom/daaw/j01$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/daaw/j01$b;->a()Lcom/daaw/j01$b$a;

    move-result-object v1

    const-string v3, "premium_12month"

    invoke-virtual {v1, v3}, Lcom/daaw/j01$b$a;->b(Ljava/lang/String;)Lcom/daaw/j01$b$a;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/daaw/j01$b$a;->c(Ljava/lang/String;)Lcom/daaw/j01$b$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/j01$b$a;->a()Lcom/daaw/j01$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
