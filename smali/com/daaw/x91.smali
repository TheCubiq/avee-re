.class public final synthetic Lcom/daaw/x91;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/y91;

.field public final synthetic q:[Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/y91;[Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/x91;->p:Lcom/daaw/y91;

    iput-object p2, p0, Lcom/daaw/x91;->q:[Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/x91;->p:Lcom/daaw/y91;

    iget-object v1, p0, Lcom/daaw/x91;->q:[Ljava/lang/Integer;

    invoke-static {v0, v1}, Lcom/daaw/y91;->a(Lcom/daaw/y91;[Ljava/lang/Integer;)V

    return-void
.end method
