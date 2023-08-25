.class public final Lcom/daaw/qn5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sy4;


# instance fields
.field public a:Landroid/os/Message;

.field public b:Lcom/daaw/wo5;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/pm5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Message;Lcom/daaw/wo5;)Lcom/daaw/qn5;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qn5;->a:Landroid/os/Message;

    iput-object p2, p0, Lcom/daaw/qn5;->b:Lcom/daaw/wo5;

    return-object p0
.end method

.method public final b(Landroid/os/Handler;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/qn5;->a:Landroid/os/Message;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    move-result p1

    invoke-virtual {p0}, Lcom/daaw/qn5;->c()V

    return p1
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/qn5;->a:Landroid/os/Message;

    iput-object v0, p0, Lcom/daaw/qn5;->b:Lcom/daaw/wo5;

    invoke-static {p0}, Lcom/daaw/wo5;->h(Lcom/daaw/qn5;)V

    return-void
.end method

.method public final zza()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qn5;->a:Landroid/os/Message;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    invoke-virtual {p0}, Lcom/daaw/qn5;->c()V

    return-void
.end method
