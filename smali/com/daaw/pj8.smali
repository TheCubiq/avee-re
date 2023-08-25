.class public final Lcom/daaw/pj8;
.super Ljava/lang/Exception;
.source ""


# instance fields
.field public final p:I

.field public final q:Z

.field public final r:Lcom/daaw/f92;


# direct methods
.method public constructor <init>(ILcom/daaw/f92;Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AudioTrack write failed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-boolean p3, p0, Lcom/daaw/pj8;->q:Z

    iput p1, p0, Lcom/daaw/pj8;->p:I

    iput-object p2, p0, Lcom/daaw/pj8;->r:Lcom/daaw/f92;

    return-void
.end method
