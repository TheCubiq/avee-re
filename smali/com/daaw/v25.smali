.class public final synthetic Lcom/daaw/v25;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/e35;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/e35;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/v25;->p:Lcom/daaw/e35;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/v25;->p:Lcom/daaw/e35;

    invoke-static {v0}, Lcom/daaw/e35;->O(Lcom/daaw/e35;)V

    return-void
.end method
