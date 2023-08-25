.class public final Lcom/daaw/kj7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/media/AudioManager;

.field public final b:Lcom/daaw/eh7;

.field public c:Lcom/daaw/hi7;

.field public d:I

.field public e:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/daaw/hi7;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/kj7;->e:F

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/kj7;->a:Landroid/media/AudioManager;

    iput-object p3, p0, Lcom/daaw/kj7;->c:Lcom/daaw/hi7;

    new-instance p1, Lcom/daaw/eh7;

    invoke-direct {p1, p0, p2}, Lcom/daaw/eh7;-><init>(Lcom/daaw/kj7;Landroid/os/Handler;)V

    iput-object p1, p0, Lcom/daaw/kj7;->b:Lcom/daaw/eh7;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/kj7;->d:I

    return-void
.end method

.method public static bridge synthetic c(Lcom/daaw/kj7;I)V
    .locals 2

    const/4 v0, -0x3

    const/4 v1, -0x2

    if-eq p1, v0, :cond_2

    if-eq p1, v1, :cond_2

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown focus change type: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "AudioFocusManager"

    invoke-static {p1, p0}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/kj7;->g(I)V

    invoke-virtual {p0, v0}, Lcom/daaw/kj7;->f(I)V

    return-void

    :cond_1
    invoke-virtual {p0, v0}, Lcom/daaw/kj7;->f(I)V

    invoke-virtual {p0}, Lcom/daaw/kj7;->e()V

    return-void

    :cond_2
    if-eq p1, v1, :cond_3

    const/4 p1, 0x3

    invoke-virtual {p0, p1}, Lcom/daaw/kj7;->g(I)V

    return-void

    :cond_3
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/kj7;->f(I)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Lcom/daaw/kj7;->g(I)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Lcom/daaw/kj7;->e:F

    return v0
.end method

.method public final b(ZI)I
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/kj7;->e()V

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/kj7;->c:Lcom/daaw/hi7;

    invoke-virtual {p0}, Lcom/daaw/kj7;->e()V

    return-void
.end method

.method public final e()V
    .locals 2

    iget v0, p0, Lcom/daaw/kj7;->d:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v0, Lcom/daaw/it5;->a:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/kj7;->a:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/daaw/kj7;->b:Lcom/daaw/eh7;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/kj7;->g(I)V

    return-void
.end method

.method public final f(I)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/kj7;->c:Lcom/daaw/hi7;

    if-eqz v0, :cond_0

    check-cast v0, Lcom/daaw/y48;

    iget-object v1, v0, Lcom/daaw/y48;->p:Lcom/daaw/j58;

    invoke-virtual {v1}, Lcom/daaw/j58;->zzq()Z

    move-result v1

    iget-object v0, v0, Lcom/daaw/y48;->p:Lcom/daaw/j58;

    invoke-static {v1, p1}, Lcom/daaw/j58;->Z(ZI)I

    move-result v2

    invoke-static {v0, v1, p1, v2}, Lcom/daaw/j58;->q(Lcom/daaw/j58;ZII)V

    :cond_0
    return-void
.end method

.method public final g(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/kj7;->d:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/daaw/kj7;->d:I

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    const p1, 0x3e4ccccd    # 0.2f

    goto :goto_0

    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    iget v0, p0, Lcom/daaw/kj7;->e:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_2

    return-void

    :cond_2
    iput p1, p0, Lcom/daaw/kj7;->e:F

    iget-object p1, p0, Lcom/daaw/kj7;->c:Lcom/daaw/hi7;

    if-eqz p1, :cond_3

    check-cast p1, Lcom/daaw/y48;

    iget-object p1, p1, Lcom/daaw/y48;->p:Lcom/daaw/j58;

    invoke-static {p1}, Lcom/daaw/j58;->n(Lcom/daaw/j58;)V

    :cond_3
    return-void
.end method
