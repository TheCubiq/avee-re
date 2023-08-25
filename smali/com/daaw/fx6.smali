.class public final synthetic Lcom/daaw/fx6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Lcom/daaw/qx6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/qx6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fx6;->a:Lcom/daaw/qx6;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fx6;->a:Lcom/daaw/qx6;

    invoke-static {v0}, Lcom/daaw/qx6;->h(Lcom/daaw/qx6;)V

    return-void
.end method
