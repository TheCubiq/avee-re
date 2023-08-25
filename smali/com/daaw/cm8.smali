.class public final Lcom/daaw/cm8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lj8;


# instance fields
.field public final synthetic a:Lcom/daaw/em8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/em8;Lcom/daaw/am8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cm8;->a:Lcom/daaw/em8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio sink error"

    invoke-static {v0, v1, p1}, Lcom/daaw/s95;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/daaw/cm8;->a:Lcom/daaw/em8;

    invoke-static {v0}, Lcom/daaw/em8;->x0(Lcom/daaw/em8;)Lcom/daaw/dj8;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/dj8;->b(Ljava/lang/Exception;)V

    return-void
.end method

.method public final zzb()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/cm8;->a:Lcom/daaw/em8;

    invoke-static {v0}, Lcom/daaw/em8;->w0(Lcom/daaw/em8;)Lcom/daaw/f98;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/daaw/em8;->w0(Lcom/daaw/em8;)Lcom/daaw/f98;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/f98;->zzb()V

    :cond_0
    return-void
.end method
