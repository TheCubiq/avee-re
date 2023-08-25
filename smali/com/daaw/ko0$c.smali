.class public Lcom/daaw/ko0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ko0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ko0;


# direct methods
.method public constructor <init>(Lcom/daaw/ko0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ko0$c;->a:Lcom/daaw/ko0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 4

    if-nez p3, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/ko0$c;->a:Lcom/daaw/ko0;

    invoke-static {p1}, Lcom/daaw/ko0;->i(Lcom/daaw/ko0;)J

    move-result-wide v0

    int-to-long p2, p2

    mul-long v0, v0, p2

    const-wide/16 p2, 0x3e8

    div-long/2addr v0, p2

    invoke-static {p1, v0, v1}, Lcom/daaw/ko0;->h(Lcom/daaw/ko0;J)J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iget-object p3, p0, Lcom/daaw/ko0$c;->a:Lcom/daaw/ko0;

    invoke-static {p3}, Lcom/daaw/ko0;->e(Lcom/daaw/ko0;)J

    move-result-wide v0

    sub-long v0, p1, v0

    const-wide/16 v2, 0xfa

    cmp-long p3, v0, v2

    if-lez p3, :cond_1

    iget-object p3, p0, Lcom/daaw/ko0$c;->a:Lcom/daaw/ko0;

    invoke-static {p3, p1, p2}, Lcom/daaw/ko0;->f(Lcom/daaw/ko0;J)J

    sget-object p1, Lcom/daaw/ko0;->O:Lcom/daaw/qw1;

    iget-object p2, p0, Lcom/daaw/ko0$c;->a:Lcom/daaw/ko0;

    invoke-static {p2}, Lcom/daaw/ko0;->g(Lcom/daaw/ko0;)J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/ko0$c;->a:Lcom/daaw/ko0;

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1}, Lcom/daaw/ko0;->f(Lcom/daaw/ko0;J)J

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    sget-object p1, Lcom/daaw/ko0;->O:Lcom/daaw/qw1;

    iget-object v0, p0, Lcom/daaw/ko0$c;->a:Lcom/daaw/ko0;

    invoke-static {v0}, Lcom/daaw/ko0;->g(Lcom/daaw/ko0;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/ko0$c;->a:Lcom/daaw/ko0;

    const-wide/16 v0, -0x1

    invoke-static {p1, v0, v1}, Lcom/daaw/ko0;->h(Lcom/daaw/ko0;J)J

    return-void
.end method
