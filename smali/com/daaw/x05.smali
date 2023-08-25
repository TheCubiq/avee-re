.class public final synthetic Lcom/daaw/x05;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic p:Lcom/daaw/k65;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/k65;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/x05;->p:Lcom/daaw/k65;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/x05;->p:Lcom/daaw/k65;

    invoke-static {v0, p1}, Lcom/daaw/k65;->g(Lcom/daaw/k65;Landroid/os/Message;)Z

    const/4 p1, 0x1

    return p1
.end method
