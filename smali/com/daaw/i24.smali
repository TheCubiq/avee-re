.class public final synthetic Lcom/daaw/i24;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/m24;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/m24;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/i24;->p:Lcom/daaw/m24;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/i24;->p:Lcom/daaw/m24;

    invoke-virtual {v0}, Lcom/daaw/m24;->s()V

    return-void
.end method
