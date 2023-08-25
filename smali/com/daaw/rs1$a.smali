.class public final Lcom/daaw/rs1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/rs1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lcom/daaw/rs1;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/daaw/rs1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/daaw/rs1$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lcom/daaw/rs1$a;->b:Lcom/daaw/rs1;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/rs1$a;)Lcom/daaw/rs1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/rs1$a;->b:Lcom/daaw/rs1;

    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/String;JJ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/rs1$a;->b:Lcom/daaw/rs1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rs1$a;->a:Landroid/os/Handler;

    new-instance v8, Lcom/daaw/rs1$a$b;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/daaw/rs1$a$b;-><init>(Lcom/daaw/rs1$a;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public c(Lcom/daaw/fq;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rs1$a;->b:Lcom/daaw/rs1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rs1$a;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/rs1$a$g;

    invoke-direct {v1, p0, p1}, Lcom/daaw/rs1$a$g;-><init>(Lcom/daaw/rs1$a;Lcom/daaw/fq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public d(IJ)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rs1$a;->b:Lcom/daaw/rs1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rs1$a;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/rs1$a$d;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/daaw/rs1$a$d;-><init>(Lcom/daaw/rs1$a;IJ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public e(Lcom/daaw/fq;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rs1$a;->b:Lcom/daaw/rs1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rs1$a;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/rs1$a$a;

    invoke-direct {v1, p0, p1}, Lcom/daaw/rs1$a$a;-><init>(Lcom/daaw/rs1$a;Lcom/daaw/fq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public f(Lcom/google/android/exoplayer2/Format;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rs1$a;->b:Lcom/daaw/rs1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rs1$a;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/rs1$a$c;

    invoke-direct {v1, p0, p1}, Lcom/daaw/rs1$a$c;-><init>(Lcom/daaw/rs1$a;Lcom/google/android/exoplayer2/Format;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public g(Landroid/view/Surface;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rs1$a;->b:Lcom/daaw/rs1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rs1$a;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/rs1$a$f;

    invoke-direct {v1, p0, p1}, Lcom/daaw/rs1$a$f;-><init>(Lcom/daaw/rs1$a;Landroid/view/Surface;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public h(IIIF)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/rs1$a;->b:Lcom/daaw/rs1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rs1$a;->a:Landroid/os/Handler;

    new-instance v7, Lcom/daaw/rs1$a$e;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/daaw/rs1$a$e;-><init>(Lcom/daaw/rs1$a;IIIF)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
