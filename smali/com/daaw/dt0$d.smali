.class public Lcom/daaw/dt0$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/dt0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public A:Z

.field public B:Z

.field public C:Ljava/lang/String;

.field public D:Landroid/os/Bundle;

.field public E:I

.field public F:I

.field public G:Landroid/app/Notification;

.field public H:Landroid/widget/RemoteViews;

.field public I:Landroid/widget/RemoteViews;

.field public J:Landroid/widget/RemoteViews;

.field public K:Ljava/lang/String;

.field public L:I

.field public M:Ljava/lang/String;

.field public N:J

.field public O:I

.field public P:I

.field public Q:Z

.field public R:Landroid/app/Notification;

.field public S:Z

.field public T:Landroid/graphics/drawable/Icon;

.field public U:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public a:Landroid/content/Context;

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/dt0$a;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/lw0;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/dt0$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/CharSequence;

.field public f:Ljava/lang/CharSequence;

.field public g:Landroid/app/PendingIntent;

.field public h:Landroid/app/PendingIntent;

.field public i:Landroid/widget/RemoteViews;

.field public j:Landroid/graphics/Bitmap;

.field public k:Ljava/lang/CharSequence;

.field public l:I

.field public m:I

.field public n:Z

.field public o:Z

.field public p:Lcom/daaw/dt0$e;

.field public q:Ljava/lang/CharSequence;

.field public r:Ljava/lang/CharSequence;

.field public s:[Ljava/lang/CharSequence;

.field public t:I

.field public u:I

.field public v:Z

.field public w:Ljava/lang/String;

.field public x:Z

.field public y:Ljava/lang/String;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/daaw/dt0$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/dt0$d;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/dt0$d;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/dt0$d;->d:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/dt0$d;->n:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/dt0$d;->z:Z

    iput v1, p0, Lcom/daaw/dt0$d;->E:I

    iput v1, p0, Lcom/daaw/dt0$d;->F:I

    iput v1, p0, Lcom/daaw/dt0$d;->L:I

    iput v1, p0, Lcom/daaw/dt0$d;->O:I

    iput v1, p0, Lcom/daaw/dt0$d;->P:I

    new-instance v2, Landroid/app/Notification;

    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    iput-object v2, p0, Lcom/daaw/dt0$d;->R:Landroid/app/Notification;

    iput-object p1, p0, Lcom/daaw/dt0$d;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/dt0$d;->K:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v2, Landroid/app/Notification;->when:J

    iget-object p1, p0, Lcom/daaw/dt0$d;->R:Landroid/app/Notification;

    const/4 p2, -0x1

    iput p2, p1, Landroid/app/Notification;->audioStreamType:I

    iput v1, p0, Lcom/daaw/dt0$d;->m:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/dt0$d;->U:Ljava/util/ArrayList;

    iput-boolean v0, p0, Lcom/daaw/dt0$d;->Q:Z

    return-void
.end method

.method public static d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    if-nez p0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x1400

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    :cond_1
    return-object p0
.end method


# virtual methods
.method public a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Lcom/daaw/dt0$d;
    .locals 2

    iget-object v0, p0, Lcom/daaw/dt0$d;->b:Ljava/util/ArrayList;

    new-instance v1, Lcom/daaw/dt0$a;

    invoke-direct {v1, p1, p2, p3}, Lcom/daaw/dt0$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Landroid/app/Notification;
    .locals 1

    new-instance v0, Lcom/daaw/et0;

    invoke-direct {v0, p0}, Lcom/daaw/et0;-><init>(Lcom/daaw/dt0$d;)V

    invoke-virtual {v0}, Lcom/daaw/et0;->c()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dt0$d;->D:Landroid/os/Bundle;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/daaw/dt0$d;->D:Landroid/os/Bundle;

    :cond_0
    iget-object v0, p0, Lcom/daaw/dt0$d;->D:Landroid/os/Bundle;

    return-object v0
.end method

.method public e(Z)Lcom/daaw/dt0$d;
    .locals 1

    const/16 v0, 0x10

    invoke-virtual {p0, v0, p1}, Lcom/daaw/dt0$d;->k(IZ)V

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/daaw/dt0$d;
    .locals 0

    iput-object p1, p0, Lcom/daaw/dt0$d;->K:Ljava/lang/String;

    return-object p0
.end method

.method public g(Landroid/app/PendingIntent;)Lcom/daaw/dt0$d;
    .locals 0

    iput-object p1, p0, Lcom/daaw/dt0$d;->g:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public h(Ljava/lang/CharSequence;)Lcom/daaw/dt0$d;
    .locals 0

    invoke-static {p1}, Lcom/daaw/dt0$d;->d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dt0$d;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public i(Ljava/lang/CharSequence;)Lcom/daaw/dt0$d;
    .locals 0

    invoke-static {p1}, Lcom/daaw/dt0$d;->d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dt0$d;->e:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public j(Landroid/app/PendingIntent;)Lcom/daaw/dt0$d;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dt0$d;->R:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public final k(IZ)V
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/dt0$d;->R:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    or-int/2addr p1, v0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/daaw/dt0$d;->R:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    xor-int/lit8 p1, p1, -0x1

    and-int/2addr p1, v0

    :goto_0
    iput p1, p2, Landroid/app/Notification;->flags:I

    return-void
.end method

.method public l(Z)Lcom/daaw/dt0$d;
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/dt0$d;->z:Z

    return-object p0
.end method

.method public m(I)Lcom/daaw/dt0$d;
    .locals 0

    iput p1, p0, Lcom/daaw/dt0$d;->m:I

    return-object p0
.end method

.method public n(I)Lcom/daaw/dt0$d;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dt0$d;->R:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->icon:I

    return-object p0
.end method

.method public o(Lcom/daaw/dt0$e;)Lcom/daaw/dt0$d;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dt0$d;->p:Lcom/daaw/dt0$e;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/daaw/dt0$d;->p:Lcom/daaw/dt0$e;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Lcom/daaw/dt0$e;->g(Lcom/daaw/dt0$d;)V

    :cond_0
    return-object p0
.end method

.method public p(Ljava/lang/CharSequence;)Lcom/daaw/dt0$d;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dt0$d;->R:Landroid/app/Notification;

    invoke-static {p1}, Lcom/daaw/dt0$d;->d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public q(J)Lcom/daaw/dt0$d;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dt0$d;->R:Landroid/app/Notification;

    iput-wide p1, v0, Landroid/app/Notification;->when:J

    return-object p0
.end method
