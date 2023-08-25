.class public final Lcom/daaw/zw8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:Lcom/daaw/yw8;


# direct methods
.method public constructor <init>(Lcom/daaw/yw8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zw8;->p:Lcom/daaw/yw8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/zw8;->p:Lcom/daaw/yw8;

    invoke-interface {v0}, Lcom/daaw/yw8;->a()V

    return-void
.end method
