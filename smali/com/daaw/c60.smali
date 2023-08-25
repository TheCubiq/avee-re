.class public Lcom/daaw/c60;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static j:Z

.field public static k:Z

.field public static l:Z

.field public static volatile m:Z


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public b:Landroid/os/Handler;

.field public c:Z

.field public final d:I

.field public final e:Ljava/util/Date;

.field public final f:Ljava/util/Date;

.field public final g:Ljava/util/Date;

.field public final h:Ljava/util/Date;

.field public final i:Ljava/util/Date;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/daaw/c60;->b:Landroid/os/Handler;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/c60;->c:Z

    const v1, 0x313ed

    iput v1, p0, Lcom/daaw/c60;->d:I

    new-instance v1, Ljava/util/Date;

    const/16 v2, 0x75

    const/16 v3, 0xb

    const/16 v4, 0x18

    invoke-direct {v1, v2, v3, v4}, Ljava/util/Date;-><init>(III)V

    iput-object v1, p0, Lcom/daaw/c60;->e:Ljava/util/Date;

    new-instance v1, Ljava/util/Date;

    const/16 v4, 0x1a

    invoke-direct {v1, v2, v3, v4}, Ljava/util/Date;-><init>(III)V

    iput-object v1, p0, Lcom/daaw/c60;->f:Ljava/util/Date;

    new-instance v1, Ljava/util/Date;

    const/16 v2, 0x76

    const/4 v3, 0x1

    invoke-direct {v1, v2, v0, v3}, Ljava/util/Date;-><init>(III)V

    iput-object v1, p0, Lcom/daaw/c60;->g:Ljava/util/Date;

    new-instance v1, Ljava/util/Date;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v0, v3}, Ljava/util/Date;-><init>(III)V

    iput-object v1, p0, Lcom/daaw/c60;->h:Ljava/util/Date;

    new-instance v1, Ljava/util/Date;

    const/4 v3, 0x4

    invoke-direct {v1, v2, v0, v3}, Ljava/util/Date;-><init>(III)V

    iput-object v1, p0, Lcom/daaw/c60;->i:Ljava/util/Date;

    sget-object v0, Lcom/daaw/avee/SettingsActivity;->u:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/c60$e;

    invoke-direct {v1, p0}, Lcom/daaw/c60$e;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/SettingsActivity;->v:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/c60$f;

    invoke-direct {v1, p0}, Lcom/daaw/c60$f;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/daaw/c60;->i()V

    sget-object v0, Lcom/daaw/vx;->v:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/c60$g;

    invoke-direct {v1, p0}, Lcom/daaw/c60$g;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/vx;->w:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/c60$h;

    invoke-direct {v1, p0}, Lcom/daaw/c60$h;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->h0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/c60$i;

    invoke-direct {v1, p0}, Lcom/daaw/c60$i;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->i0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/c60$j;

    invoke-direct {v1, p0}, Lcom/daaw/c60$j;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->l0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/c60$k;

    invoke-direct {v1, p0}, Lcom/daaw/c60$k;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->q0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/c60$l;

    invoke-direct {v1, p0}, Lcom/daaw/c60$l;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->b0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/c60$m;

    invoke-direct {v1, p0}, Lcom/daaw/c60$m;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/l01;->t:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/c60$a;

    invoke-direct {v1, p0}, Lcom/daaw/c60$a;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/l01;->v:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/c60$b;

    invoke-direct {v1, p0}, Lcom/daaw/c60$b;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->D0:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/c60$c;

    invoke-direct {v1, p0}, Lcom/daaw/c60$c;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MediaControlsView;->p:Lcom/daaw/avee/MediaControlsView$a;

    invoke-virtual {v0}, Lcom/daaw/avee/MediaControlsView$a;->a()Lcom/daaw/sw1;

    move-result-object v0

    new-instance v1, Lcom/daaw/c60$d;

    invoke-direct {v1, p0}, Lcom/daaw/c60$d;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/dj0;->t:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/z50;

    invoke-direct {v1, p0}, Lcom/daaw/z50;-><init>(Lcom/daaw/c60;)V

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/g2;->b:Lcom/daaw/ww1;

    sget-object v1, Lcom/daaw/a60;->a:Lcom/daaw/a60;

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/MainActivity;->K0:Lcom/daaw/xw1;

    sget-object v1, Lcom/daaw/b60;->a:Lcom/daaw/b60;

    iget-object v2, p0, Lcom/daaw/c60;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/xw1;->b(Lcom/daaw/xw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/c60;Ljava/lang/Integer;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/c60;->j(Ljava/lang/Integer;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/al;Landroid/content/Intent;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/c60;->l(Lcom/daaw/al;Landroid/content/Intent;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ljava/io/File;
    .locals 0

    invoke-static {p0}, Lcom/daaw/c60;->k(Ljava/lang/Object;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/c60;Landroid/app/Activity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/c60;->n(Landroid/app/Activity;)V

    return-void
.end method

.method public static synthetic e(Lcom/daaw/c60;Landroid/content/Context;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/c60;->m(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic f(Lcom/daaw/c60;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/c60;->b:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic g(Lcom/daaw/c60;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/c60;->c:Z

    return p0
.end method

.method public static synthetic h(Lcom/daaw/c60;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/c60;->i()V

    return-void
.end method

.method private synthetic j(Ljava/lang/Integer;Landroid/view/View;)V
    .locals 1

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    iget-object v0, p0, Lcom/daaw/c60;->e:Ljava/util/Date;

    invoke-virtual {p1, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/c60;->f:Ljava/util/Date;

    invoke-virtual {p1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_1

    const p1, 0x7f08017c

    :goto_0
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/c60;->g:Ljava/util/Date;

    invoke-virtual {p1, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/c60;->h:Ljava/util/Date;

    invoke-virtual {p1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result p1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    const p1, 0x7f080155

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static synthetic k(Ljava/lang/Object;)Ljava/io/File;
    .locals 0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/daaw/j5;->a(I)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/daaw/al;Landroid/content/Intent;)Ljava/lang/Boolean;
    .locals 4

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LaunchIntent: action: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ";"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ";null"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "android.intent.action.VIEW"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/daaw/rv1;->b(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v1}, Lcom/daaw/rv1;->a(Landroid/content/Context;Landroid/net/Uri;)I

    move-result p0

    if-lez p0, :cond_3

    invoke-static {p0}, Lcom/daaw/pv1;->Z(I)V

    goto :goto_1

    :cond_2
    new-instance p0, Lcom/daaw/tx0;

    const-wide/16 v2, -0x1

    invoke-direct {p0, v2, v3, v1}, Lcom/daaw/tx0;-><init>(JLandroid/net/Uri;)V

    goto :goto_2

    :cond_3
    :goto_1
    move-object p0, v0

    :goto_2
    if-eqz p0, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object p0, Lcom/daaw/avee/MainActivity;->z0:Lcom/daaw/rw1;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_4
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public final i()V
    .locals 2

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iget-object v1, p0, Lcom/daaw/c60;->e:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/c60;->i:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/daaw/c60;->m:Z

    return-void
.end method

.method public final m(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/c60;->c:Z

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/j5;->w(Landroid/content/Context;)V

    sget-boolean p1, Lcom/daaw/c60;->j:Z

    if-nez p1, :cond_0

    sget p1, Lcom/daaw/j5;->u:I

    invoke-virtual {v0, p1}, Lcom/daaw/j5;->h(I)Z

    move-result p1

    sput-boolean p1, Lcom/daaw/c60;->j:Z

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "isFirstLaunch: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v1, Lcom/daaw/c60;->j:Z

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    sget p1, Lcom/daaw/j5;->u:I

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/j5;->a0(IZ)V

    sget-boolean p1, Lcom/daaw/c60;->j:Z

    sput-boolean p1, Lcom/daaw/c60;->k:Z

    sput-boolean p1, Lcom/daaw/c60;->l:Z

    :cond_0
    return-void
.end method

.method public final n(Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->X:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->k(I)I

    move-result v0

    const v1, 0x313ed

    if-eq v0, v1, :cond_0

    new-instance v0, Lcom/daaw/al;

    invoke-direct {v0, p1}, Lcom/daaw/al;-><init>(Landroid/app/Activity;)V

    const/4 p1, 0x1

    invoke-static {v0, p1}, Lcom/daaw/vx;->i(Lcom/daaw/al;Z)V

    :cond_0
    return-void
.end method
