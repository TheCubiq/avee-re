.class public Lcom/daaw/j7;
.super Ljava/lang/Object;
.source ""


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

.field public c:[Lcom/daaw/lv;

.field public d:Lcom/daaw/lv;

.field public e:Lcom/daaw/lv;


# direct methods
.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/j7;->a:Ljava/util/List;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/daaw/j7;->b:Landroid/os/Handler;

    new-instance v0, Lcom/daaw/lv;

    const-string v1, "Bass Boost"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/daaw/j7;->d:Lcom/daaw/lv;

    iget-object v0, v0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v1, Lcom/daaw/lv$a;

    const/high16 v3, 0x42c80000    # 100.0f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v1, v3, v4}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v3, 0x0

    aput-object v1, v0, v3

    iget-object v0, p0, Lcom/daaw/j7;->d:Lcom/daaw/lv;

    iget-object v0, v0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v1, Lcom/daaw/lv$a;

    const/high16 v5, 0x43fa0000    # 500.0f

    const/4 v6, 0x0

    invoke-direct {v1, v5, v6}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v5, 0x1

    aput-object v1, v0, v5

    new-instance v0, Lcom/daaw/lv;

    const-string v1, "Treble Boost"

    invoke-direct {v0, v1, v2}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/daaw/j7;->e:Lcom/daaw/lv;

    iget-object v0, v0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v1, Lcom/daaw/lv$a;

    const/high16 v2, 0x447a0000    # 1000.0f

    invoke-direct {v1, v2, v6}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v1, v0, v3

    iget-object v0, p0, Lcom/daaw/j7;->e:Lcom/daaw/lv;

    iget-object v0, v0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v1, Lcom/daaw/lv$a;

    const v2, 0x469c4000    # 20000.0f

    invoke-direct {v1, v2, v4}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v1, v0, v5

    iget-object v0, p0, Lcom/daaw/j7;->e:Lcom/daaw/lv;

    iget-object v0, v0, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v1, Lcom/daaw/lv$a;

    invoke-direct {v1, v2, v4}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v1, v0, v5

    invoke-virtual {p0}, Lcom/daaw/j7;->f()V

    sget-object v0, Lcom/daaw/avee/MainActivity;->r0:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/j7$a;

    invoke-direct {v1, p0}, Lcom/daaw/j7$a;-><init>(Lcom/daaw/j7;)V

    iget-object v2, p0, Lcom/daaw/j7;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ko0;->Z:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/j7$b;

    invoke-direct {v1, p0}, Lcom/daaw/j7$b;-><init>(Lcom/daaw/j7;)V

    iget-object v2, p0, Lcom/daaw/j7;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/ko0;->a0:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/j7$c;

    invoke-direct {v1, p0}, Lcom/daaw/j7$c;-><init>(Lcom/daaw/j7;)V

    iget-object v2, p0, Lcom/daaw/j7;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/qx;->M:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/j7$d;

    invoke-direct {v1, p0}, Lcom/daaw/j7$d;-><init>(Lcom/daaw/j7;)V

    iget-object v2, p0, Lcom/daaw/j7;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vw1;->b(Lcom/daaw/vw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/j5;->h:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/j7$e;

    invoke-direct {v1, p0}, Lcom/daaw/j7$e;-><init>(Lcom/daaw/j7;)V

    iget-object v2, p0, Lcom/daaw/j7;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/qx;->L:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/j7$f;

    invoke-direct {v1, p0}, Lcom/daaw/j7$f;-><init>(Lcom/daaw/j7;)V

    iget-object v2, p0, Lcom/daaw/j7;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rw1;->b(Lcom/daaw/rw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->w0:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/j7$g;

    invoke-direct {v1, p0}, Lcom/daaw/j7$g;-><init>(Lcom/daaw/j7;)V

    iget-object v2, p0, Lcom/daaw/j7;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->x0:Lcom/daaw/ww1;

    new-instance v1, Lcom/daaw/j7$h;

    invoke-direct {v1, p0}, Lcom/daaw/j7$h;-><init>(Lcom/daaw/j7;)V

    iget-object v2, p0, Lcom/daaw/j7;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->y0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/j7$i;

    invoke-direct {v1, p0}, Lcom/daaw/j7$i;-><init>(Lcom/daaw/j7;)V

    iget-object v2, p0, Lcom/daaw/j7;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/j7;Lcom/daaw/avee/comp/playback/b$b;)Lcom/daaw/rx;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/j7;->e(Lcom/daaw/avee/comp/playback/b$b;)Lcom/daaw/rx;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/j7;)Lcom/daaw/lv;
    .locals 0

    iget-object p0, p0, Lcom/daaw/j7;->d:Lcom/daaw/lv;

    return-object p0
.end method

.method public static synthetic c(Lcom/daaw/j7;)Lcom/daaw/lv;
    .locals 0

    iget-object p0, p0, Lcom/daaw/j7;->e:Lcom/daaw/lv;

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/j7;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/j7;->b:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public final e(Lcom/daaw/avee/comp/playback/b$b;)Lcom/daaw/rx;
    .locals 7

    if-nez p1, :cond_0

    sget-object p1, Lcom/daaw/avee/comp/playback/b$b;->g:Lcom/daaw/avee/comp/playback/b$b;

    :cond_0
    new-instance v0, Lcom/daaw/rx;

    invoke-direct {v0}, Lcom/daaw/rx;-><init>()V

    iget-object v1, p1, Lcom/daaw/avee/comp/playback/b$b;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/daaw/rx;->a:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v1

    sget v2, Lcom/daaw/j5;->m0:I

    invoke-virtual {v1, v2}, Lcom/daaw/j5;->t(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/lv;->b(Ljava/lang/String;)Lcom/daaw/lv;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    array-length v2, v2

    iget-object v3, p1, Lcom/daaw/avee/comp/playback/b$b;->f:[F

    array-length v3, v3

    const/4 v4, 0x0

    if-eq v2, v3, :cond_1

    new-instance v1, Lcom/daaw/lv;

    iget-object v2, p1, Lcom/daaw/avee/comp/playback/b$b;->f:[F

    array-length v2, v2

    const-string v3, ""

    invoke-direct {v1, v3, v2}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p1, Lcom/daaw/avee/comp/playback/b$b;->f:[F

    array-length v3, v3

    if-ge v2, v3, :cond_1

    iget-object v3, v1, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v6}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v5, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v2, p1, Lcom/daaw/avee/comp/playback/b$b;->f:[F

    array-length v2, v2

    const v3, 0x3a83126f    # 0.001f

    if-ge v4, v2, :cond_2

    iget-object v2, v1, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    aget-object v2, v2, v4

    iget-object v5, p1, Lcom/daaw/avee/comp/playback/b$b;->e:[I

    aget v5, v5, v4

    int-to-float v5, v5

    mul-float v5, v5, v3

    iput v5, v2, Lcom/daaw/lv$a;->a:F

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    iput-object v1, v0, Lcom/daaw/rx;->b:Lcom/daaw/lv;

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget v1, Lcom/daaw/j5;->B:I

    invoke-virtual {p1, v1}, Lcom/daaw/j5;->h(I)Z

    move-result p1

    iput-boolean p1, v0, Lcom/daaw/rx;->c:Z

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget v1, Lcom/daaw/j5;->Q:I

    invoke-virtual {p1, v1}, Lcom/daaw/j5;->k(I)I

    move-result p1

    iput p1, v0, Lcom/daaw/rx;->d:I

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget v1, Lcom/daaw/j5;->R:I

    invoke-virtual {p1, v1}, Lcom/daaw/j5;->k(I)I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, v3

    iput p1, v0, Lcom/daaw/rx;->f:F

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget v1, Lcom/daaw/j5;->S:I

    invoke-virtual {p1, v1}, Lcom/daaw/j5;->k(I)I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, v3

    iput p1, v0, Lcom/daaw/rx;->h:F

    iget-object p1, p0, Lcom/daaw/j7;->d:Lcom/daaw/lv;

    iput-object p1, v0, Lcom/daaw/rx;->g:Lcom/daaw/lv;

    iget-object p1, p0, Lcom/daaw/j7;->e:Lcom/daaw/lv;

    iput-object p1, v0, Lcom/daaw/rx;->i:Lcom/daaw/lv;

    iget-object p1, p0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    iput-object p1, v0, Lcom/daaw/rx;->e:[Lcom/daaw/lv;

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget v1, Lcom/daaw/j5;->T:I

    invoke-virtual {p1, v1}, Lcom/daaw/j5;->k(I)I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, v3

    iput p1, v0, Lcom/daaw/rx;->j:F

    return-object v0
.end method

.method public final f()V
    .locals 16

    move-object/from16 v0, p0

    const/16 v1, 0xf

    new-array v2, v1, [Lcom/daaw/lv;

    iput-object v2, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    new-instance v2, Lcom/daaw/lv;

    const-string v3, "Default"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v6, 0x41a00000    # 20.0f

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v6, 0x0

    aput-object v5, v3, v6

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v8, 0x469c4000    # 20000.0f

    invoke-direct {v5, v8, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v9, 0x1

    aput-object v5, v3, v9

    iget-object v3, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    aput-object v2, v3, v6

    new-instance v2, Lcom/daaw/lv;

    const-string v3, "Classical"

    const/16 v5, 0x12

    invoke-direct {v2, v3, v5}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v10, 0x425c0000    # 55.0f

    const/high16 v11, 0x40400000    # 3.0f

    invoke-direct {v5, v10, v11}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v5, v3, v6

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v10, 0x429a0000    # 77.0f

    const/high16 v12, 0x40000000    # 2.0f

    invoke-direct {v5, v10, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v5, v3, v9

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v10, 0x42dc0000    # 110.0f

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-direct {v5, v10, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v5, v3, v4

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v10, 0x431c0000    # 156.0f

    invoke-direct {v5, v10, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v10, 0x3

    aput-object v5, v3, v10

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v14, 0x435c0000    # 220.0f

    invoke-direct {v5, v14, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v14, 0x4

    aput-object v5, v3, v14

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v15, 0x439b8000    # 311.0f

    invoke-direct {v5, v15, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v15, 0x5

    aput-object v5, v3, v15

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v15, 0x43dc0000    # 440.0f

    invoke-direct {v5, v15, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v15, 0x6

    aput-object v5, v3, v15

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v15, 0x441b8000    # 622.0f

    invoke-direct {v5, v15, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v15, 0x7

    aput-object v5, v3, v15

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v15, 0x445c0000    # 880.0f

    invoke-direct {v5, v15, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v15, 0x8

    aput-object v5, v3, v15

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v15, 0x44960000    # 1200.0f

    invoke-direct {v5, v15, v11}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v15, 0x9

    aput-object v5, v3, v15

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v15, 0x44e10000    # 1800.0f

    invoke-direct {v5, v15, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v15, 0xa

    aput-object v5, v3, v15

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v15, 0x451c4000    # 2500.0f

    invoke-direct {v5, v15, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v15, 0xb

    aput-object v5, v3, v15

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v15, 0x455ac000    # 3500.0f

    invoke-direct {v5, v15, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v15, 0xc

    aput-object v5, v3, v15

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v15, 0x459c4000    # 5000.0f

    invoke-direct {v5, v15, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v15, 0xd

    aput-object v5, v3, v15

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v15, 0x45dac000    # 7000.0f

    const/high16 v14, 0x40800000    # 4.0f

    invoke-direct {v5, v15, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v15, 0xe

    aput-object v5, v3, v15

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v15, 0x461c4000    # 10000.0f

    invoke-direct {v5, v15, v11}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v5, v3, v1

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v15, 0x465ac000    # 14000.0f

    invoke-direct {v5, v15, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v15, 0x10

    aput-object v5, v3, v15

    iget-object v3, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    invoke-direct {v5, v8, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v15, 0x11

    aput-object v5, v3, v15

    const/high16 v3, 0x41200000    # 10.0f

    invoke-virtual {v2, v3}, Lcom/daaw/lv;->c(F)V

    iget-object v5, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    aput-object v2, v5, v9

    new-instance v2, Lcom/daaw/lv;

    const-string v5, "Club"

    const/16 v15, 0x12

    invoke-direct {v2, v5, v15}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v15, Lcom/daaw/lv$a;

    const/high16 v14, 0x425c0000    # 55.0f

    invoke-direct {v15, v14, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v15, v5, v6

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v14, Lcom/daaw/lv$a;

    const/high16 v15, 0x429a0000    # 77.0f

    invoke-direct {v14, v15, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v14, v5, v9

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v14, Lcom/daaw/lv$a;

    const/high16 v15, 0x42dc0000    # 110.0f

    invoke-direct {v14, v15, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v14, v5, v4

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v14, Lcom/daaw/lv$a;

    const/high16 v15, 0x431c0000    # 156.0f

    invoke-direct {v14, v15, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v14, v5, v10

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v14, Lcom/daaw/lv$a;

    const/high16 v15, 0x435c0000    # 220.0f

    invoke-direct {v14, v15, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v15, 0x4

    aput-object v14, v5, v15

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v14, Lcom/daaw/lv$a;

    const v15, 0x439b8000    # 311.0f

    const/high16 v13, 0x40a00000    # 5.0f

    invoke-direct {v14, v15, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v15, 0x5

    aput-object v14, v5, v15

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v14, Lcom/daaw/lv$a;

    const/high16 v15, 0x43dc0000    # 440.0f

    invoke-direct {v14, v15, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v15, 0x6

    aput-object v14, v5, v15

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v14, Lcom/daaw/lv$a;

    const v15, 0x441b8000    # 622.0f

    const/high16 v11, 0x41000000    # 8.0f

    invoke-direct {v14, v15, v11}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x7

    aput-object v14, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x445c0000    # 880.0f

    const/high16 v15, 0x41000000    # 8.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0x8

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x44960000    # 1200.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0x9

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x44e10000    # 1800.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0xa

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x451c4000    # 2500.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0xb

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x455ac000    # 3500.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0xc

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x459c4000    # 5000.0f

    invoke-direct {v11, v14, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0xd

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x45dac000    # 7000.0f

    invoke-direct {v11, v14, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0xe

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x461c4000    # 10000.0f

    invoke-direct {v11, v14, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v11, v5, v1

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x465ac000    # 14000.0f

    invoke-direct {v11, v14, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0x10

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    invoke-direct {v11, v8, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0x11

    aput-object v11, v5, v14

    invoke-virtual {v2, v3}, Lcom/daaw/lv;->c(F)V

    iget-object v5, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    aput-object v2, v5, v4

    new-instance v2, Lcom/daaw/lv;

    const-string v5, "Dance"

    const/16 v11, 0x12

    invoke-direct {v2, v5, v11}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x425c0000    # 55.0f

    const/high16 v15, 0x41300000    # 11.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v11, v5, v6

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x429a0000    # 77.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v11, v5, v9

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x42dc0000    # 110.0f

    const/high16 v15, 0x41000000    # 8.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v11, v5, v4

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x431c0000    # 156.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v11, v5, v10

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x435c0000    # 220.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v14, 0x4

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x439b8000    # 311.0f

    invoke-direct {v11, v14, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v14, 0x5

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x43dc0000    # 440.0f

    invoke-direct {v11, v14, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v14, 0x6

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x441b8000    # 622.0f

    invoke-direct {v11, v14, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v14, 0x7

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x445c0000    # 880.0f

    invoke-direct {v11, v14, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0x8

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x44960000    # 1200.0f

    invoke-direct {v11, v14, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0x9

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x44e10000    # 1800.0f

    invoke-direct {v11, v14, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0xa

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x451c4000    # 2500.0f

    const/high16 v15, -0x3f600000    # -5.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0xb

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x455ac000    # 3500.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0xc

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x459c4000    # 5000.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0xd

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x45dac000    # 7000.0f

    const/high16 v15, -0x3f000000    # -8.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0xe

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x461c4000    # 10000.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v11, v5, v1

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const v14, 0x465ac000    # 14000.0f

    invoke-direct {v11, v14, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0x10

    aput-object v11, v5, v14

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    invoke-direct {v11, v8, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v14, 0x11

    aput-object v11, v5, v14

    const/high16 v5, 0x41500000    # 13.0f

    invoke-virtual {v2, v5}, Lcom/daaw/lv;->c(F)V

    iget-object v5, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    aput-object v2, v5, v10

    new-instance v2, Lcom/daaw/lv;

    const-string v5, "Disco"

    const/16 v11, 0x12

    invoke-direct {v2, v5, v11}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x425c0000    # 55.0f

    const/high16 v15, 0x40400000    # 3.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v11, v5, v6

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x429a0000    # 77.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v11, v5, v9

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x42dc0000    # 110.0f

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v11, v5, v4

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x431c0000    # 156.0f

    invoke-direct {v11, v14, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v11, v5, v10

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v11, Lcom/daaw/lv$a;

    const/high16 v14, 0x435c0000    # 220.0f

    const/high16 v7, 0x40400000    # 3.0f

    invoke-direct {v11, v14, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v7, 0x4

    aput-object v11, v5, v7

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x439b8000    # 311.0f

    invoke-direct {v7, v11, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x5

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x43dc0000    # 440.0f

    invoke-direct {v7, v11, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x6

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x441b8000    # 622.0f

    invoke-direct {v7, v11, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x7

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x445c0000    # 880.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x8

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44960000    # 1200.0f

    const/high16 v14, 0x40c00000    # 6.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x9

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44e10000    # 1800.0f

    invoke-direct {v7, v11, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xa

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x451c4000    # 2500.0f

    const/high16 v14, 0x40800000    # 4.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xb

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x455ac000    # 3500.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xc

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x459c4000    # 5000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xd

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x45dac000    # 7000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xe

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x461c4000    # 10000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v1

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x465ac000    # 14000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x10

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-direct {v7, v8, v11}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x11

    aput-object v7, v5, v11

    invoke-virtual {v2, v3}, Lcom/daaw/lv;->c(F)V

    iget-object v5, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    const/4 v7, 0x4

    aput-object v2, v5, v7

    new-instance v2, Lcom/daaw/lv;

    const-string v5, "Drum & Bass"

    const/16 v7, 0x12

    invoke-direct {v2, v5, v7}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x425c0000    # 55.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v6

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x429a0000    # 77.0f

    const/high16 v15, 0x40800000    # 4.0f

    invoke-direct {v7, v11, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v9

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x42dc0000    # 110.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v4

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x431c0000    # 156.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v10

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x435c0000    # 220.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x4

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x439b8000    # 311.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x5

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x43dc0000    # 440.0f

    const/4 v14, 0x0

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x6

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x441b8000    # 622.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x7

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x445c0000    # 880.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x8

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44960000    # 1200.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x9

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44e10000    # 1800.0f

    invoke-direct {v7, v11, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xa

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x451c4000    # 2500.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xb

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x455ac000    # 3500.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xc

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x459c4000    # 5000.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xd

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x45dac000    # 7000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xe

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x461c4000    # 10000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v1

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x465ac000    # 14000.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x10

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    invoke-direct {v7, v8, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x11

    aput-object v7, v5, v11

    invoke-virtual {v2, v3}, Lcom/daaw/lv;->c(F)V

    iget-object v5, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    const/4 v7, 0x5

    aput-object v2, v5, v7

    new-instance v2, Lcom/daaw/lv;

    const-string v5, "Heavy Metal"

    const/16 v7, 0x12

    invoke-direct {v2, v5, v7}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x425c0000    # 55.0f

    const/high16 v14, 0x40800000    # 4.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v6

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x429a0000    # 77.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v9

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x42dc0000    # 110.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v4

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x431c0000    # 156.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v10

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x435c0000    # 220.0f

    const/high16 v14, 0x40c00000    # 6.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x4

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x439b8000    # 311.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x5

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x43dc0000    # 440.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x6

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x441b8000    # 622.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x7

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x445c0000    # 880.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x8

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44960000    # 1200.0f

    invoke-direct {v7, v11, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x9

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44e10000    # 1800.0f

    const/high16 v14, 0x40800000    # 4.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xa

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x451c4000    # 2500.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xb

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x455ac000    # 3500.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xc

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x459c4000    # 5000.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xd

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x45dac000    # 7000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xe

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x461c4000    # 10000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v1

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x465ac000    # 14000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x10

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-direct {v7, v8, v11}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x11

    aput-object v7, v5, v11

    invoke-virtual {v2, v3}, Lcom/daaw/lv;->c(F)V

    iget-object v5, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    const/4 v7, 0x6

    aput-object v2, v5, v7

    new-instance v2, Lcom/daaw/lv;

    const-string v5, "Jazz"

    const/16 v7, 0x12

    invoke-direct {v2, v5, v7}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x425c0000    # 55.0f

    const/4 v14, 0x0

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v6

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x429a0000    # 77.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v9

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x42dc0000    # 110.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v4

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x431c0000    # 156.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v10

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x435c0000    # 220.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x4

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x439b8000    # 311.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x5

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x43dc0000    # 440.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x6

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x441b8000    # 622.0f

    const/4 v14, 0x0

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x7

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x445c0000    # 880.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x8

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44960000    # 1200.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x9

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44e10000    # 1800.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xa

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x451c4000    # 2500.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xb

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x455ac000    # 3500.0f

    const/high16 v14, 0x40800000    # 4.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xc

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x459c4000    # 5000.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xd

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x45dac000    # 7000.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xe

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x461c4000    # 10000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v1

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x465ac000    # 14000.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x10

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/4 v11, 0x0

    invoke-direct {v7, v8, v11}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x11

    aput-object v7, v5, v11

    invoke-virtual {v2, v3}, Lcom/daaw/lv;->c(F)V

    iget-object v5, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    const/4 v7, 0x7

    aput-object v2, v5, v7

    new-instance v2, Lcom/daaw/lv;

    const-string v5, "Latin"

    const/16 v7, 0x12

    invoke-direct {v2, v5, v7}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x425c0000    # 55.0f

    const/4 v14, 0x0

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v6

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x429a0000    # 77.0f

    const/high16 v14, -0x40000000    # -2.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v9

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x42dc0000    # 110.0f

    const/high16 v14, -0x40800000    # -1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v4

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x431c0000    # 156.0f

    const/4 v14, 0x0

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v10

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x435c0000    # 220.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x4

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x439b8000    # 311.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x5

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x43dc0000    # 440.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x6

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x441b8000    # 622.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x7

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x445c0000    # 880.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x8

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44960000    # 1200.0f

    const/high16 v14, 0x40800000    # 4.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x9

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44e10000    # 1800.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xa

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x451c4000    # 2500.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xb

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x455ac000    # 3500.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xc

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x459c4000    # 5000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xd

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x45dac000    # 7000.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xe

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x461c4000    # 10000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v1

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x465ac000    # 14000.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x10

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    invoke-direct {v7, v8, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x11

    aput-object v7, v5, v11

    invoke-virtual {v2, v3}, Lcom/daaw/lv;->c(F)V

    iget-object v5, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    const/16 v7, 0x8

    aput-object v2, v5, v7

    new-instance v2, Lcom/daaw/lv;

    const-string v5, "New Age"

    const/16 v7, 0x12

    invoke-direct {v2, v5, v7}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x425c0000    # 55.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v6

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x429a0000    # 77.0f

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v15}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v9

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x42dc0000    # 110.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v4

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x431c0000    # 156.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v10

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x435c0000    # 220.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x4

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x439b8000    # 311.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x5

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x43dc0000    # 440.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x6

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x441b8000    # 622.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x7

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x445c0000    # 880.0f

    const/4 v14, 0x0

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x8

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44960000    # 1200.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x9

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44e10000    # 1800.0f

    const/high16 v14, 0x40800000    # 4.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xa

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x451c4000    # 2500.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xb

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x455ac000    # 3500.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xc

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x459c4000    # 5000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xd

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x45dac000    # 7000.0f

    const/high16 v14, 0x40800000    # 4.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xe

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x461c4000    # 10000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v1

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x465ac000    # 14000.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x10

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    invoke-direct {v7, v8, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x11

    aput-object v7, v5, v11

    invoke-virtual {v2, v3}, Lcom/daaw/lv;->c(F)V

    iget-object v5, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    const/16 v7, 0x9

    aput-object v2, v5, v7

    new-instance v2, Lcom/daaw/lv;

    const-string v5, "Party"

    const/16 v7, 0x12

    invoke-direct {v2, v5, v7}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x425c0000    # 55.0f

    const/high16 v14, 0x40e00000    # 7.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v6

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x429a0000    # 77.0f

    const/high16 v14, 0x40c00000    # 6.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v9

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x42dc0000    # 110.0f

    invoke-direct {v7, v11, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v4

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x431c0000    # 156.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v10

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x435c0000    # 220.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x4

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x439b8000    # 311.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x5

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x43dc0000    # 440.0f

    const/4 v14, 0x0

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x6

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x441b8000    # 622.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x7

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x445c0000    # 880.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x8

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44960000    # 1200.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x9

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44e10000    # 1800.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xa

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x451c4000    # 2500.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xb

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x455ac000    # 3500.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xc

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x459c4000    # 5000.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xd

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x45dac000    # 7000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xe

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x461c4000    # 10000.0f

    const/high16 v14, 0x40800000    # 4.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v1

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x465ac000    # 14000.0f

    invoke-direct {v7, v11, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x10

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    invoke-direct {v7, v8, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x11

    aput-object v7, v5, v11

    invoke-virtual {v2, v3}, Lcom/daaw/lv;->c(F)V

    iget-object v5, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    const/16 v7, 0xa

    aput-object v2, v5, v7

    new-instance v2, Lcom/daaw/lv;

    const-string v5, "Pop"

    const/16 v7, 0x12

    invoke-direct {v2, v5, v7}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x425c0000    # 55.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v6

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x429a0000    # 77.0f

    const/high16 v14, -0x40800000    # -1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v9

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x42dc0000    # 110.0f

    const/high16 v14, -0x3fc00000    # -3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v4

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x431c0000    # 156.0f

    const/4 v14, 0x0

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v10

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x435c0000    # 220.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x4

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x439b8000    # 311.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x5

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x43dc0000    # 440.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x6

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x441b8000    # 622.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x7

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x445c0000    # 880.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x8

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44960000    # 1200.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x9

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44e10000    # 1800.0f

    const/4 v14, 0x0

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xa

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x451c4000    # 2500.0f

    const/high16 v14, -0x40800000    # -1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xb

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x455ac000    # 3500.0f

    const/high16 v14, -0x40000000    # -2.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xc

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x459c4000    # 5000.0f

    const/4 v14, 0x0

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xd

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x45dac000    # 7000.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xe

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x461c4000    # 10000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v1

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x465ac000    # 14000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x10

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    invoke-direct {v7, v8, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x11

    aput-object v7, v5, v11

    invoke-virtual {v2, v3}, Lcom/daaw/lv;->c(F)V

    iget-object v5, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    const/16 v7, 0xb

    aput-object v2, v5, v7

    new-instance v2, Lcom/daaw/lv;

    const-string v5, "Rock"

    const/16 v7, 0x12

    invoke-direct {v2, v5, v7}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x425c0000    # 55.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v6

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x429a0000    # 77.0f

    const/high16 v14, -0x3fc00000    # -3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v9

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x42dc0000    # 110.0f

    const/high16 v14, -0x40000000    # -2.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v4

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x431c0000    # 156.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v10

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x435c0000    # 220.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x4

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x439b8000    # 311.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x5

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x43dc0000    # 440.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x6

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x441b8000    # 622.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x7

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x445c0000    # 880.0f

    const/high16 v14, -0x40800000    # -1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x8

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44960000    # 1200.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x9

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44e10000    # 1800.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xa

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x451c4000    # 2500.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xb

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x455ac000    # 3500.0f

    const/4 v14, 0x0

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xc

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x459c4000    # 5000.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xd

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x45dac000    # 7000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xe

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x461c4000    # 10000.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v1

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x465ac000    # 14000.0f

    const/high16 v14, 0x40800000    # 4.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x10

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    invoke-direct {v7, v8, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x11

    aput-object v7, v5, v11

    invoke-virtual {v2, v3}, Lcom/daaw/lv;->c(F)V

    iget-object v5, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    const/16 v7, 0xc

    aput-object v2, v5, v7

    new-instance v2, Lcom/daaw/lv;

    const-string v5, "Techno"

    const/16 v7, 0x12

    invoke-direct {v2, v5, v7}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x425c0000    # 55.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v6

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x429a0000    # 77.0f

    invoke-direct {v7, v11, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v9

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x42dc0000    # 110.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v4

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x431c0000    # 156.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v10

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x435c0000    # 220.0f

    const/high16 v14, -0x40800000    # -1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x4

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x439b8000    # 311.0f

    const/4 v14, 0x0

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x5

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x43dc0000    # 440.0f

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x6

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x441b8000    # 622.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v11, 0x7

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x445c0000    # 880.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x8

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44960000    # 1200.0f

    invoke-direct {v7, v11, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x9

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x44e10000    # 1800.0f

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v14}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xa

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x451c4000    # 2500.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xb

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x455ac000    # 3500.0f

    invoke-direct {v7, v11, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xc

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x459c4000    # 5000.0f

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-direct {v7, v11, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xd

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x45dac000    # 7000.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0xe

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x461c4000    # 10000.0f

    const/high16 v13, 0x40400000    # 3.0f

    invoke-direct {v7, v11, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v1

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const v11, 0x465ac000    # 14000.0f

    const/high16 v13, 0x40800000    # 4.0f

    invoke-direct {v7, v11, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x10

    aput-object v7, v5, v11

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    invoke-direct {v7, v8, v13}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v11, 0x11

    aput-object v7, v5, v11

    invoke-virtual {v2, v3}, Lcom/daaw/lv;->c(F)V

    iget-object v5, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    const/16 v7, 0xd

    aput-object v2, v5, v7

    new-instance v2, Lcom/daaw/lv;

    const-string v5, "Vocal"

    const/16 v7, 0x12

    invoke-direct {v2, v5, v7}, Lcom/daaw/lv;-><init>(Ljava/lang/String;I)V

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v7, Lcom/daaw/lv$a;

    const/high16 v11, 0x425c0000    # 55.0f

    invoke-direct {v7, v11, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v7, v5, v6

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v6, Lcom/daaw/lv$a;

    const/high16 v7, 0x429a0000    # 77.0f

    const/high16 v11, -0x40800000    # -1.0f

    invoke-direct {v6, v7, v11}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v6, v5, v9

    iget-object v5, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v6, Lcom/daaw/lv$a;

    const/high16 v7, 0x42dc0000    # 110.0f

    const/high16 v9, -0x40800000    # -1.0f

    invoke-direct {v6, v7, v9}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v6, v5, v4

    iget-object v4, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v6, 0x431c0000    # 156.0f

    const/high16 v7, -0x40800000    # -1.0f

    invoke-direct {v5, v6, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v5, v4, v10

    iget-object v4, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v6, 0x435c0000    # 220.0f

    invoke-direct {v5, v6, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v6, 0x4

    aput-object v5, v4, v6

    iget-object v4, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v6, 0x439b8000    # 311.0f

    invoke-direct {v5, v6, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v6, 0x5

    aput-object v5, v4, v6

    iget-object v4, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v6, 0x43dc0000    # 440.0f

    const/high16 v7, 0x40800000    # 4.0f

    invoke-direct {v5, v6, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v6, 0x6

    aput-object v5, v4, v6

    iget-object v4, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v6, 0x441b8000    # 622.0f

    const/high16 v9, 0x40400000    # 3.0f

    invoke-direct {v5, v6, v9}, Lcom/daaw/lv$a;-><init>(FF)V

    const/4 v6, 0x7

    aput-object v5, v4, v6

    iget-object v4, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v6, 0x445c0000    # 880.0f

    invoke-direct {v5, v6, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v6, 0x8

    aput-object v5, v4, v6

    iget-object v4, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v6, 0x44960000    # 1200.0f

    invoke-direct {v5, v6, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v6, 0x9

    aput-object v5, v4, v6

    iget-object v4, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const/high16 v6, 0x44e10000    # 1800.0f

    const/high16 v7, 0x40400000    # 3.0f

    invoke-direct {v5, v6, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v6, 0xa

    aput-object v5, v4, v6

    iget-object v4, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v6, 0x451c4000    # 2500.0f

    invoke-direct {v5, v6, v12}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v6, 0xb

    aput-object v5, v4, v6

    iget-object v4, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v6, 0x455ac000    # 3500.0f

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v6, 0xc

    aput-object v5, v4, v6

    iget-object v4, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v6, 0x459c4000    # 5000.0f

    invoke-direct {v5, v6, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v6, 0xd

    aput-object v5, v4, v6

    iget-object v4, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v6, 0x45dac000    # 7000.0f

    invoke-direct {v5, v6, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v6, 0xe

    aput-object v5, v4, v6

    iget-object v4, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v5, Lcom/daaw/lv$a;

    const v6, 0x461c4000    # 10000.0f

    invoke-direct {v5, v6, v7}, Lcom/daaw/lv$a;-><init>(FF)V

    aput-object v5, v4, v1

    iget-object v1, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v4, Lcom/daaw/lv$a;

    const v5, 0x465ac000    # 14000.0f

    const/high16 v6, -0x40800000    # -1.0f

    invoke-direct {v4, v5, v6}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v5, 0x10

    aput-object v4, v1, v5

    iget-object v1, v2, Lcom/daaw/lv;->b:[Lcom/daaw/lv$a;

    new-instance v4, Lcom/daaw/lv$a;

    const/high16 v5, -0x40800000    # -1.0f

    invoke-direct {v4, v8, v5}, Lcom/daaw/lv$a;-><init>(FF)V

    const/16 v5, 0x11

    aput-object v4, v1, v5

    invoke-virtual {v2, v3}, Lcom/daaw/lv;->c(F)V

    iget-object v1, v0, Lcom/daaw/j7;->c:[Lcom/daaw/lv;

    const/16 v3, 0xe

    aput-object v2, v1, v3

    return-void
.end method
