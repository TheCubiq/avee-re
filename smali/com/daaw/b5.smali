.class public Lcom/daaw/b5;
.super Lcom/daaw/kt;
.source ""


# static fields
.field public static c:Lcom/daaw/xw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/xw1<",
            "Lcom/daaw/avee/comp/playback/a;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/playback/a;",
            ">;"
        }
    .end annotation
.end field

.field public static d:Lcom/daaw/xw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/xw1<",
            "Lcom/daaw/avee/comp/playback/a;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/playback/a;",
            ">;"
        }
    .end annotation
.end field

.field public static e:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static f:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static g:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static h:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:Lcom/daaw/avee/comp/playback/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/xw1;

    invoke-direct {v0}, Lcom/daaw/xw1;-><init>()V

    sput-object v0, Lcom/daaw/b5;->c:Lcom/daaw/xw1;

    new-instance v0, Lcom/daaw/xw1;

    invoke-direct {v0}, Lcom/daaw/xw1;-><init>()V

    sput-object v0, Lcom/daaw/b5;->d:Lcom/daaw/xw1;

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/b5;->e:Lcom/daaw/ww1;

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/b5;->f:Lcom/daaw/ww1;

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/b5;->g:Lcom/daaw/ww1;

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/b5;->h:Lcom/daaw/ww1;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/daaw/kt;-><init>()V

    new-instance v0, Lcom/daaw/avee/comp/playback/a;

    invoke-direct {v0}, Lcom/daaw/avee/comp/playback/a;-><init>()V

    iput-object v0, p0, Lcom/daaw/b5;->b:Lcom/daaw/avee/comp/playback/a;

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->t:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/b5$a;

    invoke-direct {v1, p0}, Lcom/daaw/b5$a;-><init>(Lcom/daaw/b5;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->H:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/b5$b;

    invoke-direct {v1, p0}, Lcom/daaw/b5$b;-><init>(Lcom/daaw/b5;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->I:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/b5$c;

    invoke-direct {v1, p0}, Lcom/daaw/b5$c;-><init>(Lcom/daaw/b5;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/b5;)Lcom/daaw/avee/comp/playback/a;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b5;->b:Lcom/daaw/avee/comp/playback/a;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/b5;Lcom/daaw/avee/comp/playback/a;)Lcom/daaw/avee/comp/playback/a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/b5;->b:Lcom/daaw/avee/comp/playback/a;

    return-object p1
.end method

.method public static c()J
    .locals 4

    invoke-static {}, Lcom/daaw/qv1;->b0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/qv1;->Z()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/xw0;->h:Lcom/daaw/hx0;

    iget-wide v0, v0, Lcom/daaw/hx0;->a:J

    :goto_0
    return-wide v0
.end method

.method public static d()J
    .locals 4

    invoke-static {}, Lcom/daaw/qv1;->b0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/qv1;->a0()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    goto :goto_0

    :cond_0
    sget-wide v0, Lcom/daaw/xw0;->i:J

    :goto_0
    return-wide v0
.end method
