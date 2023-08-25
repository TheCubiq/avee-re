.class public final synthetic Lcom/daaw/xf8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/tg8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/tg8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xf8;->p:Lcom/daaw/tg8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/xf8;->p:Lcom/daaw/tg8;

    invoke-static {v0}, Lcom/daaw/tg8;->Z(Lcom/daaw/tg8;)V

    return-void
.end method
