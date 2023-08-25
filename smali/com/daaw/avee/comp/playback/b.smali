.class public abstract Lcom/daaw/avee/comp/playback/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/playback/b$b;,
        Lcom/daaw/avee/comp/playback/b$c;,
        Lcom/daaw/avee/comp/playback/b$d;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Lcom/daaw/avee/comp/playback/b$b;

.field public c:Lcom/daaw/avee/comp/playback/b$d;

.field public d:Ljava/lang/String;

.field public e:Z

.field public f:Landroid/media/audiofx/Equalizer;

.field public g:I

.field public h:Z

.field public i:Landroid/media/audiofx/Virtualizer;

.field public j:I


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/b$d;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/avee/comp/playback/b;->a:I

    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/b;->e:Z

    iput v0, p0, Lcom/daaw/avee/comp/playback/b;->g:I

    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/b;->h:Z

    iput v0, p0, Lcom/daaw/avee/comp/playback/b;->j:I

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/b;->c:Lcom/daaw/avee/comp/playback/b$d;

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/b;->d:Ljava/lang/String;

    new-instance p1, Lcom/daaw/avee/comp/playback/b$b;

    invoke-direct {p1, p2}, Lcom/daaw/avee/comp/playback/b$b;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/b;->i:Landroid/media/audiofx/Virtualizer;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/avee/comp/playback/b;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/avee/comp/playback/b;->h:Z

    return p1
.end method


# virtual methods
.method public final b(Lcom/daaw/avee/comp/playback/b$c;Lcom/daaw/avee/comp/playback/b$b;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_6

    invoke-virtual {v0}, Landroid/media/audiofx/Equalizer;->getEnabled()Z

    move-result v0

    iget-boolean v1, p1, Lcom/daaw/avee/comp/playback/b$c;->a:Z

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v0, v1}, Landroid/media/audiofx/Equalizer;->setEnabled(Z)I

    :cond_1
    iget-boolean v0, p1, Lcom/daaw/avee/comp/playback/b$c;->a:Z

    if-nez v0, :cond_2

    return-void

    :cond_2
    :try_start_0
    iget-boolean v0, p1, Lcom/daaw/avee/comp/playback/b$c;->b:Z

    if-eqz v0, :cond_4

    iget p1, p1, Lcom/daaw/avee/comp/playback/b$c;->c:I

    int-to-short p1, p1

    iget-object p2, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    invoke-virtual {p2}, Landroid/media/audiofx/Equalizer;->getNumberOfPresets()S

    move-result p2

    if-ge p1, p2, :cond_3

    if-ltz p1, :cond_3

    iget-object p2, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    invoke-virtual {p2, p1}, Landroid/media/audiofx/Equalizer;->usePreset(S)V

    goto :goto_2

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "invalid preset: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget v0, p2, Lcom/daaw/avee/comp/playback/b$b;->d:I

    iget v1, p2, Lcom/daaw/avee/comp/playback/b$b;->c:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p1, Lcom/daaw/avee/comp/playback/b$c;->d:[F

    array-length v1, v1

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v2}, Landroid/media/audiofx/Equalizer;->getNumberOfBands()S

    move-result v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x0

    :goto_1
    iget-object v2, p2, Lcom/daaw/avee/comp/playback/b$b;->f:[F

    array-length v2, v2

    if-ge v1, v2, :cond_6

    iget-object v2, p1, Lcom/daaw/avee/comp/playback/b$c;->d:[F

    aget v2, v2, v1

    int-to-float v3, v0

    mul-float v2, v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    add-int/2addr v2, v0

    iget v3, p2, Lcom/daaw/avee/comp/playback/b$b;->c:I

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    int-to-short v4, v1

    int-to-short v2, v2

    invoke-virtual {v3, v4, v2}, Landroid/media/audiofx/Equalizer;->setBandLevel(SS)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "invalid band count "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/b$c;->d:[F

    array-length p1, p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Equalizer exception"

    invoke-static {p2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_6
    :goto_2
    return-void
.end method

.method public final c(Lcom/daaw/avee/comp/playback/b$c;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/b;->i:Landroid/media/audiofx/Virtualizer;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, p1, Lcom/daaw/avee/comp/playback/b$c;->a:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget v1, p1, Lcom/daaw/avee/comp/playback/b$c;->e:F

    cmpl-float v1, v1, v2

    if-lez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/media/audiofx/Virtualizer;->setEnabled(Z)I

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/b;->i:Landroid/media/audiofx/Virtualizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Virtualizer;->getStrengthSupported()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/b;->i:Landroid/media/audiofx/Virtualizer;

    iget p1, p1, Lcom/daaw/avee/comp/playback/b$c;->e:F

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float p1, p1, v1

    invoke-static {p1, v2, v1}, Lcom/daaw/br1;->j(FFF)F

    move-result p1

    float-to-int p1, p1

    int-to-short p1, p1

    invoke-virtual {v0, p1}, Landroid/media/audiofx/Virtualizer;->setStrength(S)V

    :cond_2
    return-void
.end method

.method public d()Lcom/daaw/avee/comp/playback/b$b;
    .locals 2

    iget v0, p0, Lcom/daaw/avee/comp/playback/b;->a:I

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/playback/b;->f(ZI)Z

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/b;->c:Lcom/daaw/avee/comp/playback/b$d;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/playback/b$d;->c(Lcom/daaw/avee/comp/playback/b$b;)V

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final f(ZI)Z
    .locals 6

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/b;->h:Z

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/daaw/avee/comp/playback/b;->g:I

    if-eq p1, p2, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/b;->k()V

    iput p2, p0, Lcom/daaw/avee/comp/playback/b;->g:I

    :try_start_0
    new-instance p1, Landroid/media/audiofx/Equalizer;

    invoke-direct {p1, v0, p2}, Landroid/media/audiofx/Equalizer;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    new-instance p2, Lcom/daaw/avee/comp/playback/b$a;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/playback/b$a;-><init>(Lcom/daaw/avee/comp/playback/b;)V

    invoke-virtual {p1, p2}, Landroid/media/audiofx/Equalizer;->setControlStatusListener(Landroid/media/audiofx/AudioEffect$OnControlStatusChangeListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/b;->k()V

    :cond_2
    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    if-nez p2, :cond_4

    iget-object p2, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    if-nez p2, :cond_3

    new-instance p1, Lcom/daaw/avee/comp/playback/b$b;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/b;->e()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/daaw/avee/comp/playback/b$b;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    goto :goto_1

    :cond_3
    move v1, p1

    :goto_1
    return v1

    :cond_4
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    if-nez p2, :cond_5

    new-instance p1, Lcom/daaw/avee/comp/playback/b$b;

    invoke-direct {p1}, Lcom/daaw/avee/comp/playback/b$b;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    const/4 p1, 0x1

    :cond_5
    :try_start_1
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/b;->e()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p2, Lcom/daaw/avee/comp/playback/b$b;->a:Ljava/lang/String;

    iget-object p2, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v2}, Landroid/media/audiofx/Equalizer;->getNumberOfBands()S

    move-result v2

    iput v2, p2, Lcom/daaw/avee/comp/playback/b$b;->b:I

    iget-object p2, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v2}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    move-result-object v2

    aget-short v2, v2, v0

    iput v2, p2, Lcom/daaw/avee/comp/playback/b$b;->c:I

    iget-object p2, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v2}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    move-result-object v2

    aget-short v1, v2, v1

    iput v1, p2, Lcom/daaw/avee/comp/playback/b$b;->d:I

    iget-object p2, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    iget v1, p2, Lcom/daaw/avee/comp/playback/b$b;->b:I

    new-array v2, v1, [F

    iput-object v2, p2, Lcom/daaw/avee/comp/playback/b$b;->f:[F

    new-array v1, v1, [I

    iput-object v1, p2, Lcom/daaw/avee/comp/playback/b$b;->e:[I

    iget v1, p2, Lcom/daaw/avee/comp/playback/b$b;->d:I

    iget p2, p2, Lcom/daaw/avee/comp/playback/b$b;->c:I

    sub-int/2addr v1, p2

    div-int/lit8 v1, v1, 0x2

    int-to-float p2, v1

    :goto_2
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    iget-object v1, v1, Lcom/daaw/avee/comp/playback/b$b;->f:[F

    array-length v2, v1

    if-ge v0, v2, :cond_6

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    int-to-short v3, v0

    invoke-virtual {v2, v3}, Landroid/media/audiofx/Equalizer;->getBandLevel(S)S

    move-result v2

    iget-object v4, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    iget v5, v4, Lcom/daaw/avee/comp/playback/b$b;->c:I

    sub-int/2addr v2, v5

    int-to-float v2, v2

    sub-float/2addr v2, p2

    div-float/2addr v2, p2

    aput v2, v1, v0

    iget-object v1, v4, Lcom/daaw/avee/comp/playback/b$b;->e:[I

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v2, v3}, Landroid/media/audiofx/Equalizer;->getCenterFreq(S)I

    move-result v2

    aput v2, v1, v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :catch_1
    move-exception p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Equalizer parameter exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/b;->k()V

    :cond_6
    return p1
.end method

.method public final g(ZI)V
    .locals 1

    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/avee/comp/playback/b;->i:Landroid/media/audiofx/Virtualizer;

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/daaw/avee/comp/playback/b;->j:I

    if-eq p1, p2, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/b;->l()V

    iput p2, p0, Lcom/daaw/avee/comp/playback/b;->j:I

    :try_start_0
    new-instance p1, Landroid/media/audiofx/Virtualizer;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p2}, Landroid/media/audiofx/Virtualizer;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/b;->i:Landroid/media/audiofx/Virtualizer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/b;->l()V

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method

.method public h(I)V
    .locals 4

    iput p1, p0, Lcom/daaw/avee/comp/playback/b;->a:I

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/b;->c:Lcom/daaw/avee/comp/playback/b$d;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/playback/b$d;->w(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/b;->c:Lcom/daaw/avee/comp/playback/b$d;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/daaw/avee/comp/playback/b$d;->d(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/b$c;

    move-result-object v0

    iget-boolean v2, v0, Lcom/daaw/avee/comp/playback/b$c;->a:Z

    iput-boolean v2, p0, Lcom/daaw/avee/comp/playback/b;->e:Z

    invoke-virtual {p0, v2, p1}, Lcom/daaw/avee/comp/playback/b;->f(ZI)Z

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    invoke-virtual {p0, v0, v2}, Lcom/daaw/avee/comp/playback/b;->b(Lcom/daaw/avee/comp/playback/b$c;Lcom/daaw/avee/comp/playback/b$b;)V

    iget-boolean v2, v0, Lcom/daaw/avee/comp/playback/b$c;->a:Z

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/daaw/avee/comp/playback/b$c;->e:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-virtual {p0, v1, p1}, Lcom/daaw/avee/comp/playback/b;->g(ZI)V

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/b;->c(Lcom/daaw/avee/comp/playback/b$c;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1, p1}, Lcom/daaw/avee/comp/playback/b;->f(ZI)Z

    invoke-virtual {p0, v1, p1}, Lcom/daaw/avee/comp/playback/b;->g(ZI)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/b;->c:Lcom/daaw/avee/comp/playback/b$d;

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    invoke-interface {p1, v0}, Lcom/daaw/avee/comp/playback/b$d;->c(Lcom/daaw/avee/comp/playback/b$b;)V

    return-void
.end method

.method public i()V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/b;->e:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/b;->k()V

    :cond_0
    return-void
.end method

.method public j()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/b;->k()V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/b;->l()V

    return-void
.end method

.method public final k()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/media/audiofx/Equalizer;->setControlStatusListener(Landroid/media/audiofx/AudioEffect$OnControlStatusChangeListener;)V

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v1}, Landroid/media/audiofx/Equalizer;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/b;->h:Z

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/b;->f:Landroid/media/audiofx/Equalizer;

    iput v1, p0, Lcom/daaw/avee/comp/playback/b;->g:I

    return-void
.end method

.method public final l()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/b;->i:Landroid/media/audiofx/Virtualizer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/audiofx/Virtualizer;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/b;->i:Landroid/media/audiofx/Virtualizer;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/avee/comp/playback/b;->j:I

    return-void
.end method

.method public m(Lcom/daaw/avee/comp/playback/b$c;)V
    .locals 2

    iget-boolean v0, p1, Lcom/daaw/avee/comp/playback/b$c;->a:Z

    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/b;->e:Z

    iget v1, p0, Lcom/daaw/avee/comp/playback/b;->a:I

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/playback/b;->f(ZI)Z

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/b;->b:Lcom/daaw/avee/comp/playback/b$b;

    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/playback/b;->b(Lcom/daaw/avee/comp/playback/b$c;Lcom/daaw/avee/comp/playback/b$b;)V

    iget-boolean v0, p1, Lcom/daaw/avee/comp/playback/b$c;->a:Z

    if-eqz v0, :cond_0

    iget v0, p1, Lcom/daaw/avee/comp/playback/b$c;->e:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/daaw/avee/comp/playback/b;->a:I

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/playback/b;->g(ZI)V

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/b;->c(Lcom/daaw/avee/comp/playback/b$c;)V

    return-void
.end method
