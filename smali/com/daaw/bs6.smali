.class public final synthetic Lcom/daaw/bs6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/tj1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/tj1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bs6;->p:Lcom/daaw/tj1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/bs6;->p:Lcom/daaw/tj1;

    invoke-static {}, Lcom/daaw/ku6;->c()Lcom/daaw/ku6;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/tj1;->c(Ljava/lang/Object;)V

    return-void
.end method
