.class public Lcom/daaw/uz$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/uz;->X(Lcom/daaw/fx0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/fx0;

.field public final synthetic q:Lcom/daaw/uz;


# direct methods
.method public constructor <init>(Lcom/daaw/uz;Lcom/daaw/fx0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uz$a;->q:Lcom/daaw/uz;

    iput-object p2, p0, Lcom/daaw/uz$a;->p:Lcom/daaw/fx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/uz$a;->q:Lcom/daaw/uz;

    iget-object v1, p0, Lcom/daaw/uz$a;->p:Lcom/daaw/fx0;

    invoke-static {v0, v1}, Lcom/daaw/uz;->e(Lcom/daaw/uz;Lcom/daaw/fx0;)V
    :try_end_0
    .catch Lcom/daaw/qz; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
