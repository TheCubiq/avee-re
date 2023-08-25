.class public final synthetic Lcom/daaw/gm0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/avee/MainActivity;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/MainActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gm0;->p:Lcom/daaw/avee/MainActivity;

    iput-object p2, p0, Lcom/daaw/gm0;->q:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/gm0;->p:Lcom/daaw/avee/MainActivity;

    iget-object v1, p0, Lcom/daaw/gm0;->q:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/avee/MainActivity;->a0(Lcom/daaw/avee/MainActivity;Ljava/lang/String;)V

    return-void
.end method
