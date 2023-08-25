.class public final synthetic Lcom/daaw/to8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/uo8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/uo8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/to8;->p:Lcom/daaw/uo8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/to8;->p:Lcom/daaw/uo8;

    invoke-static {v0}, Lcom/daaw/uo8;->d(Lcom/daaw/uo8;)V

    return-void
.end method
