.class public Lcom/daaw/x60$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/x60;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/x60;


# direct methods
.method public constructor <init>(Lcom/daaw/x60;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/x60$d;->p:Lcom/daaw/x60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/x60;Lcom/daaw/x60$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/x60$d;-><init>(Lcom/daaw/x60;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/x60$b;

    iget-object v0, p0, Lcom/daaw/x60$d;->p:Lcom/daaw/x60;

    invoke-virtual {v0, p1}, Lcom/daaw/x60;->e(Lcom/daaw/x60$b;)V

    return v1

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/x60$b;

    invoke-static {p1}, Lcom/daaw/e70;->h(Lcom/daaw/pj1;)V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
