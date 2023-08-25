.class public final synthetic Lcom/daaw/ay1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/by1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/by1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ay1;->p:Lcom/daaw/by1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ay1;->p:Lcom/daaw/by1;

    invoke-static {v0}, Lcom/daaw/by1;->b(Lcom/daaw/by1;)V

    return-void
.end method
