.class public Lcom/daaw/ae1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ae1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/ae1;


# direct methods
.method public constructor <init>(Lcom/daaw/ae1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ae1$a;->p:Lcom/daaw/ae1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/ae1$a;->p:Lcom/daaw/ae1;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/ae1$c;

    invoke-virtual {v0, p1}, Lcom/daaw/ae1;->c(Lcom/daaw/ae1$c;)V

    const/4 p1, 0x1

    return p1
.end method
