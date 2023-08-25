.class public final synthetic Lcom/daaw/fm1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/hm1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/hm1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fm1;->p:Lcom/daaw/hm1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fm1;->p:Lcom/daaw/hm1;

    invoke-virtual {v0}, Lcom/daaw/hm1;->d()V

    return-void
.end method
