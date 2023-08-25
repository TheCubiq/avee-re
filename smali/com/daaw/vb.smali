.class public final synthetic Lcom/daaw/vb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/wb;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/wb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vb;->p:Lcom/daaw/wb;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vb;->p:Lcom/daaw/wb;

    invoke-static {v0}, Lcom/daaw/wb;->d(Lcom/daaw/wb;)V

    return-void
.end method
