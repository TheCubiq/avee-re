.class public final Lcom/daaw/ml8;
.super Landroid/media/AudioTrack$StreamEventCallback;
.source ""


# instance fields
.field public final synthetic a:Lcom/daaw/sl8;

.field public final synthetic b:Lcom/daaw/ol8;


# direct methods
.method public constructor <init>(Lcom/daaw/ol8;Lcom/daaw/sl8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ml8;->b:Lcom/daaw/ol8;

    iput-object p2, p0, Lcom/daaw/ml8;->a:Lcom/daaw/sl8;

    invoke-direct {p0}, Landroid/media/AudioTrack$StreamEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDataRequest(Landroid/media/AudioTrack;I)V
    .locals 0

    iget-object p2, p0, Lcom/daaw/ml8;->b:Lcom/daaw/ol8;

    iget-object p2, p2, Lcom/daaw/ol8;->c:Lcom/daaw/sl8;

    invoke-static {p2}, Lcom/daaw/sl8;->o(Lcom/daaw/sl8;)Landroid/media/AudioTrack;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/ml8;->b:Lcom/daaw/ol8;

    iget-object p1, p1, Lcom/daaw/ol8;->c:Lcom/daaw/sl8;

    invoke-static {p1}, Lcom/daaw/sl8;->p(Lcom/daaw/sl8;)Lcom/daaw/lj8;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-static {p1}, Lcom/daaw/sl8;->r(Lcom/daaw/sl8;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p1}, Lcom/daaw/sl8;->p(Lcom/daaw/sl8;)Lcom/daaw/lj8;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/lj8;->zzb()V

    :cond_1
    return-void
.end method

.method public final onTearDown(Landroid/media/AudioTrack;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ml8;->b:Lcom/daaw/ol8;

    iget-object v0, v0, Lcom/daaw/ol8;->c:Lcom/daaw/sl8;

    invoke-static {v0}, Lcom/daaw/sl8;->o(Lcom/daaw/sl8;)Landroid/media/AudioTrack;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/ml8;->b:Lcom/daaw/ol8;

    iget-object p1, p1, Lcom/daaw/ol8;->c:Lcom/daaw/sl8;

    invoke-static {p1}, Lcom/daaw/sl8;->p(Lcom/daaw/sl8;)Lcom/daaw/lj8;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/daaw/sl8;->r(Lcom/daaw/sl8;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/daaw/sl8;->p(Lcom/daaw/sl8;)Lcom/daaw/lj8;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/lj8;->zzb()V

    :cond_1
    return-void
.end method
