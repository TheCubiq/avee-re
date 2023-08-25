.class public final synthetic Lcom/daaw/n03;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/r03;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r03;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/n03;->p:Lcom/daaw/r03;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n03;->p:Lcom/daaw/r03;

    invoke-virtual {v0}, Lcom/daaw/r03;->d()V

    return-void
.end method
