.class public final Lcom/daaw/u18;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/lang/Boolean;

.field public final synthetic q:Lcom/daaw/p28;


# direct methods
.method public constructor <init>(Lcom/daaw/p28;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/u18;->q:Lcom/daaw/p28;

    iput-object p2, p0, Lcom/daaw/u18;->p:Ljava/lang/Boolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/u18;->q:Lcom/daaw/p28;

    iget-object v1, p0, Lcom/daaw/u18;->p:Ljava/lang/Boolean;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/daaw/p28;->d0(Lcom/daaw/p28;Ljava/lang/Boolean;Z)V

    return-void
.end method
