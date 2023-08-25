.class public Lcom/daaw/g31$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/g31;-><init>(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/g31;


# direct methods
.method public constructor <init>(Lcom/daaw/g31;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/g31$a;->p:Lcom/daaw/g31;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/g31$a;->p:Lcom/daaw/g31;

    iget-object v0, p1, Lcom/daaw/g31;->c:Lcom/daaw/h0;

    const/4 v1, 0x0

    iput-object v1, p1, Lcom/daaw/g31;->c:Lcom/daaw/h0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/daaw/h0;->a()V

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
