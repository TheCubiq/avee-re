.class public final Lcom/daaw/n7$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/n7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lcom/daaw/n7;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/daaw/n7;)V
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
    iput-object p1, p0, Lcom/daaw/n7$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lcom/daaw/n7$a;->b:Lcom/daaw/n7;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/n7$a;)Lcom/daaw/n7;
    .locals 0

    iget-object p0, p0, Lcom/daaw/n7$a;->b:Lcom/daaw/n7;

    return-object p0
.end method


# virtual methods
.method public b(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n7$a;->b:Lcom/daaw/n7;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n7$a;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/n7$a$f;

    invoke-direct {v1, p0, p1}, Lcom/daaw/n7$a$f;-><init>(Lcom/daaw/n7$a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public c(IJJ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/n7$a;->b:Lcom/daaw/n7;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n7$a;->a:Landroid/os/Handler;

    new-instance v8, Lcom/daaw/n7$a$d;

    move-object v1, v8

    move-object v2, p0

    move v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/daaw/n7$a$d;-><init>(Lcom/daaw/n7$a;IJJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;JJ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/n7$a;->b:Lcom/daaw/n7;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n7$a;->a:Landroid/os/Handler;

    new-instance v8, Lcom/daaw/n7$a$b;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/daaw/n7$a$b;-><init>(Lcom/daaw/n7$a;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public e(Lcom/daaw/fq;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n7$a;->b:Lcom/daaw/n7;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n7$a;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/n7$a$e;

    invoke-direct {v1, p0, p1}, Lcom/daaw/n7$a$e;-><init>(Lcom/daaw/n7$a;Lcom/daaw/fq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public f(Lcom/daaw/fq;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n7$a;->b:Lcom/daaw/n7;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n7$a;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/n7$a$a;

    invoke-direct {v1, p0, p1}, Lcom/daaw/n7$a$a;-><init>(Lcom/daaw/n7$a;Lcom/daaw/fq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public g(Lcom/google/android/exoplayer2/Format;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n7$a;->b:Lcom/daaw/n7;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n7$a;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/n7$a$c;

    invoke-direct {v1, p0, p1}, Lcom/daaw/n7$a$c;-><init>(Lcom/daaw/n7$a;Lcom/google/android/exoplayer2/Format;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
