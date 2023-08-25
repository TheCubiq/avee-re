.class public final synthetic Lcom/daaw/q54;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/s54;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/s54;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q54;->p:Lcom/daaw/s54;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/q54;->p:Lcom/daaw/s54;

    invoke-virtual {v0}, Lcom/daaw/s54;->x()V

    return-void
.end method
