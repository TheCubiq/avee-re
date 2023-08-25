.class public final Lcom/daaw/f34;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final p:Landroid/media/AudioManager;

.field public final q:Lcom/daaw/e34;

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/e34;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/f34;->u:F

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    iput-object p1, p0, Lcom/daaw/f34;->p:Landroid/media/AudioManager;

    iput-object p2, p0, Lcom/daaw/f34;->q:Lcom/daaw/e34;

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/f34;->t:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/daaw/f34;->u:F

    :goto_0
    iget-boolean v2, p0, Lcom/daaw/f34;->r:Z

    if-eqz v2, :cond_1

    return v0

    :cond_1
    return v1
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/f34;->s:Z

    invoke-virtual {p0}, Lcom/daaw/f34;->f()V

    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/f34;->s:Z

    invoke-virtual {p0}, Lcom/daaw/f34;->f()V

    return-void
.end method

.method public final d(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/f34;->t:Z

    invoke-virtual {p0}, Lcom/daaw/f34;->f()V

    return-void
.end method

.method public final e(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/f34;->u:F

    invoke-virtual {p0}, Lcom/daaw/f34;->f()V

    return-void
.end method

.method public final f()V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/f34;->s:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/daaw/f34;->t:Z

    if-nez v0, :cond_2

    iget v0, p0, Lcom/daaw/f34;->u:F

    const/4 v3, 0x0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_2

    iget-boolean v0, p0, Lcom/daaw/f34;->r:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/f34;->p:Landroid/media/AudioManager;

    if-eqz v0, :cond_1

    const/4 v3, 0x3

    const/4 v4, 0x2

    invoke-virtual {v0, p0, v3, v4}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result v0

    if-ne v0, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    :goto_0
    iput-boolean v1, p0, Lcom/daaw/f34;->r:Z

    :cond_1
    iget-object v0, p0, Lcom/daaw/f34;->q:Lcom/daaw/e34;

    invoke-interface {v0}, Lcom/daaw/e34;->zzn()V

    return-void

    :cond_2
    iget-boolean v0, p0, Lcom/daaw/f34;->r:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/f34;->p:Landroid/media/AudioManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final onAudioFocusChange(I)V
    .locals 0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/f34;->r:Z

    iget-object p1, p0, Lcom/daaw/f34;->q:Lcom/daaw/e34;

    invoke-interface {p1}, Lcom/daaw/e34;->zzn()V

    return-void
.end method
