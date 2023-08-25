.class public final Lcom/daaw/j24;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/m24;


# direct methods
.method public constructor <init>(Lcom/daaw/m24;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j24;->p:Lcom/daaw/m24;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/j24;->p:Lcom/daaw/m24;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "surfaceCreated"

    invoke-static {v0, v2, v1}, Lcom/daaw/m24;->p(Lcom/daaw/m24;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method
